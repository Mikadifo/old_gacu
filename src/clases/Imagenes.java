
package clases;

public class Imagenes {
    
    //Atributo
    private byte[] imagen;
    private String codigo_imagen;  
    
    //Costructor

    public Imagenes() {
    }

    public Imagenes(byte[] imagen, String codigo_imagen) {
        this.imagen = imagen;
        this.codigo_imagen = codigo_imagen;
    }
    
    //Getters And Setters

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getCodigo_imagen() {
        return codigo_imagen;
    }

    public void setCodigo_imagen(String codigo_imagen) {
        this.codigo_imagen = codigo_imagen;
    }
    
}
