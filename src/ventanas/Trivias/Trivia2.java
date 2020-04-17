package ventanas.Trivias;

import baseDatos.BaseGACU;
import clases.*;
import javax.swing.JOptionPane;
import ventanas.registro.MenuPrincipal;

public class Trivia2 extends javax.swing.JFrame {

    private OpcionesTrivia2 opciones = new OpcionesTrivia2();
    private final BaseGACU base = new BaseGACU();
    private Trivia_PR[] triviaPRS;
    private boolean[] respuestasTrivias;
    private Usuario usuarioActivo;
    private String ventanaAnterior;
    int numeroVentana;

    public Trivia2(Usuario usuarioActivo, int numeroVentana, String ventanaAnterior, Trivia_PR[] triviaPRS, boolean[] respuestasTrivias) {
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

        pnlRespuestasCorrectas = new javax.swing.JPanel();
        pnlEnunciado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblEnunciado = new javax.swing.JTextPane();
        pnlRespuestas = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnSalirMenu = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblTriviaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 810, 600));
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 500));
        getContentPane().setLayout(null);

        pnlRespuestasCorrectas.setPreferredSize(new java.awt.Dimension(810, 600));
        pnlRespuestasCorrectas.setLayout(null);

        pnlEnunciado.setLayout(null);

        lblEnunciado.setEditable(false);
        lblEnunciado.setBackground(new java.awt.Color(255, 240, 240));
        lblEnunciado.setBorder(null);
        lblEnunciado.setFont(new java.awt.Font("Love Ya Like A Sister", 3, 20)); // NOI18N
        jScrollPane1.setViewportView(lblEnunciado);

        pnlEnunciado.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 730, 190);

        pnlRespuestasCorrectas.add(pnlEnunciado);
        pnlEnunciado.setBounds(40, 50, 730, 190);

        pnlRespuestas.setBackground(new java.awt.Color(102, 102, 102));
        pnlRespuestas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlRespuestas.setLayout(null);

        btn1.setFont(new java.awt.Font("Love Ya Like A Sister", 3, 20)); // NOI18N
        btn1.setBorder(null);
        btn1.setBorderPainted(false);
        btn1.setOpaque(true);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        pnlRespuestas.add(btn1);
        btn1.setBounds(10, 100, 350, 80);

        btn4.setFont(new java.awt.Font("Love Ya Like A Sister", 3, 20)); // NOI18N
        btn4.setBorder(null);
        btn4.setBorderPainted(false);
        btn4.setOpaque(true);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        pnlRespuestas.add(btn4);
        btn4.setBounds(370, 10, 350, 80);

        btn3.setFont(new java.awt.Font("Love Ya Like A Sister", 3, 20)); // NOI18N
        btn3.setBorder(null);
        btn3.setBorderPainted(false);
        btn3.setOpaque(true);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        pnlRespuestas.add(btn3);
        btn3.setBounds(370, 100, 350, 80);

        btn2.setFont(new java.awt.Font("Love Ya Like A Sister", 3, 20)); // NOI18N
        btn2.setBorder(null);
        btn2.setBorderPainted(false);
        btn2.setOpaque(true);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        pnlRespuestas.add(btn2);
        btn2.setBounds(10, 10, 350, 80);

        pnlRespuestasCorrectas.add(pnlRespuestas);
        pnlRespuestas.setBounds(40, 250, 730, 190);

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
        btnSalirMenu.setBounds(40, 500, 260, 80);

        btnPrincipal.setBackground(new java.awt.Color(76, 84, 84));
        btnPrincipal.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
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
        btnPrincipal.setBounds(510, 500, 260, 80);

        header.setBackground(new java.awt.Color(76, 84, 84));
        header.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Marion", 1, 15)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setPreferredSize(new java.awt.Dimension(250, 35));
        header.add(lblTitulo);
        lblTitulo.setBounds(0, 0, 810, 40);

        pnlRespuestasCorrectas.add(header);
        header.setBounds(0, 0, 810, 40);

        lblTriviaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Trivia/trivia2.jpg"))); // NOI18N
        pnlRespuestasCorrectas.add(lblTriviaFondo);
        lblTriviaFondo.setBounds(0, 0, 810, 600);

        getContentPane().add(pnlRespuestasCorrectas);
        pnlRespuestasCorrectas.setBounds(0, 0, 810, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarPreguntaRespuesta() {
        lblTitulo.setText(base.getTrivia(triviaPRS[1].getCodigo_trivia()).getNombre_trivia());
        lblEnunciado.setText("  " + base.getPregunta(triviaPRS[1].getCodigo_pregunta()).getPregunta());
        //System.out.println("RT2 = " + base.getRespuesta(triviaPRS[1].getCodigo_respuesta()).getRespuesta());
        mezlcarOpcionesBotones();
    }

    private void mezlcarOpcionesBotones() {
        String respuesta = base.getRespuesta(triviaPRS[1].getCodigo_respuesta()).getRespuesta();
        String[] opcionesRespuesta = copiarArray(respuesta);
        int[] posicionesRadnom = generarNumerosRandom(0, (opcionesRespuesta.length - 1));
        btn1.setText(opcionesRespuesta[posicionesRadnom[0]]);
        btn2.setText(opcionesRespuesta[posicionesRadnom[1]]);
        btn3.setText(opcionesRespuesta[posicionesRadnom[2]]);
        btn4.setText(opcionesRespuesta[posicionesRadnom[3]]);
    }

    private String[] copiarArray(String respuesta) {
        String[] arrayOpc = new String[4];
        System.arraycopy(opciones.getOpcionesTrivia(respuesta), 0, arrayOpc, 0, (arrayOpc.length - 1));
        arrayOpc[3] = respuesta;
        return arrayOpc;
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
        if (opcionSeleccionada()) {
            respuestasTrivias[1] = (getRespuesta().equals(base.getRespuesta(triviaPRS[1].getCodigo_respuesta()).getRespuesta()));
            if (btnPrincipal.getText().equals("Siguiente")) {
                mostrarVentanaRandom();
            } else {
                new TriviaResultados(usuarioActivo, respuestasTrivias, triviaPRS).setVisible(true);
            }
            base.crearRealiza(new Realiza(triviaPRS[1].getCodigo_trivia(), usuarioActivo.getCedulaUsuario()));
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Primer debe seleccionar una opcion");
        }
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        seleccionarBoton(btn2, new java.awt.Color(42, 81, 176));
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        seleccionarBoton(btn4, new java.awt.Color(54, 159, 68));
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        seleccionarBoton(btn1,  new java.awt.Color(114, 0, 14));
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        seleccionarBoton(btn3, new java.awt.Color(238, 207, 56));
    }//GEN-LAST:event_btn3ActionPerformed

    private void seleccionarBoton(javax.swing.JButton boton, java.awt.Color color) {
        btn1.setBackground(new java.awt.Color(238, 238, 238));
        btn2.setBackground(new java.awt.Color(238, 238, 238));
        btn3.setBackground(new java.awt.Color(238, 238, 238));
        btn4.setBackground(new java.awt.Color(238, 238, 238));
        boton.setBackground(color);
    }

    private void mostrarVentanaRandom() {
        switch (ventanaAnterior) {
            case "MENU":
                switch (generarNumeroRandom(1, 2)) {
                    case 1:
                        Trivia1 ventanaTrivia1 = new Trivia1(usuarioActivo, ++numeroVentana, "T2", triviaPRS, respuestasTrivias);
                        ventanaTrivia1.setVisible(true);
                        break;
                    case 2:
                        Trivia3 ventanaTrivia3 = new Trivia3(usuarioActivo, ++numeroVentana, "T2", triviaPRS, respuestasTrivias);
                        ventanaTrivia3.setVisible(true);
                        break;
                    default:
                        System.err.println("Numero fuera de rango (1-2)");
                }
                break;
            case "T1":
                Trivia3 ventanaTrivia3 = new Trivia3(usuarioActivo, ++numeroVentana, "T2", triviaPRS, respuestasTrivias);
                ventanaTrivia3.setVisible(true);
                break;
            default:
                Trivia1 ventanaTrivia1 = new Trivia1(usuarioActivo, ++numeroVentana, "T2", triviaPRS, respuestasTrivias);
                ventanaTrivia1.setVisible(true);
                break;
        }
    }

    private int generarNumeroRandom(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    private int[] generarNumerosRandom(int min, int max) {
        String nums = String.valueOf(generarNumeroRandom(min, max));
        String[] numsArray = new String[4];
        for (int i = 1; i < numsArray.length; i++) {
            do {
                String num = String.valueOf(generarNumeroRandom(min, max));
                if (!nums.contains(num)) {
                    nums += ("," + num);
                    break;
                }
            } while (true);
        }
        numsArray = nums.split(",");
        return toIntArray(numsArray);
    }

    private int[] toIntArray(String[] stringArray) {
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.valueOf(stringArray[i]);
        }
        return intArray;
    }

    private String getRespuesta() {
        return btn1.getBackground().equals(new java.awt.Color(42, 81, 176))?btn1.getText()
                :btn2.getBackground().equals(new java.awt.Color(2, 81, 176))?btn2.getText()
                :btn3.getBackground().equals(new java.awt.Color(238, 207, 56))?btn3.getText():btn4.getText();
    }
    
    private boolean opcionSeleccionada() {
        return btn1.getBackground().equals(new java.awt.Color(114, 0, 14)) || btn2.getBackground().equals(new java.awt.Color(42, 81, 176)) || btn3.getBackground().equals(new java.awt.Color(238, 207, 56)) || btn4.getBackground().equals(new java.awt.Color(54, 159, 68));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnSalirMenu;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane lblEnunciado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTriviaFondo;
    private javax.swing.JPanel pnlEnunciado;
    private javax.swing.JPanel pnlRespuestas;
    private javax.swing.JPanel pnlRespuestasCorrectas;
    // End of variables declaration//GEN-END:variables
}
