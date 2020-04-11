package baseDatos;

import com.db4o.*;
import java.io.File;
import clases.*;
import java.util.Vector;

public class BaseGACU {

    //VARIABLES
    private final File carpetaBase = new File("baseDatos"); //carpeta de la base
    private String rutaCarpeta = carpetaBase.getAbsolutePath();
    private String signoRuta = (rutaCarpeta.contains("/")) ? "/" : "\\";
    private ObjectContainer base;
    private final String rutaArchivo = rutaCarpeta + signoRuta + "gacuBD.yap"; //archivo de la base de datos

    private BaseUsuario baseUsuario = new BaseUsuario();
    private BaseCategoria baseCategoria = new BaseCategoria();
    private BaseLugares baseLugar = new BaseLugares();
    private BaseImagenes baseImagen = new BaseImagenes();
    private BaseTrivia baseTrivia = new BaseTrivia();
    private BaseRespuestas baseRespuestas = new BaseRespuestas();
    private BasePreguntas basePreguntas = new BasePreguntas();
    private BaseCategoria_Lugar baseCategoria_Lugar = new BaseCategoria_Lugar();
    private BaseLugar_Imagen baseLugar_Imagen = new BaseLugar_Imagen();
    private BaseRealiza baseRealiza = new BaseRealiza();
    private BaseTrivia_PR baseTrivia_PR = new BaseTrivia_PR();
    private BaseVisualiza baseVisualiza = new BaseVisualiza();

    //FIN VARIABLES
    //CONSTRUCTORES
    public BaseGACU() {
        comprobarArchivos();
    }
    //FIN CONSTRUCTORES

    //METODOS GENERALES
    private void comprobarArchivos() {
        if (!carpetaBase.exists()) {
            do {
            } while (!carpetaBase.mkdir());
        }
    }

    public ObjectContainer abrirBase(String ruta) {
        base = Db4o.openFile(ruta);
        return base;
    }

    public void cerrarBase() {
        base.close();
    }
    //FIN METODOS GENERALES

    //METODOS USUARIO
    public boolean crearUsuario(Usuario usuario) {
        boolean estado = baseUsuario.crearUsuario(abrirBase(rutaArchivo), usuario);
        cerrarBase();
        return estado;
    }

    public Vector<Usuario> getUsuarios() {
        Vector<Usuario> usuarios = baseUsuario.getUsuarios(abrirBase(rutaArchivo));
        cerrarBase();
        return usuarios;
    }

    public Usuario getUsuario(String cedula) {
        Usuario usuarioResultado = baseUsuario.getUsuario(abrirBase(rutaArchivo), cedula);
        cerrarBase();
        return usuarioResultado;
    }

    public boolean modificarUsuario(Usuario usuarioNuevo) {
        boolean estado = baseUsuario.modificarUsuario(abrirBase(rutaArchivo), usuarioNuevo);
        cerrarBase();
        return estado;
    }

    public boolean eliminarUsuario(String cedula) {
        boolean estado = baseUsuario.eliminarUsuario(abrirBase(rutaArchivo), cedula);
        cerrarBase();
        return estado;
    }

    public int solicitarIngresoUsuario(String cedula, String contrasena) { //-1->pwd incorrecta 0->no existe 1->correcto
        int resultado = baseUsuario.solicitarIngresoUsuario(abrirBase(rutaArchivo), cedula, contrasena);
        cerrarBase();
        return resultado;
    }
    //FIN METODOS USUARIO

    //METODOS CATEGORIA
    public boolean crearCategoria(Categoria categoria) {
        boolean estado = baseCategoria.crearCategoria(abrirBase(rutaArchivo), categoria);
        cerrarBase();
        return estado;
    }

    public Vector<Categoria> getCategorias() {
        Vector<Categoria> categorias = baseCategoria.getCategorias(abrirBase(rutaArchivo));
        cerrarBase();
        return categorias;
    }

    public Categoria getCategoria(String codigo) {
        Categoria categoriaResultado = baseCategoria.getCategoria(abrirBase(rutaArchivo), codigo);
        cerrarBase();
        return categoriaResultado;
    }

