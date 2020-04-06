package ventanas.registro;

import clases.Usuario;
import javax.swing.JOptionPane;
import baseDatos.BaseGACU;

public class MiCuenta extends javax.swing.JFrame {

    private Usuario usuarioActivo;
    private BaseGACU base = new BaseGACU();

    public MiCuenta() {
        initComponents();
        this.setSize(411, 453);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        btnGuardarCambios.setVisible(false);
        lblContra.setVisible(false);
        lblContraN.setVisible(false);
        txtContrasenaA.setVisible(false);
        txtContrasenaN.setVisible(false);
        deshabilitarCampos();
    }

    public MiCuenta(Usuario usuarioActivo) {
        initComponents();
        this.setSize(411, 453);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.usuarioActivo = usuarioActivo;
        btnGuardarCambios.setVisible(false);
        lblContra.setVisible(false);
        lblContraN.setVisible(false);
        txtContrasenaA.setVisible(false);
        txtContrasenaN.setVisible(false);
        llenarCamposUsuario(usuarioActivo);
        deshabilitarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMiCuenta = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombreU = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btX = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        btnGuardarCambios = new javax.swing.JButton();
        btnEditarCuenta = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();
        btnCerrarSeccion = new javax.swing.JButton();
        lblCedula = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        lblContraN = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        txtContrasenaA = new javax.swing.JPasswordField();
        txtContrasenaN = new javax.swing.JPasswordField();
        cmbxCiudad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelMiCuenta.setBackground(new java.awt.Color(0, 129, 175));
        PanelMiCuenta.setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(76, 84, 84));
        PanelMiCuenta.add(jSeparator1);
        jSeparator1.setBounds(0, 210, 410, 10);

