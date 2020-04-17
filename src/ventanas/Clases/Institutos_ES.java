package ventanas.Clases;

import baseDatos.BaseGACU;
import clases.*;
import ventanas.Informacion.*;
import ventanas.registro.MenuPrincipal;

public class Institutos_ES extends javax.swing.JFrame {

    private String[] codigosImagenes = new String[5];
    private Usuario usuarioActivo;
    private BaseGACU base = new BaseGACU();
    private Info_Lugar ventanaInfo;

    public Institutos_ES() {
        initComponents();
        usuarioActivo = null;
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        setLugarBotones();
    }

    public Institutos_ES(Usuario usuarioActivo) {
        initComponents();
        this.usuarioActivo = usuarioActivo;
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        setLugarBotones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAzuay = new javax.swing.JButton();
        btnCatolica = new javax.swing.JButton();
        btnUps = new javax.swing.JButton();
        btnIsta = new javax.swing.JButton();
        btnCuenca = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnAzuay.setFont(new java.awt.Font("Marion", 2, 20)); // NOI18N
        btnAzuay.setBorder(null);
        btnAzuay.setBorderPainted(false);
        btnAzuay.setOpaque(true);
        btnAzuay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzuayActionPerformed(evt);
            }
        });
        getContentPane().add(btnAzuay);
        btnAzuay.setBounds(60, 130, 590, 40);

        btnCatolica.setFont(new java.awt.Font("Marion", 2, 20)); // NOI18N
        btnCatolica.setBorder(null);
        btnCatolica.setBorderPainted(false);
        btnCatolica.setOpaque(true);
        btnCatolica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatolicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCatolica);
        btnCatolica.setBounds(60, 210, 590, 40);

        btnUps.setFont(new java.awt.Font("Marion", 2, 20)); // NOI18N
        btnUps.setBorder(null);
        btnUps.setBorderPainted(false);
        btnUps.setOpaque(true);
        btnUps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpsActionPerformed(evt);
            }
        });
        getContentPane().add(btnUps);
        btnUps.setBounds(60, 280, 590, 40);

        btnIsta.setFont(new java.awt.Font("Marion", 2, 20)); // NOI18N
        btnIsta.setBorder(null);
        btnIsta.setBorderPainted(false);
        btnIsta.setOpaque(true);
        btnIsta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIstaActionPerformed(evt);
            }
        });
        getContentPane().add(btnIsta);
        btnIsta.setBounds(60, 350, 590, 40);

        btnCuenca.setFont(new java.awt.Font("Marion", 2, 20)); // NOI18N
        btnCuenca.setBorder(null);
        btnCuenca.setBorderPainted(false);
        btnCuenca.setOpaque(true);
        btnCuenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuencaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCuenca);
        btnCuenca.setBounds(60, 50, 590, 40);

        btnVolver.setBackground(new java.awt.Color(76, 84, 84));
        btnVolver.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER");
        btnVolver.setBorder(null);
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setFocusPainted(false);
        btnVolver.setMaximumSize(new java.awt.Dimension(100, 40));
        btnVolver.setMinimumSize(new java.awt.Dimension(100, 40));
        btnVolver.setOpaque(true);
        btnVolver.setPreferredSize(new java.awt.Dimension(100, 40));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(300, 420, 100, 40);

        lblTitulo.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("EDUCACIÓN SUPERIOR");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(0, 0, 700, 30);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/fondoESuperior.jpg"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new java.awt.Color(0, 129, 175));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal menu = new MenuPrincipal(usuarioActivo);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCuencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuencaActionPerformed
        codigosImagenes[0] = "imgEC01";codigosImagenes[1] = "imgEC02";
        codigosImagenes[2] = "imgEC03";codigosImagenes[3] = "imgEC04";
        accionLugares("E01");
    }//GEN-LAST:event_btnCuencaActionPerformed

    private void btnAzuayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzuayActionPerformed
        codigosImagenes[0] = "imgEA01";codigosImagenes[1] = "imgEA02";
        codigosImagenes[2] = "imgEA03";codigosImagenes[3] = "imgEA04";
        accionLugares("E02");
        dispose();    }//GEN-LAST:event_btnAzuayActionPerformed

    private void btnCatolicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatolicaActionPerformed
        codigosImagenes[0] = "imgET01";codigosImagenes[1] = "imgET02";
        codigosImagenes[2] = "imgET03";codigosImagenes[3] = "imgET04";
        accionLugares("E03");
    }//GEN-LAST:event_btnCatolicaActionPerformed

    private void btnUpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpsActionPerformed
        codigosImagenes[0] = "imgEU01";codigosImagenes[1] = "imgEU02";
        codigosImagenes[2] = "imgEU03";codigosImagenes[3] = "imgEU04";
        accionLugares("E04");
    }//GEN-LAST:event_btnUpsActionPerformed

    private void btnIstaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIstaActionPerformed
        codigosImagenes[0] = "imgEI01";codigosImagenes[1] = "imgEI02";
        codigosImagenes[2] = "imgEI03";codigosImagenes[3] = "imgEI04";
        accionLugares("E05");
    }//GEN-LAST:event_btnIstaActionPerformed

    private void accionLugares(String codigoLugar) {
        codigosImagenes[4] = "imgE05"; //temporal
        if (usuarioActivo != null) {
            Visualiza visualiza = new Visualiza(usuarioActivo.getCedulaUsuario(), base.getCategoria_Lugar("C3E", codigoLugar).getCodigo_lugar());
            guadarVisualizaBase(visualiza);
        }
        mostarVentanaInfo(codigoLugar);
    }

    private void guadarVisualizaBase(Visualiza visualiza) {
        base.crearVisualiza(visualiza);
    }
    
    private void mostarVentanaInfo(String codigoLugar) {
        ventanaInfo = new Info_Lugar(usuarioActivo, "C3E", codigoLugar, codigosImagenes);
        ventanaInfo.setVisible(true);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAzuay;
    private javax.swing.JButton btnCatolica;
    private javax.swing.JButton btnCuenca;
    private javax.swing.JButton btnIsta;
    private javax.swing.JButton btnUps;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

    public void setLugarBoton(javax.swing.JButton boton, Lugares lugarMostrar) {
        boton.setText(lugarMostrar.getNombre_lugar());
    }

    public void setLugarBotones() {
        setLugarBoton(btnCuenca, base.getLugar(base.getCategoria_Lugar("C3E", "E01").getCodigo_lugar()));
        setLugarBoton(btnAzuay, base.getLugar(base.getCategoria_Lugar("C3E", "E02").getCodigo_lugar()));
        setLugarBoton(btnCatolica, base.getLugar(base.getCategoria_Lugar("C3E", "E03").getCodigo_lugar()));
        setLugarBoton(btnUps, base.getLugar(base.getCategoria_Lugar("C3E", "E04").getCodigo_lugar()));
        setLugarBoton(btnIsta, base.getLugar(base.getCategoria_Lugar("C3E", "E05").getCodigo_lugar()));
    }
}
