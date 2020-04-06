package ventanas.Trivias;

import ventanas.registro.MenuPrincipal;

public class Trivia3 extends javax.swing.JFrame {

    public Trivia3() {
        initComponents();
        this.setSize(810, 600);
        setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlImagenCorrecta = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblEnunciado = new javax.swing.JLabel();
        pnlRespuestas = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnSalirMenu = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        lblTriviaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        pnlImagenCorrecta.setMinimumSize(new java.awt.Dimension(700, 500));
        pnlImagenCorrecta.setPreferredSize(new java.awt.Dimension(700, 500));
        pnlImagenCorrecta.setLayout(null);

        lblTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlImagenCorrecta.add(lblTitulo);
        lblTitulo.setBounds(220, 20, 250, 20);

        lblEnunciado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlImagenCorrecta.add(lblEnunciado);
        lblEnunciado.setBounds(70, 70, 570, 140);

        pnlRespuestas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlRespuestas.setLayout(null);
        pnlRespuestas.add(btn1);
        btn1.setBounds(20, 120, 100, 30);
        pnlRespuestas.add(btn2);
        btn2.setBounds(170, 120, 100, 30);
        pnlRespuestas.add(btn3);
        btn3.setBounds(310, 120, 100, 30);
        pnlRespuestas.add(btn4);
        btn4.setBounds(450, 120, 100, 30);

        pnlImagenCorrecta.add(pnlRespuestas);
        pnlRespuestas.setBounds(70, 230, 570, 160);

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
        pnlImagenCorrecta.add(btnSalirMenu);
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
        pnlImagenCorrecta.add(btnSiguiente);
        btnSiguiente.setBounds(540, 430, 100, 40);

        lblTriviaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Trivia/quiz2.PNG"))); // NOI18N
        pnlImagenCorrecta.add(lblTriviaFondo);
        lblTriviaFondo.setBounds(0, 0, 700, 500);

        getContentPane().add(pnlImagenCorrecta);
        pnlImagenCorrecta.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMenuMouseEntered
        btnSalirMenu.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnSalirMenuMouseEntered

    private void btnSalirMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMenuMouseExited
        btnSalirMenu.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnSalirMenuMouseExited

    private void btnSalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMenuActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
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
        Trivia4 trivia4 = new Trivia4();
        trivia4.setVisible(true);
        dispose();
        trivia4.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btnSalirMenu;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel lblEnunciado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTriviaFondo;
    private javax.swing.JPanel pnlImagenCorrecta;
    private javax.swing.JPanel pnlRespuestas;
    // End of variables declaration//GEN-END:variables
}
