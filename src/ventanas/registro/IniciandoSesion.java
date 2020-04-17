package ventanas.registro;

import baseDatos.BaseGACU;
import clases.Usuario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class IniciandoSesion extends javax.swing.JFrame {

    private MenuRegistro ventanaMenu;
    private Usuario usuario;
    private BaseGACU base = new BaseGACU();
    private boolean constructorOverrideUsado = false;

    //CONSTRUCTORES
    public IniciandoSesion() {
        initComponents();
        this.setSize(810, 600);
        this.setLocationRelativeTo(null);
        this.txtCedula.grabFocus();
        btnIngresar.setEnabled(false);
    }

    public IniciandoSesion(String cedula, String contrasena) {
        initComponents();
        this.txtCedula.setText(cedula);
        this.txtContrasena.setText(contrasena);
        this.setSize(810, 600);
        this.setLocationRelativeTo(null);
        btnIngresar.setEnabled(true);
        constructorOverrideUsado = true;
    }

    public IniciandoSesion(String cedula) {
        initComponents();
        this.txtCedula.setText(cedula);
        this.setSize(810, 600);
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
        pnlHeader = new javax.swing.JPanel();
        lblInicioSesion = new javax.swing.JLabel();
        btnX = new javax.swing.JButton();
        panelIzquierda = new javax.swing.JPanel();
        lblContrasena = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        btAtras = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        txtContrasena = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        panelDerecha = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 810, 600));
        setMinimumSize(new java.awt.Dimension(810, 600));
        setUndecorated(true);
        setSize(new java.awt.Dimension(810, 600));
        getContentPane().setLayout(null);

        pnlniciandoSesion.setBackground(new java.awt.Color(0, 129, 175));
        pnlniciandoSesion.setToolTipText("");
        pnlniciandoSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlniciandoSesion.setMinimumSize(new java.awt.Dimension(810, 600));
        pnlniciandoSesion.setPreferredSize(new java.awt.Dimension(400, 372));
        pnlniciandoSesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnlniciandoSesionKeyPressed(evt);
            }
        });
        pnlniciandoSesion.setLayout(null);

        pnlHeader.setBackground(new java.awt.Color(76, 84, 84));
        pnlHeader.setToolTipText("");
        pnlHeader.setMinimumSize(new java.awt.Dimension(810, 35));
        pnlHeader.setLayout(null);

        lblInicioSesion.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
        lblInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicioSesion.setText("INICIANDO SESION");
        lblInicioSesion.setPreferredSize(new java.awt.Dimension(150, 35));
        pnlHeader.add(lblInicioSesion);
        lblInicioSesion.setBounds(40, 0, 730, 35);

        btnX.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
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
        btnX.setBounds(770, 0, 40, 35);

        pnlniciandoSesion.add(pnlHeader);
        pnlHeader.setBounds(0, 0, 810, 35);

        panelIzquierda.setBackground(new java.awt.Color(76, 84, 84));
        panelIzquierda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelIzquierdaKeyPressed(evt);
            }
        });

        lblContrasena.setBackground(new java.awt.Color(255, 255, 255));
        lblContrasena.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasena.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblContrasena.setText("Contraseña:");
        lblContrasena.setPreferredSize(new java.awt.Dimension(101, 26));

        txtCedula.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(75, 84, 84));
        txtCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84)));
        txtCedula.setPreferredSize(new java.awt.Dimension(200, 25));
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        lblCedula.setBackground(new java.awt.Color(255, 255, 255));
        lblCedula.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCedula.setText("Cédula:");
        lblCedula.setPreferredSize(new java.awt.Dimension(101, 26));

        btAtras.setBackground(new java.awt.Color(76, 84, 84));
        btAtras.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
        btAtras.setForeground(new java.awt.Color(255, 255, 255));
        btAtras.setText("<<");
        btAtras.setBorder(null);
        btAtras.setBorderPainted(false);
        btAtras.setContentAreaFilled(false);
        btAtras.setOpaque(true);
        btAtras.setPreferredSize(new java.awt.Dimension(33, 35));
        btAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAtrasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btAtrasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btAtrasMouseReleased(evt);
            }
        });
        btAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtrasActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(76, 84, 84));
        btnIngresar.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIngresarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnIngresarMouseReleased(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        txtContrasena.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(75, 84, 84));
        txtContrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84)));
        txtContrasena.setPreferredSize(new java.awt.Dimension(200, 25));
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyTyped(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/GACULOGO.jpeg"))); // NOI18N

        javax.swing.GroupLayout panelIzquierdaLayout = new javax.swing.GroupLayout(panelIzquierda);
        panelIzquierda.setLayout(panelIzquierdaLayout);
        panelIzquierdaLayout.setHorizontalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIzquierdaLayout.createSequentialGroup()
                        .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(panelIzquierdaLayout.createSequentialGroup()
                        .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addComponent(btAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelIzquierdaLayout.setVerticalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(lblContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlniciandoSesion.add(panelIzquierda);
        panelIzquierda.setBounds(0, 0, 270, 600);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/fondoREGISTRO.jpeg"))); // NOI18N

        javax.swing.GroupLayout panelDerechaLayout = new javax.swing.GroupLayout(panelDerecha);
        panelDerecha.setLayout(panelDerechaLayout);
        panelDerechaLayout.setHorizontalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechaLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        panelDerechaLayout.setVerticalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlniciandoSesion.add(panelDerecha);
        panelDerecha.setBounds(270, 0, 540, 600);

        getContentPane().add(pnlniciandoSesion);
        pnlniciandoSesion.setBounds(0, 0, 810, 600);

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
        btnIngresar.setBackground(new java.awt.Color(0, 129, 175));
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        btnIngresar.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnIngresarMouseExited

    private void btAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtrasMouseEntered
        btAtras.setBackground(new java.awt.Color(0, 129, 175));
    }//GEN-LAST:event_btAtrasMouseEntered

    private void btAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtrasMouseExited
        btAtras.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btAtrasMouseExited

    private void btnXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseEntered
        btnX.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnXMouseEntered

    private void btnXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseExited
        btnX.setForeground(new java.awt.Color(255, 113, 91));
    }//GEN-LAST:event_btnXMouseExited

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        accionarBotonIngresar();
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

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            accionarBotonIngresar();
        }
    }//GEN-LAST:event_txtCedulaKeyPressed

    private void txtContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            accionarBotonIngresar();
        }
    }//GEN-LAST:event_txtContrasenaKeyPressed

    private void pnlniciandoSesionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlniciandoSesionKeyPressed
    }//GEN-LAST:event_pnlniciandoSesionKeyPressed

    private void btAtrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtrasMousePressed
        btAtras.setBackground(new java.awt.Color(0, 58, 78));
    }//GEN-LAST:event_btAtrasMousePressed

    private void btnIngresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMousePressed
        btnIngresar.setBackground(new java.awt.Color(0, 58, 78));
    }//GEN-LAST:event_btnIngresarMousePressed

    private void btnIngresarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseReleased
        btnIngresar.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnIngresarMouseReleased

    private void btAtrasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtrasMouseReleased
        btnIngresar.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btAtrasMouseReleased

    private void panelIzquierdaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelIzquierdaKeyPressed
    }//GEN-LAST:event_panelIzquierdaKeyPressed
    
    private void accionarBotonIngresar() {
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
    }
    
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlniciandoSesion;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContrasena;
    // End of variables declaration//GEN-END:variables
}
