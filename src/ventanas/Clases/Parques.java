/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.Clases;

import ventanas.Informacion.Informacion_PCalderon;
import ventanas.Informacion.Informacion_PMadre;
import ventanas.Informacion.Informacion_PParaiso;
import ventanas.Informacion.Informacion_PSanblas;
import ventanas.Informacion.Informacion_PSebastian;
import ventanas.Informacion.Informacion_UCuenca;
import ventanas.registro.MenuPrincipal;

/**
 *
 * @author Steve
 */
public class Parques extends javax.swing.JFrame {

    /**
     * Creates new form Parques
     */
    public Parques() {
        initComponents();
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSebastian = new javax.swing.JButton();
        btnCalderon = new javax.swing.JButton();
        btnParaiso = new javax.swing.JButton();
        btnMadre = new javax.swing.JButton();
        btnBlas = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnSebastian.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnSebastian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSebastianActionPerformed(evt);
            }
        });
        getContentPane().add(btnSebastian);
        btnSebastian.setBounds(60, 360, 590, 40);

        btnCalderon.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnCalderon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalderonActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalderon);
        btnCalderon.setBounds(60, 30, 590, 40);

        btnParaiso.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnParaiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaisoActionPerformed(evt);
            }
        });
        getContentPane().add(btnParaiso);
        btnParaiso.setBounds(50, 110, 590, 40);

        btnMadre.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMadreActionPerformed(evt);
            }
        });
        getContentPane().add(btnMadre);
        btnMadre.setBounds(60, 190, 590, 40);

        btnBlas.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnBlas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlasActionPerformed(evt);
            }
        });
        getContentPane().add(btnBlas);
        btnBlas.setBounds(60, 270, 590, 40);

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
        btnVolver.setBounds(310, 430, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Parques/ParqueFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCalderonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalderonActionPerformed
        Informacion_PCalderon calderon = new Informacion_PCalderon();
        calderon.setVisible(true);
        calderon.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnCalderonActionPerformed

    private void btnParaisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaisoActionPerformed
        Informacion_PParaiso paraiso = new Informacion_PParaiso();
        paraiso.setVisible(true);
        paraiso.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnParaisoActionPerformed

    private void btnMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMadreActionPerformed
        Informacion_PMadre madre = new Informacion_PMadre();
        madre.setVisible(true);
        madre.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnMadreActionPerformed

    private void btnBlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlasActionPerformed
        Informacion_PSanblas blas = new Informacion_PSanblas();
        blas.setVisible(true);
        blas.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnBlasActionPerformed

    private void btnSebastianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSebastianActionPerformed
        Informacion_PSebastian sebastian= new Informacion_PSebastian();
        sebastian.setVisible(true);
        sebastian.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnSebastianActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlas;
    private javax.swing.JButton btnCalderon;
    private javax.swing.JButton btnMadre;
    private javax.swing.JButton btnParaiso;
    private javax.swing.JButton btnSebastian;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
