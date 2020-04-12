package baseDatos;

import clases.Preguntas;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Vector;

public class BasePreguntas {
    
    public boolean crearPregunta(ObjectContainer base, Preguntas pregunta) {
        Preguntas preguntaBuscar = getPregunta(base, pregunta.getCodigo_pregunta());
        if (preguntaBuscar == null) {
            base.store(pregunta);
            return true; //Se agrega la pregunta a la base
        }
        return false; //Ya existe el codigo de la pregunta 
    }
    
    public Vector<Preguntas> getPreguntas(ObjectContainer base) {
        Vector<Preguntas> preguntas = new Vector<>();
        Preguntas preguntaBuscar = new Preguntas(null, null);
        ObjectSet resultado = base.queryByExample(preguntaBuscar);
        while (resultado.hasNext()) {
            preguntas.add((Preguntas)resultado.next());
        }
        return preguntas; //Retorna todas las preguntas de la base
    }
    
    public Preguntas getPregunta(ObjectContainer base, String codigo_pregunta) {
        Preguntas preguntaBuscar = new Preguntas(codigo_pregunta, null);
        ObjectSet resultado = base.queryByExample(preguntaBuscar);
        if (resultado.size() > 0) {
            Preguntas preguntaResultado = (Preguntas)resultado.next();
            return preguntaResultado; //Retorna la pregunta encontrada
        }
        return null; //No encontro la pregunta
    }
    
    public boolean modificarPregunta(ObjectContainer base, Preguntas preguntaNueva) {
        Preguntas preguntaBuscar = new Preguntas(preguntaNueva.getCodigo_pregunta(), null);
        ObjectSet respuesta = base.queryByExample(preguntaBuscar); 
        if (respuesta.size() > 0) { 
            Preguntas preguntaModificar = (Preguntas)respuesta.next(); 
            preguntaModificar.setCodigo_pregunta(preguntaNueva.getCodigo_pregunta());
            preguntaModificar.setPregunta(preguntaNueva.getPregunta());
            base.store(preguntaModificar);
            return true; //Se modifica la pregunta
        } 
        return false; //No encontro la pregunta
    }
    
    public boolean eliminarPregunta(ObjectContainer base, String codigo_pregunta) {
        Preguntas preguntaBuscar = new Preguntas(codigo_pregunta, null);
        ObjectSet respuesta = base.queryByExample(preguntaBuscar);
        if (respuesta.size() > 0) { 
            Preguntas preguntaEliminar = (Preguntas)respuesta.next(); 
            base.delete(preguntaEliminar);
            return true; //Elimina la pregunta
        }
        return false; //No hay preguntas para eliminar
    }
    
    
}
