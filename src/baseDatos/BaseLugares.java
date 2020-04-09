package baseDatos;

import clases.Lugares;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Vector;

public class BaseLugares {


        public boolean crearLugar(ObjectContainer base, Lugares lugar) {
            Lugares lugarBuscar = getLugar(base, lugar.getCodigo_lugar());
            if (lugarBuscar == null) {
                base.store(lugar);
                return true; //Se agrega el lugar a la base
            }
            return false; //Ya existe el codigo del Lugar 
        }

        public Vector<Lugares> getLugares(ObjectContainer base) {
            Vector<Lugares> lugares = new Vector<>();
            Lugares lugarBuscar = new Lugares(null, null,null);
            ObjectSet resultado = base.queryByExample(lugarBuscar);
            while (resultado.hasNext()) {
                lugares.add((Lugares) resultado.next());
            }
            return lugares; //Retorna todas las categorias de la base
        }

        public Lugares getLugar(ObjectContainer base, String codigo_lugar) {
            Lugares lugarBuscar = new Lugares(codigo_lugar, null,null);
            ObjectSet resultado = base.queryByExample(lugarBuscar);
            if (resultado.size() > 0) {
                Lugares categoriaResultado = (Lugares) resultado.next();
                return categoriaResultado; //Retorna el lugar encontrado
            }
            return null; //No encontro el lugar
        }

        public boolean modificarLugar(ObjectContainer base, Lugares lugarNueva) {
            Lugares lugarBuscar = new Lugares(lugarNueva.getCodigo_lugar(), null, null);
            ObjectSet respuesta = base.queryByExample(lugarBuscar);
            if (respuesta.size() > 0) {
                Lugares lugarModificar = (Lugares) respuesta.next();
                lugarModificar.setCodigo_lugar(lugarNueva.getCodigo_lugar());
                lugarModificar.setNombre_lugar(lugarNueva.getNombre_lugar());
                lugarModificar.setInformacion_lugar(lugarNueva.getInformacion_lugar());
                base.store(lugarModificar);
                return true; //Se modifica el lugar
            }
            return false; //No encontro el lugar
        }

        public boolean eliminarLugar(ObjectContainer base, String codigo_lugar) {
            Lugares lugarBuscar = new Lugares(codigo_lugar, null, null);
            ObjectSet respuesta = base.queryByExample(lugarBuscar);
            if (respuesta.size() > 0) {
                Lugares lugarEliminar = (Lugares) respuesta.next();
                base.delete(lugarEliminar);
                return true; //Elimina el lugar
            }
            return false; //No hay lugares para eliminar
        }
    }