    public boolean modificarCategoria(Categoria categoriaNueva) {
        boolean estado = baseCategoria.modificarCategoria(abrirBase(rutaArchivo), categoriaNueva);
        cerrarBase();
        return estado;
    }

    public boolean eliminarCategoria(String codigo) {
        boolean estado = baseCategoria.eliminarCategoria(abrirBase(rutaArchivo), codigo);
        cerrarBase();
        return estado;
    }
    //FIN METODOS CATEGORIA

    //METODOS LUGARES
    public boolean crearLugar(Lugares lugar) {
        boolean estado = baseLugar.crearLugar(abrirBase(rutaArchivo), lugar);
        cerrarBase();
        return estado;
    }

    public Vector<Lugares> getLugares() {
        Vector<Lugares> lugares = baseLugar.getLugares(abrirBase(rutaArchivo));
        cerrarBase();
        return lugares;
    }

    public Lugares getLugar(String codigo) {
        Lugares LugarResultado = baseLugar.getLugar(abrirBase(rutaArchivo), codigo);
        cerrarBase();
        return LugarResultado;
    }

    public boolean modificarLugar(Lugares lugarNueva) {
        boolean estado = baseLugar.modificarLugar(abrirBase(rutaArchivo), lugarNueva);
        cerrarBase();
        return estado;
    }

    public boolean eliminarLugar(String codigo) {
        boolean estado = baseLugar.eliminarLugar(abrirBase(rutaArchivo), codigo);
        cerrarBase();
        return estado;
    }
    //FIN METODOS LUGARES

    //INICIO METODOS IMAGEN
    public boolean crearImagen(Imagenes imagen) {
        boolean estado = baseImagen.crearImagen(abrirBase(rutaArchivo), imagen);
        cerrarBase();
        return estado;
    }

    public Vector<Imagenes> getImagenes() {
        Vector<Imagenes> imagenes = baseImagen.getImagenes(abrirBase(rutaArchivo));
        cerrarBase();
        return imagenes;
    }

    public Imagenes getImagen(String codigo) {
        Imagenes ImagenResultado = baseImagen.getImagen(abrirBase(rutaArchivo), codigo);
        cerrarBase();
        return ImagenResultado;
    }

    public boolean modificarImagen(Imagenes imagenNueva) {
        boolean estado = baseImagen.modificarImagen(abrirBase(rutaArchivo), imagenNueva);
        cerrarBase();
        return estado;
    }

    public boolean eliminarImagen(String codigo) {
        boolean estado = baseImagen.eliminarImagen(abrirBase(rutaArchivo), codigo);
        cerrarBase();
        return estado;
    }
    //FIN METODOS IMAGEN
    
    //INICIO METODOS TRIVIA
    public boolean crearTrivia(Trivia trivia) {
        boolean estado = baseTrivia.crearTrivia(abrirBase(rutaArchivo), trivia);
        cerrarBase();
        return estado;
    }

    public Vector<Trivia> getTrivias() {
        Vector<Trivia> trivias = baseTrivia.getTrivias(abrirBase(rutaArchivo));
        cerrarBase();
        return trivias;
    }

    public Trivia getTrivia(String codigo) {
        Trivia triviaResultado = baseTrivia.getTrivia(abrirBase(rutaArchivo), codigo);
        cerrarBase();
        return triviaResultado;
    }

    public boolean modificarTrivia(Trivia triviaNueva) {
        boolean estado = baseTrivia.modificarTrivia(abrirBase(rutaArchivo), triviaNueva);
        cerrarBase();
        return estado;
    }

    public boolean eliminarTrivia(String codigo) {
        boolean estado = baseTrivia.eliminarTrivia(abrirBase(rutaArchivo), codigo);
        cerrarBase();
        return estado;
    }
    //FIN METODOS TRIVIA
    
    //INICIO METODOS PREGUNTAS
    public boolean crearPregunta(Preguntas pregunta) {
        boolean estado = basePreguntas.crearPregunta(abrirBase(rutaArchivo), pregunta);
        cerrarBase();
        return estado;
    }

