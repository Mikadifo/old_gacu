package baseDatos;

import clases.Categoria;
import clases.Imagenes;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BaseDefault {
    
    public final BaseGACU base = new BaseGACU();
    
    //Menu Principal
    public Categoria categorias = new Categoria();
    public Imagenes imagenes = new Imagenes();
    public File carpetaImg = new File("Imagenes_Principal");
    public final String rutaCarpeta = carpetaImg.getAbsolutePath();
    public final String signoRuta = (rutaCarpeta.contains("/")) ? "/" : "\\";
    public File ruta;
    public byte[] icono;
    
    public void guardarCategorias() {
        categorias.setCodigo_categoria("C1P");
        categorias.setNombre_categoria("Parques");
        guardarCategoriaBase(categorias);
        categorias.setCodigo_categoria("C2I");
        categorias.setNombre_categoria("Iglesias");
        guardarCategoriaBase(categorias);
        categorias.setCodigo_categoria("C3M");
        categorias.setNombre_categoria("Museos");
        guardarCategoriaBase(categorias);
        categorias.setCodigo_categoria("C4E");
        categorias.setNombre_categoria("Educacion Superior");
        guardarCategoriaBase(categorias);
    }

    public void guardarCategoriaBase(Categoria categoria) {
        base.crearCategoria(categoria);
    }
    
    public void cargarImagenes() {
        cargarImagen("img01", "imgIglesia.PNG");
        cargarImagen("img02", "imgParque.PNG");
        cargarImagen("img03", "imgMuseo.PNG");
        cargarImagen("img04", "imgUniversidad.PNG");
    }

    public void cargarImagen(String codigoImagen, String nombreImagen) {
        ruta = new File(rutaCarpeta + signoRuta + nombreImagen);
        guardarImagenBase(codigoImagen, ruta);
    }

    public void guardarImagenBase(String codigo, File rutaImg) {
        imagenes.setCodigo_imagen(codigo);
        try {
            icono = new byte[(int) rutaImg.length()];
            InputStream input = new FileInputStream(rutaImg);
            input.read(icono);
            imagenes.setImagen(icono);
        } catch (IOException ex) {
            imagenes.setImagen(null);
        }
        base.crearImagen(imagenes);
    }
    //FIN Menu Principal
    
}
