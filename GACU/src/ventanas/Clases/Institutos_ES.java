
package ventanas.Clases;

import ventanas.Informacion.Informacion_UAzuay;
import ventanas.Informacion.Informacion_UCatolica_Cuenca;
import ventanas.Informacion.Informacion_UCuenca;
import ventanas.Informacion.Informacion_UIsta;
import ventanas.Informacion.Informacion_UUps;
import ventanas.registro.MenuPrincipal;


public class Institutos_ES extends javax.swing.JFrame {

   
    public Institutos_ES() {
        initComponents();
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAzuay = new javax.swing.JButton();
        btnCatolica = new javax.swing.JButton();
        btnUps = new javax.swing.JButton();
        btnIsta = new javax.swing.JButton();
        btnCuenca = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnAzuay.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnAzuay.setText("Universidad del Azuay");
        btnAzuay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzuayActionPerformed(evt);
            }
        });
        getContentPane().add(btnAzuay);
        btnAzuay.setBounds(60, 110, 590, 40);

        btnCatolica.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnCatolica.setText("Universidad Católica de Cuenca");
        btnCatolica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatolicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCatolica);
        btnCatolica.setBounds(60, 190, 590, 40);

        btnUps.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnUps.setText("Universidad Politécnica Saleciana de Cuenca");
        btnUps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpsActionPerformed(evt);
            }
        });
        getContentPane().add(btnUps);
        btnUps.setBounds(60, 270, 590, 40);

        btnIsta.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnIsta.setText("ISTA");
        btnIsta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIstaActionPerformed(evt);
            }
        });
        getContentPane().add(btnIsta);
        btnIsta.setBounds(60, 350, 590, 40);

        btnCuenca.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnCuenca.setText("Universidad de Cuenca");
        btnCuenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuencaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCuenca);
        btnCuenca.setBounds(60, 30, 590, 40);

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
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(300, 420, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Institutos/InstitutoFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal menu= new MenuPrincipal();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCuencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuencaActionPerformed
        Informacion_UCuenca cuenca= new Informacion_UCuenca();
        cuenca.setVisible(true);
        cuenca.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnCuencaActionPerformed

    private void btnAzuayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzuayActionPerformed
        Informacion_UAzuay azuay= new Informacion_UAzuay();
        azuay.setVisible(true);
        azuay.setLocationRelativeTo(null);
        dispose();    }//GEN-LAST:event_btnAzuayActionPerformed

    private void btnCatolicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatolicaActionPerformed
        Informacion_UCatolica_Cuenca catolica= new Informacion_UCatolica_Cuenca();
        catolica.setVisible(true);
        catolica.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnCatolicaActionPerformed

    private void btnUpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpsActionPerformed
        Informacion_UUps ups= new Informacion_UUps();
        ups.setVisible(true);
        ups.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnUpsActionPerformed

    private void btnIstaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIstaActionPerformed
        Informacion_UIsta ista= new Informacion_UIsta();
        ista.setVisible(true);
        ista.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnIstaActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAzuay;
    private javax.swing.JButton btnCatolica;
    private javax.swing.JButton btnCuenca;
    private javax.swing.JButton btnIsta;
    private javax.swing.JButton btnUps;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
