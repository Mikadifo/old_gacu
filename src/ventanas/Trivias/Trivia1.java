package ventanas.Trivias;

import ventanas.registro.MenuPrincipal;

public class Trivia1 extends javax.swing.JFrame {

    public Trivia1() {
        initComponents();
        this.setSize(810, 600);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSalirMenu = new javax.swing.JButton();
        btnSiguiente1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 810, 600));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(310, 20, 250, 20);

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 70, 690, 140);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(70, 230, 690, 160);

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

        btnSiguiente1.setBackground(new java.awt.Color(76, 84, 84));
        btnSiguiente1.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnSiguiente1.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente1.setText("Siguiente");
        btnSiguiente1.setBorder(null);
        btnSiguiente1.setBorderPainted(false);
        btnSiguiente1.setContentAreaFilled(false);
        btnSiguiente1.setFocusPainted(false);
        btnSiguiente1.setMaximumSize(new java.awt.Dimension(100, 40));
        btnSiguiente1.setMinimumSize(new java.awt.Dimension(100, 40));
        btnSiguiente1.setOpaque(true);
        btnSiguiente1.setPreferredSize(new java.awt.Dimension(100, 40));
        btnSiguiente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSiguiente1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSiguiente1MouseExited(evt);
            }
        });
        btnSiguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente1);
        btnSiguiente1.setBounds(660, 440, 100, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Trivia/quiz2.PNG"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(700, 500));
        jLabel3.setMinimumSize(new java.awt.Dimension(700, 500));
        jLabel3.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 810, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMenuMouseEntered
        btnSalirMenu.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnSalirMenuMouseEntered

    private void btnSalirMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMenuMouseExited
        btnSalirMenu.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnSalirMenuMouseExited

    private void btnSalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMenuActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirMenuActionPerformed

    private void btnSiguiente1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguiente1MouseEntered
        btnSiguiente1.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnSiguiente1MouseEntered

    private void btnSiguiente1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguiente1MouseExited
        btnSiguiente1.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnSiguiente1MouseExited

    private void btnSiguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente1ActionPerformed
        Trivia2 trivia2 = new Trivia2();
        trivia2.setVisible(true);
        dispose();
        trivia2.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSiguiente1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalirMenu;
    private javax.swing.JButton btnSiguiente1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
