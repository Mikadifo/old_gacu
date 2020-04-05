
public class MiCuenta extends javax.swing.JFrame {

    
    public MiCuenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btX = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnGuardarCambios = new javax.swing.JButton();
        btnEditarCuenta = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();
        btnCerrarSeccion = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 129, 175));
        jPanel1.setLayout(null);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 230, 410, 10);

        jTextField2.setEnabled(false);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(150, 80, 180, 20);

        jTextField3.setEnabled(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(150, 50, 180, 20);

        jTextField4.setEnabled(false);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(150, 140, 180, 20);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GENERO:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 180, 70, 14);

        jPanel2.setBackground(new java.awt.Color(76, 84, 84));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(btX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(btX, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 410, 30);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("APELLIDOS:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 80, 70, 14);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DIRECCION:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 110, 70, 14);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TELEFONO:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 140, 70, 14);

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
        btnGuardarCambios.setPreferredSize(new java.awt.Dimension(100, 40));
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
        jPanel1.add(btnGuardarCambios);
        btnGuardarCambios.setBounds(120, 250, 180, 40);

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
        btnEditarCuenta.setPreferredSize(new java.awt.Dimension(100, 40));
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
        jPanel1.add(btnEditarCuenta);
        btnEditarCuenta.setBounds(120, 300, 180, 40);

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
        btnEliminarCuenta.setPreferredSize(new java.awt.Dimension(100, 40));
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
        jPanel1.add(btnEliminarCuenta);
        btnEliminarCuenta.setBounds(120, 350, 180, 40);

        btnCerrarSeccion.setBackground(new java.awt.Color(76, 84, 84));
        btnCerrarSeccion.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnCerrarSeccion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSeccion.setText("CERRAR SECCION");
        btnCerrarSeccion.setBorder(null);
        btnCerrarSeccion.setBorderPainted(false);
        btnCerrarSeccion.setContentAreaFilled(false);
        btnCerrarSeccion.setFocusPainted(false);
        btnCerrarSeccion.setMaximumSize(new java.awt.Dimension(100, 40));
        btnCerrarSeccion.setMinimumSize(new java.awt.Dimension(100, 40));
        btnCerrarSeccion.setOpaque(true);
        btnCerrarSeccion.setPreferredSize(new java.awt.Dimension(100, 40));
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
        jPanel1.add(btnCerrarSeccion);
        btnCerrarSeccion.setBounds(120, 400, 180, 40);

        jRadioButton1.setText("MASCULINO");
        jRadioButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(120, 180, 93, 21);

        jRadioButton2.setText("FEMENINO");
        jRadioButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(270, 180, 90, 21);

        jTextField5.setEnabled(false);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(150, 110, 180, 20);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("NOMBRES:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 50, 70, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnEditarCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarCuentaMouseEntered
        btnGuardarCambios.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnEditarCuentaMouseEntered

    private void btnEditarCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarCuentaMouseExited
        btnGuardarCambios.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnEditarCuentaMouseExited

    private void btnEditarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCuentaActionPerformed
     
    }//GEN-LAST:event_btnEditarCuentaActionPerformed

    private void btnEliminarCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCuentaMouseEntered
        btnGuardarCambios.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnEliminarCuentaMouseEntered

    private void btnEliminarCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCuentaMouseExited
        btnGuardarCambios.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnEliminarCuentaMouseExited

    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed
       
    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

    private void btnCerrarSeccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSeccionMouseEntered
        btnGuardarCambios.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnCerrarSeccionMouseEntered

    private void btnCerrarSeccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSeccionMouseExited
        btnGuardarCambios.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnCerrarSeccionMouseExited

    private void btnCerrarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSeccionActionPerformed
        
    }//GEN-LAST:event_btnCerrarSeccionActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btX;
    private javax.swing.JButton btnCerrarSeccion;
    private javax.swing.JButton btnEditarCuenta;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
