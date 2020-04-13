package baseDatos;

import clases.*;
import java.util.Vector;

public class BaseGeneracionTRIVIAPR {

    BaseGACU base = new BaseGACU();
    //Atributos Trivias
    private Vector<Preguntas> preguntas;
    private Vector<Respuestas> respuestas;
    private Vector<Trivia_PR> triviasPR_Lugares;
    //Fin atributos Trivias

    public BaseGeneracionTRIVIAPR() {
    }
    
    //Metodos trivias
    public Trivia crearGuardarTrivia(String codigoLugar, String codigoTrivia) {
        Trivia trivia = crearTrivia(codigoLugar, codigoTrivia);
        guardarTrivia(trivia);
        return trivia;
    }
    
    public Trivia crearTrivia(String codigoLugar, String codigoTrivia) {
        return new Trivia(codigoTrivia, "Trivia " + base.getLugar(codigoLugar).getNombre_lugar());
    }

    public boolean guardarTrivia(Trivia trivia) {
        return base.crearTrivia(trivia);
    }
    //fin Metodos trivias

    //Metodos preguntas y respuestas
    public void crearGuardarTriviasPR(String codigoLugar) {
        preguntas = new Vector<>();
        respuestas = new Vector<>();
        triviasPR_Lugares = new Vector<>(); //trivias Pr de lugares especificos
        switch (codigoLugar) {
            case "P01":
                preguntas.addElement(new Preguntas("PP01", "Los padres de Octavio Cordero Palacios fueron Coronel Francisco Calderon y Manuela Garaicoa"));
                respuestas.addElement(new Respuestas("RP01", "Verdadero"));

                preguntas.addElement(new Preguntas("PP02", "El 20 de marzo de 1887 fue ejecutado:"));
                respuestas.addElement(new Respuestas("RP02", "Luis Vargas Torres"));
                
                preguntas.addElement(new Preguntas("PP03", "El parque Calderon fue bautizado y rediseñado por-,nació en-el 31 de Julio de 1804 y muere en Mayo de-"));
                respuestas.addElement(new Respuestas("RP03", "Octavio Cordero Palacios,Cuenca,1882"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TP01").getCodigo_trivia(), "PP01", "RP01"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TP02").getCodigo_trivia(), "PP02", "RP02"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TP03").getCodigo_trivia(), "PP03", "RP03"));
                break;
            case "P02":
                preguntas.addElement(new Preguntas("PP04", "La estatua de la Madre simboliza la lucha y libertad de las mujeres"));
                respuestas.addElement(new Respuestas("RP04", "Verdadero"));

                preguntas.addElement(new Preguntas("PP05", "En el parque hay espacios verdes, juego infantiles y un/una:"));
                respuestas.addElement(new Respuestas("RP05", "Planetario"));
                
                preguntas.addElement(new Preguntas("PP06", "Este parque destinado al deporte tuvo como primer campeón olimpico a-y se le a honrado con un/una-dentro el parque, tambien se puede acceder a:"));
                respuestas.addElement(new Respuestas("RP06", "Jefferson Pérez,Estatua,Planetario"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TP04").getCodigo_trivia(), "PP04", "RP04"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TP05").getCodigo_trivia(), "PP05", "RP05"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TP06").getCodigo_trivia(), "PP06", "RP06"));
                break;
            case "P03":
                preguntas.addElement(new Preguntas("PP07", "Un parque atractivo que cuenta con una laguna donde se puede rentar ciclonautas"));
                respuestas.addElement(new Respuestas("RP07", "Verdadero"));

                preguntas.addElement(new Preguntas("PP08", "Este parque esta ubicado en el sector de:"));
                respuestas.addElement(new Respuestas("RP08", "Gapal"));
                
                preguntas.addElement(new Preguntas("PP09", "El parque mas grande de Cuenca, fue inagurado el-de-se puede acceder de manera gratuita los-"));
                respuestas.addElement(new Respuestas("RP09", "19 de marzo,2003,Lunes a Domingo"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TP07").getCodigo_trivia(), "PP07", "RP07"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TP08").getCodigo_trivia(), "PP08", "RP08"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TP09").getCodigo_trivia(), "PP09", "RP09"));
                break;
            case "P04":
                preguntas.addElement(new Preguntas("PP10", "En este parque se pueden realizar desfiles civicos, politicos y folkloricos, por lo tanto es ideal para las actividades culturales"));
                respuestas.addElement(new Respuestas("RP10", "Verdadero"));

                preguntas.addElement(new Preguntas("PP11", "Este parque visitado por turistas y extranjeros se encuentra en frente de la iglesia de:"));
                respuestas.addElement(new Respuestas("RP11", "San Blas"));
                
                preguntas.addElement(new Preguntas("PP12", "El parque San Blas es un parque-de Cuenca, adornado por hermosos-y una pileta de agua, cuyo centro se levanta el busto de-"));
                respuestas.addElement(new Respuestas("RP12", "Tradicional,Jardines,Manuel J.Calle"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TP10").getCodigo_trivia(), "PP10", "RP10"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TP11").getCodigo_trivia(), "PP11", "RP11"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TP012").getCodigo_trivia(), "PP12", "RP12"));
                break;
            case "P05":
                preguntas.addElement(new Preguntas("PP13", "Este parque cuenca con juegos infantiles e instalaciones para deportistas"));
                respuestas.addElement(new Respuestas("RP13", "Falso"));

                preguntas.addElement(new Preguntas("PP14", "Al frente se encuentra el museo de Arte Moderno en el que se realiza:"));
                respuestas.addElement(new Respuestas("RP14", "Bienal de pintura"));
                
                preguntas.addElement(new Preguntas("PP15", "Posee una encantadora-y se levanta el busto del poeta-y al frente se encuentra el museo de-"));
                respuestas.addElement(new Respuestas("RP15", "Pileta,Miguel Moreno,Arte Moderno"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TP13").getCodigo_trivia(), "PP13", "RP13"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TP14").getCodigo_trivia(), "PP14", "RP14"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TP015").getCodigo_trivia(), "PP15", "RP15"));
                break;
            case "I01":
                preguntas.addElement(new Preguntas("PI01", "En su fachada se puede observar como resalta una portada tallada de madera"));
                respuestas.addElement(new Respuestas("RI01", "Falso"));

                preguntas.addElement(new Preguntas("PI02", "Su fundación estuvo acargo de las religiosas del convento:"));
                respuestas.addElement(new Respuestas("RI02", "San Jose"));
                
                preguntas.addElement(new Preguntas("PI03", "Al pie de la plaza de las-un lugar turistico bastante-ubicado en el-de la ciudad"));
                respuestas.addElement(new Respuestas("RI03", "Flores,Visitado,Centro"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TI01").getCodigo_trivia(), "PI01", "RI01"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TI02").getCodigo_trivia(), "PI02", "RI02"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TI03").getCodigo_trivia(), "PI03", "RI03"));
                break;
            case "I02":
                preguntas.addElement(new Preguntas("PI04", "La catedral vieja es la mas anigua de Cuenca"));
                respuestas.addElement(new Respuestas("RI04", "Falso"));

                preguntas.addElement(new Preguntas("PI05", "La catedral vieja fue construida hace:"));
                respuestas.addElement(new Respuestas("RI05", "10 Años"));
                
                preguntas.addElement(new Preguntas("PI06", "La iglesia mas antigua es-como hoy es conocida. Piedras labradas traidas de la incásica-sirvieron para los cimientos y las bases de los -"));
                respuestas.addElement(new Respuestas("RI06", "Catedral Vieja,Tomebamba,Muros"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TI04").getCodigo_trivia(), "PI04", "RI04"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TI05").getCodigo_trivia(), "PI05", "RI05"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TI06").getCodigo_trivia(), "PI06", "RI06"));
                break;
            case "I03":
                preguntas.addElement(new Preguntas("PI07", "Representa el limite occidental de la ciudad"));
                respuestas.addElement(new Respuestas("RI07", "Falso"));

                preguntas.addElement(new Preguntas("PI08", "El interior y exterior se restauró en el año:"));
                respuestas.addElement(new Respuestas("RI08", "1910"));
                
                preguntas.addElement(new Preguntas("PI09", "La construccion de este templo fue dedicado a-y se remonta al ultimo tercio del siglo-,se utilizaron piedras de los edificios destruidos de-para su edificación"));
                respuestas.addElement(new Respuestas("RI09", "San Blas,XVI,Tomebamba"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TI07").getCodigo_trivia(), "PI07", "RI07"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TI08").getCodigo_trivia(), "PI08", "RI08"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TI09").getCodigo_trivia(), "PI09", "RI09"));
                break;
            case "I04":
                preguntas.addElement(new Preguntas("PI10", "El templo continua con sus caracteristicas principales de su origen"));
                respuestas.addElement(new Respuestas("RI10", "Verdadero"));

                preguntas.addElement(new Preguntas("PI11", "En el interior del templo se puede apreciar:"));
                respuestas.addElement(new Respuestas("RI11", "Una bella pintura"));
                
                preguntas.addElement(new Preguntas("PI12", "Segun los historiadores esta fue la primera-de Cuenca y llevaba el nombre de-la primera misa fue realizada por-"));
                respuestas.addElement(new Respuestas("RI12", "Ermita,Usno,Fray Alonso"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TI10").getCodigo_trivia(), "PI10", "RI10"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TI11").getCodigo_trivia(), "PI11", "RI11"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TI12").getCodigo_trivia(), "PI12", "RI12"));
                break;
            case "I05":
                preguntas.addElement(new Preguntas("PI13", "Se puede visitar la cupula y cripta de la catedral solo los dias martes y jueves"));
                respuestas.addElement(new Respuestas("RI13", "Falso"));

                preguntas.addElement(new Preguntas("PI14", "El estilo que comprende la catedran nueva es:"));
                respuestas.addElement(new Respuestas("RI14", "Renacentista"));
                
                preguntas.addElement(new Preguntas("PI15", "La catedral nueva es el simbolo-mas representativo de la ciudad, su volumen,-y color, se divisan desde todos los angulos de-"));
                respuestas.addElement(new Respuestas("RI15", "Religioso,Textura,Cuenca "));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TI13").getCodigo_trivia(), "PI13", "RI13"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TI14").getCodigo_trivia(), "PI14", "RI14"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TI15").getCodigo_trivia(), "PI15", "RI15"));
                break;
            case "M01":
                preguntas.addElement(new Preguntas("PM01", "¿El museo cuenta con un parque o Zoologico?"));
                respuestas.addElement(new Respuestas("RM01", "Verdadero"));

                preguntas.addElement(new Preguntas("PM02", "El museo comprende varios compontes interesantes como:"));
                respuestas.addElement(new Respuestas("RM02", "Sala Etnográfica Nacional"));
                
                preguntas.addElement(new Preguntas("PM03", "El Museo y Parque Ancestral Pumapungo son parte del-que hace de Cuenca una ciudad llena de interesantes propuestas-.Es deber de todos-y respetarlos "));
                respuestas.addElement(new Respuestas("RM03", "Patrimonio,Artístico-Culturales,Valorarlo"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TM01").getCodigo_trivia(), "PM01", "RM01"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TM02").getCodigo_trivia(), "PM02", "RM02"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TM03").getCodigo_trivia(), "PM03", "RM03"));
                break;
            case "M02":
                preguntas.addElement(new Preguntas("PM04", "Es considerado el Museo menos completo de la ciudad de Cuenca y todo el mundo."));
                respuestas.addElement(new Respuestas("RM04", "Falso"));

                preguntas.addElement(new Preguntas("PM05", "El Museo funciona en una casa del siglo:"));
                respuestas.addElement(new Respuestas("RM05", "XVIII"));
                
                preguntas.addElement(new Preguntas("PM06", "Este es un museo cuenta con más de-piezas arqueológicas correspondientes a todos los-de la historia aborigen de-"));
                respuestas.addElement(new Respuestas("RM06", "8000,Periodos,Ecuador"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TM04").getCodigo_trivia(), "PM04", "RM04"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TM05").getCodigo_trivia(), "PM05", "RM05"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TM06").getCodigo_trivia(), "PM06", "RM06"));
                break;
            case "M03":
                preguntas.addElement(new Preguntas("PM07", "El Museo Municipal de Arte Moderno abrió sus puertas el 1 de agosto de 1981"));
                respuestas.addElement(new Respuestas("RM07", "Verdadero"));

                preguntas.addElement(new Preguntas("PM08", "El Museo cuenta con varias muestras de:"));
                respuestas.addElement(new Respuestas("RM08", "Guayasamín"));
                
                preguntas.addElement(new Preguntas("PM09", "La casa en donde funciona el Museo-de Arte Moderno pertenece a la arquitectura-antigua de tipo-"));
                respuestas.addElement(new Respuestas("RM09", "Municipal,Regional,Institucional"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TM07").getCodigo_trivia(), "PM07", "RM07"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TM08").getCodigo_trivia(), "PM08", "RM08"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TM09").getCodigo_trivia(), "PM09", "RM09"));
                break;
            case "M04":
                preguntas.addElement(new Preguntas("PM10", "¿Santiago Piñas es director del museo?"));
                respuestas.addElement(new Respuestas("RM10", "Falso"));

                preguntas.addElement(new Preguntas("PM11", "El museo es una herramienta que tratar de acercar a la ciencia y a la: "));
                respuestas.addElement(new Respuestas("RM11", "Sociedad"));
                
                preguntas.addElement(new Preguntas("PM12", "Constituye desde el 10 de abril del-un nuevo y original espacio que contribuye para ampliar los conocimientos acerca del mundo-, a través de la-cientifica"));
                respuestas.addElement(new Respuestas("RM12", "2001,Investigación"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TM10").getCodigo_trivia(), "PM10", "RM10"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TM11").getCodigo_trivia(), "PM11", "RM11"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TM12").getCodigo_trivia(), "PM12", "RM12"));
                break;
            case "M05":
                preguntas.addElement(new Preguntas("PM13", "Fue descubierta en noviembre de 1953"));
                respuestas.addElement(new Respuestas("RM13", "Falso"));

                preguntas.addElement(new Preguntas("PM14", "¿En que año se realizo las excavaciones arqueologicas?"));
                respuestas.addElement(new Respuestas("RM14", "1972"));
                
                preguntas.addElement(new Preguntas("PM15", "Las Ruinas de Todos los Santos, constituye un sitio-.Aquí podemos encontrar-que fueron descubiertos durante los trabajos de-"));
                respuestas.addElement(new Respuestas("RM15", "Arqueológico,Vestigios,Excavación"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TM13").getCodigo_trivia(), "PM13", "RM13"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TM14").getCodigo_trivia(), "PM14", "RM14"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TM15").getCodigo_trivia(), "PM15", "RM15"));
                break;
            case "E01":
                preguntas.addElement(new Preguntas("PE01", "La Universidad de Cuenca se denominó inicialmente como Corporación Universitaria del Azuay"));
                respuestas.addElement(new Respuestas("RE01", "Verdadero"));

                preguntas.addElement(new Preguntas("PE02", "La mision de la Universidad de Cuenca es:"));
                respuestas.addElement(new Respuestas("RE02", "Formar profesionales y científicos"));
                
                preguntas.addElement(new Preguntas("PE03", "La universidad de-fue creada oficialmente por el decreto-en el año-además de ser muy reconocida a nivel de Latinoamérica"));
                respuestas.addElement(new Respuestas("RE03", "Cuenca,Legislativo,1867"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TE01").getCodigo_trivia(), "PE01", "RE01"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TE02").getCodigo_trivia(), "PE02", "RE02"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TE03").getCodigo_trivia(), "PE03", "RE03"));
                break;
            case "E02":
                preguntas.addElement(new Preguntas("PE04", "Las dos unidades académicas que solicitaron su anexión a la Pontificia Universidad Católica del Ecuador fueron la Universidad de Cuenca y la Universidad Politecnica"));
                respuestas.addElement(new Respuestas("RE04", "Falso"));

                preguntas.addElement(new Preguntas("PE05", "El primer director del Instituto fue"));
                respuestas.addElement(new Respuestas("RE05", "Agustín López Conesa"));
                
                preguntas.addElement(new Preguntas("PE06", "UDA. Nació en el año-como una institución-y con la autorización de la-, sin embargo, la inauguración oficial de la institución se llevó a cabo el 2 de mayo de 1969."));
                respuestas.addElement(new Respuestas("RE06", "1968,Filial,Santa Sede"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TE04").getCodigo_trivia(), "PE04", "RE04"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TE05").getCodigo_trivia(), "PE05", "RE05"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TE06").getCodigo_trivia(), "PE06", "RE06"));
                break;
            case "E03":
                preguntas.addElement(new Preguntas("PE07", "El presidente José María Velasco Ibarra firmó el decreto de creación de la universidad el 17 de octubre de 1970."));
                respuestas.addElement(new Respuestas("RE07", "Falso"));

                preguntas.addElement(new Preguntas("PE08", "¿En que año se se abrieron las extensiones universitarias de Morona Santiago?"));
                respuestas.addElement(new Respuestas("RE08", "1970"));
                
                preguntas.addElement(new Preguntas("PE09", "La Universidad Católica de Cuenca fue creada por gestiones personales del sacerdote-, quien había creado en-la escuela arzobispo Serrano, en 1962 el colegio normal católico-y después otros centros educativos."));
                respuestas.addElement(new Respuestas("RE09", "César Cordero Moscoso,1955,Miguel Cordero Crespo"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TE07").getCodigo_trivia(), "PE07", "RE07"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TE08").getCodigo_trivia(), "PE08", "RE08"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TE09").getCodigo_trivia(), "PE09", "RE09"));
                break;
            case "E04":
                preguntas.addElement(new Preguntas("PE10", "En 1897 el gobierno de Ecuador firmó un convenio con Don Bosco para que los salesianos tomaran bajo su responsabilidad el Protectorado Católico de Artes y Oficios en Quito"));
                respuestas.addElement(new Respuestas("RE10", "Falso"));

                preguntas.addElement(new Preguntas("PE11", "¿Cuantos estudiantes se registraron en el año 2016 en el Ecuador?"));
                respuestas.addElement(new Respuestas("RE11", "25.545"));
                
                preguntas.addElement(new Preguntas("PE12", "La Universidad Politécnica Salesiana del Ecuador es una obra de la-La UPS fue fundada el-de agosto de 1994 en la ciudad de Cuenca y tiene sedes en-y Guayaquil"));
                respuestas.addElement(new Respuestas("RE12", "Congregación Salesiana,5,Quito"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TE10").getCodigo_trivia(), "PE10", "RE10"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TE11").getCodigo_trivia(), "PE11", "RE11"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TE12").getCodigo_trivia(), "PE12", "RE12"));
                break;
            case "E05":
                preguntas.addElement(new Preguntas("PE13", "Las siglas ISTA significan Instituto Superior Trabajador Ambiental"));
                respuestas.addElement(new Respuestas("RE13", "Falso"));

                preguntas.addElement(new Preguntas("PE14", "Uno de los principios en ISTA es:"));
                respuestas.addElement(new Respuestas("RE14", "Inclusión"));
                
                preguntas.addElement(new Preguntas("PE15", "El Instituto Superior Tecnológico del Azuay es una institución de-a nivel-, dedicada a formar-comprometidos éticamente con la sociedad"));
                respuestas.addElement(new Respuestas("RE15", "Educación Superior,Técnico y tecnológico,Profesionales"));
                
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TE13").getCodigo_trivia(), "PE13", "RE13"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TE14").getCodigo_trivia(), "PE14", "RE14"));
                triviasPR_Lugares.add(crearGuardarTriviaPR(crearGuardarTrivia(codigoLugar, "TE15").getCodigo_trivia(), "PE15", "RE15"));
                break;
            default:
                System.err.println("Lugar no encontrado!!!");
        }
        guardarPreguntasRespuestas();
    }
    
    public void guardarPreguntasRespuestas() {
        preguntas.forEach((elemento) -> {
            base.crearPregunta(elemento);
        });
        respuestas.forEach((elemento) -> {
            base.crearRespuesta(elemento); 
        });
    }
    //Fin Metodos preguntas y respuestas
    
    //Metodos TRIVIA_PR
    public Trivia_PR crearGuardarTriviaPR(String codigoTrivia, String codigoPregunta, String codigoRespuesta) {
        Trivia_PR trivia_PR = crearTrivia_PR(codigoTrivia, codigoPregunta, codigoRespuesta);
        guardarTrivia_PR(trivia_PR);
        return trivia_PR;
    }
    
    public Trivia_PR crearTrivia_PR(String codigoTrivia, String codigoPregunta, String codigoRespuesta) {
        return new Trivia_PR(codigoTrivia, codigoPregunta, codigoRespuesta);
    }
    
    public boolean guardarTrivia_PR(Trivia_PR trivia_PR) {
        return base.crearTrivia_PR(trivia_PR);
    }
    //FIN Metodos TRIVIA_PR

    public Vector<Trivia_PR> getTriviasPR_Lugares() {
        return triviasPR_Lugares;
    }

}