    public Vector<Preguntas> getPreguntas() {
        Vector<Preguntas> preguntas = basePreguntas.getPreguntas(abrirBase(rutaArchivo));
        cerrarBase();
        return preguntas;
    }

    public Preguntas getPregunta(String codigo) {
        Preguntas preguntaResultado = basePreguntas.getPregunta(abrirBase(rutaArchivo), codigo);
        cerrarBase();
        return preguntaResultado;
    }

    public boolean modificarPregunta(Preguntas preguntaNueva) {
        boolean estado = basePreguntas.modificarPregunta(abrirBase(rutaArchivo), preguntaNueva);
        cerrarBase();
        return estado;
    }

    public boolean eliminarPregunta(String codigo) {
        boolean estado = basePreguntas.eliminarPregunta(abrirBase(rutaArchivo), codigo);
        cerrarBase();
        return estado;
    }
    //FIN METODOS PREGUNTAS
    
    //INICIO METODOS RESPUESTAS
    public boolean crearRespuesta(Respuestas respuesta) {
        boolean estado = baseRespuestas.crearRespuesta(abrirBase(rutaArchivo), respuesta);
        cerrarBase();
        return estado;
    }

    public Vector<Respuestas> getRespuestas() {
        Vector<Respuestas> respuestas = baseRespuestas.getRespuestas(abrirBase(rutaArchivo));
        cerrarBase();
        return respuestas;
    }

    public Respuestas getRespuesta(String codigo) {
        Respuestas respuestaResultado = baseRespuestas.getRespuesta(abrirBase(rutaArchivo), codigo);
        cerrarBase();
        return respuestaResultado;
    }

    public boolean modificarRespuesta(Respuestas respuestaNueva) {
        boolean estado = baseRespuestas.modificarRespuesta(abrirBase(rutaArchivo), respuestaNueva);
        cerrarBase();
        return estado;
    }

    public boolean eliminarRespuesta(String codigo) {
        boolean estado = baseRespuestas.eliminarRespuesta(abrirBase(rutaArchivo), codigo);
        cerrarBase();
        return estado;
    }
    //FIN METODOS RESPUESTAS
    
    //INICIO METODOS CATEGORIA_LUGAR
    public boolean crearCategoria_Lugar(Categoria_Lugar categoria_Lugar) {
        boolean estado = baseCategoria_Lugar.crearCategoria_Lugar(abrirBase(rutaArchivo), categoria_Lugar);
        cerrarBase();
        return estado;
    }

    public Vector<Categoria_Lugar> getCategorias_Lugares() {
        Vector<Categoria_Lugar> categorias_lugares = baseCategoria_Lugar.getCategorias_Lugares(abrirBase(rutaArchivo));
        cerrarBase();
        return categorias_lugares;
    }

    public Categoria_Lugar getCategoria_Lugar(String codigo_categoria, String codigo_lugar) {
        Categoria_Lugar categoria_lugar_Resultado = baseCategoria_Lugar.getCategoria_Lugar(abrirBase(rutaArchivo), codigo_categoria, codigo_lugar);
        cerrarBase();
        return categoria_lugar_Resultado;
    }

    public boolean eliminarCategoria_Lugar(String codigo_categoria, String codigo_lugar) {
        boolean estado = baseCategoria_Lugar.eliminarCategoria_Lugar(abrirBase(rutaArchivo), codigo_categoria, codigo_lugar);
        cerrarBase();
        return estado;
    }
    //FIN METODOS CATEGORIA_LUGAR
    
    //INICIO METODOS LUGAR_IMG
    public boolean crearLugar_img(Lugar_img lugar_img) {
        boolean estado = baseLugar_Imagen.crearLugar_Imagen(abrirBase(rutaArchivo), lugar_img);
        cerrarBase();
        return estado;
    }

    public Vector<Lugar_img> getLugares_Imgs() {
        Vector<Lugar_img> lugares_imgs = baseLugar_Imagen.getLugares_Imgs(abrirBase(rutaArchivo));
        cerrarBase();
        return lugares_imgs;
    }

