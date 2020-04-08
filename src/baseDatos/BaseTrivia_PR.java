
package baseDatos;

import clases.Trivia_PR;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Vector;

public class BaseTrivia_PR {
    public boolean crearTrivia_PR(ObjectContainer base, Trivia_PR trivia_pr) {
        Trivia_PR trivia_prBuscar = new Trivia_PR();
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
}
