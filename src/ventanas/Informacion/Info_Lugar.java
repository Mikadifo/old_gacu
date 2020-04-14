package ventanas.Informacion;

import baseDatos.BaseGACU;
import clases.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.*;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.Icon;
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
    private String[] codigoImagenes;

    public Info_Lugar(String codigo_Categoria, String codigo_Lugar, String[] codigoImagenes) {
        initComponents();
        usuarioActivo = null;
        this.codigo_Categoria = codigo_Categoria;
        this.codigoImagenes = codigoImagenes;
        this.setSize(810, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        mostrarInfoLugar(codigo_Lugar);
    }

    public Info_Lugar(Usuario usuarioActivo, String codigo_Categoria, String codigo_Lugar, String[] codigoImagenes) {
        initComponents();
        this.usuarioActivo = usuarioActivo;
        this.codigo_Categoria = codigo_Categoria;
        this.codigoImagenes = codigoImagenes;
        this.setSize(810, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        mostrarInfoLugar(codigo_Lugar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Info_pn = new javax.swing.JPanel();
        central = new javax.swing.JLabel();
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
        setBounds(new java.awt.Rectangle(0, 0, 810, 600));
        setMinimumSize(new java.awt.Dimension(810, 600));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(810, 600));
        getContentPane().setLayout(null);

        Info_pn.setMaximumSize(new java.awt.Dimension(810, 600));
        Info_pn.setMinimumSize(new java.awt.Dimension(810, 600));
        Info_pn.setLayout(null);

        central.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Info_pn.add(central);
        central.setBounds(160, 50, 630, 330);

        jtextInfo.setEditable(false);
        jtextInfo.setBackground(new java.awt.Color(153, 153, 153));
        jtextInfo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Info_spn.setViewportView(jtextInfo);

        Info_pn.add(Info_spn);
        Info_spn.setBounds(160, 390, 630, 190);

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
        btnVolver.setBounds(20, 530, 120, 50);

        lblImagen2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblImagen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagen2MouseClicked(evt);
            }
        });
        Info_pn.add(lblImagen2);
        lblImagen2.setBounds(20, 50, 120, 90);

        lblImagen3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblImagen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagen3MouseClicked(evt);
            }
        });
        Info_pn.add(lblImagen3);
        lblImagen3.setBounds(20, 170, 120, 90);

        lblImagen4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblImagen4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagen4MouseClicked(evt);
            }
        });
        Info_pn.add(lblImagen4);
        lblImagen4.setBounds(20, 290, 120, 90);

        lblImagen1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblImagen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagen1MouseClicked(evt);
            }
        });
        Info_pn.add(lblImagen1);
        lblImagen1.setBounds(20, 410, 120, 90);

        jlTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Info_pn.add(jlTitulo);
        jlTitulo.setBounds(300, 10, 190, 20);

        jlFondo.setMaximumSize(new java.awt.Dimension(810, 600));
        jlFondo.setMinimumSize(new java.awt.Dimension(810, 600));
        jlFondo.setPreferredSize(new java.awt.Dimension(810, 600));
        Info_pn.add(jlFondo);
        jlFondo.setBounds(0, 0, 810, 600);

        getContentPane().add(Info_pn);
        Info_pn.setBounds(0, 0, 810, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        mostrarVentanaAnterior(codigo_Categoria);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void lblImagen2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagen2MouseClicked
        setImagenLabel(central, base.getImagen(codigoImagenes[1]).getImagen());
    }//GEN-LAST:event_lblImagen2MouseClicked

    private void lblImagen3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagen3MouseClicked
        setImagenLabel(central, base.getImagen(codigoImagenes[2]).getImagen());
    }//GEN-LAST:event_lblImagen3MouseClicked

    private void lblImagen4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagen4MouseClicked
        setImagenLabel(central, base.getImagen(codigoImagenes[3]).getImagen());
    }//GEN-LAST:event_lblImagen4MouseClicked

    private void lblImagen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagen1MouseClicked
        setImagenLabel(central, base.getImagen(codigoImagenes[0]).getImagen());
    }//GEN-LAST:event_lblImagen1MouseClicked
    
    private void mostrarVentanaAnterior(String codigo_Categoria) {
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

    private void mostrarInfoLugar(String codigoLugar) {
        Categoria_Lugar resultado = base.getCategoria_Lugar(codigo_Categoria, codigoLugar);
        jlTitulo.setText(base.getLugar(resultado.getCodigo_lugar()).getNombre_lugar());
        crearGuardarLugaresImagenes(codigoLugar, codigoImagenes);
        mostrarImagenesLabels(codigoLugar, codigoImagenes);
        jtextInfo.setText(base.getLugar(resultado.getCodigo_lugar()).getInformacion_lugar());
    }

    private void mostrarImagenesLabels(String codigoLugar, String[] codigoImagenes) {
        setImagenLabel(lblImagen1, base.getImagen(base.getLugar_img(codigoLugar, codigoImagenes[0]).getCodigo_imagen()).getImagen());
        setImagenLabel(lblImagen2, base.getImagen(base.getLugar_img(codigoLugar, codigoImagenes[1]).getCodigo_imagen()).getImagen());
        setImagenLabel(lblImagen3, base.getImagen(base.getLugar_img(codigoLugar, codigoImagenes[2]).getCodigo_imagen()).getImagen());
        setImagenLabel(lblImagen4, base.getImagen(base.getLugar_img(codigoLugar, codigoImagenes[3]).getCodigo_imagen()).getImagen());
        setImagenLabel(jlFondo, base.getImagen(base.getLugar_img(codigoLugar, codigoImagenes[4]).getCodigo_imagen()).getImagen());
        setImagenLabel(central, base.getImagen(base.getLugar_img(codigoLugar, codigoImagenes[0]).getCodigo_imagen()).getImagen());
    }

    private void setImagenLabel(javax.swing.JLabel label, byte[] imagen) {
        try {
            BufferedImage image;
            InputStream in = new ByteArrayInputStream(imagen);
            image = ImageIO.read(in);
            ImageIcon imgI = new ImageIcon(image);
            Icon imgBtn = new ImageIcon(imgI.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
            label.setIcon(imgBtn);
        } catch (IOException ex) {
            label.setText("NO IMAGE:" + label.getName());
        }
    }

    public void crearGuardarLugaresImagenes(String codigoLugar, String[] codigoImagenes) {
        crearLugaresImagenes(codigoLugar, codigoImagenes);
        guardarLugaresImagenesBase();
    }

    public void crearLugaresImagenes(String codigoLugar, String[] codigoImagenes) {
        for (String codigoImagen : codigoImagenes) {
            setLugarImagen(codigoLugar, codigoImagen);
        }
    }

    public void setLugarImagen(String codigoLugar, String codigoImagen) {
        LugarImagen = new Lugar_img(codigoLugar, codigoImagen);
        lugaresImagenes.addElement(LugarImagen);
    }

    public void guardarLugaresImagenesBase() {
        lugaresImagenes.forEach((elemento) -> guardarLugarImagenBase(elemento));
    }

    public void guardarLugarImagenBase(Lugar_img lugarImagen) {
        base.crearLugar_img(lugarImagen);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Info_pn;
    private javax.swing.JScrollPane Info_spn;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel central;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextPane jtextInfo;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JLabel lblImagen4;
    // End of variables declaration//GEN-END:variables
}
