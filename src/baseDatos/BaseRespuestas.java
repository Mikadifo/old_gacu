
package baseDatos;

import clases.Respuestas;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Vector;

public class BaseRespuestas {
    
    public boolean crearRespuesta(ObjectContainer base, Respuestas respuesta) {
        Respuestas respuestaBuscar = getRespuesta(base, respuesta.getCodigo_respuesta());
        if (respuestaBuscar == null) {
            base.store(respuesta);
            return true; //Se agrega la respuesta a la base
        }
        return false; //Ya existe el codigo de la respuesta 
    }
    
    public Vector<Respuestas> getRespuestas(ObjectContainer base) {
        Vector<Respuestas> respuestas = new Vector<>();
        Respuestas respuestaBuscar = new Respuestas(null, null);
        ObjectSet resultado = base.queryByExample(respuestaBuscar);
        while (resultado.hasNext()) {
            respuestas.add((Respuestas)resultado.next());
        }
        return respuestas; //Retorna todas las respuestas de la base
    }
    
    public Respuestas getRespuesta(ObjectContainer base, String codigo_respuesta) {
        Respuestas respuestaBuscar = new Respuestas(codigo_respuesta, null);
        ObjectSet resultado = base.queryByExample(respuestaBuscar);
        if (resultado.size() > 0) {
            Respuestas respuestaResultado = (Respuestas)resultado.next();
            return respuestaResultado; //Retorna la respuesta encontrada
        }
        return null; //No encontro la respuesta
    }
    
    public boolean modificarRespuesta(ObjectContainer base, Respuestas respuestaNueva) {
        Respuestas respuestaBuscar = new Respuestas(respuestaNueva.getCodigo_respuesta(), null);
        ObjectSet respuesta = base.queryByExample(respuestaBuscar); 
        if (respuesta.size() > 0) { 
            Respuestas respuestaModificar = (Respuestas)respuesta.next(); 
            respuestaModificar.setCodigo_respuesta(respuestaNueva.getCodigo_respuesta());
            respuestaModificar.setRespuesta(respuestaNueva.getRespuesta());
            base.store(respuestaModificar);
            return true; //Se modifica la respuesta
        } 
        return false; //No encontro la respuesta
    }
    
    public boolean eliminarRespuesta(ObjectContainer base, String codigo_respuesta) {
        Respuestas respuestaBuscar = new Respuestas(codigo_respuesta, null);
        ObjectSet respuesta = base.queryByExample(respuestaBuscar);
        if (respuesta.size() > 0) { 
            Respuestas respuestaEliminar = (Respuestas)respuesta.next(); 
            base.delete(respuestaEliminar);
            return true; //Elimina la respuesta
        }
        return false; //No hay respuestas para eliminar
    }
    
}
