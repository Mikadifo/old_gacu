package ventanas.Trivias;

import ventanas.registro.MenuPrincipal;

public class TriviaResultados extends javax.swing.JFrame {

    public TriviaResultados() {

        initComponents();
        this.setSize(290, 420);
        lblimgX1.setVisible(false);
        lblimgV1.setVisible(false);
        lblimgX2.setVisible(false);
        lblimgV2.setVisible(false);
        lblimgX3.setVisible(false);
        lblimgV3.setVisible(false);
        lblimgX4.setVisible(false);
        lblimgV4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pnlTriviaResultados = new javax.swing.JPanel();
        lblPregunta4 = new javax.swing.JLabel();
        lblimgV2 = new javax.swing.JLabel();
        lblimgX3 = new javax.swing.JLabel();
        lblimgV4 = new javax.swing.JLabel();
        lblimgX1 = new javax.swing.JLabel();
        lblimgV1 = new javax.swing.JLabel();
        lblimgX2 = new javax.swing.JLabel();
        lblimgV3 = new javax.swing.JLabel();
        lblimgX4 = new javax.swing.JLabel();
        lblPregunta1 = new javax.swing.JLabel();
        lblPregunta2 = new javax.swing.JLabel();
        lblPregunta3 = new javax.swing.JLabel();
        pnlHeader = new javax.swing.JPanel();
        lblTriviaResultados = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 810, 600));
        setUndecorated(true);
        getContentPane().setLayout(null);

        pnlTriviaResultados.setBackground(new java.awt.Color(0, 129, 175));
        pnlTriviaResultados.setLayout(null);

        lblPregunta4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblPregunta4.setForeground(new java.awt.Color(255, 255, 255));
        lblPregunta4.setText("Pregunta 4");
        pnlTriviaResultados.add(lblPregunta4);
        lblPregunta4.setBounds(30, 310, 110, 19);

        lblimgV2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/comprobado.png"))); // NOI18N
        pnlTriviaResultados.add(lblimgV2);
        lblimgV2.setBounds(190, 140, 40, 40);

        lblimgX3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/eliminar.png"))); // NOI18N
        pnlTriviaResultados.add(lblimgX3);
        lblimgX3.setBounds(190, 220, 40, 40);

        lblimgV4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/comprobado.png"))); // NOI18N
        pnlTriviaResultados.add(lblimgV4);
        lblimgV4.setBounds(190, 290, 40, 40);

        lblimgX1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/eliminar.png"))); // NOI18N
        pnlTriviaResultados.add(lblimgX1);
        lblimgX1.setBounds(190, 60, 40, 40);

        lblimgV1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/comprobado.png"))); // NOI18N
        pnlTriviaResultados.add(lblimgV1);
        lblimgV1.setBounds(190, 60, 40, 40);

        lblimgX2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/eliminar.png"))); // NOI18N
        pnlTriviaResultados.add(lblimgX2);
        lblimgX2.setBounds(190, 140, 40, 40);

        lblimgV3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/comprobado.png"))); // NOI18N
        pnlTriviaResultados.add(lblimgV3);
        lblimgV3.setBounds(190, 220, 40, 40);

        lblimgX4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/eliminar.png"))); // NOI18N
        pnlTriviaResultados.add(lblimgX4);
        lblimgX4.setBounds(190, 290, 40, 40);

        lblPregunta1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblPregunta1.setForeground(new java.awt.Color(255, 255, 255));
        lblPregunta1.setText("Pregunta 1");
        pnlTriviaResultados.add(lblPregunta1);
        lblPregunta1.setBounds(30, 70, 110, 19);

        lblPregunta2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblPregunta2.setForeground(new java.awt.Color(255, 255, 255));
        lblPregunta2.setText("Pregunta 2");
        pnlTriviaResultados.add(lblPregunta2);
        lblPregunta2.setBounds(30, 150, 110, 19);

        lblPregunta3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblPregunta3.setForeground(new java.awt.Color(255, 255, 255));
        lblPregunta3.setText("Pregunta 3");
        pnlTriviaResultados.add(lblPregunta3);
        lblPregunta3.setBounds(30, 230, 110, 19);

        pnlHeader.setBackground(new java.awt.Color(76, 84, 84));
        pnlHeader.setLayout(null);

        lblTriviaResultados.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        lblTriviaResultados.setForeground(new java.awt.Color(255, 255, 255));
        lblTriviaResultados.setText("TRIVIA RESULTADOS");
        pnlHeader.add(lblTriviaResultados);
        lblTriviaResultados.setBounds(60, 0, 180, 22);

        pnlTriviaResultados.add(pnlHeader);
        pnlHeader.setBounds(0, 0, 290, 30);

        btnAceptar.setBackground(new java.awt.Color(76, 84, 84));
        btnAceptar.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setFocusPainted(false);
        btnAceptar.setOpaque(true);
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarMouseExited(evt);
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        pnlTriviaResultados.add(btnAceptar);
        btnAceptar.setBounds(80, 360, 120, 40);

        getContentPane().add(pnlTriviaResultados);
        pnlTriviaResultados.setBounds(0, 0, 290, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        btnAceptar.setBackground(new java.awt.Color(30,168,150));
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        btnAceptar.setBackground(new java.awt.Color(76,84,84));
    }//GEN-LAST:event_btnAceptarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPregunta1;
    private javax.swing.JLabel lblPregunta2;
    private javax.swing.JLabel lblPregunta3;
    private javax.swing.JLabel lblPregunta4;
    private javax.swing.JLabel lblTriviaResultados;
    private javax.swing.JLabel lblimgV1;
    private javax.swing.JLabel lblimgV2;
    private javax.swing.JLabel lblimgV3;
    private javax.swing.JLabel lblimgV4;
    private javax.swing.JLabel lblimgX1;
    private javax.swing.JLabel lblimgX2;
    private javax.swing.JLabel lblimgX3;
    private javax.swing.JLabel lblimgX4;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlTriviaResultados;
    // End of variables declaration//GEN-END:variables
}
