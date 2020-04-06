
package clases;

import java.awt.Image;

public class Imagenes {
    //Atributo
    private Image imagen;
    private String codigo_imagen;  
    
    //Costructor

    public Imagenes() {
    }

    public Imagenes(Image imagen, String codigo_imagen) {
        this.imagen = imagen;
        this.codigo_imagen = codigo_imagen;
    }
    
    //Getters And Setters

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public String getCodigo_imagen() {
        return codigo_imagen;
    }

    public void setCodigo_imagen(String codigo_imagen) {
        this.codigo_imagen = codigo_imagen;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Imagenes{" + "imagen=" + imagen + ", codigo_imagen=" + codigo_imagen + '}';
    }
    
}
