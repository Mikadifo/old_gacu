
package clases;

import javax.swing.ImageIcon;
public class Imagenes {
    
    //Atributo
    private ImageIcon imagen;
    private String codigo_imagen;  
    
    //Costructor

    public Imagenes() {
    }

    public Imagenes(ImageIcon imagen, String codigo_imagen) {
        this.imagen = imagen;
        this.codigo_imagen = codigo_imagen;
    }
    
    //Getters And Setters

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public String getCodigo_imagen() {
        return codigo_imagen;
    }

    public void setCodigo_imagen(String codigo_imagen) {
        this.codigo_imagen = codigo_imagen;
    }
    
}
