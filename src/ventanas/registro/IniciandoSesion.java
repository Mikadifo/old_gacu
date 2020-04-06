package ventanas.registro;

import baseDatos.BaseGACU;
import clases.Usuario;
import javax.swing.JOptionPane;

public class IniciandoSesion extends javax.swing.JFrame {

    private MenuRegistro ventanaMenu;
    private Usuario usuario;
    private BaseGACU base = new BaseGACU();
    private boolean constructorOverrideUsado = false;

    //CONSTRUCTORES
    public IniciandoSesion() {
        initComponents();
        this.setSize(400, 372);
        this.setLocationRelativeTo(null);
        btnIngresar.setEnabled(false);
    }

    public IniciandoSesion(String cedula, String contrasena) {
        initComponents();
        this.txtCedula.setText(cedula);
        this.txtContrasena.setText(contrasena);
        this.setSize(400, 372);
        this.setLocationRelativeTo(null);
        btnIngresar.setEnabled(true);
        constructorOverrideUsado = true;
    }

    public IniciandoSesion(String cedula) {
        initComponents();
        this.txtCedula.setText(cedula);
        this.setSize(400, 372);
        this.setLocationRelativeTo(null);
        btnIngresar.setEnabled(true);
        constructorOverrideUsado = true;
    }
    //FIN CONSTRUCTORES

    public void validarBoton() {
        if (txtCedula.getText().isEmpty() || new String(txtContrasena.getPassword()).isEmpty()) {
            btnIngresar.setEnabled(false);
        } else {
            btnIngresar.setEnabled(true);
        }
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
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
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
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyTyped(evt);
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
        btnIngresar.setOpaque(true);
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
        if (constructorOverrideUsado) {
            CreandoCuenta ventanaCrear = new CreandoCuenta();
            ventanaCrear.setVisible(true);
            dispose();
        } else {
            ventanaMenu = new MenuRegistro();
            ventanaMenu.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btAtrasActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnXActionPerformed

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        btnIngresar.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        btnIngresar.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnIngresarMouseExited

    private void btAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtrasMouseEntered
        btAtras.setForeground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btAtrasMouseEntered

    private void btAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtrasMouseExited
        btAtras.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btAtrasMouseExited

    private void btnXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseEntered
        btnX.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnXMouseEntered

    private void btnXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseExited
        btnX.setForeground(new java.awt.Color(255, 113, 91));
    }//GEN-LAST:event_btnXMouseExited

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if (datosValidos()) {
            Usuario usuarioActivo;
            int estadoSolicitud = base.solicitarIngresoUsuario(txtCedula.getText(), new String(txtContrasena.getPassword()));
            switch (estadoSolicitud) {
                case -1:
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Cedula incorrecta");
                    break;
                default:
                    usuarioActivo = base.getUsuario(txtCedula.getText());
                    MenuPrincipal menu = new MenuPrincipal(usuarioActivo);
                    menu.setVisible(true);
                    dispose();
                    break;
            }
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

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

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        validarBoton();
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtContrasenaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyReleased
        validarBoton();
    }//GEN-LAST:event_txtContrasenaKeyReleased

    private void txtContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyTyped
        char con = evt.getKeyChar();
        String contra = new String(txtContrasena.getPassword());
        if (((con < 'a' || con > 'z') && (con < 'A' || con > 'Z') && (con < '0' || con > '9') && (con < ' ')) || (contra.length() > 25)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtContrasenaKeyTyped
    private boolean datosValidos() {
        if (!validarCedula(txtCedula.getText())) {
            JOptionPane.showMessageDialog(null, "Cedula incorrecta");
            txtCedula.grabFocus();
            return false;
        } else if (!validarContrasena(new String(txtContrasena.getPassword()))) {
            JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
            txtContrasena.grabFocus();
            return false;
        }
        return true;
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
