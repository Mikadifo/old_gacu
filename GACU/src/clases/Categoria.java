package clases;

public class Categoria {

    //Atributos 
    private String codigo_categoria;
    private String nombre_categoria;
    //fin atributos

    //constructores
    public Categoria() {
    }

    public Categoria(String codigo_categoria, String nombre_categoria) {
        this.codigo_categoria = codigo_categoria;
        this.nombre_categoria = nombre_categoria;
    }
    //fin constructores

    //Getters and Setters

    public String getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(String codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }
    //fin
    
    //override

    @Override
    public String toString() {
        return "Categoria{" + "codigo_categoria=" + codigo_categoria + ", nombre_categoria=" + nombre_categoria + '}';
    }
    
    
    
}
