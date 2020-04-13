package ventanas.registro;

import clases.*;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ventanas.Clases.*;
import baseDatos.BaseGACU;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Vector;
import javax.imageio.ImageIO;
import ventanas.Trivias.*;

public class MenuPrincipal extends javax.swing.JFrame {

    info inf = new info();
    private Usuario usuarioActivo;
    private BaseGACU base = new BaseGACU();
    private Imagenes imagenes = new Imagenes();
    private Categoria categorias = new Categoria();
    private File carpetaImg = new File("Imagenes_Principal");
    private String rutaCarpeta = carpetaImg.getAbsolutePath();
    private String signoRuta = (rutaCarpeta.contains("/")) ? "/" : "\\";
    private File ruta;
    byte[] icono;
    MenuPrincipal thisVentana;

    public MenuPrincipal() {
        initComponents();
        thisVentana = this;
        usuarioActivo = null;
        this.setSize(810, 600);
        this.setLocationRelativeTo(null);
        cargarImagenes();
        guardarCategorias();
    }

    public MenuPrincipal(Usuario usuarioActivo) {
        initComponents();
        thisVentana = this;
        this.usuarioActivo = usuarioActivo;
        this.setSize(810, 600);
        this.setLocationRelativeTo(null);
        cargarImagenes();
        guardarCategorias();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeneral = new javax.swing.JPanel();
        iconImagen = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btX = new javax.swing.JButton();
        lbinfo = new javax.swing.JLabel();
        btnCuenta = new javax.swing.JButton();
        btnIglesias = new javax.swing.JButton();
        btnTrivia = new javax.swing.JButton();
        btnInstitutos = new javax.swing.JButton();
        btnParques = new javax.swing.JButton();
        btnMuseos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        pnlGeneral.setLayout(null);

        iconImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/Uuario.png"))); // NOI18N
        iconImagen.setPreferredSize(new java.awt.Dimension(35, 30));
        iconImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconImagenMousePressed(evt);
            }
        });
        pnlGeneral.add(iconImagen);
        iconImagen.setBounds(770, 40, 35, 30);

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/Informacion.png"))); // NOI18N
        btnInfo.setBorder(null);
        btnInfo.setBorderPainted(false);
        btnInfo.setContentAreaFilled(false);
        btnInfo.setPreferredSize(new java.awt.Dimension(35, 30));
        btnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInfoMouseExited(evt);
            }
        });
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnInfo);
        btnInfo.setBounds(760, 560, 35, 30);

        jPanel1.setBackground(new java.awt.Color(76, 84, 84));
        jPanel1.setPreferredSize(new java.awt.Dimension(810, 35));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("           Menu Principal");
        jLabel2.setPreferredSize(new java.awt.Dimension(225, 26));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 10, 225, 26);

        btX.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btX.setForeground(new java.awt.Color(255, 113, 91));
        btX.setText("X");
        btX.setAutoscrolls(true);
        btX.setBorder(null);
        btX.setBorderPainted(false);
        btX.setContentAreaFilled(false);
        btX.setDefaultCapable(false);
        btX.setMaximumSize(new java.awt.Dimension(20, 15));
        btX.setMinimumSize(new java.awt.Dimension(20, 15));
        btX.setPreferredSize(new java.awt.Dimension(50, 35));
        btX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btXMouseExited(evt);
            }
        });
        btX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXActionPerformed(evt);
            }
        });
        jPanel1.add(btX);
        btX.setBounds(760, 0, 50, 35);

        lbinfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbinfo.setEnabled(false);
        jPanel1.add(lbinfo);
        lbinfo.setBounds(40, 530, 740, 50);

        pnlGeneral.add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 35);

        btnCuenta.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCuenta.setText("Cuenta");
        btnCuenta.setBorder(null);
        btnCuenta.setBorderPainted(false);
        btnCuenta.setContentAreaFilled(false);
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnCuenta);
        btnCuenta.setBounds(760, 70, 50, 23);

        btnIglesias.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnIglesias.setOpaque(true);
        btnIglesias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIglesiasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIglesiasMouseExited(evt);
            }
        });
        btnIglesias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIglesiasActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnIglesias);
        btnIglesias.setBounds(440, 70, 240, 170);

        btnTrivia.setBackground(new java.awt.Color(76, 84, 84));
        btnTrivia.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnTrivia.setForeground(new java.awt.Color(255, 255, 255));
        btnTrivia.setText("TRIVIA");
        btnTrivia.setBorder(null);
        btnTrivia.setBorderPainted(false);
        btnTrivia.setContentAreaFilled(false);
        btnTrivia.setFocusPainted(false);
        btnTrivia.setMaximumSize(new java.awt.Dimension(100, 40));
        btnTrivia.setMinimumSize(new java.awt.Dimension(100, 40));
        btnTrivia.setOpaque(true);
        btnTrivia.setPreferredSize(new java.awt.Dimension(100, 40));
        btnTrivia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTriviaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTriviaMouseExited(evt);
            }
        });
        btnTrivia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriviaActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnTrivia);
        btnTrivia.setBounds(300, 540, 210, 50);

        btnInstitutos.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnInstitutos.setOpaque(true);
        btnInstitutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInstitutosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInstitutosMouseExited(evt);
            }
        });
        btnInstitutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstitutosActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnInstitutos);
        btnInstitutos.setBounds(440, 290, 240, 180);

        btnParques.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnParques.setOpaque(true);
        btnParques.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnParquesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnParquesMouseExited(evt);
            }
        });
        btnParques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParquesActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnParques);
        btnParques.setBounds(130, 70, 240, 170);

        btnMuseos.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnMuseos.setOpaque(true);
        btnMuseos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMuseosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMuseosMouseExited(evt);
            }
        });
        btnMuseos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuseosActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnMuseos);
        btnMuseos.setBounds(130, 290, 240, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/fondo.jpg"))); // NOI18N
        pnlGeneral.add(jLabel1);
        jLabel1.setBounds(-8, 30, 820, 570);

        getContentPane().add(pnlGeneral);
        pnlGeneral.setBounds(0, 0, 810, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cargarImagenes() {
        cargarImagen("img01", "imgIglesia.PNG", btnIglesias);
        cargarImagen("img02", "imgParque.PNG", btnParques);
        cargarImagen("img03", "imgMuseo.PNG", btnMuseos);
        cargarImagen("img04", "imgUniversidad.PNG", btnInstitutos);
    }

    private void guardarCategorias() {
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

    private void guardarCategoriaBase(Categoria categoria) {
        if (base.crearCategoria(categoria)) {
            System.err.println("Categoria " + categoria + "creada");
        } else {
            System.err.println("Categoria ya existe");
        }
    }

    private void cargarImagen(String codigo, String nombre, javax.swing.JButton boton) {
        ruta = new File(rutaCarpeta + signoRuta + nombre);
        guardarImagenBase(codigo, ruta);
        setImagenBoton(boton, base.getImagen(codigo).getImagen());
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

    private void setImagenBoton(javax.swing.JButton boton, byte[] imagen) {
        try {
            BufferedImage image;
            InputStream in = new ByteArrayInputStream(imagen);
            image = ImageIO.read(in);
            ImageIcon imgI = new ImageIcon(image);
            //Icon imgBtn = new ImageIcon(imgI.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT));
            boton.setIcon(imgI);
        } catch (IOException ex) {
            boton.setText("NO IMAGE:" + boton.getName());
        }
    }

    private void btXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXMouseEntered
        btX.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btXMouseEntered

    private void btXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXMouseExited
        btX.setForeground(new java.awt.Color(255, 113, 91));
    }//GEN-LAST:event_btXMouseExited

    private void btXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir de GACU?") == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btXActionPerformed

    private void btnTriviaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTriviaMouseEntered
        btnTrivia.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnTriviaMouseEntered

    private void btnTriviaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTriviaMouseExited
        btnTrivia.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnTriviaMouseExited

    private void btnIglesiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIglesiasActionPerformed
        Iglesias iglesias = new Iglesias(usuarioActivo);
        iglesias.setVisible(true);
        iglesias.setLocationRelativeTo(null);
        dispose();

    }//GEN-LAST:event_btnIglesiasActionPerformed

    private void btnInstitutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstitutosActionPerformed
        Institutos_ES institutos = new Institutos_ES(usuarioActivo);
        institutos.setVisible(true);
        institutos.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnInstitutosActionPerformed

    private void btnMuseosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuseosActionPerformed
        Museos museos = new Museos(usuarioActivo);
        museos.setVisible(true);
        museos.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnMuseosActionPerformed

    private void btnTriviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriviaActionPerformed
        if (usuarioActivo != null) {
            if (base.getVisualizas(usuarioActivo.getCedulaUsuario()).isEmpty()) {
                JOptionPane.showMessageDialog(null, "El sistema no pudo generar las trivias debido a que\nno ha visitado ningun lugar todavia.");
            } else {
                mostrarVentanaRandom();
                dispose();
            }
        } else {
            if (JOptionPane.showConfirmDialog(null, "Debe iniciar sesion para usar esta funcion\n¿Desea ir al menu de registro?") == JOptionPane.YES_OPTION) {
                MenuRegistro ventanaMenu = new MenuRegistro();
                dispose();
                ventanaMenu.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnTriviaActionPerformed

    private void btnIglesiasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIglesiasMouseEntered
        btnIglesias.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnIglesiasMouseEntered

    private void btnIglesiasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIglesiasMouseExited
        btnIglesias.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_btnIglesiasMouseExited

    private void btnMuseosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuseosMouseEntered
        btnMuseos.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnMuseosMouseEntered

    private void btnMuseosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuseosMouseExited
        btnMuseos.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_btnMuseosMouseExited

    private void btnInstitutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInstitutosMouseEntered
        btnInstitutos.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnInstitutosMouseEntered

    private void btnInstitutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInstitutosMouseExited
        btnInstitutos.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_btnInstitutosMouseExited

    private void btnInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseEntered
        inf.setVisible(true);
        inf.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnInfoMouseEntered

    private void btnInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseExited
        inf.setVisible(false);
    }//GEN-LAST:event_btnInfoMouseExited

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed

    }//GEN-LAST:event_btnInfoActionPerformed

    public void habilitarPanelPrincipal() {
        for (Component componente : pnlGeneral.getComponents()) {
            componente.setEnabled(true);
        }
        btX.setEnabled(true);
        btnInfo.setEnabled(true);
        btnInfo.setVisible(true);
    }

    public void deshabilitarPanelPrincipal() {
        for (Component componente : pnlGeneral.getComponents()) {
            componente.setEnabled(false);
        }
        btX.setEnabled(false);
        btnInfo.setVisible(false);
    }

    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
        if (usuarioActivo == null) {
            if (JOptionPane.showConfirmDialog(null, "Debe iniciar sesion para usar esta funcion\n¿Desea ir al menu de registro?") == JOptionPane.YES_OPTION) {
                MenuRegistro ventanaMenu = new MenuRegistro();
                dispose();
                ventanaMenu.setVisible(true);
            }
        } else {
            MiCuenta micuenta = new MiCuenta(usuarioActivo, thisVentana);
            micuenta.setAlwaysOnTop(true);
            micuenta.setVisible(true);
            deshabilitarPanelPrincipal();
        }
    }//GEN-LAST:event_btnCuentaActionPerformed

    private void iconImagenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconImagenMousePressed
        if (usuarioActivo == null) {
            if (JOptionPane.showConfirmDialog(null, "Debe iniciar sesion para usar esta funcion\n¿Desea ir al menu de registro?") == JOptionPane.YES_OPTION) {
                MenuRegistro ventanaMenu = new MenuRegistro();
                dispose();
                ventanaMenu.setVisible(true);
            }
        } else {
            MiCuenta micuenta = new MiCuenta(usuarioActivo, thisVentana);
            micuenta.setAlwaysOnTop(true);
            micuenta.setVisible(true);
            deshabilitarPanelPrincipal();
        }
    }//GEN-LAST:event_iconImagenMousePressed

    private void btnParquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParquesActionPerformed
        Parques parques = new Parques(usuarioActivo);
        parques.setVisible(true);
        parques.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnParquesActionPerformed

    private void btnParquesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParquesMouseExited
        btnParques.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_btnParquesMouseExited

    private void btnParquesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParquesMouseEntered
        btnParques.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnParquesMouseEntered

    private void mostrarVentanaRandom() {
        switch (generarNumeroRandom(1, 3)) {
            case 1:
                Trivia1 ventanaTrivia1 = new Trivia1(usuarioActivo, 1, "MENU", getTriviasPR(), new boolean[3]);
                ventanaTrivia1.setVisible(true);
                break;
            case 2:
                Trivia2 ventanaTrivia2 = new Trivia2(usuarioActivo, 1, "MENU", getTriviasPR(), new boolean[3]);
                ventanaTrivia2.setVisible(true);
                break;
            case 3:
                Trivia3 ventanaTrivia3 = new Trivia3(usuarioActivo, 1, "MENU", getTriviasPR(), new boolean[3]);
                ventanaTrivia3.setVisible(true);
                break;
            default:
                System.err.println("Numero fuera de rango (1-3)");
        }
    }

    private int generarNumeroRandom(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    private Trivia_PR[] getTriviasPR() {
        Trivia_PR[] trivias = new Trivia_PR[3];
        Vector<Trivia_PR> trivias_PR = base.getTrivia_PRs();//revisar
        String respuestaActual;
        do {
            Trivia_PR triviaActual = trivias_PR.get(generarNumeroRandom(0, (trivias_PR.size()) - 1));
            respuestaActual = base.getRespuesta(triviaActual.getCodigo_respuesta()).getRespuesta();
            if (trivias[2] == null) {
                trivias[2] = (respuestaActual.contains(",")) ? triviaActual : null;
            } 
            if (trivias[1] == null) {
                trivias[1] = (!respuestaActual.contains(",") && !(respuestaActual.equalsIgnoreCase("verdadero") || respuestaActual.equalsIgnoreCase("falso")))?triviaActual:null; //completar
            }
            if (trivias[0] == null) {
                trivias[0] = (respuestaActual.equalsIgnoreCase("verdadero") || respuestaActual.equalsIgnoreCase("falso"))?triviaActual:null; //opc correcta
            }
        } while (trivias[0] == null || trivias[1] == null || trivias[2] == null); //v o f
        return trivias;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btX;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnIglesias;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnInstitutos;
    private javax.swing.JButton btnMuseos;
    private javax.swing.JButton btnParques;
    private javax.swing.JButton btnTrivia;
    private javax.swing.JLabel iconImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbinfo;
    private javax.swing.JPanel pnlGeneral;
    // End of variables declaration//GEN-END:variables
}
