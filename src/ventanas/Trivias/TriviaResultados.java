package ventanas.Trivias;

import ventanas.registro.MenuPrincipal;

public class TriviaResultados extends javax.swing.JFrame {

    public TriviaResultados() {

        initComponents();
        this.setSize(290, 420);
        imgX1.setVisible(false);
        imgV1.setVisible(false);
        imgX2.setVisible(false);
        imgV2.setVisible(false);
        imgX3.setVisible(false);
        imgV3.setVisible(false);
        imgX4.setVisible(false);
        imgV4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        imgV2 = new javax.swing.JLabel();
        imgX3 = new javax.swing.JLabel();
        imgV4 = new javax.swing.JLabel();
        imgX1 = new javax.swing.JLabel();
        imgV1 = new javax.swing.JLabel();
        imgX2 = new javax.swing.JLabel();
        imgV3 = new javax.swing.JLabel();
        imgX4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 810, 600));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 129, 175));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pregunta 4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 310, 110, 19);

        imgV2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/comprobado.png"))); // NOI18N
        jPanel1.add(imgV2);
        imgV2.setBounds(190, 140, 40, 40);

        imgX3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/eliminar.png"))); // NOI18N
        jPanel1.add(imgX3);
        imgX3.setBounds(190, 220, 40, 40);

        imgV4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/comprobado.png"))); // NOI18N
        jPanel1.add(imgV4);
        imgV4.setBounds(190, 290, 40, 40);

        imgX1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/eliminar.png"))); // NOI18N
        jPanel1.add(imgX1);
        imgX1.setBounds(190, 60, 40, 40);

        imgV1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/comprobado.png"))); // NOI18N
        jPanel1.add(imgV1);
        imgV1.setBounds(190, 60, 40, 40);

        imgX2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/eliminar.png"))); // NOI18N
        jPanel1.add(imgX2);
        imgX2.setBounds(190, 140, 40, 40);

        imgV3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/comprobado.png"))); // NOI18N
        jPanel1.add(imgV3);
        imgV3.setBounds(190, 220, 40, 40);

        imgX4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/eliminar.png"))); // NOI18N
        jPanel1.add(imgX4);
        imgX4.setBounds(190, 290, 40, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pregunta 1");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 70, 110, 19);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pregunta 2");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 150, 110, 19);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pregunta 3");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 230, 110, 19);

        jPanel3.setBackground(new java.awt.Color(76, 84, 84));
        jPanel3.setLayout(null);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TRIVIA RESULTADOS");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(94, 5, 102, 14);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 290, 30);

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
        jPanel1.add(btnAceptar);
        btnAceptar.setBounds(90, 360, 120, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 290, 420);

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
    private javax.swing.JLabel imgV1;
    private javax.swing.JLabel imgV2;
    private javax.swing.JLabel imgV3;
    private javax.swing.JLabel imgV4;
    private javax.swing.JLabel imgX1;
    private javax.swing.JLabel imgX2;
    private javax.swing.JLabel imgX3;
    private javax.swing.JLabel imgX4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
