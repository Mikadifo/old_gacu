
package clases;

public class Trivia_PR {
    //Atributos
    private String codigo_trivia;
    private String codigo_pregunta;
    private String codigo_respuesta;
    
    //Constructores

    public Trivia_PR() {
    }

    public Trivia_PR(String codigo_trivia, String codigo_pregunta, String codigo_respuesta) {
        this.codigo_trivia = codigo_trivia;
        this.codigo_pregunta = codigo_pregunta;
        this.codigo_respuesta = codigo_respuesta;
    }
    
    //Getters and Setters

    public String getCodigo_trivia() {
        return codigo_trivia;
    }

    public void setCodigo_trivia(String codigo_trivia) {
        this.codigo_trivia = codigo_trivia;
    }

    public String getCodigo_pregunta() {
        return codigo_pregunta;
    }

    public void setCodigo_pregunta(String codigo_pregunta) {
        this.codigo_pregunta = codigo_pregunta;
    }

    public String getCodigo_respuesta() {
        return codigo_respuesta;
    }

    public void setCodigo_respuesta(String codigo_respuesta) {
        this.codigo_respuesta = codigo_respuesta;
    }
    
    //Metodos

    @Override
    public String toString() {
        return "Trivia_PR{" + "codigo_trivia=" + codigo_trivia + ", codigo_pregunta=" + codigo_pregunta + ", codigo_respuesta=" + codigo_respuesta + '}';
    }
    
    
}
