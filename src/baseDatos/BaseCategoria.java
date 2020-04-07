
package baseDatos;

import clases.Categoria;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Vector;

public class BaseCategoria {
    public boolean crearCategoria(ObjectContainer base, Categoria categoria) {
        Categoria categoriaBuscar = getCategoria(base, categoria.getCodigo_categoria());
        if (categoriaBuscar == null) {
            base.store(categoria);
            return true; //Se agrega la categoria a la base
        }
        return false; //Ya existe el codigo de la categoria 
    }
    
    public Vector<Categoria> getCategorias(ObjectContainer base) {
        Vector<Categoria> categorias = new Vector<>();
        Categoria categoriaBuscar = new Categoria(null, null);
        ObjectSet resultado = base.queryByExample(categoriaBuscar);
        while (resultado.hasNext()) {
            categorias.add((Categoria)resultado.next());
        }
        return categorias; //Retorna todas las categorias de la base
    }
    
    public Categoria getCategoria(ObjectContainer base, String codigo_categoria) {
        Categoria categoriaBuscar = new Categoria(codigo_categoria, null);
        ObjectSet resultado = base.queryByExample(categoriaBuscar);
        if (resultado.size() > 0) {
            Categoria categoriaResultado = (Categoria)resultado.next();
            return categoriaResultado; //Retorna la categoria encontrada
        }
        return null; //No encontro la categoria
    }
    
    public boolean modificarCategoria(ObjectContainer base, Categoria categoriaNueva) {
        Categoria categoriaBuscar = new Categoria(categoriaNueva.getCodigo_categoria(), null);
        ObjectSet respuesta = base.queryByExample(categoriaBuscar); 
        if (respuesta.size() > 0) { 
            Categoria categoriaModificar = (Categoria)respuesta.next(); 
            categoriaModificar.setCodigo_categoria(categoriaNueva.getCodigo_categoria());
            categoriaModificar.setNombre_categoria(categoriaNueva.getNombre_categoria());
            base.store(categoriaModificar);
            return true; //Se modifica la categoria
        } 
        return false; //No encontro la categoria
    }
    
    public boolean eliminarCategoria(ObjectContainer base, String codigo_categoria) {
        Categoria categoriaBuscar = new Categoria(codigo_categoria, null);
        ObjectSet respuesta = base.queryByExample(categoriaBuscar);
        if (respuesta.size() > 0) { 
            Categoria categoriaEliminar = (Categoria)respuesta.next(); 
            base.delete(categoriaEliminar);
            return true; //Elimina la categoria
        }
        return false; //No hay categorias para eliminar
    }
}
