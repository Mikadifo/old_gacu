package baseDatos;

import clases.*;
import java.util.Vector;

public class DefaultBase {

    BaseGACU base = new BaseGACU();
    //Atributos Trivias
    private static int triviaAcum = 0;
    private Vector<Preguntas> preguntas = new Vector<>(); //60
    private Vector<Respuestas> respuestas = new Vector<>(); //60
    //Fin atributos Trivias

    public DefaultBase() {
    }
    
    //Metodos trivias
    public Trivia crearGuardarTrivia(String codigoLugar) {
        Trivia trivia = crearTrivia(codigoLugar);
        guardarTrivia(trivia);
        return trivia;
    }
    
    public Trivia crearTrivia(String codigoLugar) {
        return new Trivia("T0" + (++triviaAcum), "Trivia " + base.getLugar(codigoLugar).getNombre_lugar());
    }

    public boolean guardarTrivia(Trivia trivia) {
        return base.crearTrivia(trivia);
    }
    //fin Metodos trivias

    //Metodos preguntas y respuestas
    public boolean crearGuardarTriviaPRParques(String codigoLugar) {
        
        switch (codigoLugar) {
            case "P01":
                preguntas.addElement(new Preguntas("PP01", "Los padres de Octavio Cordero Palacios fueron Coronel Francisco Calderon y Manuela Garaicoa"));
                respuestas.addElement(new Respuestas("RP01", "Verdadero"));

                preguntas.addElement(new Preguntas("PP02", "El 20 de marzo de 1887 fue ejecutado:"));
                respuestas.addElement(new Respuestas("RP02", "Luis Vargas Torres"));
                
                preguntas.addElement(new Preguntas("PP03", "El parque Calderon fue bautizado y rediseñado por-,nació en-el 31 de Julio de 1804 y muere en Mayo de-"));
                respuestas.addElement(new Respuestas("RP03", "Octavio Cordero Palacios,Cuenca,1882"));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PP01", "RP01") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PP02", "RP02") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PP03", "RP03");
            case "P02":
                preguntas.addElement(new Preguntas("PP04", "La estatua de la Madre simboliza la lucha y libertad de las mujeres"));
                respuestas.addElement(new Respuestas("RP04", "Verdadero"));

                preguntas.addElement(new Preguntas("PP05", "En el parque hay espacios verdes, juego infantiles y un/una:"));
                respuestas.addElement(new Respuestas("RP05", "Planetario"));
                
                preguntas.addElement(new Preguntas("PP06", "Este parque destinado al deporte tuvo como primer campeón olimpico a-y se le a honrado con un/una-dentro el parque, tambien se puede acceder a:"));
                respuestas.addElement(new Respuestas("RP06", "Jefferson Pérez,Estatua,Planetario"));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PP04", "RP04") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PP05", "RP05") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PP06", "RP06");
            case "P03":
                preguntas.addElement(new Preguntas("PP07", "Un parque atractivo que cuenta con una laguna donde se puede rentar ciclonautas"));
                respuestas.addElement(new Respuestas("RP07", "Verdadero"));

                preguntas.addElement(new Preguntas("PP08", "Este parque esta ubicado en el sector de:"));
                respuestas.addElement(new Respuestas("RP08", "Gapal"));
                
