package ventanas.Trivias;

import clases.Usuario;
import ventanas.registro.MenuPrincipal;

public class Trivia1 extends javax.swing.JFrame {

    private Usuario usuarioActivo;
    
    public Trivia1(Usuario usuarioActivo) {
        initComponents();
        this.usuarioActivo = usuarioActivo;
        this.setSize(700, 500);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlVoF = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblEnunciado = new javax.swing.JLabel();
        pnlRespuestas = new javax.swing.JPanel();
        btnFalso = new javax.swing.JButton();
        btnVerdadero = new javax.swing.JButton();
        btnSalirMenu = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        lblTriviaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 810, 600));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        pnlVoF.setPreferredSize(new java.awt.Dimension(700, 500));
        pnlVoF.setLayout(null);

        lblTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlVoF.add(lblTitulo);
        lblTitulo.setBounds(220, 20, 250, 20);

        lblEnunciado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblEnunciado.setPreferredSize(new java.awt.Dimension(560, 140));
        pnlVoF.add(lblEnunciado);
        lblEnunciado.setBounds(70, 70, 560, 140);

        pnlRespuestas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlRespuestas.setLayout(null);

        btnFalso.setBackground(new java.awt.Color(76, 84, 84));
        btnFalso.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnFalso.setForeground(new java.awt.Color(255, 255, 255));
        btnFalso.setText("FALSO");
        btnFalso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 113, 91), 5));
        btnFalso.setOpaque(true);
        btnFalso.setPreferredSize(new java.awt.Dimension(280, 170));
        btnFalso.setSize(new java.awt.Dimension(280, 120));
        btnFalso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFalsoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFalsoMouseExited(evt);
            }
        });
        pnlRespuestas.add(btnFalso);
        btnFalso.setBounds(280, 0, 280, 160);

        btnVerdadero.setBackground(new java.awt.Color(76, 84, 84));
        btnVerdadero.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnVerdadero.setForeground(new java.awt.Color(255, 255, 255));
        btnVerdadero.setText("VERDADERO");
        btnVerdadero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 168, 150), 5));
        btnVerdadero.setOpaque(true);
        btnVerdadero.setPreferredSize(new java.awt.Dimension(280, 177));
        btnVerdadero.setSize(new java.awt.Dimension(280, 120));
        btnVerdadero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerdaderoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerdaderoMouseExited(evt);
            }
        });
        pnlRespuestas.add(btnVerdadero);
        btnVerdadero.setBounds(0, 0, 280, 160);

        pnlVoF.add(pnlRespuestas);
        pnlRespuestas.setBounds(70, 230, 560, 160);

        btnSalirMenu.setBackground(new java.awt.Color(76, 84, 84));
        btnSalirMenu.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnSalirMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirMenu.setText("Salir al Menu");
        btnSalirMenu.setBorder(null);
        btnSalirMenu.setBorderPainted(false);
        btnSalirMenu.setContentAreaFilled(false);
        btnSalirMenu.setFocusPainted(false);
        btnSalirMenu.setMaximumSize(new java.awt.Dimension(100, 40));
        btnSalirMenu.setMinimumSize(new java.awt.Dimension(100, 40));
        btnSalirMenu.setOpaque(true);
        btnSalirMenu.setPreferredSize(new java.awt.Dimension(100, 40));
        btnSalirMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMenuMouseExited(evt);
            }
        });
        btnSalirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirMenuActionPerformed(evt);
            }
        });
        pnlVoF.add(btnSalirMenu);
        btnSalirMenu.setBounds(70, 430, 130, 40);

        btnSiguiente.setBackground(new java.awt.Color(76, 84, 84));
        btnSiguiente.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setBorder(null);
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.setFocusPainted(false);
        btnSiguiente.setMaximumSize(new java.awt.Dimension(100, 40));
        btnSiguiente.setMinimumSize(new java.awt.Dimension(100, 40));
        btnSiguiente.setOpaque(true);
        btnSiguiente.setPreferredSize(new java.awt.Dimension(100, 40));
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseExited(evt);
            }
        });
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        pnlVoF.add(btnSiguiente);
        btnSiguiente.setBounds(530, 430, 100, 40);

        lblTriviaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Trivia/quiz2.PNG"))); // NOI18N
        lblTriviaFondo.setMaximumSize(new java.awt.Dimension(700, 500));
        lblTriviaFondo.setMinimumSize(new java.awt.Dimension(700, 500));
        lblTriviaFondo.setPreferredSize(new java.awt.Dimension(700, 500));
        pnlVoF.add(lblTriviaFondo);
        lblTriviaFondo.setBounds(0, 0, 700, 500);

        getContentPane().add(pnlVoF);
        pnlVoF.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMenuMouseEntered
        btnSalirMenu.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnSalirMenuMouseEntered

    private void btnSalirMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMenuMouseExited
        btnSalirMenu.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnSalirMenuMouseExited

    private void btnSalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMenuActionPerformed
        MenuPrincipal menu = new MenuPrincipal(usuarioActivo);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirMenuActionPerformed

    private void btnSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseEntered
        btnSiguiente.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnSiguienteMouseEntered

    private void btnSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseExited
        btnSiguiente.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnSiguienteMouseExited

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        Trivia2 trivia2 = new Trivia2(usuarioActivo);
        trivia2.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnVerdaderoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerdaderoMouseEntered
        btnVerdadero.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnVerdaderoMouseEntered

    private void btnVerdaderoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerdaderoMouseExited
        btnVerdadero.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnVerdaderoMouseExited

    private void btnFalsoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFalsoMouseEntered
        btnFalso.setBackground(new java.awt.Color(255,113,91));
    }//GEN-LAST:event_btnFalsoMouseEntered

    private void btnFalsoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFalsoMouseExited
        btnFalso.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnFalsoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFalso;
    private javax.swing.JButton btnSalirMenu;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVerdadero;
    private javax.swing.JLabel lblEnunciado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTriviaFondo;
    private javax.swing.JPanel pnlRespuestas;
    private javax.swing.JPanel pnlVoF;
    // End of variables declaration//GEN-END:variables
}
