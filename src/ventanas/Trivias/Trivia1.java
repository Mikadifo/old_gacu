package ventanas.Trivias;

import clases.Usuario;
import clases.Trivia_PR;
import baseDatos.BaseGACU;
import clases.Realiza;
import javax.swing.JOptionPane;
import ventanas.registro.MenuPrincipal;

public class Trivia1 extends javax.swing.JFrame {

    private BaseGACU base = new BaseGACU();
    private Trivia_PR[] triviaPRS;
    private boolean[] respuestasTrivias;
    private Usuario usuarioActivo;
    private String ventanaAnterior;
    private int numeroVentana;

    public Trivia1(Usuario usuarioActivo, int numeroVentana, String ventanaAnterior, Trivia_PR[] triviaPRS, boolean[] respuestasTrivias) {
        initComponents();
        this.numeroVentana = numeroVentana;
        this.ventanaAnterior = ventanaAnterior;
        this.triviaPRS = triviaPRS;
        this.respuestasTrivias = respuestasTrivias;
        setBotonPosicion();
        this.usuarioActivo = usuarioActivo;
        this.setSize(810, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        cargarPreguntaRespuesta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlVoF = new javax.swing.JPanel();
        pnlRespuestas = new javax.swing.JPanel();
        btnFalso = new javax.swing.JButton();
        btnVerdadero = new javax.swing.JButton();
        btnSalirMenu = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();
        pnlEnunciado = new javax.swing.JPanel();
        lblEnunciado = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblTriviaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 810, 600));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        pnlVoF.setPreferredSize(new java.awt.Dimension(700, 500));
        pnlVoF.setLayout(null);

        pnlRespuestas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlRespuestas.setLayout(null);

