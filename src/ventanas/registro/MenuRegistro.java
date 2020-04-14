package ventanas.registro;

public class MenuRegistro extends javax.swing.JFrame {

    private CreandoCuenta ventanaCC;
    private IniciandoSesion ventanaIS;

    public MenuRegistro() {
        initComponents();
        this.setSize(810, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        panelIzquierda = new javax.swing.JPanel();
        btnInvitado = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCrearCuenta = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        btnGacu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelDerecha = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 810, 600));
        setMinimumSize(new java.awt.Dimension(810, 600));
        setUndecorated(true);
        setSize(new java.awt.Dimension(810, 600));
        getContentPane().setLayout(null);

        pnlMenu.setBackground(new java.awt.Color(0, 129, 175));
        pnlMenu.setMinimumSize(new java.awt.Dimension(810, 600));
        pnlMenu.setPreferredSize(new java.awt.Dimension(810, 600));
        pnlMenu.setLayout(null);

        panelIzquierda.setBackground(new java.awt.Color(76, 84, 84));
        panelIzquierda.setMinimumSize(new java.awt.Dimension(275, 600));
        panelIzquierda.setPreferredSize(new java.awt.Dimension(275, 600));

        btnInvitado.setBackground(new java.awt.Color(76, 84, 84));
        btnInvitado.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnInvitado.setForeground(new java.awt.Color(255, 255, 255));
        btnInvitado.setText("INVITADO");
        btnInvitado.setBorderPainted(false);
        btnInvitado.setOpaque(true);
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

        btnSalir.setBackground(new java.awt.Color(76, 84, 84));
        btnSalir.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorderPainted(false);
        btnSalir.setOpaque(true);
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

        btnCrearCuenta.setBackground(new java.awt.Color(76, 84, 84));
        btnCrearCuenta.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta.setText("CREAR CUENTA");
        btnCrearCuenta.setBorder(null);
        btnCrearCuenta.setBorderPainted(false);
        btnCrearCuenta.setOpaque(true);
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

        btnIniciarSesion.setBackground(new java.awt.Color(76, 84, 84));
        btnIniciarSesion.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("INICIAR SESION");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setOpaque(true);
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

        btnGacu.setBackground(new java.awt.Color(76, 84, 84));
        btnGacu.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnGacu.setForeground(new java.awt.Color(255, 255, 255));
        btnGacu.setText("GALERÍA CUENCA");
        btnGacu.setBorderPainted(false);
        btnGacu.setPreferredSize(new java.awt.Dimension(257, 40));
        btnGacu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGacuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGacuMouseExited(evt);
            }
        });
        btnGacu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGacuActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/GACULOGO.jpeg"))); // NOI18N

        javax.swing.GroupLayout panelIzquierdaLayout = new javax.swing.GroupLayout(panelIzquierda);
        panelIzquierda.setLayout(panelIzquierdaLayout);
        panelIzquierdaLayout.setHorizontalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
            .addComponent(btnCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInvitado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGacu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelIzquierdaLayout.setVerticalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIzquierdaLayout.createSequentialGroup()
                .addComponent(btnGacu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlMenu.add(panelIzquierda);
        panelIzquierda.setBounds(0, 0, 270, 600);

        panelDerecha.setMinimumSize(new java.awt.Dimension(540, 600));
        panelDerecha.setPreferredSize(new java.awt.Dimension(540, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/fondoREGISTRO.jpeg"))); // NOI18N

        javax.swing.GroupLayout panelDerechaLayout = new javax.swing.GroupLayout(panelDerecha);
        panelDerecha.setLayout(panelDerechaLayout);
        panelDerechaLayout.setHorizontalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelDerechaLayout.setVerticalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlMenu.add(panelDerecha);
        panelDerecha.setBounds(270, 0, 540, 600);

        getContentPane().add(pnlMenu);
        pnlMenu.setBounds(0, 0, 810, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new java.awt.Color(255, 113, 91));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnInvitadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvitadoMouseEntered
        btnInvitado.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnInvitadoMouseEntered

    private void btnInvitadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvitadoMouseExited
        btnInvitado.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnInvitadoMouseExited

    private void btnCrearCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuentaMouseEntered
        btnCrearCuenta.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnCrearCuentaMouseEntered

    private void btnCrearCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuentaMouseExited
        btnCrearCuenta.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnCrearCuentaMouseExited

    private void btnIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseEntered
        btnIniciarSesion.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnIniciarSesionMouseEntered

    private void btnIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseExited
        btnIniciarSesion.setBackground(new java.awt.Color(76, 84, 84));
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
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInvitadoActionPerformed

    private void btnGacuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGacuMouseEntered
        btnGacu.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnGacuMouseEntered

    private void btnGacuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGacuMouseExited
        btnGacu.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnGacuMouseExited

    private void btnGacuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGacuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGacuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnGacu;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnInvitado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
