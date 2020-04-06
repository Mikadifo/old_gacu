/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.Clases;

import ventanas.Informacion.Informacion_IAsuntion;
import ventanas.Informacion.Informacion_ICatedral;
import ventanas.Informacion.Informacion_IFrancisco;
import ventanas.Informacion.Informacion_ISantos;
import ventanas.Informacion.Informacion_I_Inmaculada;
import ventanas.Informacion.Informacion_UCuenca;
import ventanas.registro.MenuPrincipal;


public class Iglesias extends javax.swing.JFrame {

    /**
     * Creates new form Iglesias
     */
    public Iglesias() {
        initComponents();
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInmaculada = new javax.swing.JButton();
        btnAsuncion = new javax.swing.JButton();
        btnFrancisco = new javax.swing.JButton();
        btnSantos = new javax.swing.JButton();
        btnSagrario = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        btnInmaculada.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnInmaculada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInmaculadaActionPerformed(evt);
            }
        });
        getContentPane().add(btnInmaculada);
        btnInmaculada.setBounds(60, 100, 590, 40);

        btnAsuncion.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnAsuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsuncionActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsuncion);
        btnAsuncion.setBounds(60, 180, 590, 40);

        btnFrancisco.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnFrancisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFranciscoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFrancisco);
        btnFrancisco.setBounds(60, 260, 590, 40);

        btnSantos.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnSantos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSantosActionPerformed(evt);
            }
        });
        getContentPane().add(btnSantos);
        btnSantos.setBounds(60, 350, 590, 40);

        btnSagrario.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnSagrario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSagrarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnSagrario);
        btnSagrario.setBounds(60, 20, 590, 40);

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iglesias/iglesiaFondo.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(800, 500));
        jLabel2.setMinimumSize(new java.awt.Dimension(800, 500));
        jLabel2.setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 700, 500);

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

    private void btnSagrarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSagrarioActionPerformed
        Informacion_ICatedral sagrario= new Informacion_ICatedral();
        sagrario.setVisible(true);
        sagrario.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnSagrarioActionPerformed

    private void btnInmaculadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInmaculadaActionPerformed
        Informacion_I_Inmaculada inmaculada= new Informacion_I_Inmaculada();
        inmaculada.setVisible(true);
        inmaculada.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnInmaculadaActionPerformed

    private void btnAsuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsuncionActionPerformed
        Informacion_IAsuntion asuncion= new Informacion_IAsuntion();
        asuncion.setVisible(true);
        asuncion.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnAsuncionActionPerformed

    private void btnFranciscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFranciscoActionPerformed
        Informacion_IFrancisco francisco= new Informacion_IFrancisco();
        francisco.setVisible(true);
        francisco.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnFranciscoActionPerformed

    private void btnSantosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSantosActionPerformed
        Informacion_ISantos santos= new Informacion_ISantos();
        santos.setVisible(true);
        santos.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnSantosActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsuncion;
    private javax.swing.JButton btnFrancisco;
    private javax.swing.JButton btnInmaculada;
    private javax.swing.JButton btnSagrario;
    private javax.swing.JButton btnSantos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
