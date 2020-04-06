package baseDatos;

import com.db4o.*;
import java.io.File;
import clases.*;
import java.util.Vector;

public class BaseGACU {

    //VARIABLES
    private final File carpetaBase = new File("baseDatos"); //carpeta de la base
    private String rutaCarpeta = carpetaBase.getAbsolutePath();
    private String signoRuta = (rutaCarpeta.contains("/")) ? "/" : "\\";
    private ObjectContainer base;
    private final String rutaArchivo = rutaCarpeta + signoRuta + "gacuBD.yap"; //archivo de la base de datos
    
    private BaseUsuario baseUsuario = new BaseUsuario();
    private BaseCategoria baseCategoria = new BaseCategoria();
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
        boolean estado = baseUsuario.crearUsuario(abrirBase(rutaArchivo), usuario);
        cerrarBase();
        return estado;
    }
    
    public Vector<Usuario> getUsuarios() {
        Vector<Usuario> usuarios = baseUsuario.getUsuarios(abrirBase(rutaArchivo));
        cerrarBase();
        return usuarios;
    }
    
    public Usuario getUsuario(String cedula) {
        Usuario usuarioResultado = baseUsuario.getUsuario(abrirBase(rutaArchivo), cedula);
        cerrarBase();
        return usuarioResultado;
    }
    
    public boolean modificarUsuario(Usuario usuarioNuevo) {
        boolean estado = baseUsuario.modificarUsuario(abrirBase(rutaArchivo), usuarioNuevo);
        cerrarBase();
        return estado;
    }
    
    public boolean eliminarUsuario(String cedula) {
        boolean estado = baseUsuario.eliminarUsuario(abrirBase(rutaArchivo), cedula);
        cerrarBase();
        return estado;
    }
    
    public int solicitarIngresoUsuario(String cedula, String contrasena) { //-1->pwd incorrecta 0->no existe 1->correcto
        int resultado = baseUsuario.solicitarIngresoUsuario(abrirBase(rutaArchivo), cedula, contrasena);
        cerrarBase();
        return resultado;
    }
    //FIN METODOS USUARIO
    
    //METODOS CATEGORIA
    public boolean crearCategoria(Categoria categoria) {
        boolean estado = baseCategoria.crearCategoria(abrirBase(rutaArchivo), categoria);
        cerrarBase();
        return estado;
    }
    
    public Vector<Categoria> getCategorias() {
        Vector<Categoria> categorias = baseCategoria.getCategorias(abrirBase(rutaArchivo));
        cerrarBase();
        return categorias;
    }
    
    public Categoria getCategoria(String codigo) {
        Categoria categoriaResultado = baseCategoria.getCategoria(abrirBase(rutaArchivo), codigo);
        cerrarBase();
        return categoriaResultado;
    }
    
    public boolean modificarCategoria(Categoria categoriaNueva) {
        boolean estado = baseCategoria.modificarCategoria(abrirBase(rutaArchivo), categoriaNueva);
        cerrarBase();
        return estado;
    }
    
    public boolean eliminarCategoria(String codigo) {
        boolean estado = baseCategoria.eliminarCategoria(abrirBase(rutaArchivo), codigo);
        cerrarBase();
        return estado;
    }
    //FIN METODOS CATEGORIA
    
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
