
package clases;


public class Lugares {
    //Atributos
    
    private String codigo_lugar;
    private String nombre_lugar;
    private String informacion_lugar;
    private String codigo_imagen;
    
    //Constructores

    public Lugares() {
    }

    public Lugares(String codigo_lugar, String nombre_lugar, String informacion_lugar, String codigo_imagen) {
        this.codigo_lugar = codigo_lugar;
        this.nombre_lugar = nombre_lugar;
        this.informacion_lugar = informacion_lugar;
        this.codigo_imagen = codigo_imagen;
    }
    
    //Getters and Setters

    public String getCodigo_lugar() {
        return codigo_lugar;
    }

    public void setCodigo_lugar(String codigo_lugar) {
        this.codigo_lugar = codigo_lugar;
    }

    public String getNombre_lugar() {
        return nombre_lugar;
    }

    public void setNombre_lugar(String nombre_lugar) {
        this.nombre_lugar = nombre_lugar;
    }

    public String getInformacion_lugar() {
        return informacion_lugar;
    }

    public void setInformacion_lugar(String informacion_lugar) {
        this.informacion_lugar = informacion_lugar;
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
        return "Lugares{" + "codigo_lugar=" + codigo_lugar + ", nombre_lugar=" + nombre_lugar + ", informacion_lugar=" + informacion_lugar + ", codigo_imagen=" + codigo_imagen + '}';
    }
    
}