        btnFalso.setBackground(new java.awt.Color(76, 84, 84));
        btnFalso.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnFalso.setForeground(new java.awt.Color(255, 255, 255));
        btnFalso.setText("FALSO");
        btnFalso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 113, 91), 5));
        btnFalso.setOpaque(true);
        btnFalso.setPreferredSize(new java.awt.Dimension(280, 170));
        btnFalso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFalsoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFalsoMouseExited(evt);
            }
        });
        btnFalso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFalsoActionPerformed(evt);
            }
        });
        pnlRespuestas.add(btnFalso);
        btnFalso.setBounds(0, 90, 730, 90);

        btnVerdadero.setBackground(new java.awt.Color(76, 84, 84));
        btnVerdadero.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnVerdadero.setForeground(new java.awt.Color(255, 255, 255));
        btnVerdadero.setText("VERDADERO");
        btnVerdadero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 168, 150), 5));
        btnVerdadero.setOpaque(true);
        btnVerdadero.setPreferredSize(new java.awt.Dimension(280, 177));
        btnVerdadero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerdaderoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerdaderoMouseExited(evt);
            }
        });
        btnVerdadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerdaderoActionPerformed(evt);
            }
        });
        pnlRespuestas.add(btnVerdadero);
        btnVerdadero.setBounds(0, 0, 730, 90);

        pnlVoF.add(pnlRespuestas);
        pnlRespuestas.setBounds(40, 280, 730, 180);

        btnSalirMenu.setBackground(new java.awt.Color(76, 84, 84));
        btnSalirMenu.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnSalirMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirMenu.setText("Salir al Menu");
        btnSalirMenu.setBorder(null);
        btnSalirMenu.setBorderPainted(false);
        btnSalirMenu.setContentAreaFilled(false);
        btnSalirMenu.setFocusPainted(false);
        btnSalirMenu.setMaximumSize(new java.awt.Dimension(100, 40));
        btnSalirMenu.setMinimumSize(new java.awt.Dimension(100, 40));
        btnSalirMenu.setOpaque(true);
        btnSalirMenu.setPreferredSize(new java.awt.Dimension(100, 40));
        btnSalirMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMenuMouseExited(evt);
            }
        });
        btnSalirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirMenuActionPerformed(evt);
            }
        });
        pnlVoF.add(btnSalirMenu);
        btnSalirMenu.setBounds(40, 510, 260, 80);

        btnPrincipal.setBackground(new java.awt.Color(76, 84, 84));
        btnPrincipal.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setText("Siguiente");
        btnPrincipal.setBorder(null);
        btnPrincipal.setBorderPainted(false);
        btnPrincipal.setContentAreaFilled(false);
        btnPrincipal.setFocusPainted(false);
        btnPrincipal.setMaximumSize(new java.awt.Dimension(100, 40));
        btnPrincipal.setMinimumSize(new java.awt.Dimension(100, 40));
        btnPrincipal.setOpaque(true);
        btnPrincipal.setPreferredSize(new java.awt.Dimension(130, 40));
        btnPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseExited(evt);
            }
        });
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });
        pnlVoF.add(btnPrincipal);
        btnPrincipal.setBounds(510, 500, 260, 80);

        pnlEnunciado.setBackground(new java.awt.Color(76, 84, 84));
        pnlEnunciado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlEnunciado.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        pnlEnunciado.setLayout(null);
        pnlEnunciado.add(lblEnunciado);
        lblEnunciado.setBounds(0, 0, 650, 190);

        pnlVoF.add(pnlEnunciado);
        pnlEnunciado.setBounds(80, 70, 650, 190);

        header.setBackground(new java.awt.Color(76, 84, 84));
        header.setLayout(null);

        lblTitulo.setPreferredSize(new java.awt.Dimension(250, 35));
        header.add(lblTitulo);
        lblTitulo.setBounds(0, 0, 250, 35);

        pnlVoF.add(header);
        header.setBounds(0, 0, 810, 40);

        lblTriviaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Trivia/trivia1.jpg"))); // NOI18N
        lblTriviaFondo.setMaximumSize(new java.awt.Dimension(700, 500));
        lblTriviaFondo.setMinimumSize(new java.awt.Dimension(700, 500));
        lblTriviaFondo.setPreferredSize(new java.awt.Dimension(700, 500));
        pnlVoF.add(lblTriviaFondo);
        lblTriviaFondo.setBounds(0, 0, 810, 600);

        getContentPane().add(pnlVoF);
        pnlVoF.setBounds(0, 0, 810, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarPreguntaRespuesta() {
        lblTitulo.setText(base.getTrivia(triviaPRS[0].getCodigo_trivia()).getNombre_trivia());
        lblEnunciado.setText(base.getPregunta(triviaPRS[0].getCodigo_pregunta()).getPregunta());
    }

    private void setBotonPosicion() {
        switch (numeroVentana) {
            case 1:
            case 2:
                btnPrincipal.setText("Siguiente");
                break;
            default:
                btnPrincipal.setText("Terminar");
        }
    }

    private void btnPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseEntered
        btnPrincipal.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnPrincipalMouseEntered

    private void btnPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseExited
        btnPrincipal.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnPrincipalMouseExited

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        if (btnVerdadero.getBackground().equals((new java.awt.Color(30, 168, 150))) || btnFalso.getBackground().equals((new java.awt.Color(255, 113, 91)))) {
            if (btnPrincipal.getText().equals("Siguiente")) {
                respuestasTrivias[0] = (getRespuesta().equals(base.getRespuesta(triviaPRS[0].getCodigo_respuesta()).getRespuesta()));
                mostrarVentanaRandom();
            } else {
                TriviaResultados ventanaResultados = new TriviaResultados(usuarioActivo);
                ventanaResultados.setVisible(true);
            }
            base.crearRealiza(new Realiza(triviaPRS[0].getCodigo_trivia(), usuarioActivo.getCedulaUsuario()));
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Primer debe seleccionar una opcion");
        }
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnSalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMenuActionPerformed
        MenuPrincipal menu = new MenuPrincipal(usuarioActivo);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirMenuActionPerformed

    private void btnSalirMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMenuMouseExited
        btnSalirMenu.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnSalirMenuMouseExited

    private void btnSalirMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMenuMouseEntered
        btnSalirMenu.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnSalirMenuMouseEntered

    private void btnFalsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFalsoActionPerformed
        if (btnVerdadero.getBackground().equals((new java.awt.Color(30, 168, 150)))) {
            btnVerdadero.setBackground(new java.awt.Color(76, 84, 84));
        }
        btnFalso.setBackground(new java.awt.Color(255, 113, 91));
    }//GEN-LAST:event_btnFalsoActionPerformed

    private void btnFalsoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFalsoMouseExited

    }//GEN-LAST:event_btnFalsoMouseExited

    private void btnFalsoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFalsoMouseEntered

    }//GEN-LAST:event_btnFalsoMouseEntered

    private void btnVerdaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerdaderoActionPerformed
        if (btnFalso.getBackground().equals(new java.awt.Color(255, 113, 91))) {
            btnFalso.setBackground(new java.awt.Color(76, 84, 84));
        }
        btnVerdadero.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnVerdaderoActionPerformed

    private void btnVerdaderoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerdaderoMouseExited

    }//GEN-LAST:event_btnVerdaderoMouseExited

    private void btnVerdaderoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerdaderoMouseEntered

    }//GEN-LAST:event_btnVerdaderoMouseEntered

    private String getRespuesta() {
        return btnVerdadero.getBackground().equals(new java.awt.Color(30, 168, 150))?"Verdadero":"Falso";
    }
    
    private void mostrarVentanaRandom() {
        if (ventanaAnterior.equals("MENU")) {
            switch (generarNumeroRandom(1, 2)) {
                case 1:
                    Trivia2 ventanaTrivia2 = new Trivia2(usuarioActivo, ++numeroVentana, "T1", triviaPRS, respuestasTrivias);
                    ventanaTrivia2.setVisible(true);
                    break;
                case 2:
                    Trivia3 ventanaTrivia3 = new Trivia3(usuarioActivo, ++numeroVentana, "T1", triviaPRS, respuestasTrivias);
                    ventanaTrivia3.setVisible(true);
                    break;
                default:
                    System.err.println("Numero fuera de rango (1-2)");
            }
        } else if (ventanaAnterior.equals("T2")) {
            Trivia3 ventanaTrivia3 = new Trivia3(usuarioActivo, ++numeroVentana, "T1", triviaPRS, respuestasTrivias);
            ventanaTrivia3.setVisible(true);
        } else {
            Trivia2 ventanaTrivia2 = new Trivia2(usuarioActivo, ++numeroVentana, "T1", triviaPRS, respuestasTrivias);
            ventanaTrivia2.setVisible(true);
        }
    }

    private int generarNumeroRandom(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFalso;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnSalirMenu;
    private javax.swing.JButton btnVerdadero;
    private javax.swing.JPanel header;
    private javax.swing.JLabel lblEnunciado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTriviaFondo;
    private javax.swing.JPanel pnlEnunciado;
    private javax.swing.JPanel pnlRespuestas;
    private javax.swing.JPanel pnlVoF;
    // End of variables declaration//GEN-END:variables
}
