package baseDatos;

import clases.Visualiza;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Vector;

public class BaseVisualiza {

    public boolean crearVisualiza(ObjectContainer base, Visualiza visualiza) {
        base.store(visualiza);
        return true; //Se agrega la visualiza a la base
    }

    public Vector<Visualiza> getVisualizas(ObjectContainer base) {
        Vector<Visualiza> visualizas = new Vector<>();
        Visualiza visualizasBuscar = new Visualiza(null, null);
        ObjectSet resultado = base.queryByExample(visualizasBuscar);
        while (resultado.hasNext()) {
            visualizas.add((Visualiza) resultado.next());
        }
        return visualizas; //Retorna todas las visualizas de la base
    }
}
