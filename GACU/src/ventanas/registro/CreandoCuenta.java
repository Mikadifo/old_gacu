package ventanas.registro;


public class CreandoCuenta extends javax.swing.JFrame {

    private MenuRegistro ventanaMenu;
    
    public CreandoCuenta() {
        initComponents();
        this.setSize(400, 372);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCreandoCuenta = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        btX = new javax.swing.JButton();
        lblCreandoCuenta = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        cmbxCiudad = new javax.swing.JComboBox<>();
        txtContrasena = new javax.swing.JPasswordField();
        btnAtras = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 372));
        setUndecorated(true);
        getContentPane().setLayout(null);

        pnlCreandoCuenta.setBackground(new java.awt.Color(0, 129, 175));
        pnlCreandoCuenta.setMinimumSize(new java.awt.Dimension(400, 372));
        pnlCreandoCuenta.setPreferredSize(new java.awt.Dimension(400, 372));
        pnlCreandoCuenta.setLayout(null);

        pnlHeader.setBackground(new java.awt.Color(76, 84, 84));
        pnlHeader.setPreferredSize(new java.awt.Dimension(400, 35));
        pnlHeader.setVerifyInputWhenFocusTarget(false);
        pnlHeader.setLayout(null);

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
        pnlHeader.add(btX);
        btX.setBounds(350, 0, 50, 35);

        lblCreandoCuenta.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        lblCreandoCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblCreandoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreandoCuenta.setText("CREANDO CUENTA");
        lblCreandoCuenta.setMaximumSize(new java.awt.Dimension(250, 35));
        lblCreandoCuenta.setMinimumSize(new java.awt.Dimension(250, 35));
        lblCreandoCuenta.setPreferredSize(new java.awt.Dimension(250, 35));
        pnlHeader.add(lblCreandoCuenta);
        lblCreandoCuenta.setBounds(110, 0, 170, 35);

        pnlCreandoCuenta.add(pnlHeader);
        pnlHeader.setBounds(0, 0, 400, 35);

        lblCedula.setBackground(new java.awt.Color(225, 225, 255));
        lblCedula.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula.setText("Cédula :");
        lblCedula.setMaximumSize(new java.awt.Dimension(101, 26));
        lblCedula.setMinimumSize(new java.awt.Dimension(101, 26));
        lblCedula.setPreferredSize(new java.awt.Dimension(101, 26));
        pnlCreandoCuenta.add(lblCedula);
        lblCedula.setBounds(32, 72, 101, 26);

        lblUsuario.setBackground(new java.awt.Color(225, 225, 255));
        lblUsuario.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario :");
        lblUsuario.setMaximumSize(new java.awt.Dimension(101, 26));
        lblUsuario.setMinimumSize(new java.awt.Dimension(101, 26));
        lblUsuario.setPreferredSize(new java.awt.Dimension(101, 26));
        pnlCreandoCuenta.add(lblUsuario);
        lblUsuario.setBounds(32, 118, 101, 26);

        lblContrasena.setBackground(new java.awt.Color(225, 225, 255));
        lblContrasena.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasena.setText("Contraseña:");
        lblContrasena.setMaximumSize(new java.awt.Dimension(101, 26));
        lblContrasena.setMinimumSize(new java.awt.Dimension(101, 26));
        lblContrasena.setPreferredSize(new java.awt.Dimension(101, 26));
        pnlCreandoCuenta.add(lblContrasena);
        lblContrasena.setBounds(32, 164, 101, 26);

        lblCiudad.setBackground(new java.awt.Color(225, 225, 255));
        lblCiudad.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(255, 255, 255));
        lblCiudad.setText("Ciudad :");
        lblCiudad.setMaximumSize(new java.awt.Dimension(101, 26));
        lblCiudad.setMinimumSize(new java.awt.Dimension(101, 26));
        lblCiudad.setPreferredSize(new java.awt.Dimension(101, 26));
        pnlCreandoCuenta.add(lblCiudad);
        lblCiudad.setBounds(32, 213, 101, 26);

        txtUsuario.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(76, 84, 84));
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84)));
        txtUsuario.setMinimumSize(new java.awt.Dimension(200, 26));
        txtUsuario.setPreferredSize(new java.awt.Dimension(200, 25));
        txtUsuario.setVerifyInputWhenFocusTarget(false);
        pnlCreandoCuenta.add(txtUsuario);
        txtUsuario.setBounds(167, 120, 200, 25);

        txtCedula.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(76, 84, 84));
        txtCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84)));
        txtCedula.setMinimumSize(new java.awt.Dimension(200, 26));
        txtCedula.setPreferredSize(new java.awt.Dimension(200, 25));
        pnlCreandoCuenta.add(txtCedula);
        txtCedula.setBounds(167, 74, 200, 25);

        cmbxCiudad.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        cmbxCiudad.setForeground(new java.awt.Color(76, 84, 84));
        cmbxCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cuenca", "Quito", "Guayaquil", "Ambato", "Manta", "Machalla", "Ibarra", "Loja", "Portoviejo", "Santo Domingo", "Latacunga", "Babahoyo", "Esmeraldas", "Puyo" }));
        cmbxCiudad.setAlignmentX(0.0F);
        cmbxCiudad.setAlignmentY(0.0F);
        cmbxCiudad.setMaximumSize(new java.awt.Dimension(200, 25));
        cmbxCiudad.setMinimumSize(new java.awt.Dimension(200, 25));
        cmbxCiudad.setPreferredSize(new java.awt.Dimension(200, 25));
        pnlCreandoCuenta.add(cmbxCiudad);
        cmbxCiudad.setBounds(167, 215, 200, 25);

        txtContrasena.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(76, 84, 84));
        txtContrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84)));
        txtContrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtContrasena.setDropMode(javax.swing.DropMode.INSERT);
        txtContrasena.setMinimumSize(new java.awt.Dimension(200, 26));
        txtContrasena.setPreferredSize(new java.awt.Dimension(200, 25));
        pnlCreandoCuenta.add(txtContrasena);
        txtContrasena.setBounds(167, 166, 200, 25);

        btnAtras.setBackground(new java.awt.Color(255, 255, 255));
        btnAtras.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("<<");
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setFocusPainted(false);
        btnAtras.setMaximumSize(new java.awt.Dimension(33, 35));
        btnAtras.setMinimumSize(new java.awt.Dimension(33, 35));
        btnAtras.setPreferredSize(new java.awt.Dimension(33, 25));
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAtrasMouseExited(evt);
            }
        });
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        pnlCreandoCuenta.add(btnAtras);
        btnAtras.setBounds(30, 300, 33, 35);

        btnCrear.setBackground(new java.awt.Color(76, 84, 84));
        btnCrear.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("CREAR");
        btnCrear.setBorder(null);
        btnCrear.setBorderPainted(false);
        btnCrear.setContentAreaFilled(false);
        btnCrear.setFocusPainted(false);
        btnCrear.setMaximumSize(new java.awt.Dimension(100, 40));
        btnCrear.setMinimumSize(new java.awt.Dimension(100, 40));
        btnCrear.setOpaque(true);
        btnCrear.setPreferredSize(new java.awt.Dimension(100, 40));
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearMouseExited(evt);
            }
        });
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        pnlCreandoCuenta.add(btnCrear);
        btnCrear.setBounds(270, 300, 100, 40);

        getContentPane().add(pnlCreandoCuenta);
        pnlCreandoCuenta.setBounds(0, 0, 400, 372);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseEntered
        btnAtras.setForeground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnAtrasMouseEntered

    private void btnAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseExited
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnAtrasMouseExited

    private void btnCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseEntered
        btnCrear.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnCrearMouseEntered

    private void btnCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseExited
        btnCrear.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnCrearMouseExited

    private void btXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXMouseEntered
        btX.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btXMouseEntered

    private void btXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXMouseExited
        btX.setForeground(new java.awt.Color(255, 113, 91));
    }//GEN-LAST:event_btXMouseExited

    private void btXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btXActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ventanaMenu = new MenuRegistro();
        ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        MenuPrincipal menu= new MenuPrincipal();
        menu.setVisible(true);
        dispose();
        setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnCrearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btX;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCrear;
    private javax.swing.JComboBox<String> cmbxCiudad;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCreandoCuenta;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCreandoCuenta;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
