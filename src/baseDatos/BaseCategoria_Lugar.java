
package baseDatos;

import clases.Categoria_Lugar;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Vector;

public class BaseCategoria_Lugar {
    public boolean crearCategoria_Lugar(ObjectContainer base, Categoria_Lugar categoria_lugar) {
        Categoria_Lugar categoria_lugarBuscar = getCategoria_Lugar(base, categoria_lugar.getCodigo_categoria(), categoria_lugar.getCodigo_lugar());
        if (categoria_lugarBuscar == null) {
            base.store(categoria_lugar);
            return true; //Se agrega la categoria_lugar a la base
        }
        return false; //Ya existe el codigo de la categoria_lugar 
    }
    
    public Vector<Categoria_Lugar> getCategorias_Lugares(ObjectContainer base) {
        Vector<Categoria_Lugar> categorias_lugares = new Vector<>();
        Categoria_Lugar categoria_lugarBuscar = new Categoria_Lugar(null, null);
        ObjectSet resultado = base.queryByExample(categoria_lugarBuscar);
        while (resultado.hasNext()) {
            categorias_lugares.add((Categoria_Lugar)resultado.next());
        }
        return categorias_lugares; //Retorna todas las categoria_lugar de la base
    }
    
    public Categoria_Lugar getCategoria_Lugar(ObjectContainer base, String codigo_categoria, String codigo_lugar) {
        Categoria_Lugar categoria_lugarBuscar = new Categoria_Lugar(codigo_categoria, codigo_lugar);
        ObjectSet resultado = base.queryByExample(categoria_lugarBuscar);
        if (resultado.size() > 0) {
            Categoria_Lugar categoria_lugarResultado = (Categoria_Lugar)resultado.next();
            return categoria_lugarResultado; //Retorna la categoria_lugar encontrada
        }
        return null; //No encontro la categoria_lugar
    }
    
    public boolean eliminarCategoria_Lugar(ObjectContainer base, String codigo_categoria, String codigo_lugar) {
        Categoria_Lugar categoria_lugar_Buscar = new Categoria_Lugar(codigo_categoria, codigo_lugar);
        ObjectSet respuesta = base.queryByExample(categoria_lugar_Buscar);
        if (respuesta.size() > 0) { 
            Categoria_Lugar categoria_lugar_Eliminar = (Categoria_Lugar)respuesta.next(); 
            base.delete(categoria_lugar_Eliminar);
            return true; //Elimina la Categoria_Lugar
        }
        return false; //No hay Categorias_Lugares para eliminar
    }
}
