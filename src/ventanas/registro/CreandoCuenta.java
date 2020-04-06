package ventanas.registro;

import clases.Usuario;
import baseDatos.BaseGACU;
import javax.swing.JOptionPane;

public class CreandoCuenta extends javax.swing.JFrame {

    private Usuario usuario;
    private MenuRegistro ventanaMenu;
    private BaseGACU base = new BaseGACU();

    public CreandoCuenta() {
        initComponents();
        this.setSize(400, 372);
        this.setLocationRelativeTo(null);
        btnCrear.setEnabled(false);

    }

    public void asteriscoYboton() {
        if (txtCedula.getText().isEmpty() || txtUsuario.getText().isEmpty() || new String(txtContrasena.getPassword()).isEmpty()
                || cmbxCiudad.getSelectedIndex() == 0) {
            btnCrear.setEnabled(false);
            lbasterisco.setText("*Rellenar todos los campos");
        } else {
            btnCrear.setEnabled(true);
            lbasterisco.setText(null);
        }
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
        lbasterisco = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        cmbxCiudad = new javax.swing.JComboBox<>();
        txtContrasena = new javax.swing.JPasswordField();
        btnAtras = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        lblCiudad1 = new javax.swing.JLabel();

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
        lblCedula.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula.setText("Cédula :");
        lblCedula.setMaximumSize(new java.awt.Dimension(101, 26));
        lblCedula.setMinimumSize(new java.awt.Dimension(101, 26));
        lblCedula.setPreferredSize(new java.awt.Dimension(101, 26));
        pnlCreandoCuenta.add(lblCedula);
        lblCedula.setBounds(32, 72, 101, 26);

        lblUsuario.setBackground(new java.awt.Color(225, 225, 255));
        lblUsuario.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario :");
        lblUsuario.setMaximumSize(new java.awt.Dimension(101, 26));
        lblUsuario.setMinimumSize(new java.awt.Dimension(101, 26));
        lblUsuario.setPreferredSize(new java.awt.Dimension(101, 26));
        pnlCreandoCuenta.add(lblUsuario);
        lblUsuario.setBounds(32, 118, 101, 26);

        lblContrasena.setBackground(new java.awt.Color(225, 225, 255));
        lblContrasena.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasena.setText("Contraseña:");
        lblContrasena.setMaximumSize(new java.awt.Dimension(101, 26));
        lblContrasena.setMinimumSize(new java.awt.Dimension(101, 26));
        lblContrasena.setPreferredSize(new java.awt.Dimension(101, 26));
        pnlCreandoCuenta.add(lblContrasena);
        lblContrasena.setBounds(32, 164, 120, 26);

        lbasterisco.setBackground(new java.awt.Color(225, 225, 255));
        lbasterisco.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbasterisco.setForeground(new java.awt.Color(255, 255, 255));
        lbasterisco.setMaximumSize(new java.awt.Dimension(101, 26));
        lbasterisco.setMinimumSize(new java.awt.Dimension(101, 26));
        lbasterisco.setPreferredSize(new java.awt.Dimension(101, 26));
        pnlCreandoCuenta.add(lbasterisco);
        lbasterisco.setBounds(30, 260, 330, 26);

        txtUsuario.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(76, 84, 84));
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84)));
        txtUsuario.setMinimumSize(new java.awt.Dimension(200, 26));
        txtUsuario.setPreferredSize(new java.awt.Dimension(200, 25));
        txtUsuario.setVerifyInputWhenFocusTarget(false);
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        pnlCreandoCuenta.add(txtUsuario);
        txtUsuario.setBounds(177, 120, 190, 25);

        txtCedula.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(76, 84, 84));
        txtCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84)));
        txtCedula.setMinimumSize(new java.awt.Dimension(200, 26));
        txtCedula.setPreferredSize(new java.awt.Dimension(200, 25));
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        pnlCreandoCuenta.add(txtCedula);
        txtCedula.setBounds(177, 74, 190, 25);

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
        pnlCreandoCuenta.add(cmbxCiudad);
        cmbxCiudad.setBounds(177, 215, 190, 25);

        txtContrasena.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(76, 84, 84));
        txtContrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84)));
        txtContrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtContrasena.setDropMode(javax.swing.DropMode.INSERT);
        txtContrasena.setMinimumSize(new java.awt.Dimension(200, 26));
        txtContrasena.setPreferredSize(new java.awt.Dimension(200, 25));
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyTyped(evt);
            }
        });
        pnlCreandoCuenta.add(txtContrasena);
        txtContrasena.setBounds(177, 166, 190, 25);

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

        lblCiudad1.setBackground(new java.awt.Color(225, 225, 255));
        lblCiudad1.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        lblCiudad1.setForeground(new java.awt.Color(255, 255, 255));
        lblCiudad1.setText("Ciudad :");
        lblCiudad1.setMaximumSize(new java.awt.Dimension(101, 26));
        lblCiudad1.setMinimumSize(new java.awt.Dimension(101, 26));
        lblCiudad1.setPreferredSize(new java.awt.Dimension(101, 26));
        pnlCreandoCuenta.add(lblCiudad1);
        lblCiudad1.setBounds(32, 213, 101, 26);

        getContentPane().add(pnlCreandoCuenta);
        pnlCreandoCuenta.setBounds(0, 0, 400, 372);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean datosValidos() {
        if (!validarCedula(txtCedula.getText())) {
            JOptionPane.showMessageDialog(null, "Cedula incorrecta");
            txtCedula.grabFocus();
            return false;
        } else if (!validarUsuario(txtUsuario.getText())) {
            JOptionPane.showMessageDialog(null, "El nombre de usuario no es el correcto");
            txtUsuario.grabFocus();
            return false;
        } else if (!validarContrasena(new String(txtContrasena.getPassword()))) {
            JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
            txtContrasena.grabFocus();
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

    private boolean validarContrasena(String nombreUsuario) {
        if (nombreUsuario.length() == 0) {
            return false;
        }
        if (!nombreUsuario.matches(".*[A-Za-z].*")) {
            return false;
        }
        return nombreUsuario.matches("^\\w(\\s|\\S)+\\w$");
    }
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
    private void datos(Usuario usuario) {
        usuario.setCedulaUsuario(txtCedula.getText());
        usuario.setNombreUsuario(txtUsuario.getText());
        usuario.setContrasenaUsuario(new String(txtContrasena.getPassword()));
        usuario.setCiudadUsuario((String) cmbxCiudad.getSelectedItem());

    }
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        if (datosValidos()) {
            usuario = new Usuario();
            datos(usuario);
            if (base.crearUsuario(usuario)) {
                IniciandoSesion sesion = new IniciandoSesion(txtCedula.getText(), new String(txtContrasena.getPassword()));
                sesion.setVisible(true);
                dispose();
                setLocationRelativeTo(null);
            } else {
                JOptionPane.showMessageDialog(null, "El numero cedula ya esta registrada");
                if (JOptionPane.showConfirmDialog(null, "Desea Iniciar Sesion con esa cedula?") == JOptionPane.YES_OPTION) {
                    IniciandoSesion sesion = new IniciandoSesion(txtCedula.getText());
                    sesion.setVisible(true);
                    dispose();
                    setLocationRelativeTo(null);
                }
            }
        }

    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        asteriscoYboton();
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        asteriscoYboton();
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void txtContrasenaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyReleased
        asteriscoYboton();
    }//GEN-LAST:event_txtContrasenaKeyReleased

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

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        char us = evt.getKeyChar();
        String usuario = txtUsuario.getText();
        if (((us < 'a' || us > 'z') && (us < 'A' || us > 'Z') && (us < '0' || us > '9') && (us < ' ')) || (usuario.length() > 50)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyTyped
        char con = evt.getKeyChar();
        String contra = new String (txtContrasena.getPassword());
        if (((con < 'a' || con > 'z') && (con < 'A' || con > 'Z') && (con < '0' || con > '9') && (con < ' ')) || (contra.length() > 25)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtContrasenaKeyTyped

    private void cmbxCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbxCiudadItemStateChanged
        asteriscoYboton();
    }//GEN-LAST:event_cmbxCiudadItemStateChanged
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btX;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCrear;
    private javax.swing.JComboBox<String> cmbxCiudad;
    private javax.swing.JLabel lbasterisco;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCiudad1;
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
