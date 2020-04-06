package ventanas.registro;

public class MenuRegistro extends javax.swing.JFrame {

   private CreandoCuenta ventanaCC;
    private IniciandoSesion ventanaIS;
    
    public MenuRegistro() {
        initComponents();
        this.setSize(400, 372);
        this.pnlMenu.setSize(400, 372);
        this.pnlHeader.setSize(400, 35);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        lblGacu = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        btnCrearCuenta = new javax.swing.JButton();
        btnInvitado = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 810, 600));
        setUndecorated(true);
        getContentPane().setLayout(null);

        pnlMenu.setBackground(new java.awt.Color(0, 129, 175));
        pnlMenu.setLayout(null);

        pnlHeader.setBackground(new java.awt.Color(76, 84, 84));
        pnlHeader.setPreferredSize(new java.awt.Dimension(400, 35));
        pnlHeader.setLayout(null);

        lblGacu.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        lblGacu.setForeground(new java.awt.Color(255, 255, 255));
        lblGacu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGacu.setText("GACU - GALERÍA CUENCA");
        lblGacu.setPreferredSize(new java.awt.Dimension(36, 35));
        pnlHeader.add(lblGacu);
        lblGacu.setBounds(70, 0, 270, 35);

        pnlMenu.add(pnlHeader);
        pnlHeader.setBounds(0, 0, 400, 35);

        btnIniciarSesion.setBackground(new java.awt.Color(76, 84, 84));
        btnIniciarSesion.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("INICIAR SESION");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setPreferredSize(new java.awt.Dimension(257, 40));
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseExited(evt);
            }
        });
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        pnlMenu.add(btnIniciarSesion);
        btnIniciarSesion.setBounds(75, 95, 257, 40);

        btnCrearCuenta.setBackground(new java.awt.Color(76, 84, 84));
        btnCrearCuenta.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta.setText("CREAR CUENTA");
        btnCrearCuenta.setBorder(null);
        btnCrearCuenta.setBorderPainted(false);
        btnCrearCuenta.setPreferredSize(new java.awt.Dimension(257, 40));
        btnCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearCuentaMouseExited(evt);
            }
        });
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });
        pnlMenu.add(btnCrearCuenta);
        btnCrearCuenta.setBounds(75, 155, 257, 40);

        btnInvitado.setBackground(new java.awt.Color(76, 84, 84));
        btnInvitado.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnInvitado.setForeground(new java.awt.Color(255, 255, 255));
        btnInvitado.setText("INVITADO");
        btnInvitado.setBorderPainted(false);
        btnInvitado.setPreferredSize(new java.awt.Dimension(257, 40));
        btnInvitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInvitadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInvitadoMouseExited(evt);
            }
        });
        btnInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvitadoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnInvitado);
        btnInvitado.setBounds(75, 215, 257, 40);

        btnSalir.setBackground(new java.awt.Color(76, 84, 84));
        btnSalir.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorderPainted(false);
        btnSalir.setPreferredSize(new java.awt.Dimension(257, 40));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pnlMenu.add(btnSalir);
        btnSalir.setBounds(75, 275, 257, 40);

        getContentPane().add(pnlMenu);
        pnlMenu.setBounds(0, 0, 400, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new java.awt.Color(255,113,91));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new java.awt.Color(76,84,84));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnInvitadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvitadoMouseEntered
        btnInvitado.setBackground(new java.awt.Color(30,168,150));
    }//GEN-LAST:event_btnInvitadoMouseEntered

    private void btnInvitadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvitadoMouseExited
        btnInvitado.setBackground(new java.awt.Color(76,84,84));
    }//GEN-LAST:event_btnInvitadoMouseExited

    private void btnCrearCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuentaMouseEntered
        btnCrearCuenta.setBackground(new java.awt.Color(30,168,150));
    }//GEN-LAST:event_btnCrearCuentaMouseEntered

    private void btnCrearCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuentaMouseExited
        btnCrearCuenta.setBackground(new java.awt.Color(76,84,84));
    }//GEN-LAST:event_btnCrearCuentaMouseExited

    private void btnIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseEntered
        btnIniciarSesion.setBackground(new java.awt.Color(30,168,150));
    }//GEN-LAST:event_btnIniciarSesionMouseEntered

    private void btnIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseExited
        btnIniciarSesion.setBackground(new java.awt.Color(76,84,84));
    }//GEN-LAST:event_btnIniciarSesionMouseExited

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        ventanaCC = new CreandoCuenta();
        ventanaCC.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        ventanaIS = new IniciandoSesion();
        ventanaIS.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvitadoActionPerformed
        MenuPrincipal menu= new MenuPrincipal();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInvitadoActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnInvitado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblGacu;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
