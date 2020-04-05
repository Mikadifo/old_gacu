package baseDatos;

import clases.Usuario;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Vector;

public class BaseUsuario {
    
    public boolean crearUsuario(ObjectContainer base, Usuario usuario) {
        Usuario usuarioBuscar = getUsuario(base, usuario.getCedulaUsuario());
        if (usuarioBuscar == null) {
            base.store(usuario);
            return true; //Se agrega el usuario a la base
        }
        return false; //Ya existe la cedula
    }
    
    public Vector<Usuario> getUsuarios(ObjectContainer base) {
        Vector<Usuario> usuarios = new Vector<>();
        Usuario usuarioBuscar = new Usuario(null, null, null, null);
        ObjectSet resultado = base.queryByExample(usuarioBuscar);
        while (resultado.hasNext()) {
            usuarios.add((Usuario)resultado.next());
        }
        return usuarios; //Retorna todos los usuarios de la base
    }
    
    public Usuario getUsuario(ObjectContainer base, String cedula) {
        Usuario usuarioBuscar = new Usuario(null, cedula, null, null);
        ObjectSet resultado = base.queryByExample(usuarioBuscar);
        if (resultado.size() > 0) {
            Usuario usuarioResultado = (Usuario)resultado.next();
            return usuarioResultado; //Retorna el usuario encontrado
        }
        return null; //No encontro el usuario
    }
    
    public boolean modificarUsuario(ObjectContainer base, Usuario usuarioNuevo) {
        Usuario usuarioBuscar = new Usuario(null, usuarioNuevo.getCedulaUsuario(), null, null);
        ObjectSet respuesta = base.queryByExample(usuarioBuscar); 
        if (respuesta.size() > 0) { 
            Usuario usuarioModificar = (Usuario)respuesta.next(); 
            usuarioModificar.setNombreUsuario(usuarioNuevo.getNombreUsuario());
            usuarioModificar.setCiudadUsuario(usuarioNuevo.getCiudadUsuario());
            usuarioModificar.setContrasenaUsuario(usuarioNuevo.getContrasenaUsuario());
            base.store(usuarioModificar);
            return true; //Se modifica el usuario
        } 
        return false; //No encontro el usuario
    }
    
    public boolean eliminarUsuario(ObjectContainer base, String cedula) {
        Usuario usuarioBuscar = new Usuario(null, cedula, null, null);
        ObjectSet respuesta = base.queryByExample(usuarioBuscar);
        if (respuesta.size() > 0) { 
            Usuario usuarioEliminar = (Usuario)respuesta.next(); 
            base.delete(usuarioEliminar);
            return true; //Elimina al usuario
        }
        return false; //No hay usuarios para eliminar
    }
    
    public int solicitarIngresoUsuario(ObjectContainer base, String cedula, String contrasena) { //-1->pwd incorrecta 0->no existe 1->correcto
        Usuario usuarioEntrando = getUsuario(base, cedula);
        if (usuarioEntrando != null) {
            if (usuarioEntrando.getContrasenaUsuario().equals(contrasena)) {
                return 1;
            }
            return -1;
        }
        return 0;
    }
    
}
