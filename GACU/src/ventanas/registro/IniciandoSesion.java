package ventanas.registro;

public class IniciandoSesion extends javax.swing.JFrame {

    private MenuRegistro ventanaMenu;
    
    public IniciandoSesion() {
        initComponents();
        this.setSize(400, 372);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlniciandoSesion = new javax.swing.JPanel();
        lblContrasena = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btAtras = new javax.swing.JButton();
        pnlHeader = new javax.swing.JPanel();
        lblInicioSesion = new javax.swing.JLabel();
        btnX = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        pnlniciandoSesion.setBackground(new java.awt.Color(0, 129, 175));
        pnlniciandoSesion.setToolTipText("");
        pnlniciandoSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlniciandoSesion.setPreferredSize(new java.awt.Dimension(400, 372));
        pnlniciandoSesion.setLayout(null);

        lblContrasena.setBackground(new java.awt.Color(255, 255, 255));
        lblContrasena.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasena.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblContrasena.setText("Contraseña:");
        lblContrasena.setPreferredSize(new java.awt.Dimension(101, 26));
        pnlniciandoSesion.add(lblContrasena);
        lblContrasena.setBounds(20, 160, 101, 26);

        lblCedula.setBackground(new java.awt.Color(255, 255, 255));
        lblCedula.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCedula.setText("Cédula:");
        lblCedula.setPreferredSize(new java.awt.Dimension(101, 26));
        pnlniciandoSesion.add(lblCedula);
        lblCedula.setBounds(20, 90, 101, 26);

        txtCedula.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(75, 84, 84));
        txtCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84)));
        txtCedula.setPreferredSize(new java.awt.Dimension(200, 25));
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        pnlniciandoSesion.add(txtCedula);
        txtCedula.setBounds(150, 90, 200, 25);

        txtContrasena.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(75, 84, 84));
        txtContrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84)));
        txtContrasena.setPreferredSize(new java.awt.Dimension(200, 25));
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        pnlniciandoSesion.add(txtContrasena);
        txtContrasena.setBounds(150, 160, 200, 25);

        btnIngresar.setBackground(new java.awt.Color(75, 84, 84));
        btnIngresar.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setMnemonic('I');
        btnIngresar.setText("INGRESAR");
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        pnlniciandoSesion.add(btnIngresar);
        btnIngresar.setBounds(270, 310, 100, 40);

        btAtras.setBackground(new java.awt.Color(255, 255, 255));
        btAtras.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btAtras.setForeground(new java.awt.Color(255, 255, 255));
        btAtras.setText("<<");
        btAtras.setBorder(null);
        btAtras.setBorderPainted(false);
        btAtras.setContentAreaFilled(false);
        btAtras.setPreferredSize(new java.awt.Dimension(33, 35));
        btAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAtrasMouseExited(evt);
            }
        });
        btAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtrasActionPerformed(evt);
            }
        });
        pnlniciandoSesion.add(btAtras);
        btAtras.setBounds(10, 320, 33, 35);

        pnlHeader.setBackground(new java.awt.Color(76, 84, 84));
        pnlHeader.setToolTipText("");
        pnlHeader.setLayout(null);

        lblInicioSesion.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        lblInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicioSesion.setText("INICIANDO SESION");
        lblInicioSesion.setPreferredSize(new java.awt.Dimension(150, 35));
        pnlHeader.add(lblInicioSesion);
        lblInicioSesion.setBounds(110, 0, 180, 35);

        btnX.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnX.setForeground(new java.awt.Color(255, 113, 91));
        btnX.setText("X");
        btnX.setBorder(null);
        btnX.setBorderPainted(false);
        btnX.setContentAreaFilled(false);
        btnX.setPreferredSize(new java.awt.Dimension(40, 35));
        btnX.setSelected(true);
        btnX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXMouseExited(evt);
            }
        });
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        pnlHeader.add(btnX);
        btnX.setBounds(360, 0, 40, 35);

        pnlniciandoSesion.add(pnlHeader);
        pnlHeader.setBounds(0, 0, 400, 35);

        getContentPane().add(pnlniciandoSesion);
        pnlniciandoSesion.setBounds(0, 0, 400, 372);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void btAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtrasActionPerformed
        ventanaMenu = new MenuRegistro();
        ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btAtrasActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnXActionPerformed

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        btnIngresar.setBackground(new java.awt.Color(30,168,150));
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        btnIngresar.setBackground(new java.awt.Color(76,84,84));
    }//GEN-LAST:event_btnIngresarMouseExited

    private void btAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtrasMouseEntered
        btAtras.setForeground(new java.awt.Color(30,168,150));
    }//GEN-LAST:event_btAtrasMouseEntered

    private void btAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtrasMouseExited
        btAtras.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btAtrasMouseExited

    private void btnXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseEntered
        btnX.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnXMouseEntered

    private void btnXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseExited
        btnX.setForeground(new java.awt.Color(255,113,91));
    }//GEN-LAST:event_btnXMouseExited

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        MenuPrincipal menu= new MenuPrincipal();
        menu.setVisible(true);
        dispose();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_btnIngresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtras;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnX;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlniciandoSesion;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContrasena;
    // End of variables declaration//GEN-END:variables
}
