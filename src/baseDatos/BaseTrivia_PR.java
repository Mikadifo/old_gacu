
package baseDatos;

import clases.Trivia_PR;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Vector;

public class BaseTrivia_PR {
    
    public boolean crearTrivia_PR(ObjectContainer base, Trivia_PR trivia_pr) {
        Trivia_PR trivia_prBuscar = getTrivia_PR(base, trivia_pr.getCodigo_trivia(), trivia_pr.getCodigo_pregunta(), trivia_pr.getCodigo_respuesta());
        if (trivia_prBuscar == null) {
            base.store(trivia_pr);
            return true; //Se agrega la trivia_pr a la base
        }
        return false; //Ya existe el codigo de la trivia_pr
    }
    
    public Vector<Trivia_PR> getTrivias_PRS(ObjectContainer base) {
        Vector<Trivia_PR> trivias_prs = new Vector<>();
        Trivia_PR trivias_prsBuscar = new Trivia_PR(null, null,null);
        ObjectSet resultado = base.queryByExample(trivias_prsBuscar);
        while (resultado.hasNext()) {
            trivias_prs.add((Trivia_PR)resultado.next());
        }
        return trivias_prs; //Retorna todas las trivias_prs de la base
    }
    
    public Trivia_PR getTrivia_PR(ObjectContainer base, String codigo_trivia, String codigo_pregunta, String codigo_respuesta) {
        Trivia_PR trivia_PRBuscar = new Trivia_PR(codigo_trivia, codigo_pregunta, codigo_respuesta);
        ObjectSet resultado = base.queryByExample(trivia_PRBuscar);
        if (resultado.size() > 0) {
            Trivia_PR trivia_PRResultado = (Trivia_PR)resultado.next();
            return trivia_PRResultado; //Retorna el la triviaPR encontrada
        }
        return null; //No encontro la triviaPR
    }
    
    public boolean eliminarTrivia_PR(ObjectContainer base, String codigo_trivia, String codigo_pregunta, String codigo_respuesta) {
        Trivia_PR trivia_PRBuscar = new Trivia_PR(codigo_trivia, codigo_pregunta, codigo_respuesta);
        ObjectSet respuesta = base.queryByExample(trivia_PRBuscar);
        if (respuesta.size() > 0) { 
            Trivia_PR trivia_PREliminar = (Trivia_PR)respuesta.next(); 
            base.delete(trivia_PREliminar);
            return true; //Elimina la trivia_PR
        }
        return false; //No hay trivia_PR para eliminar
    }
    
}
