package ventanas.Trivias;

import baseDatos.BaseGACU;
import clases.*;
import javax.swing.JOptionPane;
import ventanas.registro.MenuPrincipal;

public class Trivia3 extends javax.swing.JFrame {

    private BaseGACU base = new BaseGACU();
    private Trivia_PR[] triviaPRS;
    private boolean[] respuestasTrivias;
    private Usuario usuarioActivo;
    private String ventanaAnterior;
    private int numeroVentana;
    
    public Trivia3(Usuario usuarioActivo, int numeroVentana, String ventanaAnterior, Trivia_PR[] triviaPRS, boolean[] respuestasTrivias) {
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

        pnlCompletar = new javax.swing.JPanel();
        pnlRespuestas = new javax.swing.JPanel();
        lblR1 = new javax.swing.JLabel();
        lblR2 = new javax.swing.JLabel();
        lblR3 = new javax.swing.JLabel();
        txtR3 = new javax.swing.JTextField();
        txtR2 = new javax.swing.JTextField();
        txtR1 = new javax.swing.JTextField();
        btnSalirMenu = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();
        pnlEnunciado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblEnunciado = new javax.swing.JTextPane();
        header = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblTriviaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        pnlCompletar.setMinimumSize(new java.awt.Dimension(700, 500));
        pnlCompletar.setRequestFocusEnabled(false);
        pnlCompletar.setLayout(null);

        pnlRespuestas.setBackground(new java.awt.Color(102, 102, 102));
        pnlRespuestas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlRespuestas.setLayout(null);

        lblR1.setBackground(new java.awt.Color(102, 102, 102));
        lblR1.setFont(new java.awt.Font("Love Ya Like A Sister", 1, 20)); // NOI18N
        lblR1.setForeground(new java.awt.Color(255, 255, 255));
        lblR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblR1.setText("1.-");
        lblR1.setOpaque(true);
        pnlRespuestas.add(lblR1);
        lblR1.setBounds(10, 50, 40, 30);

        lblR2.setBackground(new java.awt.Color(102, 102, 102));
        lblR2.setFont(new java.awt.Font("Love Ya Like A Sister", 1, 20)); // NOI18N
        lblR2.setForeground(new java.awt.Color(255, 255, 255));
        lblR2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblR2.setText("2.-");
        lblR2.setOpaque(true);
        pnlRespuestas.add(lblR2);
        lblR2.setBounds(10, 130, 40, 30);

        lblR3.setBackground(new java.awt.Color(102, 102, 102));
        lblR3.setFont(new java.awt.Font("Love Ya Like A Sister", 1, 20)); // NOI18N
        lblR3.setForeground(new java.awt.Color(255, 255, 255));
        lblR3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblR3.setText("3.-");
        lblR3.setOpaque(true);
        pnlRespuestas.add(lblR3);
        lblR3.setBounds(10, 210, 40, 30);

        txtR3.setFont(new java.awt.Font("Love Ya Like A Sister", 3, 15)); // NOI18N
        pnlRespuestas.add(txtR3);
        txtR3.setBounds(70, 210, 590, 29);

        txtR2.setFont(new java.awt.Font("Love Ya Like A Sister", 3, 15)); // NOI18N
        pnlRespuestas.add(txtR2);
        txtR2.setBounds(70, 130, 590, 29);

        txtR1.setFont(new java.awt.Font("Love Ya Like A Sister", 3, 15)); // NOI18N
        pnlRespuestas.add(txtR1);
        txtR1.setBounds(70, 50, 590, 29);

        pnlCompletar.add(pnlRespuestas);
        pnlRespuestas.setBounds(50, 190, 710, 290);

        btnSalirMenu.setBackground(new java.awt.Color(76, 84, 84));
        btnSalirMenu.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
        btnSalirMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirMenu.setText("Salir al Menu");
        btnSalirMenu.setBorder(null);
        btnSalirMenu.setBorderPainted(false);
        btnSalirMenu.setContentAreaFilled(false);
        btnSalirMenu.setFocusPainted(false);
        btnSalirMenu.setMaximumSize(new java.awt.Dimension(100, 40));
        btnSalirMenu.setMinimumSize(new java.awt.Dimension(100, 40));
        btnSalirMenu.setOpaque(true);
        btnSalirMenu.setPreferredSize(new java.awt.Dimension(130, 40));
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
        pnlCompletar.add(btnSalirMenu);
        btnSalirMenu.setBounds(50, 500, 260, 80);

        btnPrincipal.setBackground(new java.awt.Color(76, 84, 84));
        btnPrincipal.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setText("Terminar");
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
        pnlCompletar.add(btnPrincipal);
        btnPrincipal.setBounds(500, 500, 260, 80);

        pnlEnunciado.setBackground(new java.awt.Color(76, 84, 84));
        pnlEnunciado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlEnunciado.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        pnlEnunciado.setPreferredSize(new java.awt.Dimension(710, 70));
        pnlEnunciado.setLayout(null);

        lblEnunciado.setEditable(false);
        lblEnunciado.setBackground(new java.awt.Color(255, 240, 240));
        lblEnunciado.setBorder(null);
        lblEnunciado.setFont(new java.awt.Font("Love Ya Like A Sister", 3, 20)); // NOI18N
        jScrollPane1.setViewportView(lblEnunciado);

        pnlEnunciado.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 710, 110);