    public Lugar_img getLugar_img(String codigo_lugar, String codigo_imagen) {
        Lugar_img lugar_imgResultado = baseLugar_Imagen.getlugar_img(abrirBase(rutaArchivo), codigo_lugar, codigo_imagen);
        cerrarBase();
        return lugar_imgResultado;
    }

    public boolean eliminarLugar_img(String codigo_lugar, String codigo_imagen) {
        boolean estado = baseLugar_Imagen.eliminarLugar_img(abrirBase(rutaArchivo), codigo_lugar, codigo_imagen);
        cerrarBase();
        return estado;
    }
    //FIN METODOS LUGAR_IMG

    //INICIO METODOS REALIZA    
    public boolean crearRealiza(Realiza realiza) {
        boolean estado = baseRealiza.crearRealiza(abrirBase(rutaArchivo), realiza);
        cerrarBase();
        return estado;
    }

    public Vector<Realiza> getRealizas() {
        Vector<Realiza> lugares_imgs = baseRealiza.getRealizas(abrirBase(rutaArchivo));
        cerrarBase();
        return lugares_imgs;
    }
    
    public Realiza getRealiza(String codigo_trivia, String codigo_usuario) {
        Realiza realizaResultado = baseRealiza.getRealiza(abrirBase(rutaArchivo), codigo_trivia, codigo_usuario);
        cerrarBase();
        return realizaResultado;
    }

    public boolean eliminarRealiza(String codigo_trivia, String codigo_usuario) {
        boolean estado = baseRealiza.eliminarRealiza(abrirBase(rutaArchivo), codigo_trivia, codigo_usuario);
        cerrarBase();
        return estado;
    } 
    //FIN METODOS REALIZA
    
    //INICIO METODOS VISUALIZA
    public boolean crearVisualiza(Visualiza visualiza) {
        boolean estado = baseVisualiza.crearVisualiza(abrirBase(rutaArchivo), visualiza);
        cerrarBase();
        return estado;
    }

    public Vector<Visualiza> getVisualizas() {
        Vector<Visualiza> lugares_imgs = baseVisualiza.getVisualizas(abrirBase(rutaArchivo));
        cerrarBase();
        return lugares_imgs;
    }
    
    public Visualiza getVisualiza(String codigo_usuario, String codigo_lugar) {
        Visualiza visualizaResultado = baseVisualiza.getVisualiza(abrirBase(rutaArchivo), codigo_usuario, codigo_lugar);
        cerrarBase();
        return visualizaResultado;
    }

    public boolean eliminarVisualiza(String codigo_usuario, String codigo_lugar) {
        boolean estado = baseVisualiza.eliminarVisualiza(abrirBase(rutaArchivo), codigo_usuario, codigo_lugar);
        cerrarBase();
        return estado;
    } 
    //FIN METODOS VISUALIZA
    
    //INICIO METODOS TRIVIA_PR
    public boolean crearTRIVIA_PR(Trivia_PR trivia_PR) {
        boolean estado = baseTrivia_PR.crearTrivia_PR(abrirBase(rutaArchivo), trivia_PR);
        cerrarBase();
        return estado;
    }

    public Vector<Trivia_PR> getTRIVIA_PR() {
        Vector<Trivia_PR> trivias_PRs = baseTrivia_PR.getTrivias_PRS(abrirBase(rutaArchivo));
        cerrarBase();
        return trivias_PRs;
    }
    
    public Trivia_PR getTrivia_PR(String codigo_trivia, String codigo_pregunta, String codigo_respuesta) {
        Trivia_PR trivia_PRResultado = baseTrivia_PR.getTrivia_PR(abrirBase(rutaArchivo), codigo_trivia, codigo_pregunta, codigo_respuesta);
        cerrarBase();
        return trivia_PRResultado;
    }

    public boolean eliminarTrivia_PR(String codigo_trivia, String codigo_pregunta, String codigo_respuesta) {
        boolean estado = baseTrivia_PR.eliminarTrivia_PR(abrirBase(rutaArchivo), codigo_trivia, codigo_pregunta, codigo_respuesta);
        cerrarBase();
        return estado;
    } 
    //FIN METODOS TRIVIA_PR
    
}
