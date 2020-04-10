
package baseDatos;

import clases.Realiza;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Vector;

public class BaseRealiza {
    
    public boolean crearRealiza(ObjectContainer base, Realiza realiza) {
        Realiza realizaBuscar = getRealiza(base, realiza.getCodigo_trivia(), realiza.getCedula_usuario());
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
    
    public Realiza getRealiza(ObjectContainer base, String codigo_trivia, String codigo_usuario) {
        Realiza realizaBuscar = new Realiza(codigo_trivia, codigo_usuario);
        ObjectSet resultado = base.queryByExample(realizaBuscar);
        if (resultado.size() > 0) {
            Realiza realizaResultado = (Realiza)resultado.next();
            return realizaResultado; //Retorna el realiza encontrada
        }
        return null; //No encontro el realiza
    }
    
    public boolean eliminarRealiza(ObjectContainer base, String codigo_trivia, String codigo_usuario) {
        Realiza realizaBuscar = new Realiza(codigo_trivia, codigo_usuario);
        ObjectSet respuesta = base.queryByExample(realizaBuscar);
        if (respuesta.size() > 0) { 
            Realiza realizaEliminar = (Realiza)respuesta.next(); 
            base.delete(realizaEliminar);
            return true; //Elimina el realiza
        }
        return false; //No hay realiza para eliminar
    }

}