                preguntas.addElement(new Preguntas("PP09", "El parque mas grande de Cuenca, fue inagurado el-de-se puede acceder de manera gratuita los-"));
                respuestas.addElement(new Respuestas("RP09", "19 de marzo,2003,Lunes a Domingo"));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PP07", "RP07") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PP08", "RP08") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PP09", "RP09");
            case "P04":
                preguntas.addElement(new Preguntas("PP10", "En este parque se pueden realizar desfiles civicos, politicos y folkloricos, por lo tanto es ideal para las actividades culturales"));
                respuestas.addElement(new Respuestas("RP10", "Verdadero"));

                preguntas.addElement(new Preguntas("PP11", "Este parque visitado por turistas y extranjeros se encuentra en frente de la iglesia de:"));
                respuestas.addElement(new Respuestas("RP11", "San Blas"));
                
                preguntas.addElement(new Preguntas("PP12", "El parque San Blas es un parque-de Cuenca, adornado por hermosos-y una pileta de agua, cuyo centro se levanta el busto de-"));
                respuestas.addElement(new Respuestas("RP12", "Tradicional,Jardines,Manuel J.Calle"));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PP10", "RP10") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PP11", "RP11") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PP12", "RP12");
            case "P05":
                preguntas.addElement(new Preguntas("PP13", "Este parque cuenca con juegos infantiles e instalaciones para deportistas"));
                respuestas.addElement(new Respuestas("RP13", "Falso"));

                preguntas.addElement(new Preguntas("PP14", "Al frente se encuentra el museo de Arte Moderno en el que se realiza:"));
                respuestas.addElement(new Respuestas("RP14", "Bienal de pintura"));
                
                preguntas.addElement(new Preguntas("PP15", "Posee una encantadora-y se levanta el busto del poeta-y al frente se encuentra el museo de-"));
                respuestas.addElement(new Respuestas("RP15", "Pileta,Miguel Moreno,Arte Moderno"));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PP13", "RP13") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PP14", "RP14") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PP15", "RP15");
            default:
                System.err.println("Parque no encontrado!!!");
                return false;
        }
    }
    
    public boolean crearGuardarTriviaPRIglesias(String codigoLugar) {
        switch (codigoLugar) {
            case "I01":
                preguntas.addElement(new Preguntas("PI01", "En su fachada se puede observar como resalta una portada tallada de madera"));
                respuestas.addElement(new Respuestas("RI01", "Falso"));

                preguntas.addElement(new Preguntas("PI02", "Su fundación estuvo de las religiosas de convento:"));
                respuestas.addElement(new Respuestas("RI02", "San Jose"));
                
                preguntas.addElement(new Preguntas("PI03", "Al pie de la plaza de las-un lugar turistico bastante-ubicado en el-de la ciudad"));
                respuestas.addElement(new Respuestas("RI03", "Flores,Visitado,Centro"));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PI01", "RI01") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PI02", "RI02") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PI03", "RI03");
            case "I02":
                preguntas.addElement(new Preguntas("PI04", "La catedral vieja es la mas anigua de Cuenca"));
                respuestas.addElement(new Respuestas("RI04", "Falso"));

                preguntas.addElement(new Preguntas("PI05", "La catedral vieja fue construida hace:"));
                respuestas.addElement(new Respuestas("RI05", "10 Años"));
                
                preguntas.addElement(new Preguntas("PI06", "La iglesia mas antigua es-como hoy es conocida, piedras labradas traidas de la incasia-sirvieron para las bases de-"));
                respuestas.addElement(new Respuestas("RI06", "Catedral Vieja,Tomebamba,Muros"));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PI04", "RI04") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PI05", "RI05") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PI06", "RI06");
            case "I03":
                preguntas.addElement(new Preguntas("PI07", "Representa el limite occidental de la ciudad"));
                respuestas.addElement(new Respuestas("RI07", "Verdadero"));

                preguntas.addElement(new Preguntas("PI08", "El interior y exterior se restauró en el año:"));
                respuestas.addElement(new Respuestas("RI08", "1910"));
                
                preguntas.addElement(new Preguntas("PI09", "La construccion de este templo fue dedicado a-y se remonta al ultimo tercio del siglo-,se utilizaron piedras de los edificios destruidos de-para su edificación"));
                respuestas.addElement(new Respuestas("RI09", "San Blas,XVI,Tomebamba"));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PI07", "RI07") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PI08", "RI08") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PI09", "RI09");
            case "I04":
                preguntas.addElement(new Preguntas("PI10", "El templo continua con sus caracteristicas principales de su origen"));
                respuestas.addElement(new Respuestas("RI10", "Verdadero"));

                preguntas.addElement(new Preguntas("PI11", "En el interior del templo se puede apreciar:"));
                respuestas.addElement(new Respuestas("RI11", "Una bella pintura"));
                
                preguntas.addElement(new Preguntas("PI12", "Segun los historiadores esta fue la primera-de Cuenca y llevaba el nombre de-la primera misa fue realizada por-"));
                respuestas.addElement(new Respuestas("RI12", "Ermita,Usno,Fray Alonso"));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PI10", "RI10") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PI11", "RI11") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PI12", "RI12");
            case "I05":
                preguntas.addElement(new Preguntas("PI13", "Se puede visitar la cupula y cripta de la catedral solo los dias martes y jueves"));
                respuestas.addElement(new Respuestas("RI13", "Falso"));

                preguntas.addElement(new Preguntas("PI14", "El estilo que comprende la catedran nueva es:"));
                respuestas.addElement(new Respuestas("RI14", "Renacentista"));
                
                preguntas.addElement(new Preguntas("PI15", "La catedral nueva es el simbolo-mas representativo de cuenca, su volumen,-y color, se divisan desde todos los angulos de-"));
                respuestas.addElement(new Respuestas("RI15", ""));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PI13", "RI13") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PI14", "RI14") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PI15", "RI15");
            default:
                System.err.println("Iglesia no encontrada!!!");
                return false;
        }
    }
    
    public boolean crearGuardarTriviaPRMuseos(String codigoLugar) { //terminar
        switch (codigoLugar) {
            case "M01":
                preguntas.addElement(new Preguntas("PM01", ""));
                respuestas.addElement(new Respuestas("RM01", ""));

                preguntas.addElement(new Preguntas("PM02", ""));
                respuestas.addElement(new Respuestas("RM02", ""));
                
                preguntas.addElement(new Preguntas("PM03", ""));
                respuestas.addElement(new Respuestas("RM03", ""));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PM01", "RM01") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PM02", "RM02") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PM03", "RM03");
            case "M02":
                preguntas.addElement(new Preguntas("PM04", ""));
                respuestas.addElement(new Respuestas("RM04", ""));

                preguntas.addElement(new Preguntas("PM05", ""));
                respuestas.addElement(new Respuestas("RM05", ""));
                
                preguntas.addElement(new Preguntas("PM06", ""));
                respuestas.addElement(new Respuestas("RM06", ""));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PM04", "RM04") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PM05", "RM05") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PM06", "RM06");
            case "M03":
                preguntas.addElement(new Preguntas("PM07", ""));
                respuestas.addElement(new Respuestas("RM07", ""));

                preguntas.addElement(new Preguntas("PM08", ""));
                respuestas.addElement(new Respuestas("RM08", ""));
                
                preguntas.addElement(new Preguntas("PM09", ""));
                respuestas.addElement(new Respuestas("RM09", ""));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PM07", "RM07") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PM08", "RM08") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PM09", "RM09");
            case "M04":
                preguntas.addElement(new Preguntas("PM10", ""));
                respuestas.addElement(new Respuestas("RM10", ""));

                preguntas.addElement(new Preguntas("PM11", ""));
                respuestas.addElement(new Respuestas("RM11", ""));
                
                preguntas.addElement(new Preguntas("PM12", ""));
                respuestas.addElement(new Respuestas("RM12", ""));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PM10", "RM10") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PM11", "RM11") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PM12", "RM12");
            case "M05":
                preguntas.addElement(new Preguntas("PM13", ""));
                respuestas.addElement(new Respuestas("RM13", ""));

                preguntas.addElement(new Preguntas("PM14", ""));
                respuestas.addElement(new Respuestas("RM14", ""));
                
                preguntas.addElement(new Preguntas("PM15", ""));
                respuestas.addElement(new Respuestas("RM15", ""));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PM13", "RM13") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PM14", "RM14") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PM15", "RM15");
            default:
                System.err.println("Museo no encontrado!!!");
                return false;
        }
    }
    
    public boolean crearGuardarTriviaPRESuperior(String codigoLugar) { //terminar
        switch (codigoLugar) {
            case "E01":
                preguntas.addElement(new Preguntas("PES01", ""));
                respuestas.addElement(new Respuestas("RES01", ""));

                preguntas.addElement(new Preguntas("PES02", ""));
                respuestas.addElement(new Respuestas("RES02", ""));
                
                preguntas.addElement(new Preguntas("PES03", ""));
                respuestas.addElement(new Respuestas("RES03", ""));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PES01", "RES01") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PES02", "RES02") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PES03", "RES03");
            case "E02":
                preguntas.addElement(new Preguntas("PES04", ""));
                respuestas.addElement(new Respuestas("RES04", ""));

                preguntas.addElement(new Preguntas("PES05", ""));
                respuestas.addElement(new Respuestas("RES05", ""));
                
                preguntas.addElement(new Preguntas("PES06", ""));
                respuestas.addElement(new Respuestas("RES06", ""));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PES04", "RES04") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PES05", "RES05") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PES06", "RES06");
            case "E03":
                preguntas.addElement(new Preguntas("PES07", ""));
                respuestas.addElement(new Respuestas("RES07", ""));

                preguntas.addElement(new Preguntas("PES08", ""));
                respuestas.addElement(new Respuestas("RES08", ""));
                
                preguntas.addElement(new Preguntas("PES09", ""));
                respuestas.addElement(new Respuestas("RES09", ""));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PES07", "RES07") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PES08", "RES08") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PES09", "RES09");
            case "E04":
                preguntas.addElement(new Preguntas("PES10", ""));
                respuestas.addElement(new Respuestas("RES10", ""));

                preguntas.addElement(new Preguntas("PES11", ""));
                respuestas.addElement(new Respuestas("RES11", ""));
                
                preguntas.addElement(new Preguntas("PES12", ""));
                respuestas.addElement(new Respuestas("RES12", ""));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PES10", "RES10") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PES11", "RES11") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PES12", "RES12");
            case "E05":
                preguntas.addElement(new Preguntas("PES13", ""));
                respuestas.addElement(new Respuestas("RES13", ""));

                preguntas.addElement(new Preguntas("PES14", ""));
                respuestas.addElement(new Respuestas("RES14", ""));
                
                preguntas.addElement(new Preguntas("PES15", ""));
                respuestas.addElement(new Respuestas("RES15", ""));
                
                guardarPreguntasRespuestas();
                return crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PES13", "RES13") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PES14", "RES14") && crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar).getCodigo_trivia(), "PES15", "RES15");
            default:
                System.err.println("Instituto/Universidad no encontrada/o!!!");
                return false;
        }
    }
    
    public void guardarPreguntasRespuestas() {
        preguntas.forEach((elemento) -> {
            if (base.crearPregunta(elemento)) {
                System.err.println("Pregunta " + elemento.getCodigo_pregunta() + " creada");
            } else {
                System.err.println("Pregunta " + elemento.getCodigo_pregunta() + " ya existe");
            }
        });
        respuestas.forEach((elemento) -> {
            if (base.crearRespuesta(elemento)) {
                System.err.println("Respuesta " + elemento.getCodigo_respuesta()+ " creada");
            } else {
                System.err.println("Respuesta " + elemento.getCodigo_respuesta() + " ya existe");
            }
        });
    }
    //Fin Metodos preguntas y respuestas
    
    //Metodos TRIVIA_PR
    public boolean crearGuardarTriviaPR(String codigoTrivia, String codigoPregunta, String codigoRespuesta) {
        return guardarTrivia_PR(crearTrivia_PR(codigoTrivia, codigoPregunta, codigoRespuesta));
    }
    
    public Trivia_PR crearTrivia_PR(String codigoTrivia, String codigoPregunta, String codigoRespuesta) {
        return new Trivia_PR(codigoTrivia, codigoPregunta, codigoRespuesta);
    }
    
    public boolean guardarTrivia_PR(Trivia_PR trivia_PR) {
        return base.crearTrivia_PR(trivia_PR);
    }
    //FIN Metodos TRIVIA_PR

}
