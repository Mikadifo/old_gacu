package clases;

public class Trivia {
    //Atributos
    private String codigo_trivia;
    private String nombre_trivia;
    
    //Constructores

    public Trivia() {
    }

    public Trivia(String codigo_trivia, String nombre_trivia) {
        this.codigo_trivia = codigo_trivia;
        this.nombre_trivia = nombre_trivia;
    }
    
    //Getters and Setters

    public String getCodigo_trivia() {
        return codigo_trivia;
    }

    public void setCodigo_trivia(String codigo_trivia) {
        this.codigo_trivia = codigo_trivia;
    }

    public String getNombre_trivia() {
        return nombre_trivia;
    }

    public void setNombre_trivia(String nombre_trivia) {
        this.nombre_trivia = nombre_trivia;
    }
    
    //Metodos

    @Override
    public String toString() {
        return "Trivia{" + "codigo_trivia=" + codigo_trivia + ", nombre_trivia=" + nombre_trivia + '}';
    }
    
}
