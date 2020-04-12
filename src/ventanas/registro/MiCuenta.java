package ventanas.registro;

import clases.Usuario;
import javax.swing.JOptionPane;
import baseDatos.BaseGACU;

public class MiCuenta extends javax.swing.JFrame {

    private Usuario usuarioActivo;
    private BaseGACU base = new BaseGACU();
    MenuPrincipal ventanaAtras;
    MiCuenta thisVentana;

    public MiCuenta() {
        initComponents();
        thisVentana = this;
        this.setSize(810,600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        btnGuardarCambios.setVisible(false);
        lblContra.setVisible(false);
        lblContraN.setVisible(false);
        txtContrasenaA.setVisible(false);
        txtContrasenaN.setVisible(false);
        deshabilitarCampos();
    }

    public MiCuenta(Usuario usuarioActivo, MenuPrincipal ventanaAtras) {
        initComponents();
        this.setSize(810,600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        thisVentana = this;
        this.ventanaAtras = ventanaAtras;
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
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btX = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelIzquierda = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombreU = new javax.swing.JTextField();
        lblCiudad = new javax.swing.JLabel();
        cmbxCiudad = new javax.swing.JComboBox<>();
        lblContra = new javax.swing.JLabel();
        txtContrasenaA = new javax.swing.JPasswordField();
        lblContraN = new javax.swing.JLabel();
        txtContrasenaN = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        btnCerrarSeccion = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();
        btnEditarCuenta = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 810, 600));
        setMinimumSize(new java.awt.Dimension(810, 600));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(810, 600));

        PanelMiCuenta.setBackground(new java.awt.Color(0, 129, 175));
        PanelMiCuenta.setMinimumSize(new java.awt.Dimension(810, 600));
        PanelMiCuenta.setPreferredSize(new java.awt.Dimension(810, 600));
        PanelMiCuenta.setRequestFocusEnabled(false);
        PanelMiCuenta.setLayout(null);

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
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(312, 312, 312)
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
        header.setBounds(0, 0, 810, 30);

        jPanel1.setMinimumSize(new java.awt.Dimension(540, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(540, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/fondoREGISTRO.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelMiCuenta.add(jPanel1);
        jPanel1.setBounds(270, 0, 540, 600);

        panelIzquierda.setBackground(new java.awt.Color(76, 84, 84));
        panelIzquierda.setToolTipText("");

        lblCedula.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula.setText("CEDULA:");

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

        lblNombre.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("NOMBRE USUARIO:");

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

        lblCiudad.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(255, 255, 255));
        lblCiudad.setText("CIUDAD:");

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

        lblContra.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        lblContra.setForeground(new java.awt.Color(255, 255, 255));
        lblContra.setText("CONTRASEÑA ACTUAL:");

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

        lblContraN.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        lblContraN.setForeground(new java.awt.Color(255, 255, 255));
        lblContraN.setText("CONTRASEÑA NUEVA:");

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

        jSeparator1.setForeground(new java.awt.Color(76, 84, 84));

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

        javax.swing.GroupLayout panelIzquierdaLayout = new javax.swing.GroupLayout(panelIzquierda);
        panelIzquierda.setLayout(panelIzquierdaLayout);
        panelIzquierdaLayout.setHorizontalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCerrarSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarCambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIzquierdaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContra, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrasenaA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContraN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrasenaN, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelIzquierdaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        panelIzquierdaLayout.setVerticalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblCedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCiudad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblContra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasenaA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblContraN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasenaN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelMiCuenta.add(panelIzquierda);
        panelIzquierda.setBounds(0, 0, 270, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMiCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMiCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            JOptionPane.showMessageDialog(thisVentana, "Cedula incorrecta");
            txtCedula.grabFocus();
            return false;
        } else if (!validarUsuario(txtNombreU.getText())) {
            JOptionPane.showMessageDialog(thisVentana, "El nombre de usuario no es el correcto");
            txtNombreU.grabFocus();
            return false;
        }
        return true;
    }

    private boolean contrasenaNuevaValida() {
        if (!validarContrasena(new String(txtContrasenaN.getPassword()))) {
            JOptionPane.showMessageDialog(thisVentana, "La contraseña nueva es incorrecta");
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
        dispose();
        ventanaAtras.habilitarPanelPrincipal();
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
                JOptionPane.showMessageDialog(thisVentana, "Los cambios se han guardado con exito");
            } else if (new String(txtContrasenaA.getPassword()).equals(usuarioActivo.getContrasenaUsuario())) {
                if (contrasenaNuevaValida()) {
                    usuarioNuevo.setContrasenaUsuario(new String(txtContrasenaN.getPassword()));
                    base.modificarUsuario(usuarioNuevo);
                    JOptionPane.showMessageDialog(thisVentana, "Los cambios se han guardado con exito");
                }
            } else {
                JOptionPane.showMessageDialog(thisVentana, "Contrasena Actual Incorrecta");
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
        if (JOptionPane.showConfirmDialog(thisVentana, "¿Esta seguro que desea eliminar esta cuenta?") == JOptionPane.YES_OPTION) {
            if (base.eliminarUsuario(usuarioActivo.getCedulaUsuario())) {
                JOptionPane.showMessageDialog(thisVentana, "El usuario ha sido eliminado!!\nLe enviaremos al menu de registro");
                dispose();
                ventanaAtras.dispose();
                MenuRegistro ventanaMenu = new MenuRegistro();
                ventanaMenu.setVisible(true);
                setLocationRelativeTo(null);
            } else {
                JOptionPane.showMessageDialog(thisVentana, "No se ha podido eliminar el usuario");
            }
        }
    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

    private void btnCerrarSeccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSeccionMouseEntered
        btnCerrarSeccion.setBackground(new java.awt.Color(255, 113, 91));
    }//GEN-LAST:event_btnCerrarSeccionMouseEntered

    private void btnCerrarSeccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSeccionMouseExited
        btnCerrarSeccion.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnCerrarSeccionMouseExited

    private void btnCerrarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSeccionActionPerformed
        if (JOptionPane.showConfirmDialog(thisVentana, "¿Esta seguro de cerrar la sesion actual?") == JOptionPane.YES_OPTION) {
            dispose();
            ventanaAtras.dispose();
            MenuRegistro ventanaMenu = new MenuRegistro();
            ventanaMenu.setVisible(true);
            setLocationRelativeTo(null);
        }
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblContraN;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContrasenaA;
    private javax.swing.JPasswordField txtContrasenaN;
    private javax.swing.JTextField txtNombreU;
    // End of variables declaration//GEN-END:variables
}
