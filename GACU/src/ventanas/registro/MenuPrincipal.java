
package ventanas.registro;

import ventanas.Clases.Iglesias;
import ventanas.Clases.Institutos_ES;
import ventanas.Clases.Museos;
import ventanas.Clases.Parques;


public class MenuPrincipal extends javax.swing.JFrame {

   
   
    public MenuPrincipal() {
        initComponents();
        this.setSize(810, 600);
        this.setLocationRelativeTo(null);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btX = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        btnIglesias = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnTrivia = new javax.swing.JButton();
        btnInstitutos = new javax.swing.JButton();
        btnParques = new javax.swing.JButton();
        btnMuseos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(810, 600));
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/Uuario.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(35, 30));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(770, 40, 35, 30);

        jPanel1.setBackground(new java.awt.Color(76, 84, 84));
        jPanel1.setPreferredSize(new java.awt.Dimension(810, 35));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("           Menu Principal");
        jLabel2.setPreferredSize(new java.awt.Dimension(225, 26));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 10, 225, 26);

        btX.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
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
        jPanel1.add(btX);
        btX.setBounds(760, 0, 50, 35);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 35);

        btnCuenta.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCuenta.setText("Cuenta");
        btnCuenta.setBorder(null);
        btnCuenta.setBorderPainted(false);
        btnCuenta.setContentAreaFilled(false);
        getContentPane().add(btnCuenta);
        btnCuenta.setBounds(760, 70, 50, 23);

        btnIglesias.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnIglesias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iglesias/igle.png"))); // NOI18N
        btnIglesias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIglesiasActionPerformed(evt);
            }
        });
        getContentPane().add(btnIglesias);
        btnIglesias.setBounds(400, 70, 340, 200);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/Informacion.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setPreferredSize(new java.awt.Dimension(35, 30));
        getContentPane().add(jButton6);
        jButton6.setBounds(760, 560, 35, 30);

        btnTrivia.setBackground(new java.awt.Color(76, 84, 84));
        btnTrivia.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
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
        });
        getContentPane().add(btnTrivia);
        btnTrivia.setBounds(300, 510, 210, 50);

        btnInstitutos.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnInstitutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Institutos/Principal Intituto.png"))); // NOI18N
        btnInstitutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstitutosActionPerformed(evt);
            }
        });
        getContentPane().add(btnInstitutos);
        btnInstitutos.setBounds(400, 290, 340, 200);

        btnParques.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnParques.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Parques/ParquePrincipal1.png"))); // NOI18N
        btnParques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParquesActionPerformed(evt);
            }
        });
        getContentPane().add(btnParques);
        btnParques.setBounds(40, 70, 340, 200);

        btnMuseos.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnMuseos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuseosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMuseos);
        btnMuseos.setBounds(40, 290, 340, 200);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/MenuPrincipalFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(2, 30, 810, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXMouseEntered
        btX.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btXMouseEntered

    private void btXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXMouseExited
        btX.setForeground(new java.awt.Color(255, 113, 91));
    }//GEN-LAST:event_btXMouseExited

    private void btXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btXActionPerformed

    private void btnTriviaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTriviaMouseEntered
        btnTrivia.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnTriviaMouseEntered

    private void btnTriviaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTriviaMouseExited
        btnTrivia.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnTriviaMouseExited

    private void btnIglesiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIglesiasActionPerformed
        Iglesias iglesias= new Iglesias();
        iglesias.setVisible(true);
        iglesias.setLocationRelativeTo(null);
        dispose();
        
    }//GEN-LAST:event_btnIglesiasActionPerformed

    private void btnInstitutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstitutosActionPerformed
        Institutos_ES institutos= new Institutos_ES();
        institutos.setVisible(true);
        institutos.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnInstitutosActionPerformed

    private void btnParquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParquesActionPerformed
        Parques parques= new Parques();
        parques.setVisible(true);
        parques.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnParquesActionPerformed

    private void btnMuseosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuseosActionPerformed
        Museos museos= new Museos();
        museos.setVisible(true);
        museos.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnMuseosActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btX;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnIglesias;
    private javax.swing.JButton btnInstitutos;
    private javax.swing.JButton btnMuseos;
    private javax.swing.JButton btnParques;
    private javax.swing.JButton btnTrivia;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
