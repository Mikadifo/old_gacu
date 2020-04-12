package clases;

public class Preguntas {
    //Atributos
    private String codigo_pregunta;
    private String pregunta;
    
    //Constructores

    public Preguntas() {
    }

    public Preguntas(String codigo_pregunta, String pregunta) {
        this.codigo_pregunta = codigo_pregunta;
        this.pregunta = pregunta;
    }
    
    //Getters and Setters

    public String getCodigo_pregunta() {
        return codigo_pregunta;
    }

    public void setCodigo_pregunta(String codigo_pregunta) {
        this.codigo_pregunta = codigo_pregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    //Metodos

    @Override
    public String toString() {
        return "Preguntas{" + "codigo_pregunta=" + codigo_pregunta + ", pregunta=" + pregunta + '}';
    }
    
    
}
