package ventanas.registro;

import clases.Trivia;
import clases.Usuario;
import ventanas.Clases.Iglesias;
import ventanas.Clases.Institutos_ES;
import ventanas.Clases.Museos;
import ventanas.Clases.Parques;
import ventanas.Trivias.Trivia1;

public class MenuPrincipal extends javax.swing.JFrame {

    info inf = new info();
    private Usuario usuarioActivo;

    public MenuPrincipal() {
        initComponents();
        this.setSize(810, 600);
        this.dispose();
        this.btnTrivia.setEnabled(false);
        this.setLocationRelativeTo(null);
    }
    
    public MenuPrincipal(Usuario usuarioActivo) {
        initComponents();
        this.usuarioActivo = usuarioActivo;
        this.setSize(810, 600);
        this.dispose();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btX = new javax.swing.JButton();
        lbinfo = new javax.swing.JLabel();
        btnCuenta = new javax.swing.JButton();
        btnIglesias = new javax.swing.JButton();
        btnTrivia = new javax.swing.JButton();
        btnInstitutos = new javax.swing.JButton();
        btnParques = new javax.swing.JButton();
        btnMuseos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/Uuario.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(35, 30));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(770, 40, 35, 30);

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Usuario/Informacion.png"))); // NOI18N
        btnInfo.setBorder(null);
        btnInfo.setBorderPainted(false);
        btnInfo.setContentAreaFilled(false);
        btnInfo.setPreferredSize(new java.awt.Dimension(35, 30));
        btnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInfoMouseExited(evt);
            }
        });
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfo);
        btnInfo.setBounds(760, 560, 35, 30);

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

        lbinfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbinfo.setEnabled(false);
        jPanel1.add(lbinfo);
        lbinfo.setBounds(40, 530, 740, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 35);

        btnCuenta.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCuenta.setText("Cuenta");
        btnCuenta.setBorder(null);
        btnCuenta.setBorderPainted(false);
        btnCuenta.setContentAreaFilled(false);
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCuenta);
        btnCuenta.setBounds(760, 70, 50, 23);

        btnIglesias.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnIglesias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/imgIglesia.PNG"))); // NOI18N
        btnIglesias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIglesiasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIglesiasMouseExited(evt);
            }
        });
        btnIglesias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIglesiasActionPerformed(evt);
            }
        });
        getContentPane().add(btnIglesias);
        btnIglesias.setBounds(440, 70, 240, 170);

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
        btnTrivia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriviaActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrivia);
        btnTrivia.setBounds(300, 540, 210, 50);

        btnInstitutos.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnInstitutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/imgUniversidad.PNG"))); // NOI18N
        btnInstitutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInstitutosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInstitutosMouseExited(evt);
            }
        });
        btnInstitutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstitutosActionPerformed(evt);
            }
        });
        getContentPane().add(btnInstitutos);
        btnInstitutos.setBounds(440, 290, 240, 180);

        btnParques.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnParques.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/imgParque.PNG"))); // NOI18N
        btnParques.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnParquesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnParquesMouseExited(evt);
            }
        });
        btnParques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParquesActionPerformed(evt);
            }
        });
        getContentPane().add(btnParques);
        btnParques.setBounds(130, 70, 240, 170);

        btnMuseos.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnMuseos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/imgMuseo.PNG"))); // NOI18N
        btnMuseos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMuseosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMuseosMouseExited(evt);
            }
        });
        btnMuseos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuseosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMuseos);
        btnMuseos.setBounds(130, 290, 240, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-8, 30, 820, 570);

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
        Iglesias iglesias = new Iglesias();
        iglesias.setVisible(true);
        iglesias.setLocationRelativeTo(null);
        dispose();

    }//GEN-LAST:event_btnIglesiasActionPerformed

    private void btnInstitutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstitutosActionPerformed
        Institutos_ES institutos = new Institutos_ES();
        institutos.setVisible(true);
        institutos.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnInstitutosActionPerformed

    private void btnParquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParquesActionPerformed
        Parques parques = new Parques();
        parques.setVisible(true);
        parques.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnParquesActionPerformed

    private void btnMuseosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuseosActionPerformed
        Museos museos = new Museos();
        museos.setVisible(true);
        museos.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnMuseosActionPerformed

    private void btnTriviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriviaActionPerformed
        Trivia1 trivia1 = new Trivia1();
        trivia1.setVisible(true);
        trivia1.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnTriviaActionPerformed

    private void btnIglesiasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIglesiasMouseEntered
        btnIglesias.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnIglesiasMouseEntered

    private void btnIglesiasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIglesiasMouseExited
        btnIglesias.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_btnIglesiasMouseExited

    private void btnParquesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParquesMouseEntered
        btnParques.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnParquesMouseEntered

    private void btnParquesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParquesMouseExited
        btnParques.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_btnParquesMouseExited

    private void btnMuseosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuseosMouseEntered
        btnMuseos.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnMuseosMouseEntered

    private void btnMuseosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuseosMouseExited
        btnMuseos.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_btnMuseosMouseExited

    private void btnInstitutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInstitutosMouseEntered
        btnInstitutos.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnInstitutosMouseEntered

    private void btnInstitutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInstitutosMouseExited
        btnInstitutos.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_btnInstitutosMouseExited

    private void btnInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseEntered
        inf.setVisible(true);
        inf.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnInfoMouseEntered

    private void btnInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseExited
        inf.setVisible(false);
    }//GEN-LAST:event_btnInfoMouseExited

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
        MiCuenta micuenta = new MiCuenta(usuarioActivo);
        micuenta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCuentaActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        MiCuenta micuenta = new MiCuenta(usuarioActivo);
        micuenta.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btX;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnIglesias;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnInstitutos;
    private javax.swing.JButton btnMuseos;
    private javax.swing.JButton btnParques;
    private javax.swing.JButton btnTrivia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbinfo;
    // End of variables declaration//GEN-END:variables
}
