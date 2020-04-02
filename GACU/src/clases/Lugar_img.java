
package clases;

public class Lugar_img {
    //Atributos
    private String codigo_lugar;
    private String codigo_imagen;
    
    //Costructores

    public Lugar_img() {
    }

    public Lugar_img(String codigo_lugar, String codigo_imagen) {
        this.codigo_lugar = codigo_lugar;
        this.codigo_imagen = codigo_imagen;
    }
    
    //Getters and Setters

    public String getCodigo_lugar() {
        return codigo_lugar;
    }

    public void setCodigo_lugar(String codigo_lugar) {
        this.codigo_lugar = codigo_lugar;
    }

    public String getCodigo_imagen() {
        return codigo_imagen;
    }

    public void setCodigo_imagen(String codigo_imagen) {
        this.codigo_imagen = codigo_imagen;
    }
    //Metodos

    @Override
    public String toString() {
        return "Lugar_img{" + "codigo_lugar=" + codigo_lugar + ", codigo_imagen=" + codigo_imagen + '}';
    }
    
}
