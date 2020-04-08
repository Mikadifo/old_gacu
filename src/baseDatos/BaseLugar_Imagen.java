
package baseDatos;

import clases.Lugar_img;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Vector;

public class BaseLugar_Imagen {
    
    public boolean crearLugar_Imagen(ObjectContainer base, Lugar_img lugar_img) {
        Lugar_img lugar_imgBuscar = getlugar_img(base, lugar_img.getCodigo_imagen());
        if (lugar_imgBuscar == null) {
            base.store(lugar_img);
            return true; //Se agrega el lugar_img a la base
        }
        return false; //Ya existe el codigo del lugar_img 
    }
    
    public Vector<Lugar_img> getLugares_Imgs(ObjectContainer base) {
        Vector<Lugar_img> lugares_imgs = new Vector<>();
        Lugar_img lugar_imgBuscar = new Lugar_img(null, null);
        ObjectSet resultado = base.queryByExample(lugar_imgBuscar);
        while (resultado.hasNext()) {
            lugares_imgs.add((Lugar_img)resultado.next());
        }
        return lugares_imgs; //Retorna todas los lugar_img de la base
    }
    
    public Lugar_img getlugar_img(ObjectContainer base, String codigo_imagen) {
        Lugar_img lugar_imgBuscar = new Lugar_img(null, codigo_imagen);
        ObjectSet resultado = base.queryByExample(lugar_imgBuscar);
        if (resultado.size() > 0) {
            Lugar_img lugar_imgResultado = (Lugar_img)resultado.next();
            return lugar_imgResultado; //Retorna el Lugar_img encontrada
        }
        return null; //No encontro el Lugar_img
    }
    
    public boolean modificarLugar_img(ObjectContainer base, Lugar_img lugar_imgNueva) {
        Lugar_img imagenBuscar = new Lugar_img(null, lugar_imgNueva.getCodigo_imagen());
        ObjectSet respuesta = base.queryByExample(imagenBuscar); 
        if (respuesta.size() > 0) { 
            Lugar_img lugar_imgModificar = (Lugar_img)respuesta.next(); 
            lugar_imgModificar.setCodigo_imagen(lugar_imgNueva.getCodigo_imagen());
            lugar_imgModificar.setCodigo_lugar(lugar_imgNueva.getCodigo_lugar());
            base.store(lugar_imgModificar);
            return true; //Se modifica el lugar_img
        } 
        return false; //No encontro el lugar_img
    }
    
    public boolean eliminarLugar_img(ObjectContainer base, String codigo_imagen) {
        Lugar_img lugar_imgBuscar = new Lugar_img(null,codigo_imagen);
        ObjectSet respuesta = base.queryByExample(lugar_imgBuscar);
        if (respuesta.size() > 0) { 
            Lugar_img lugar_imgEliminar = (Lugar_img)respuesta.next(); 
            base.delete(lugar_imgEliminar);
            return true; //Elimina el lugar_img
        }
        return false; //No hay lugar_img para eliminar
    }
    
}
