package ventanas.Informacion;

import baseDatos.BaseGACU;
import clases.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.*;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import ventanas.Clases.*;

public class Info_Lugar extends javax.swing.JFrame {

    private Usuario usuarioActivo;
    private Iglesias ventanaAtrasI;
    private Museos ventanaAtrasM;
    private Institutos_ES ventanaAtrasES;
    private Parques ventanaAtrasP;
    private String codigo_Categoria;
    private Imagenes imagenes = new Imagenes();
    private Lugar_img LugarImagen;
    private Vector<Lugar_img> lugaresImagenes = new Vector<>();
    private BaseGACU base = new BaseGACU();
    private File carpetaImg;
    private String rutaCarpeta;
    private String signoRuta;
    private File ruta;
    byte[] icono;

    public Info_Lugar(String codigo_Categoria, String codigo_Lugar, String[] codigoImagenes, String[] nombreImagenes) {
        initComponents();
        usuarioActivo = null;
        this.codigo_Categoria = codigo_Categoria;
        initRutas(codigo_Categoria);
        this.setSize(800, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        mostarInfoLugar(codigo_Lugar, codigoImagenes, nombreImagenes);
    }

    public Info_Lugar(Usuario usuarioActivo, String codigo_Categoria, String codigo_Lugar, String[] codigoImagenes, String[] nombreImagenes) {
        initComponents();
        this.usuarioActivo = usuarioActivo;
        this.codigo_Categoria = codigo_Categoria;
        initRutas(codigo_Categoria);
        this.setSize(800, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        mostarInfoLugar(codigo_Lugar, codigoImagenes, nombreImagenes);
    }

    private void initRutas(String codigo_Categoria) {
        switch (codigo_Categoria) {
            case "C2I":
                carpetaImg = new File("Imagenes_Iglesias");
                break;
            case "C4M":
                carpetaImg = new File("Imagenes_Museo");
                break;
            case "C3E":
                carpetaImg = new File("Imagenes_Institutos");
                break;
            case "C1P":
                carpetaImg = new File("Imagenes_Parques");
                break;
            default:
                System.out.println("Clase " + codigo_Categoria + " no encontrada!!!");
        }
        rutaCarpeta = carpetaImg.getAbsolutePath();
        signoRuta = (rutaCarpeta.contains("/")) ? "/" : "\\";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Info_pn = new javax.swing.JPanel();
        Info_spn = new javax.swing.JScrollPane();
        jtextInfo = new javax.swing.JTextPane();
        btnVolver = new javax.swing.JButton();
        lblImagen2 = new javax.swing.JLabel();
        lblImagen3 = new javax.swing.JLabel();
        lblImagen4 = new javax.swing.JLabel();
        lblImagen1 = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jlFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        Info_pn.setLayout(null);

        jtextInfo.setBackground(new java.awt.Color(153, 153, 153));
        jtextInfo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Info_spn.setViewportView(jtextInfo);

        Info_pn.add(Info_spn);
        Info_spn.setBounds(70, 300, 680, 148);

        btnVolver.setBackground(new java.awt.Color(76, 84, 84));
        btnVolver.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER");
        btnVolver.setBorder(null);
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setFocusPainted(false);
        btnVolver.setMaximumSize(new java.awt.Dimension(100, 40));
        btnVolver.setMinimumSize(new java.awt.Dimension(100, 40));
        btnVolver.setOpaque(true);
        btnVolver.setPreferredSize(new java.awt.Dimension(100, 40));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        Info_pn.add(btnVolver);
        btnVolver.setBounds(360, 460, 100, 40);

        lblImagen2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Info_pn.add(lblImagen2);
        lblImagen2.setBounds(470, 40, 270, 120);

        lblImagen3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Info_pn.add(lblImagen3);
        lblImagen3.setBounds(80, 170, 270, 120);

        lblImagen4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Info_pn.add(lblImagen4);
        lblImagen4.setBounds(470, 170, 270, 120);

        lblImagen1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Info_pn.add(lblImagen1);
        lblImagen1.setBounds(80, 40, 270, 120);

        jlTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Info_pn.add(jlTitulo);
        jlTitulo.setBounds(300, 10, 190, 20);
        Info_pn.add(jlFondo);
        jlFondo.setBounds(0, 0, 800, 500);

        getContentPane().add(Info_pn);
        Info_pn.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        mostarVentanaAnterior(codigo_Categoria);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void mostarVentanaAnterior(String codigo_Categoria) {
        switch (codigo_Categoria) {
            case "C2I":
                ventanaAtrasI = new Iglesias(usuarioActivo);
                ventanaAtrasI.setVisible(true);
                break;
            case "C4M":
                ventanaAtrasM = new Museos(usuarioActivo);
                ventanaAtrasM.setVisible(true);
                break;
            case "C3E":
                ventanaAtrasES = new Institutos_ES(usuarioActivo);
                ventanaAtrasES.setVisible(true);
                break;
            case "C1P":
                ventanaAtrasP = new Parques(usuarioActivo);
                ventanaAtrasP.setVisible(true);
                break;
            default:
                System.err.println("Clase " + codigo_Categoria + " no encontrada!!!");
        }
    }

    private void mostarInfoLugar(String codigoLugar, String[] codigoImagenes, String[] nombreImagenes) { //falta img
        Categoria_Lugar resultado = base.getCategoria_Lugar(codigo_Categoria, codigoLugar);
        jlTitulo.setText(base.getLugar(resultado.getCodigo_lugar()).getNombre_lugar());
        cargarImagenes(codigoImagenes, nombreImagenes);
        crearGuardarLugaresImagenes(codigoLugar, codigoImagenes);
        jtextInfo.setText(base.getLugar(resultado.getCodigo_lugar()).getInformacion_lugar());
    }

    private void cargarImagenes(String[] codigoImagenes, String[] nombres) {
        cargarImagen(codigoImagenes[0], nombres[0], lblImagen1);//nombre con extension
        cargarImagen(codigoImagenes[1], nombres[1], lblImagen2);
        cargarImagen(codigoImagenes[2], nombres[2], lblImagen3);
        cargarImagen(codigoImagenes[3], nombres[3], lblImagen4);
        cargarImagen(codigoImagenes[4], nombres[4], jlFondo);
    }

    private void cargarImagen(String codigo, String nombre, javax.swing.JLabel label) {
        ruta = new File(rutaCarpeta + signoRuta + nombre);
        guardarImagenBase(codigo, ruta);
        setImagenLabel(label, base.getImagen(codigo).getImagen());
    }

    private void guardarImagenBase(String codigo, File rutaImg) {
        imagenes.setCodigo_imagen(codigo);
        try {
            icono = new byte[(int) rutaImg.length()];
            InputStream input = new FileInputStream(rutaImg);
            input.read(icono);
            imagenes.setImagen(icono);
        } catch (IOException ex) {
            imagenes.setImagen(null);
        }
        if (base.crearImagen(imagenes)) {
            System.err.println("Imagen " + imagenes.getCodigo_imagen() + "creada");
        } else {
            System.err.println("Imagen ya existe");
        }
    }

    private void setImagenLabel(javax.swing.JLabel label, byte[] imagen) {
        try {
            BufferedImage image = null;
            InputStream in = new ByteArrayInputStream(imagen);
            image = ImageIO.read(in);
            ImageIcon imgI = new ImageIcon(image);
            label.setIcon(imgI);
        } catch (IOException ex) {
            label.setText("NO IMAGE:" + label.getName());
        }
    }

    public void crearGuardarLugaresImagenes(String codigoLugar, String[] codigoImagenes) {
        crearLugaresImagenes(codigoLugar, codigoImagenes);
        guardarLugaresImagenesBase(lugaresImagenes);
    }
    
    public void crearLugaresImagenes(String codigoLugar, String[] codigoImagenes) {
        setLugarImagen(codigoLugar, codigoImagenes[0]);
        setLugarImagen(codigoLugar, codigoImagenes[1]);
        setLugarImagen(codigoLugar, codigoImagenes[2]);
        setLugarImagen(codigoLugar, codigoImagenes[3]);
        setLugarImagen(codigoLugar, codigoImagenes[4]);
    }
    
    public void setLugarImagen(String codigoLugar, String codigoImagen) {
        LugarImagen = new Lugar_img(codigoLugar, codigoImagen);
        lugaresImagenes.addElement(LugarImagen);
    }
    
    public void guardarLugaresImagenesBase(Vector<Lugar_img> LugaresImagenes) {
        LugaresImagenes.forEach((elemento) -> guardarLugarImagenBase(elemento));
    }
    
    public void guardarLugarImagenBase(Lugar_img lugarImagen) {
        if (base.crearLugar_img(lugarImagen)) {
            System.err.println("Se ha creado lugar imagen " + lugarImagen.getCodigo_lugar() + " " + lugarImagen.getCodigo_imagen() + " correctamente");
        } else {
            System.err.println("Lugar Imagen ya existe");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Info_pn;
    private javax.swing.JScrollPane Info_spn;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextPane jtextInfo;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JLabel lblImagen4;
    // End of variables declaration//GEN-END:variables
}
