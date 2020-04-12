package clases;

public class Realiza {
    //Atributos
    private String codigo_trivia;
    private String cedula_usuario;
    
    //Costructor

    public Realiza() {
    }

    public Realiza(String codigo_trivia, String cedula_usuario) {
        this.codigo_trivia = codigo_trivia;
        this.cedula_usuario = cedula_usuario;
    }
    
    //Getters and Setters

    public String getCodigo_trivia() {
        return codigo_trivia;
    }

    public void setCodigo_trivia(String codigo_trivia) {
        this.codigo_trivia = codigo_trivia;
    }

    public String getCedula_usuario() {
        return cedula_usuario;
    }

    public void setCedula_usuario(String cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }
    
    //Metodos

    @Override
    public String toString() {
        return "Realiza{" + "codigo_trivia=" + codigo_trivia + ", cedula_usuario=" + cedula_usuario + '}';
    }
    
}
