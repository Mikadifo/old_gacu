package Interfaces;

import clases.Categoria_Lugar;
import clases.Lugares;
import java.util.Vector;

public interface Categoria_Lugares {
    
    //CATEGORIAS
    public void crearGuardarCategoriasLugares();
    
    public void crearCategoriasLugares();
    
    public void setCategoriaLugar(String codigoCategoria, String codigoLugar);
    
    public void guardarCategoriasLugaresBase(Vector<Categoria_Lugar> categoriasLugares);
    
    public void guardarCategoriaLugarBase(Categoria_Lugar categoriaLugar);
    
    //LUGARES
    public void setLugarBoton(javax.swing.JButton boton, Lugares lugarMostrar);
    
    public void crearGuardarLugares();
    
    public void crearLugares();
    
    public void setLugar(String codigo, String nombre, String info);
    
    public void guardarLugaresBase(Vector<Lugares> lugaresGuardar);
    
    public void guardarLugarBase(Lugares lugarGuardar);
    
    public void setLugarBotones();
    
}
