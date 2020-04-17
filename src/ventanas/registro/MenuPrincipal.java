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
    MenuPrincipal thisVentana;

    public MenuPrincipal() {
        initComponents();
        thisVentana = this;
        usuarioActivo = null;
        this.setSize(810, 600);
        this.setLocationRelativeTo(null);
        setImagenesBotones();
    }

    public MenuPrincipal(Usuario usuarioActivo) {
        initComponents();
        thisVentana = this;
        this.usuarioActivo = usuarioActivo;
        this.setSize(810, 600);
        this.setLocationRelativeTo(null);
        setImagenesBotones();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeneral = new javax.swing.JPanel();
        lblParques = new javax.swing.JLabel();
        lblParques1 = new javax.swing.JLabel();
        lblParques2 = new javax.swing.JLabel();
        lblParques3 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btX = new javax.swing.JButton();
        lblCuenta = new javax.swing.JButton();
        btnIglesias = new javax.swing.JButton();
        btnTrivia = new javax.swing.JButton();
        btnInstitutos = new javax.swing.JButton();
        btnParques = new javax.swing.JButton();
        btnMuseos = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        pnlGeneral.setLayout(null);

        lblParques.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
        lblParques.setForeground(new java.awt.Color(255, 255, 255));
        lblParques.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblParques.setText("PARQUES");
        pnlGeneral.add(lblParques);
        lblParques.setBounds(130, 240, 240, 30);

        lblParques1.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
        lblParques1.setForeground(new java.awt.Color(255, 255, 255));
        lblParques1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblParques1.setText("IGLESIAS");
        pnlGeneral.add(lblParques1);
        lblParques1.setBounds(440, 240, 240, 30);

        lblParques2.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
        lblParques2.setForeground(new java.awt.Color(255, 255, 255));
        lblParques2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblParques2.setText("EDUCACIÓN SUPERIOR");
        pnlGeneral.add(lblParques2);
        lblParques2.setBounds(430, 470, 260, 30);

        lblParques3.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
        lblParques3.setForeground(new java.awt.Color(255, 255, 255));
        lblParques3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblParques3.setText("MUSEOS");
        pnlGeneral.add(lblParques3);
        lblParques3.setBounds(130, 470, 240, 30);

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

        btnCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/Uuario.png"))); // NOI18N
        btnCuenta.setBorder(null);
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnCuenta);
        btnCuenta.setBounds(760, 40, 40, 32);

        Header.setBackground(new java.awt.Color(76, 84, 84));
        Header.setPreferredSize(new java.awt.Dimension(810, 35));
        Header.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(240, 240, 240));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Menu Principal");
        lblTitulo.setPreferredSize(new java.awt.Dimension(225, 26));
        Header.add(lblTitulo);
        lblTitulo.setBounds(40, 0, 730, 30);

        btX.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
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
        Header.add(btX);
        btX.setBounds(760, 0, 50, 35);

        pnlGeneral.add(Header);
        Header.setBounds(0, 0, 810, 35);

        lblCuenta.setFont(new java.awt.Font("Marion", 1, 15)); // NOI18N
        lblCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblCuenta.setText("Cuenta");
        lblCuenta.setBorder(null);
        lblCuenta.setBorderPainted(false);
        lblCuenta.setContentAreaFilled(false);
        lblCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCuentaActionPerformed(evt);
            }
        });
        pnlGeneral.add(lblCuenta);
        lblCuenta.setBounds(750, 70, 60, 23);

        btnIglesias.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnIglesias.setBorder(null);
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
        btnTrivia.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTriviaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTriviaMouseReleased(evt);
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
        btnInstitutos.setBorder(null);
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
        btnParques.setBorder(null);
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
        btnMuseos.setBorder(null);
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

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/fondo.jpg"))); // NOI18N
        pnlGeneral.add(lblFondo);
        lblFondo.setBounds(-8, 30, 820, 570);

        getContentPane().add(pnlGeneral);
        pnlGeneral.setBounds(0, 0, 810, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setImagenesBotones() {
        setImagenBoton(btnIglesias, base.getImagen("img01").getImagen());
        setImagenBoton(btnParques, base.getImagen("img02").getImagen());
        setImagenBoton(btnMuseos, base.getImagen("img03").getImagen());
        setImagenBoton(btnInstitutos, base.getImagen("img04").getImagen());
    }
    
    private void setImagenBoton(javax.swing.JButton boton, byte[] imagen) {
        try {
            BufferedImage image;
            InputStream in = new ByteArrayInputStream(imagen);
            image = ImageIO.read(in);
            ImageIcon imgI = new ImageIcon(image);
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
        btnTrivia.setBackground(new java.awt.Color(0, 129, 175));
    }//GEN-LAST:event_btnTriviaMouseEntered

    private void btnTriviaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTriviaMouseExited
        btnTrivia.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnTriviaMouseExited

    private void btnIglesiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIglesiasActionPerformed
        new Iglesias(usuarioActivo).setVisible(true);
        dispose();

    }//GEN-LAST:event_btnIglesiasActionPerformed

    private void btnInstitutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstitutosActionPerformed
        new Institutos_ES(usuarioActivo).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInstitutosActionPerformed

    private void btnMuseosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuseosActionPerformed
        new Museos(usuarioActivo).setVisible(true);
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
        btnIglesias.setBounds(btnIglesias.getX() - 6, btnIglesias.getY() - 6, btnIglesias.getWidth() + 12, btnIglesias.getHeight() + 12);
    }//GEN-LAST:event_btnIglesiasMouseEntered

    private void btnIglesiasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIglesiasMouseExited
        btnIglesias.setBounds(440, 70, 240, 170);
    }//GEN-LAST:event_btnIglesiasMouseExited

    private void btnMuseosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuseosMouseEntered
        btnMuseos.setBounds(btnMuseos.getX() - 6, btnMuseos.getY() - 6, btnMuseos.getWidth() + 12, btnMuseos.getHeight() + 12);
    }//GEN-LAST:event_btnMuseosMouseEntered

    private void btnMuseosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuseosMouseExited
        btnMuseos.setBounds(130, 290, 240, 180);
    }//GEN-LAST:event_btnMuseosMouseExited

    private void btnInstitutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInstitutosMouseEntered
        btnInstitutos.setBounds(btnInstitutos.getX() - 6, btnInstitutos.getY() - 6, btnInstitutos.getWidth() + 12, btnInstitutos.getHeight() + 12);
    }//GEN-LAST:event_btnInstitutosMouseEntered

    private void btnInstitutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInstitutosMouseExited
        btnInstitutos.setBounds(440, 290, 240, 180);
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

    private void lblCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCuentaActionPerformed
        accionCuenta();
    }//GEN-LAST:event_lblCuentaActionPerformed

    private void btnParquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParquesActionPerformed
        new Parques(usuarioActivo).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnParquesActionPerformed

    private void btnParquesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParquesMouseExited
        btnParques.setBounds(130, 70, 240, 170);
    }//GEN-LAST:event_btnParquesMouseExited

    private void btnParquesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParquesMouseEntered
        btnParques.setBounds(btnParques.getX() - 6, btnParques.getY() - 6, btnParques.getWidth() + 12, btnParques.getHeight() + 12);
    }//GEN-LAST:event_btnParquesMouseEntered

    private void btnTriviaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTriviaMousePressed
        btnTrivia.setBackground(new java.awt.Color(0, 58, 78));
    }//GEN-LAST:event_btnTriviaMousePressed

    private void btnTriviaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTriviaMouseReleased
        btnTrivia.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnTriviaMouseReleased

    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
        accionCuenta();
    }//GEN-LAST:event_btnCuentaActionPerformed

    private void accionCuenta() {
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
    }
    
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
        Vector<Trivia_PR> trivias_PR = base.getTrivia_PRs(base.getVisualizas(usuarioActivo.getCedulaUsuario()));
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
    private javax.swing.JPanel Header;
    private javax.swing.JButton btX;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnIglesias;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnInstitutos;
    private javax.swing.JButton btnMuseos;
    private javax.swing.JButton btnParques;
    private javax.swing.JButton btnTrivia;
    private javax.swing.JButton lblCuenta;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblParques;
    private javax.swing.JLabel lblParques1;
    private javax.swing.JLabel lblParques2;
    private javax.swing.JLabel lblParques3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlGeneral;
    // End of variables declaration//GEN-END:variables
}
