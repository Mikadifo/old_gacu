package ventanas.Trivias;

import baseDatos.BaseGACU;
import clases.Trivia_PR;
import clases.Usuario;
import ventanas.registro.MenuPrincipal;

public class Trivia2 extends javax.swing.JFrame {

    private BaseGACU base = new BaseGACU();
    private Trivia_PR[] triviaPRS;
    private Usuario usuarioActivo;
    private String ventanaAnterior;
    private int numeroVentana;
    
    public Trivia2(Usuario usuarioActivo, int numeroVentana, String ventanaAnterior, Trivia_PR[] triviaPRS) {
        initComponents();
        this.numeroVentana = numeroVentana;
        this.ventanaAnterior = ventanaAnterior;
        this.triviaPRS = triviaPRS;
        setBotonPosicion();
        this.usuarioActivo = usuarioActivo;
        this.setSize(700, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        cargarPreguntaRespuesta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRespuestasCorrectas = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblEnunciado = new javax.swing.JLabel();
        pnlRespuestas = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnSalirMenu = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();
        lblTriviaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 810, 600));
        setUndecorated(true);
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        pnlRespuestasCorrectas.setPreferredSize(new java.awt.Dimension(700, 500));
        pnlRespuestasCorrectas.setLayout(null);

        lblTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlRespuestasCorrectas.add(lblTitulo);
        lblTitulo.setBounds(220, 20, 250, 20);

        lblEnunciado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblEnunciado.setLocation(new java.awt.Point(70, 70));
        lblEnunciado.setPreferredSize(new java.awt.Dimension(560, 140));
        lblEnunciado.setSize(new java.awt.Dimension(560, 140));
        pnlRespuestasCorrectas.add(lblEnunciado);
        lblEnunciado.setBounds(70, 70, 560, 140);

        pnlRespuestas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlRespuestas.setLocation(new java.awt.Point(70, 230));
        pnlRespuestas.setSize(new java.awt.Dimension(560, 160));
        pnlRespuestas.setLayout(null);
        pnlRespuestas.add(btn1);
        btn1.setBounds(0, 0, 180, 160);
        pnlRespuestas.add(btn4);
        btn4.setBounds(420, 0, 140, 160);
        pnlRespuestas.add(btn3);
        btn3.setBounds(280, 0, 140, 160);
        pnlRespuestas.add(btn2);
        btn2.setBounds(130, 0, 170, 160);

        pnlRespuestasCorrectas.add(pnlRespuestas);
        pnlRespuestas.setBounds(70, 230, 560, 160);

        btnSalirMenu.setBackground(new java.awt.Color(76, 84, 84));
        btnSalirMenu.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnSalirMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirMenu.setText("Salir al Menu");
        btnSalirMenu.setBorder(null);
        btnSalirMenu.setBorderPainted(false);
        btnSalirMenu.setContentAreaFilled(false);
        btnSalirMenu.setFocusPainted(false);
        btnSalirMenu.setLocation(new java.awt.Point(70, 430));
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
        pnlRespuestasCorrectas.add(btnSalirMenu);
        btnSalirMenu.setBounds(70, 430, 130, 40);

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
        pnlRespuestasCorrectas.add(btnPrincipal);
        btnPrincipal.setBounds(500, 430, 130, 40);

        lblTriviaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Trivia/fondoTrivia2.jpeg"))); // NOI18N
        pnlRespuestasCorrectas.add(lblTriviaFondo);
        lblTriviaFondo.setBounds(0, 0, 700, 500);

        getContentPane().add(pnlRespuestasCorrectas);
        pnlRespuestasCorrectas.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarPreguntaRespuesta() {
        lblTitulo.setText(base.getTrivia(triviaPRS[1].getCodigo_trivia()).getNombre_trivia());
        lblEnunciado.setText(base.getPregunta(triviaPRS[1].getCodigo_pregunta()).getPregunta());
        btn1.setText(base.getRespuesta(triviaPRS[1].getCodigo_respuesta()).getRespuesta());//Mezcalar opciones
    }
    
    private void setBotonPosicion() {
        switch (numeroVentana) {
            case 1: case 2:
                btnPrincipal.setText("Siguiente");
                break;
            default:
                btnPrincipal.setText("Terminar");
        }
    }
    
    private void btnSalirMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMenuMouseEntered
        btnSalirMenu.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnSalirMenuMouseEntered

    private void btnSalirMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMenuMouseExited
        btnSalirMenu.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnSalirMenuMouseExited

    private void btnSalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMenuActionPerformed
        MenuPrincipal menu = new MenuPrincipal(usuarioActivo);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirMenuActionPerformed

    private void btnPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseEntered
        btnPrincipal.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnPrincipalMouseEntered

    private void btnPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseExited
        btnPrincipal.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnPrincipalMouseExited

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        if (btnPrincipal.getText().equals("Siguiente")) {
            mostrarVentanaRandom();
        } else {
            TriviaResultados ventanaResultados = new TriviaResultados(usuarioActivo);
            ventanaResultados.setVisible(true);
        }
        dispose();
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void mostrarVentanaRandom() {
        if (ventanaAnterior.equals("MENU")) {
            switch (generarNumeroRandom(1, 2)) {
                case 1:
                    Trivia1 ventanaTrivia1 = new Trivia1(usuarioActivo, ++numeroVentana, "T2", triviaPRS);
                    ventanaTrivia1.setVisible(true);
                    break;
                case 2:
                    Trivia3 ventanaTrivia3 = new Trivia3(usuarioActivo, ++numeroVentana, "T2", triviaPRS);
                    ventanaTrivia3.setVisible(true);
                    break;
                default:
                    System.err.println("Numero fuera de rango (1-2)");
            }
        } else if (ventanaAnterior.equals("T1")) {
            Trivia3 ventanaTrivia3 = new Trivia3(usuarioActivo, ++numeroVentana, "T2", triviaPRS);
            ventanaTrivia3.setVisible(true);
        } else {
            Trivia1 ventanaTrivia1 = new Trivia1(usuarioActivo, ++numeroVentana, "T2", triviaPRS);
            ventanaTrivia1.setVisible(true);
        }
    }

    private int generarNumeroRandom(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnSalirMenu;
    private javax.swing.JLabel lblEnunciado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTriviaFondo;
    private javax.swing.JPanel pnlRespuestas;
    private javax.swing.JPanel pnlRespuestasCorrectas;
    // End of variables declaration//GEN-END:variables
}