        txtNombreU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84)));
        txtNombreU.setEnabled(false);
        txtNombreU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreUKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreUKeyTyped(evt);
            }
        });
        PanelMiCuenta.add(txtNombreU);
        txtNombreU.setBounds(210, 80, 180, 20);

        txtCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84)));
        txtCedula.setEnabled(false);
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        PanelMiCuenta.add(txtCedula);
        txtCedula.setBounds(210, 50, 180, 20);

        header.setBackground(new java.awt.Color(76, 84, 84));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MI CUENTA");

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

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(106, 106, 106)
                .addComponent(btX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btX, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        PanelMiCuenta.add(header);
        header.setBounds(0, 0, 410, 30);

        lblNombre.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("NOMBRE USUARIO:");
        PanelMiCuenta.add(lblNombre);
        lblNombre.setBounds(10, 80, 180, 22);

        btnGuardarCambios.setBackground(new java.awt.Color(76, 84, 84));
        btnGuardarCambios.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambios.setText("GUARDAR CAMBIOS");
        btnGuardarCambios.setBorder(null);
        btnGuardarCambios.setBorderPainted(false);
        btnGuardarCambios.setContentAreaFilled(false);
        btnGuardarCambios.setFocusPainted(false);
        btnGuardarCambios.setMaximumSize(new java.awt.Dimension(100, 40));
        btnGuardarCambios.setMinimumSize(new java.awt.Dimension(100, 40));
        btnGuardarCambios.setOpaque(true);
        btnGuardarCambios.setPreferredSize(new java.awt.Dimension(257, 40));
        btnGuardarCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarCambiosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarCambiosMouseExited(evt);
            }
        });
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });
        PanelMiCuenta.add(btnGuardarCambios);
        btnGuardarCambios.setBounds(80, 240, 257, 40);

        btnEditarCuenta.setBackground(new java.awt.Color(76, 84, 84));
        btnEditarCuenta.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnEditarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCuenta.setText("EDITAR CUENTA");
        btnEditarCuenta.setBorder(null);
        btnEditarCuenta.setBorderPainted(false);
        btnEditarCuenta.setContentAreaFilled(false);
        btnEditarCuenta.setFocusPainted(false);
        btnEditarCuenta.setMaximumSize(new java.awt.Dimension(100, 40));
        btnEditarCuenta.setMinimumSize(new java.awt.Dimension(100, 40));
        btnEditarCuenta.setOpaque(true);
        btnEditarCuenta.setPreferredSize(new java.awt.Dimension(257, 40));
        btnEditarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarCuentaMouseExited(evt);
            }
        });
        btnEditarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCuentaActionPerformed(evt);
            }
        });
        PanelMiCuenta.add(btnEditarCuenta);
        btnEditarCuenta.setBounds(80, 290, 257, 40);

        btnEliminarCuenta.setBackground(new java.awt.Color(76, 84, 84));
        btnEliminarCuenta.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnEliminarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCuenta.setText("ELIMINAR CUENTA");
        btnEliminarCuenta.setBorder(null);
        btnEliminarCuenta.setBorderPainted(false);
        btnEliminarCuenta.setContentAreaFilled(false);
        btnEliminarCuenta.setFocusPainted(false);
        btnEliminarCuenta.setMaximumSize(new java.awt.Dimension(100, 40));
        btnEliminarCuenta.setMinimumSize(new java.awt.Dimension(100, 40));
        btnEliminarCuenta.setOpaque(true);
        btnEliminarCuenta.setPreferredSize(new java.awt.Dimension(257, 40));
        btnEliminarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarCuentaMouseExited(evt);
            }
        });
        btnEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuentaActionPerformed(evt);
            }
        });
        PanelMiCuenta.add(btnEliminarCuenta);
        btnEliminarCuenta.setBounds(80, 340, 257, 40);

        btnCerrarSeccion.setBackground(new java.awt.Color(76, 84, 84));
        btnCerrarSeccion.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnCerrarSeccion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSeccion.setText("CERRAR SESION");
        btnCerrarSeccion.setBorderPainted(false);
        btnCerrarSeccion.setContentAreaFilled(false);
        btnCerrarSeccion.setFocusPainted(false);
        btnCerrarSeccion.setMaximumSize(new java.awt.Dimension(100, 40));
        btnCerrarSeccion.setMinimumSize(new java.awt.Dimension(100, 40));
        btnCerrarSeccion.setOpaque(true);
        btnCerrarSeccion.setPreferredSize(new java.awt.Dimension(257, 40));
        btnCerrarSeccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSeccionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSeccionMouseExited(evt);
            }
        });
        btnCerrarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSeccionActionPerformed(evt);
            }
        });
        PanelMiCuenta.add(btnCerrarSeccion);
        btnCerrarSeccion.setBounds(80, 390, 257, 40);

        lblCedula.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula.setText("CEDULA:");
        PanelMiCuenta.add(lblCedula);
        lblCedula.setBounds(10, 50, 90, 22);

        lblContra.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        lblContra.setForeground(new java.awt.Color(255, 255, 255));
        lblContra.setText("CONTRASEÑA ACTUAL:");
        PanelMiCuenta.add(lblContra);
        lblContra.setBounds(10, 140, 210, 22);

        lblContraN.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        lblContraN.setForeground(new java.awt.Color(255, 255, 255));
        lblContraN.setText("CONTRASEÑA NUEVA:");
        PanelMiCuenta.add(lblContraN);
        lblContraN.setBounds(10, 170, 200, 22);

        lblCiudad.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(255, 255, 255));
        lblCiudad.setText("CIUDAD:");
        PanelMiCuenta.add(lblCiudad);
        lblCiudad.setBounds(10, 110, 90, 22);

        txtContrasenaA.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        txtContrasenaA.setForeground(new java.awt.Color(76, 84, 84));
        txtContrasenaA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84)));
        txtContrasenaA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtContrasenaA.setDropMode(javax.swing.DropMode.INSERT);
        txtContrasenaA.setMinimumSize(new java.awt.Dimension(200, 26));
        txtContrasenaA.setPreferredSize(new java.awt.Dimension(200, 25));
        txtContrasenaA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContrasenaAKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContrasenaAKeyTyped(evt);
            }
        });
        PanelMiCuenta.add(txtContrasenaA);
        txtContrasenaA.setBounds(210, 140, 180, 20);

        txtContrasenaN.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        txtContrasenaN.setForeground(new java.awt.Color(76, 84, 84));
        txtContrasenaN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84)));
        txtContrasenaN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtContrasenaN.setDropMode(javax.swing.DropMode.INSERT);
        txtContrasenaN.setMinimumSize(new java.awt.Dimension(200, 26));
        txtContrasenaN.setPreferredSize(new java.awt.Dimension(200, 25));
        txtContrasenaN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContrasenaNKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContrasenaNKeyTyped(evt);
            }
        });
        PanelMiCuenta.add(txtContrasenaN);
        txtContrasenaN.setBounds(210, 170, 180, 20);

        cmbxCiudad.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        cmbxCiudad.setForeground(new java.awt.Color(76, 84, 84));
        cmbxCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cuenca", "Quito", "Guayaquil", "Ambato", "Manta", "Machalla", "Ibarra", "Loja", "Portoviejo", "Santo Domingo", "Latacunga", "Babahoyo", "Esmeraldas", "Puyo" }));
        cmbxCiudad.setAlignmentX(0.0F);
        cmbxCiudad.setAlignmentY(0.0F);
        cmbxCiudad.setMaximumSize(new java.awt.Dimension(200, 25));
        cmbxCiudad.setMinimumSize(new java.awt.Dimension(200, 25));
        cmbxCiudad.setPreferredSize(new java.awt.Dimension(200, 25));
        cmbxCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbxCiudadItemStateChanged(evt);
            }
        });
        PanelMiCuenta.add(cmbxCiudad);
        cmbxCiudad.setBounds(210, 110, 180, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMiCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMiCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarCamposUsuario(Usuario usuario) {
        txtCedula.setText(usuario.getCedulaUsuario());
        txtNombreU.setText(usuario.getNombreUsuario());
        cmbxCiudad.setSelectedItem(usuario.getCiudadUsuario());
    }

    private void habilitarCampos() {
        lblContra.setVisible(true);
        lblContraN.setVisible(true);
        txtContrasenaA.setVisible(true);
        txtContrasenaN.setVisible(true);
        txtCedula.setEnabled(false);
        cmbxCiudad.setEnabled(true);
        txtContrasenaA.setEnabled(true);
        txtContrasenaN.setEnabled(true);
        txtNombreU.setEnabled(true);
    }

    private void deshabilitarCampos() {
        txtCedula.setEnabled(false);
        cmbxCiudad.setEnabled(false);
        txtContrasenaA.setEnabled(false);
        txtContrasenaN.setEnabled(false);
        txtNombreU.setEnabled(false);
    }

    public void asteriscoYboton() {
        if (txtCedula.getText().isEmpty() || txtNombreU.getText().isEmpty() || cmbxCiudad.getSelectedIndex() == 0) {
            btnGuardarCambios.setEnabled(false);
        } else {
            btnGuardarCambios.setEnabled(true);
        }
    }

    private boolean datosValidos() {
        if (!validarCedula(txtCedula.getText())) {
            JOptionPane.showMessageDialog(null, "Cedula incorrecta");
            txtCedula.grabFocus();
            return false;
        } else if (!validarUsuario(txtNombreU.getText())) {
            JOptionPane.showMessageDialog(null, "El nombre de usuario no es el correcto");
            txtNombreU.grabFocus();
            return false;
        }
        return true;
    }

    private boolean contrasenaNuevaValida() {
        if (!validarContrasena(new String(txtContrasenaN.getPassword()))) {
            JOptionPane.showMessageDialog(null, "La contraseña nueva es incorrecta");
            txtContrasenaN.grabFocus();
            return false;
        }
        return true;
    }

    private boolean validarUsuario(String nombreUsuario) {
        if (nombreUsuario.length() == 0) {
            return false;
        }
        if (!nombreUsuario.matches(".*[A-Za-z].*")) {
            return false;
        }
        return nombreUsuario.matches("^\\w(\\s|\\S)+\\w$");
    }

    private boolean validarContrasena(String contrasena) {
        if (!contrasena.matches(".*[A-Za-z].*")) {
            return false;
        }
        return contrasena.matches("^\\w(\\s|\\S)+\\w$");
    }

    private boolean validarCedula(String cedula) {
        int digitos[] = new int[10];
        int digitoVerificador = 0;

        if (cedula.length() == 0 || cedula.length() > 10) {
            return false;
        }
        for (int d = 0; d < cedula.length(); d++) {
            digitos[d] = Integer.parseInt("" + cedula.charAt(d));
            if ((d + 1) < 10) {
                if ((d + 1) % 2 != 0) {
                    digitos[d] *= 2;
                    if (digitos[d] > 9) {
                        digitos[d] -= 9;
                    }
                }
                digitoVerificador += digitos[d];
            } else {
                break;
            }
        }
        digitoVerificador %= 10;
        if (digitoVerificador != 0) {
            digitoVerificador = 10 - digitoVerificador;
        }
        return digitoVerificador == digitos[9];
    }

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed

    }//GEN-LAST:event_txtCedulaActionPerformed

    private void btXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXMouseEntered
        btX.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btXMouseEntered

    private void btXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXMouseExited
        btX.setForeground(new java.awt.Color(255, 113, 91));
    }//GEN-LAST:event_btXMouseExited

    private void btXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btXActionPerformed

    private void btnGuardarCambiosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCambiosMouseEntered
        btnGuardarCambios.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnGuardarCambiosMouseEntered

    private void btnGuardarCambiosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCambiosMouseExited
        btnGuardarCambios.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnGuardarCambiosMouseExited

    private void setDatosNuevos(Usuario usuario) {
        usuario.setCedulaUsuario(txtCedula.getText());
        usuario.setNombreUsuario(txtNombreU.getText());
        usuario.setCiudadUsuario((String) cmbxCiudad.getSelectedItem());
    }

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        if (datosValidos()) {
            Usuario usuarioNuevo = new Usuario();
            setDatosNuevos(usuarioNuevo);
            if (new String(txtContrasenaA.getPassword()).isEmpty() && new String(txtContrasenaN.getPassword()).isEmpty()) {
                usuarioNuevo.setContrasenaUsuario(usuarioActivo.getContrasenaUsuario());
                base.modificarUsuario(usuarioNuevo);
                JOptionPane.showMessageDialog(null, "Los cambios se han guardado con exito");
            } else if (new String(txtContrasenaA.getPassword()).equals(usuarioActivo.getContrasenaUsuario())) {
                if (contrasenaNuevaValida()) {
                    usuarioNuevo.setContrasenaUsuario(new String(txtContrasenaN.getPassword()));
                    base.modificarUsuario(usuarioNuevo);
                    JOptionPane.showMessageDialog(null, "Los cambios se han guardado con exito");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Contrasena Actual Incorrecta");
            }
        }
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnEditarCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarCuentaMouseEntered
        btnEditarCuenta.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnEditarCuentaMouseEntered

    private void btnEditarCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarCuentaMouseExited
        btnEditarCuenta.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnEditarCuentaMouseExited

    private void btnEditarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCuentaActionPerformed
        btnGuardarCambios.setVisible(true);
        habilitarCampos();
    }//GEN-LAST:event_btnEditarCuentaActionPerformed

    private void btnEliminarCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCuentaMouseEntered
        btnEliminarCuenta.setBackground(new java.awt.Color(255, 113, 91));
    }//GEN-LAST:event_btnEliminarCuentaMouseEntered

    private void btnEliminarCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCuentaMouseExited
        btnEliminarCuenta.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnEliminarCuentaMouseExited

    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed

    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

    private void btnCerrarSeccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSeccionMouseEntered
        btnCerrarSeccion.setBackground(new java.awt.Color(255, 113, 91));
    }//GEN-LAST:event_btnCerrarSeccionMouseEntered

    private void btnCerrarSeccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSeccionMouseExited
        btnCerrarSeccion.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnCerrarSeccionMouseExited

    private void btnCerrarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSeccionActionPerformed
        MenuRegistro ventanaMenu = new MenuRegistro();
        ventanaMenu.setVisible(true);
        dispose();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCerrarSeccionActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        int press = evt.getKeyChar();
        if (press == 10) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        String Cedula = txtCedula.getText();
        if ((c < '0' || c > '9') || (Cedula.length() > 9)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtContrasenaAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaAKeyReleased
        asteriscoYboton();
    }//GEN-LAST:event_txtContrasenaAKeyReleased

    private void txtContrasenaAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaAKeyTyped
        char con = evt.getKeyChar();
        String contra = new String(txtContrasenaA.getPassword());
        if (((con < 'a' || con > 'z') && (con < 'A' || con > 'Z') && (con < '0' || con > '9') && (con < ' ')) || (contra.length() > 25)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtContrasenaAKeyTyped

    private void txtContrasenaNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaNKeyReleased
        asteriscoYboton();
    }//GEN-LAST:event_txtContrasenaNKeyReleased

    private void txtContrasenaNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaNKeyTyped
        char con = evt.getKeyChar();
        String contra = new String(txtContrasenaN.getPassword());
        if (((con < 'a' || con > 'z') && (con < 'A' || con > 'Z') && (con < '0' || con > '9') && (con < ' ')) || (contra.length() > 25)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtContrasenaNKeyTyped

    private void cmbxCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbxCiudadItemStateChanged
        asteriscoYboton();
    }//GEN-LAST:event_cmbxCiudadItemStateChanged

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        asteriscoYboton();
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtNombreUKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUKeyReleased
        asteriscoYboton();
    }//GEN-LAST:event_txtNombreUKeyReleased

    private void txtNombreUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUKeyTyped
        char us = evt.getKeyChar();
        String usuario = txtNombreU.getText();
        if (((us < 'a' || us > 'z') && (us < 'A' || us > 'Z') && (us < '0' || us > '9') && (us < ' ')) || (usuario.length() > 50)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreUKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMiCuenta;
    private javax.swing.JButton btX;
    private javax.swing.JButton btnCerrarSeccion;
    private javax.swing.JButton btnEditarCuenta;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JComboBox<String> cmbxCiudad;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblContraN;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContrasenaA;
    private javax.swing.JPasswordField txtContrasenaN;
    private javax.swing.JTextField txtNombreU;
    // End of variables declaration//GEN-END:variables
}
