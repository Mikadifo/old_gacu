package baseDatos;

import clases.Visualiza;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Vector;

public class BaseVisualiza {

    public boolean crearVisualiza(ObjectContainer base, Visualiza visualiza) {
        Visualiza visualizaBuscar = getVisualiza(base, visualiza.getCedula_usuario(), visualiza.getCodigo_lugar());
        if (visualizaBuscar == null) {
            base.store(visualiza);
            return true; //Se agrega el visualiza a la base
        }
        return false; //Ya existe el codigo del visualiza
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
    
    public Vector<Visualiza> getVisualizas(ObjectContainer base, String cedulaUsuario) {
        Vector<Visualiza> visualizas = new Vector<>();
        Visualiza visualizasBuscar = new Visualiza(cedulaUsuario, null);
        ObjectSet resultado = base.queryByExample(visualizasBuscar);
        while (resultado.hasNext()) {
            visualizas.add((Visualiza) resultado.next());
        }
        return visualizas; //Retorna todas las visualizas de la base del usuario indicado
    }
    
    public Visualiza getVisualiza(ObjectContainer base, String cedula_usuario, String codigo_lugar) {
        Visualiza visualizaBuscar = new Visualiza(cedula_usuario, codigo_lugar);
        ObjectSet resultado = base.queryByExample(visualizaBuscar);
        if (resultado.size() > 0) {
            Visualiza visualizaResultado = (Visualiza)resultado.next();
            return visualizaResultado; //Retorna el visualiza encontrado
        }
        return null; //No encontro el visualiza
    }
    
    public boolean eliminarVisualiza(ObjectContainer base, String cedula_usuario, String codigo_lugar) {
        Visualiza visualizaBuscar = new Visualiza(cedula_usuario, codigo_lugar);
        ObjectSet respuesta = base.queryByExample(visualizaBuscar);
        if (respuesta.size() > 0) { 
            Visualiza visualizaEliminar = (Visualiza)respuesta.next(); 
            base.delete(visualizaEliminar);
            return true; //Elimina el Visualiza
        }
        return false; //No hay Visualiza para eliminar
    }
}
