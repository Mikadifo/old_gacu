package ventanas.Clases;

import baseDatos.BaseGACU;
import clases.*;
import ventanas.Informacion.*;
import ventanas.registro.MenuPrincipal;

public class Iglesias extends javax.swing.JFrame {

    private String[] codigosImagenes = new String[5];
    private Usuario usuarioActivo;
    private BaseGACU base = new BaseGACU();
    private Info_Lugar ventanaInfo;

    public Iglesias() {
        initComponents();
        usuarioActivo = null;
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        setLugarBotones();
    }

    public Iglesias(Usuario usuarioActivo) {
        initComponents();
        this.usuarioActivo = usuarioActivo;
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        setLugarBotones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInmaculada = new javax.swing.JButton();
        btnAsuncion = new javax.swing.JButton();
        btnBlas = new javax.swing.JButton();
        btnSantos = new javax.swing.JButton();
        btnSagrario = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnInmaculada.setFont(new java.awt.Font("Marion", 2, 20)); // NOI18N
        btnInmaculada.setBorder(null);
        btnInmaculada.setBorderPainted(false);
        btnInmaculada.setOpaque(true);
        btnInmaculada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInmaculadaActionPerformed(evt);
            }
        });
        getContentPane().add(btnInmaculada);
        btnInmaculada.setBounds(60, 110, 590, 40);

        btnAsuncion.setFont(new java.awt.Font("Marion", 2, 20)); // NOI18N
        btnAsuncion.setBorder(null);
        btnAsuncion.setBorderPainted(false);
        btnAsuncion.setOpaque(true);
        btnAsuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsuncionActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsuncion);
        btnAsuncion.setBounds(60, 190, 590, 40);

        btnBlas.setFont(new java.awt.Font("Marion", 2, 20)); // NOI18N
        btnBlas.setBorder(null);
        btnBlas.setBorderPainted(false);
        btnBlas.setOpaque(true);
        btnBlas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlasActionPerformed(evt);
            }
        });
        getContentPane().add(btnBlas);
        btnBlas.setBounds(60, 270, 590, 40);

        btnSantos.setFont(new java.awt.Font("Marion", 2, 20)); // NOI18N
        btnSantos.setBorder(null);
        btnSantos.setBorderPainted(false);
        btnSantos.setOpaque(true);
        btnSantos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSantosActionPerformed(evt);
            }
        });
        getContentPane().add(btnSantos);
        btnSantos.setBounds(60, 350, 590, 40);

        btnSagrario.setFont(new java.awt.Font("Marion", 2, 20)); // NOI18N
        btnSagrario.setBorder(null);
        btnSagrario.setBorderPainted(false);
        btnSagrario.setOpaque(true);
        btnSagrario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSagrarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnSagrario);
        btnSagrario.setBounds(60, 40, 590, 40);

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

        jLabel1.setFont(new java.awt.Font("Marion", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IGLESIAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 30);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/fondoIglesias.jpg"))); // NOI18N
        lblFondo.setMaximumSize(new java.awt.Dimension(800, 500));
        lblFondo.setMinimumSize(new java.awt.Dimension(800, 500));
        lblFondo.setPreferredSize(new java.awt.Dimension(800, 500));
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

    private void btnSagrarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSagrarioActionPerformed
        codigosImagenes[0] = "imgIS01";codigosImagenes[1] = "imgIS02";
        codigosImagenes[2] = "imgIS03";codigosImagenes[3] = "imgIS04";
        accionLugares("I02");
    }//GEN-LAST:event_btnSagrarioActionPerformed

    private void btnInmaculadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInmaculadaActionPerformed
        codigosImagenes[0] = "imgII01";codigosImagenes[1] = "imgII02";
        codigosImagenes[2] = "imgII03";codigosImagenes[3] = "imgII04";
        accionLugares("I05");
    }//GEN-LAST:event_btnInmaculadaActionPerformed

    private void btnAsuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsuncionActionPerformed
        codigosImagenes[0] = "imgIA01";codigosImagenes[1] = "imgIA02";
        codigosImagenes[2] = "imgIA03";codigosImagenes[3] = "imgIA04";
        accionLugares("I01");
    }//GEN-LAST:event_btnAsuncionActionPerformed

    private void btnBlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlasActionPerformed
        codigosImagenes[0] = "imgIB01";codigosImagenes[1] = "imgIB02";
        codigosImagenes[2] = "imgIB03";codigosImagenes[3] = "imgIB04";
        accionLugares("I03");
    }//GEN-LAST:event_btnBlasActionPerformed

    private void btnSantosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSantosActionPerformed
        codigosImagenes[0] = "imgIT01";codigosImagenes[1] = "imgIT02";
        codigosImagenes[2] = "imgIT03";codigosImagenes[3] = "imgIT04";
        accionLugares("I04");
    }//GEN-LAST:event_btnSantosActionPerformed

    private void accionLugares(String codigoLugar) {
        codigosImagenes[4] = "imgI05"; //temporal
        if (usuarioActivo != null) {
            Visualiza visualiza = new Visualiza(usuarioActivo.getCedulaUsuario(), base.getCategoria_Lugar("C2I", codigoLugar).getCodigo_lugar());
            guadarVisualizaBase(visualiza);
        }
        mostarVentanaInfo(codigoLugar);
    }

    private void guadarVisualizaBase(Visualiza visualiza) {
        base.crearVisualiza(visualiza);
    }

    private void mostarVentanaInfo(String codigoLugar) {
        ventanaInfo = new Info_Lugar(usuarioActivo, "C2I", codigoLugar, codigosImagenes);
        ventanaInfo.setVisible(true);
        dispose();
    }
    
    public void setLugarBoton(javax.swing.JButton boton, Lugares lugarMostrar) {
        boton.setText(lugarMostrar.getNombre_lugar());
    }

    public void setLugarBotones() {
        setLugarBoton(btnAsuncion, base.getLugar(base.getCategoria_Lugar("C2I", "I01").getCodigo_lugar()));
        setLugarBoton(btnSagrario, base.getLugar(base.getCategoria_Lugar("C2I", "I02").getCodigo_lugar()));
        setLugarBoton(btnBlas, base.getLugar(base.getCategoria_Lugar("C2I", "I03").getCodigo_lugar()));
        setLugarBoton(btnSantos, base.getLugar(base.getCategoria_Lugar("C2I", "I04").getCodigo_lugar()));
        setLugarBoton(btnInmaculada, base.getLugar(base.getCategoria_Lugar("C2I", "I05").getCodigo_lugar()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsuncion;
    private javax.swing.JButton btnBlas;
    private javax.swing.JButton btnInmaculada;
    private javax.swing.JButton btnSagrario;
    private javax.swing.JButton btnSantos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables

}
