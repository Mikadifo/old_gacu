package baseDatos;

import com.db4o.*;
import java.io.File;
import java.io.IOException;
import clases.*;
import java.util.Vector;

public class BaseGACU {

    //VARIABLES
    private final File carpetaBase = new File("baseDatos"); //carpeta de la base
    private String rutaCarpeta = carpetaBase.getAbsolutePath();
    private String signoRuta = (rutaCarpeta.contains("/")) ? "/" : "\\";
    private File baseDatos = new File("baseDatos" + signoRuta + "gacuBD.yap"); //base de datos
    private ObjectContainer base;
    private final String rutaArchivo = rutaCarpeta + signoRuta + "gacuBD"; //archivo de la base de datos
    //FIN VARIABLES
    
    //CONSTRUCTORES
    public BaseGACU() {
        comprobarArchivos();
    }
    //FIN CONSTRUCTORES

    //METODOS GENERALES
    private void comprobarArchivos() {
        if (!carpetaBase.exists()) {
            do {
            } while (!carpetaBase.mkdir());
        }

        if (!baseDatos.exists()) {
            try {
                do {
                } while (!baseDatos.createNewFile());
            } catch (IOException e) {
                System.out.println("Error IO: " + e.getMessage());
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
    
    public ObjectContainer abrirBase(String ruta) {
        base = Db4o.openFile(ruta);
        return base;
    }
    
    public void cerrarBase() {
        base.close();
    }
    //FIN METODOS GENERALES
    
    //METODOS USUARIO
    public boolean crearUsuario(Usuario usuario) {
        Usuario usuarioBuscar = getUsuario(usuario.getCedulaUsuario());
        abrirBase(rutaArchivo);
        if (usuarioBuscar == null) {
            base.store(usuario);
            cerrarBase();
            return true; //Se agrega el usuario a la base
        }
        cerrarBase();
        return false; //Ya existe la cedula
    }
    
    public Vector<Usuario> getUsuarios() {
        abrirBase(rutaArchivo);
        Vector<Usuario> usuarios = new Vector<>();
        Usuario usuarioBuscar = new Usuario(null, null, null, null);
        ObjectSet resultado = base.queryByExample(usuarioBuscar);
        while (resultado.hasNext()) {
            usuarios.add((Usuario)resultado.next());
        }
        cerrarBase();
        return usuarios; //Retorna todos los usuarios de la base
    }
    
    public Usuario getUsuario(String cedula) {
        abrirBase(rutaArchivo);
        Usuario usuarioBuscar = new Usuario(null, cedula, null, null);
        ObjectSet resultado = base.queryByExample(usuarioBuscar);
        if (resultado.size() > 0) {
            Usuario usuarioResultado = (Usuario)resultado.next();
            cerrarBase();
            return usuarioResultado; //Retorna el usuario encontrado
        }
        cerrarBase();
        return null; //No encontro el usuario
    }
    
    public boolean modificarUsuario(Usuario usuarioNuevo) {
        abrirBase(rutaArchivo);
        Usuario usuarioBuscar = new Usuario(null, usuarioNuevo.getCedulaUsuario(), null, null);
        ObjectSet respuesta = base.queryByExample(usuarioBuscar); 
        if (respuesta.size() > 0) { 
            Usuario usuarioModificar = (Usuario)respuesta.next(); 
            usuarioModificar.setNombreUsuario(usuarioNuevo.getNombreUsuario());
            usuarioModificar.setCiudadUsuario(usuarioNuevo.getCiudadUsuario());
            usuarioModificar.setContrasenaUsuario(usuarioNuevo.getContrasenaUsuario());
            base.store(usuarioModificar);
            cerrarBase();
            return true; //Se modifica el usuario
        } 
        cerrarBase();
        return false; //No encontro el usuario
    }
    
    public boolean eliminarUsuario(String cedula) {
        Usuario usuarioBuscar = new Usuario(null, cedula, null, null);
        abrirBase(rutaArchivo);
        ObjectSet respuesta = base.queryByExample(usuarioBuscar);
        if (respuesta.size() > 0) { 
            Usuario usuarioEliminar = (Usuario)respuesta.next(); 
            base.delete(usuarioEliminar);
            cerrarBase();
            return true; //Elimina al usuario
        }
        cerrarBase();
        return false; //No hay usuarios para eliminar
    }
    
    public int solicitarIngresoUsuario(String cedula, String contrasena) { //-1->pwd incorrecta 0->no existe 1->correcto
        Usuario usuarioEntrando = getUsuario(cedula);
        if (usuarioEntrando != null) {
            if (usuarioEntrando.getContrasenaUsuario().equals(contrasena)) {
                return 1;
            }
            return -1;
        }
        return 0;
    }
    //FIN METODOS USUARIO
    
    //METODOS TRIVIA(PREGUNTAS-RESPUESTAS)Trivia_PR
    public boolean crearTrivia(Trivia trivia) {
        //Trivia triviaBuscar = getTrivia(trivia.getCodigo_trivia()); falta hacer metodo getTrivia(SOBREESCRITO)
        abrirBase(rutaArchivo);
        /*
        if (triviaBuscar == null) {
            base.store(trivia);
            cerrarBase();
            return true; //Se agrega la trivia a la base
        }
        */
        cerrarBase();
        return false; //Ya existe la trivia
    }
    //FIN METODOS TRIVIA(PREGUNTAS-RESPUESTAS)Trivia_PR

}
