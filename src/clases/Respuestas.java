package clases;

public class Respuestas {
    //Atributos
    private String codigo_respuesta;
    private String respuesta;
    
    //Constructores

    public Respuestas() {
    }

    public Respuestas(String codigo_respuesta, String respuesta) {
        this.codigo_respuesta = codigo_respuesta;
        this.respuesta = respuesta;
    }
    
    //Getters and Setters

    public String getCodigo_respuesta() {
        return codigo_respuesta;
    }

    public void setCodigo_respuesta(String codigo_respuesta) {
        this.codigo_respuesta = codigo_respuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    //Metodos

    @Override
    public String toString() {
        return "Respuestas{" + "codigo_respuesta=" + codigo_respuesta + ", respuesta=" + respuesta + '}';
    }
    
    
}
