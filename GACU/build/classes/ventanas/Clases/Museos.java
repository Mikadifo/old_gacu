
package ventanas.Clases;

public class Museos extends javax.swing.JFrame {

   
    public Museos() {
        initComponents();
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jButton2.setText("Ruinas de Todos los Santos");
        getContentPane().add(jButton2);
        jButton2.setBounds(60, 350, 590, 40);

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jButton3.setText("Museo de las Culturas Aborígenes");
        getContentPane().add(jButton3);
        jButton3.setBounds(60, 110, 590, 40);

        jButton4.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jButton4.setText("Museo de Esqueletología");
        getContentPane().add(jButton4);
        jButton4.setBounds(60, 260, 590, 40);

        jButton5.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jButton5.setText("Museo de Arte Moderno");
        getContentPane().add(jButton5);
        jButton5.setBounds(60, 180, 590, 40);

        jButton6.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jButton6.setText("Museo Pumapungo");
        getContentPane().add(jButton6);
        jButton6.setBounds(60, 40, 590, 40);

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
        getContentPane().add(btnVolver);
        btnVolver.setBounds(310, 420, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Museo/MuseoFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnVolverMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
