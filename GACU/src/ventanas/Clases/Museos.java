
package ventanas.Clases;

import ventanas.Informacion.Informacion_MAborigenes;
import ventanas.Informacion.Informacion_MSEsqueletologia;
import ventanas.Informacion.Informacion_MSModerno;
import ventanas.Informacion.Informacion_MSPumapungo;
import ventanas.Informacion.Informacion_MSRuinas;
import ventanas.Informacion.Informacion_UCuenca;
import ventanas.registro.MenuPrincipal;

public class Museos extends javax.swing.JFrame {

   
    public Museos() {
        initComponents();
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSantos = new javax.swing.JButton();
        btnAborigenes = new javax.swing.JButton();
        btnEsqueletologia = new javax.swing.JButton();
        btnModerno = new javax.swing.JButton();
        btnPumapungo = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        btnSantos.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnSantos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSantosActionPerformed(evt);
            }
        });
        getContentPane().add(btnSantos);
        btnSantos.setBounds(60, 350, 590, 40);

        btnAborigenes.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnAborigenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAborigenesActionPerformed(evt);
            }
        });
        getContentPane().add(btnAborigenes);
        btnAborigenes.setBounds(60, 110, 590, 40);

        btnEsqueletologia.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnEsqueletologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqueletologiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEsqueletologia);
        btnEsqueletologia.setBounds(60, 260, 590, 40);

        btnModerno.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnModerno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModernoActionPerformed(evt);
            }
        });
        getContentPane().add(btnModerno);
        btnModerno.setBounds(60, 180, 590, 40);

        btnPumapungo.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnPumapungo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPumapungoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPumapungo);
        btnPumapungo.setBounds(60, 40, 590, 40);

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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal menu= new MenuPrincipal();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnPumapungoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPumapungoActionPerformed
        Informacion_MSPumapungo puma= new Informacion_MSPumapungo();
        puma.setVisible(true);
        puma.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnPumapungoActionPerformed

    private void btnAborigenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAborigenesActionPerformed
        Informacion_MAborigenes aborigen= new Informacion_MAborigenes();
        aborigen.setVisible(true);
        aborigen.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnAborigenesActionPerformed

    private void btnModernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModernoActionPerformed
        Informacion_MSModerno moderno= new Informacion_MSModerno();
        moderno.setVisible(true);
        moderno.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnModernoActionPerformed

    private void btnEsqueletologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueletologiaActionPerformed
        Informacion_MSEsqueletologia esqueleto= new Informacion_MSEsqueletologia();
        esqueleto.setVisible(true);
        esqueleto.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnEsqueletologiaActionPerformed

    private void btnSantosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSantosActionPerformed
        Informacion_MSRuinas ruinas= new Informacion_MSRuinas();
        ruinas.setVisible(true);
        ruinas.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnSantosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAborigenes;
    private javax.swing.JButton btnEsqueletologia;
    private javax.swing.JButton btnModerno;
    private javax.swing.JButton btnPumapungo;
    private javax.swing.JButton btnSantos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
