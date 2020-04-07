
package baseDatos;

import clases.Imagenes;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Vector;

public class BaseImagenes {
    
    public boolean crearImagen(ObjectContainer base, Imagenes imagen) {
        Imagenes imagenBuscar = getImagen(base, imagen.getCodigo_imagen());
        if (imagenBuscar == null) {
            base.store(imagen);
            return true; //Se agrega la imagen a la base
        }
        return false; //Ya existe el codigo de la imagen 
    }
    
    public Vector<Imagenes> getImagenes(ObjectContainer base) {
        Vector<Imagenes> categorias = new Vector<>();
        Imagenes imagenBuscar = new Imagenes(null, null);
        ObjectSet resultado = base.queryByExample(imagenBuscar);
        while (resultado.hasNext()) {
            categorias.add((Imagenes)resultado.next());
        }
        return categorias; //Retorna todas las imagenes de la base
    }
    
    public Imagenes getImagen(ObjectContainer base, String codigo_imagen) {
        Imagenes imagenBuscar = new Imagenes(null, codigo_imagen);
        ObjectSet resultado = base.queryByExample(imagenBuscar);
        if (resultado.size() > 0) {
            Imagenes imagenResultado = (Imagenes)resultado.next();
            return imagenResultado; //Retorna la imagen encontrada
        }
        return null; //No encontro la imagen
    }
    
    public boolean modificarImagen(ObjectContainer base, Imagenes imagenNueva) {
        Imagenes imagenBuscar = new Imagenes(null, imagenNueva.getCodigo_imagen());
        ObjectSet respuesta = base.queryByExample(imagenBuscar); 
        if (respuesta.size() > 0) { 
            Imagenes imagenModificar = (Imagenes)respuesta.next(); 
            imagenModificar.setCodigo_imagen(imagenNueva.getCodigo_imagen());
            imagenModificar.setImagen(imagenNueva.getImagen());
            base.store(imagenModificar);
            return true; //Se modifica la imagen
        } 
        return false; //No encontro la imagen
    }
    
    public boolean eliminarImagen(ObjectContainer base, String codigo_imagen) {
        Imagenes imagenBuscar = new Imagenes(null,codigo_imagen);
        ObjectSet respuesta = base.queryByExample(imagenBuscar);
        if (respuesta.size() > 0) { 
            Imagenes imagenEliminar = (Imagenes)respuesta.next(); 
            base.delete(imagenEliminar);
            return true; //Elimina la imagen
        }
        return false; //No hay imagenes para eliminar
    }
    
}
