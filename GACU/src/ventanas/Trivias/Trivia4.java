
package ventanas.Trivias;


public class Trivia4 extends javax.swing.JFrame {

   
    public Trivia4() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSalirMenu = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 20, 250, 20);

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 70, 570, 140);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(70, 230, 570, 160);

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
        jPanel1.add(btnSalirMenu);
        btnSalirMenu.setBounds(70, 430, 130, 40);

        btnSiguiente.setBackground(new java.awt.Color(76, 84, 84));
        btnSiguiente.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Terminar");
        btnSiguiente.setBorder(null);
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.setFocusPainted(false);
        btnSiguiente.setMaximumSize(new java.awt.Dimension(100, 40));
        btnSiguiente.setMinimumSize(new java.awt.Dimension(100, 40));
        btnSiguiente.setOpaque(true);
        btnSiguiente.setPreferredSize(new java.awt.Dimension(100, 40));
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseExited(evt);
            }
        });
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente);
        btnSiguiente.setBounds(330, 430, 100, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Trivia/Trivia_Fondos.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 700, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMenuMouseEntered
        btnSalirMenu.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnSalirMenuMouseEntered

    private void btnSalirMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMenuMouseExited
        btnSalirMenu.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnSalirMenuMouseExited

    private void btnSalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMenuActionPerformed
        
    }//GEN-LAST:event_btnSalirMenuActionPerformed

    private void btnSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseEntered
        btnSalirMenu.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnSiguienteMouseEntered

    private void btnSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseExited
        btnSalirMenu.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnSiguienteMouseExited

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
       
    }//GEN-LAST:event_btnSiguienteActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalirMenu;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
