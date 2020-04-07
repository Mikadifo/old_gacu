
package baseDatos;

import clases.Trivia;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Vector;

public class BaseTrivia {
    
    public boolean crearTrivia(ObjectContainer base, Trivia trivia) {
        Trivia triviaBuscar = getTrivia(base, trivia.getCodigo_trivia());
        if (triviaBuscar == null) {
            base.store(trivia);
            return true; //Se agrega la trivia a la base
        }
        return false; //Ya existe el codigo de la trivia 
    }
    
    public Vector<Trivia> getTrivias(ObjectContainer base) {
        Vector<Trivia> trivias = new Vector<>();
        Trivia triviaBuscar = new Trivia(null, null);
        ObjectSet resultado = base.queryByExample(triviaBuscar);
        while (resultado.hasNext()) {
            trivias.add((Trivia)resultado.next());
        }
        return trivias; //Retorna todas las trivias de la base
    }
    
    public Trivia getTrivia(ObjectContainer base, String codigo_trivia) {
        Trivia triviaBuscar = new Trivia(codigo_trivia, null);
        ObjectSet resultado = base.queryByExample(triviaBuscar);
        if (resultado.size() > 0) {
            Trivia triviaResultado = (Trivia)resultado.next();
            return triviaResultado; //Retorna la trivia encontrada
        }
        return null; //No encontro la trivia
    }
    
    public boolean modificarTrivia(ObjectContainer base, Trivia triviaNueva) {
        Trivia triviaBuscar = new Trivia(triviaNueva.getCodigo_trivia(), null);
        ObjectSet respuesta = base.queryByExample(triviaBuscar); 
        if (respuesta.size() > 0) { 
            Trivia triviaModificar = (Trivia)respuesta.next(); 
            triviaModificar.setCodigo_trivia(triviaNueva.getCodigo_trivia());
            triviaModificar.setNombre_trivia(triviaNueva.getNombre_trivia());
            base.store(triviaModificar);
            return true; //Se modifica la trivia
        } 
        return false; //No encontro la trivia
    }
    
    public boolean eliminarTrivia(ObjectContainer base, String codigo_trivia) {
        Trivia triviaBuscar = new Trivia(codigo_trivia, null);
        ObjectSet respuesta = base.queryByExample(triviaBuscar);
        if (respuesta.size() > 0) { 
            Trivia triviaEliminar = (Trivia)respuesta.next(); 
            base.delete(triviaEliminar);
            return true; //Elimina la trivia
        }
        return false; //No hay trivias para eliminar
    }
    
}