        pnlCompletar.add(pnlEnunciado);
        pnlEnunciado.setBounds(50, 60, 710, 110);

        header.setBackground(new java.awt.Color(76, 84, 84));
        header.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Marion", 1, 15)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setPreferredSize(new java.awt.Dimension(250, 35));
        header.add(lblTitulo);
        lblTitulo.setBounds(0, 0, 810, 40);

        pnlCompletar.add(header);
        header.setBounds(0, 0, 810, 40);

        lblTriviaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Trivia/trivia3.jpg"))); // NOI18N
        pnlCompletar.add(lblTriviaFondo);
        lblTriviaFondo.setBounds(0, 0, 810, 600);

        getContentPane().add(pnlCompletar);
        pnlCompletar.setBounds(0, 0, 810, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarPreguntaRespuesta() {
        String[] enunciado = base.getPregunta(triviaPRS[2].getCodigo_pregunta()).getPregunta().split("-");
        lblTitulo.setText(base.getTrivia(triviaPRS[2].getCodigo_trivia()).getNombre_trivia());
        if (enunciado.length == 4) {
            lblEnunciado.setText("  " + enunciado[0] + " 1. <______>" + enunciado[1] + " 2. <______>" + enunciado[2] + " 3. <______>" + enunciado[3]);
        } else {
            lblEnunciado.setText("  " + enunciado[0] + " 1. <______>" + enunciado[1] + " 2. <______>" + enunciado[2] + " 3. <______>");
        }
        System.out.println("RT3 = " + base.getRespuesta(triviaPRS[2].getCodigo_respuesta()).getRespuesta());
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
        if (respuestasLlenas()) {
            String[] respuestas = base.getRespuesta(triviaPRS[2].getCodigo_respuesta()).getRespuesta().split(",");
            respuestasTrivias[2] = respuestas[0].equalsIgnoreCase(txtR1.getText()) && respuestas[1].equalsIgnoreCase(txtR2.getText()) && respuestas[2].equalsIgnoreCase(txtR3.getText());
        if (btnPrincipal.getText().equals("Siguiente")) {
            mostrarVentanaRandom();
        } else {
            new TriviaResultados(usuarioActivo, respuestasTrivias, triviaPRS).setVisible(true);
        }
        base.crearRealiza(new Realiza(triviaPRS[2].getCodigo_trivia(), usuarioActivo.getCedulaUsuario()));
        dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Primero debe llenar todos los espacios");
        }
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void mostrarVentanaRandom() {
        switch (ventanaAnterior) {
            case "MENU":
                switch (generarNumeroRandom(1, 2)) {
                    case 1:
                        Trivia1 ventanaTrivia1 = new Trivia1(usuarioActivo, ++numeroVentana, "T3", triviaPRS, respuestasTrivias);
                        ventanaTrivia1.setVisible(true);
                        break;
                    case 2:
                        Trivia2 ventanaTrivia2 = new Trivia2(usuarioActivo, ++numeroVentana, "T3", triviaPRS, respuestasTrivias);
                        ventanaTrivia2.setVisible(true);
                        break;
                    default:
                        System.err.println("Numero fuera de rango (1-2)");
                }   break;
            case "T1":
                Trivia2 ventanaTrivia2 = new Trivia2(usuarioActivo, ++numeroVentana, "T3", triviaPRS, respuestasTrivias);
                ventanaTrivia2.setVisible(true);
                break;
            default:
                Trivia1 ventanaTrivia1 = new Trivia1(usuarioActivo, ++numeroVentana, "T3", triviaPRS, respuestasTrivias);
                ventanaTrivia1.setVisible(true);
                break;
        }
    }

    private int generarNumeroRandom(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }
    
    private boolean respuestasLlenas() {
        return !txtR1.getText().isBlank() && !txtR2.getText().isBlank() && !txtR3.getText().isBlank();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnSalirMenu;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane lblEnunciado;
    private javax.swing.JLabel lblR1;
    private javax.swing.JLabel lblR2;
    private javax.swing.JLabel lblR3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTriviaFondo;
    private javax.swing.JPanel pnlCompletar;
    private javax.swing.JPanel pnlEnunciado;
    private javax.swing.JPanel pnlRespuestas;
    private javax.swing.JTextField txtR1;
    private javax.swing.JTextField txtR2;
    private javax.swing.JTextField txtR3;
    // End of variables declaration//GEN-END:variables
}
