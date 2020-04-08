
package baseDatos;

import clases.Realiza;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Vector;

public class BaseRealiza {
    
    public boolean crearRealiza(ObjectContainer base, Realiza realiza) {
        Realiza realizaBuscar = new Realiza();
        if (realizaBuscar == null) {
            base.store(realiza);
            return true; //Se agrega la realiza a la base
        }
        return false; //Ya existe el codigo de la realiza
    }
    
    public Vector<Realiza> getRealizas(ObjectContainer base) {
        Vector<Realiza> realizas = new Vector<>();
        Realiza realizasBuscar = new Realiza(null, null);
        ObjectSet resultado = base.queryByExample(realizasBuscar);
        while (resultado.hasNext()) {
            realizas.add((Realiza)resultado.next());
        }
        return realizas; //Retorna todas las realizas de la base
    }

}
