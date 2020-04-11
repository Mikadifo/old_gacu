
package clases;

public class Visualiza {
    //Atributos
    private String cedula_usuario;
    private String codigo_lugar;
    
    //Costructores
    public Visualiza() {
    }

    public Visualiza(String cedula_usuario, String codigo_lugar) {
        this.cedula_usuario = cedula_usuario;
        this.codigo_lugar = codigo_lugar;
    }
    
    //Getters and Setters
    public String getCedula_usuario() {
        return cedula_usuario;
    }

    public void setCedula_usuario(String cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public String getCodigo_lugar() {
        return codigo_lugar;
    }

    public void setCodigo_lugar(String codigo_lugar) {
        this.codigo_lugar = codigo_lugar;
    }
    
    //metodos

    @Override
    public String toString() {
        return "Visualiza{" + "cedula_usuario=" + cedula_usuario + ", codigo_lugar=" + codigo_lugar + '}';
    }
    
    
}
