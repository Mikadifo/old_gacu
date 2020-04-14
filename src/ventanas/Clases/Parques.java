package ventanas.Clases;

import clases.*;
import baseDatos.BaseGACU;
import ventanas.Informacion.*;
import ventanas.registro.MenuPrincipal;

public class Parques extends javax.swing.JFrame {

    private String[] codigosImagenes = new String[5];
    private BaseGACU base = new BaseGACU();
    private Usuario usuarioActivo;
    private Info_Lugar ventanaInfo;

    public Parques() {
        initComponents();
        usuarioActivo = null;
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        setLugarBotones();
    }

    public Parques(Usuario usuarioActivo) {
        initComponents();
        this.usuarioActivo = usuarioActivo;
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        setLugarBotones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSebastian = new javax.swing.JButton();
        btnCalderon = new javax.swing.JButton();
        btnParaiso = new javax.swing.JButton();
        btnMadre = new javax.swing.JButton();
        btnBlas = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnSebastian.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnSebastian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSebastianActionPerformed(evt);
            }
        });
        getContentPane().add(btnSebastian);
        btnSebastian.setBounds(60, 360, 590, 40);

        btnCalderon.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnCalderon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalderonActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalderon);
        btnCalderon.setBounds(60, 30, 590, 40);

        btnParaiso.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnParaiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaisoActionPerformed(evt);
            }
        });
        getContentPane().add(btnParaiso);
        btnParaiso.setBounds(60, 110, 590, 40);

        btnMadre.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMadreActionPerformed(evt);
            }
        });
        getContentPane().add(btnMadre);
        btnMadre.setBounds(60, 190, 590, 40);

        btnBlas.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnBlas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlasActionPerformed(evt);
            }
        });
        getContentPane().add(btnBlas);
        btnBlas.setBounds(60, 270, 590, 40);

        btnVolver.setBackground(new java.awt.Color(76, 84, 84));
        btnVolver.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
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
        btnVolver.setBounds(310, 430, 100, 40);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/fondosParques.jpg"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setLugarBotones() { //Si la base existira mas de 5 lugares se usaria metodo getLugares y se asiganiar con una vector
        setLugarBoton(btnCalderon, base.getLugar(base.getCategoria_Lugar("C1P", "P01").getCodigo_lugar()));
        setLugarBoton(btnMadre, base.getLugar(base.getCategoria_Lugar("C1P", "P02").getCodigo_lugar()));
        setLugarBoton(btnParaiso, base.getLugar(base.getCategoria_Lugar("C1P", "P03").getCodigo_lugar()));
        setLugarBoton(btnBlas, base.getLugar(base.getCategoria_Lugar("C1P", "P04").getCodigo_lugar()));
        setLugarBoton(btnSebastian, base.getLugar(base.getCategoria_Lugar("C1P", "P05").getCodigo_lugar()));
    }

    public void setLugarBoton(javax.swing.JButton boton, Lugares lugarMostrar) {
        boton.setText(lugarMostrar.getNombre_lugar());
    }

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal menu = new MenuPrincipal(usuarioActivo);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCalderonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalderonActionPerformed
        codigosImagenes[0] = "imgPC01";codigosImagenes[1] = "imgPC02";
        codigosImagenes[2] = "imgPC03";codigosImagenes[3] = "imgPC04";
        accionLugares("P01");
    }//GEN-LAST:event_btnCalderonActionPerformed

    private void btnParaisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaisoActionPerformed
        codigosImagenes[0] = "imgPP01";codigosImagenes[1] = "imgPP02";
        codigosImagenes[2] = "imgPP03";codigosImagenes[3] = "imgPP04";
        accionLugares("P02");
    }//GEN-LAST:event_btnParaisoActionPerformed

    private void btnMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMadreActionPerformed
        codigosImagenes[0] = "imgPM01";codigosImagenes[1] = "imgPM02";
        codigosImagenes[2] = "imgPM03";codigosImagenes[3] = "imgPM04";
        accionLugares("P03");
    }//GEN-LAST:event_btnMadreActionPerformed

    private void btnBlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlasActionPerformed
        codigosImagenes[0] = "imgPB01";codigosImagenes[1] = "imgPB02";
        codigosImagenes[2] = "imgPB03";codigosImagenes[3] = "imgPB04";
        accionLugares("P04");
    }//GEN-LAST:event_btnBlasActionPerformed

    private void btnSebastianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSebastianActionPerformed
        codigosImagenes[0] = "imgPS01";codigosImagenes[1] = "imgPS02";
        codigosImagenes[2] = "imgPS03";codigosImagenes[3] = "imgPS04";
        accionLugares("P05");
    }//GEN-LAST:event_btnSebastianActionPerformed

    private void accionLugares(String codigoLugar) {
        codigosImagenes[4] = "imgP05";
        if (usuarioActivo != null) {
            Visualiza visualiza = new Visualiza(usuarioActivo.getCedulaUsuario(), base.getCategoria_Lugar("C1P", codigoLugar).getCodigo_lugar());
            guadarVisualizaBase(visualiza);
        }
        mostarVentanaInfo(codigoLugar);
    }

    private void guadarVisualizaBase(Visualiza visualiza) {
        base.crearVisualiza(visualiza);
    }
    
    private void mostarVentanaInfo(String codigoLugar) {
        ventanaInfo = new Info_Lugar(usuarioActivo, "C1P", codigoLugar, codigosImagenes);
        ventanaInfo.setVisible(true);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlas;
    private javax.swing.JButton btnCalderon;
    private javax.swing.JButton btnMadre;
    private javax.swing.JButton btnParaiso;
    private javax.swing.JButton btnSebastian;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
