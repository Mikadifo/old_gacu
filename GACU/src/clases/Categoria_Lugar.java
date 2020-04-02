
package clases;

public class Categoria_Lugar {
    //Atributos
    private String codigo_categoria;
    private String codigo_lugar;
    //fin atributos
    
    //Constructor

    public Categoria_Lugar() {
    }

    public Categoria_Lugar(String codigo_categoria, String codigo_lugar) {
        this.codigo_categoria = codigo_categoria;
        this.codigo_lugar = codigo_lugar;
    }
    //Fin
    
    //Getters and Setters

    public String getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(String codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public String getCodigo_lugar() {
        return codigo_lugar;
    }

    public void setCodigo_lugar(String codigo_lugar) {
        this.codigo_lugar = codigo_lugar;
    }
    //fin
    
    //ToString

    @Override
    public String toString() {
        return "Categoria_Lugar{" + "codigo_categoria=" + codigo_categoria + ", codigo_lugar=" + codigo_lugar + '}';
    }
    
}
