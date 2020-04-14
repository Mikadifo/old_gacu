package ventanas.Clases;

import baseDatos.BaseGACU;
import clases.*;
import ventanas.Informacion.*;
import ventanas.registro.MenuPrincipal;

public class Museos extends javax.swing.JFrame {

    private String[] codigosImagenes = new String[5];
    private Usuario usuarioActivo;
    private BaseGACU base = new BaseGACU();
    private Info_Lugar ventanaInfo;

    public Museos() {
        initComponents();
        usuarioActivo = null;
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        setLugarBotones();
    }

    public Museos(Usuario usuarioActivo) {
        initComponents();
        this.usuarioActivo = usuarioActivo;
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        setLugarBotones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSantos = new javax.swing.JButton();
        btnAborigenes = new javax.swing.JButton();
        btnEsqueletologia = new javax.swing.JButton();
        btnModerno = new javax.swing.JButton();
        btnPumapungo = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnSantos.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnSantos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSantosActionPerformed(evt);
            }
        });
        getContentPane().add(btnSantos);
        btnSantos.setBounds(60, 350, 590, 40);

        btnAborigenes.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnAborigenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAborigenesActionPerformed(evt);
            }
        });
        getContentPane().add(btnAborigenes);
        btnAborigenes.setBounds(60, 110, 590, 40);

        btnEsqueletologia.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnEsqueletologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqueletologiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEsqueletologia);
        btnEsqueletologia.setBounds(60, 260, 590, 40);

        btnModerno.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnModerno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModernoActionPerformed(evt);
            }
        });
        getContentPane().add(btnModerno);
        btnModerno.setBounds(60, 180, 590, 40);

        btnPumapungo.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnPumapungo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPumapungoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPumapungo);
        btnPumapungo.setBounds(60, 40, 590, 40);

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
        btnVolver.setBounds(310, 420, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/fondoMuseos.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnPumapungoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPumapungoActionPerformed
        codigosImagenes[0] = "imgMP01";codigosImagenes[1] = "imgMP02";
        codigosImagenes[2] = "imgMP03";codigosImagenes[3] = "imgMP04";
        accionLugares("M01");
    }//GEN-LAST:event_btnPumapungoActionPerformed

    private void btnAborigenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAborigenesActionPerformed
        codigosImagenes[0] = "imgMA01";codigosImagenes[1] = "imgMA02";
        codigosImagenes[2] = "imgMA03";codigosImagenes[3] = "imgMA04";
        accionLugares("M02");
    }//GEN-LAST:event_btnAborigenesActionPerformed

    private void btnModernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModernoActionPerformed
        codigosImagenes[0] = "imgMM01";codigosImagenes[1] = "imgMM02";
        codigosImagenes[2] = "imgMM03";codigosImagenes[3] = "imgMM04";
        accionLugares("M03");
    }//GEN-LAST:event_btnModernoActionPerformed

    private void btnEsqueletologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueletologiaActionPerformed
        codigosImagenes[0] = "imgME01";codigosImagenes[1] = "imgME02";
        codigosImagenes[2] = "imgME03";codigosImagenes[3] = "imgME04";
        accionLugares("M04");
    }//GEN-LAST:event_btnEsqueletologiaActionPerformed

    private void btnSantosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSantosActionPerformed
        codigosImagenes[0] = "imgMS01";codigosImagenes[1] = "imgMS02";
        codigosImagenes[2] = "imgMS03";codigosImagenes[3] = "imgMS04";
        accionLugares("M05");
    }//GEN-LAST:event_btnSantosActionPerformed

    private void accionLugares(String codigoLugar) {
        codigosImagenes[4] = "imgM05";
        if (usuarioActivo != null) {
            Visualiza visualiza = new Visualiza(usuarioActivo.getCedulaUsuario(), base.getCategoria_Lugar("C4M", codigoLugar).getCodigo_lugar());
            guadarVisualizaBase(visualiza);
        }
        mostarVentanaInfo(codigoLugar);
    }

    private void guadarVisualizaBase(Visualiza visualiza) {
        base.crearVisualiza(visualiza);
    }
    
    private void mostarVentanaInfo(String codigoLugar) {
        ventanaInfo = new Info_Lugar(usuarioActivo, "C4M", codigoLugar, codigosImagenes);
        ventanaInfo.setVisible(true);
        dispose();
    }
    
    public void setLugarBoton(javax.swing.JButton boton, Lugares lugarMostrar) {
        boton.setText(lugarMostrar.getNombre_lugar());
    }

    public void setLugarBotones() {
        setLugarBoton(btnPumapungo, base.getLugar(base.getCategoria_Lugar("C4M", "M01").getCodigo_lugar()));
        setLugarBoton(btnAborigenes, base.getLugar(base.getCategoria_Lugar("C4M", "M02").getCodigo_lugar()));
        setLugarBoton(btnModerno, base.getLugar(base.getCategoria_Lugar("C4M", "M03").getCodigo_lugar()));
        setLugarBoton(btnEsqueletologia, base.getLugar(base.getCategoria_Lugar("C4M", "M04").getCodigo_lugar()));
        setLugarBoton(btnSantos, base.getLugar(base.getCategoria_Lugar("C4M", "M05").getCodigo_lugar()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAborigenes;
    private javax.swing.JButton btnEsqueletologia;
    private javax.swing.JButton btnModerno;
    private javax.swing.JButton btnPumapungo;
    private javax.swing.JButton btnSantos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
