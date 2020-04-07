package ventanas.Trivias;

import ventanas.registro.MenuPrincipal;

public class Trivia3 extends javax.swing.JFrame {

    public Trivia3() {
        initComponents();
        initComponents();
        this.setSize(700, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCompletar = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblEnunciado = new javax.swing.JLabel();
        pnlRespuestas = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnSalirMenu = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        lblTriviaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        pnlCompletar.setMinimumSize(new java.awt.Dimension(700, 500));
        pnlCompletar.setRequestFocusEnabled(false);
        pnlCompletar.setLayout(null);

        lblTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlCompletar.add(lblTitulo);
        lblTitulo.setBounds(220, 20, 250, 20);

        lblEnunciado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblEnunciado.setPreferredSize(new java.awt.Dimension(560, 140));
        lblEnunciado.setSize(new java.awt.Dimension(560, 140));
        pnlCompletar.add(lblEnunciado);
        lblEnunciado.setBounds(70, 70, 560, 140);

        pnlRespuestas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlRespuestas.setSize(new java.awt.Dimension(560, 160));
        pnlRespuestas.setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        pnlRespuestas.add(jComboBox1);
        jComboBox1.setBounds(100, 40, 80, 27);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlRespuestas.add(jLabel1);
        jLabel1.setBounds(370, 40, 80, 20);

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlRespuestas.add(jLabel2);
        jLabel2.setBounds(10, 40, 80, 20);

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlRespuestas.add(jLabel3);
        jLabel3.setBounds(10, 80, 80, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlRespuestas.add(jComboBox2);
        jComboBox2.setBounds(100, 80, 80, 27);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        pnlRespuestas.add(jComboBox3);
        jComboBox3.setBounds(280, 40, 80, 27);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        pnlRespuestas.add(jComboBox4);
        jComboBox4.setBounds(460, 40, 80, 27);

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlRespuestas.add(jLabel4);
        jLabel4.setBounds(190, 40, 80, 20);

        pnlCompletar.add(pnlRespuestas);
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
        pnlCompletar.add(btnSalirMenu);
        btnSalirMenu.setBounds(70, 430, 130, 40);

        btnTerminar.setBackground(new java.awt.Color(76, 84, 84));
        btnTerminar.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btnTerminar.setForeground(new java.awt.Color(255, 255, 255));
        btnTerminar.setText("Terminar");
        btnTerminar.setBorder(null);
        btnTerminar.setBorderPainted(false);
        btnTerminar.setContentAreaFilled(false);
        btnTerminar.setFocusPainted(false);
        btnTerminar.setMaximumSize(new java.awt.Dimension(100, 40));
        btnTerminar.setMinimumSize(new java.awt.Dimension(100, 40));
        btnTerminar.setOpaque(true);
        btnTerminar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnTerminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTerminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTerminarMouseExited(evt);
            }
        });
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });
        pnlCompletar.add(btnTerminar);
        btnTerminar.setBounds(330, 430, 100, 40);

        lblTriviaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Trivia/quiz2.PNG"))); // NOI18N
        pnlCompletar.add(lblTriviaFondo);
        lblTriviaFondo.setBounds(0, 0, 700, 500);

        getContentPane().add(pnlCompletar);
        pnlCompletar.setBounds(0, 0, 700, 500);

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

    private void btnTerminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarMouseEntered
        btnTerminar.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnTerminarMouseEntered

    private void btnTerminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarMouseExited
        btnTerminar.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnTerminarMouseExited

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        TriviaResultados triviaResul = new TriviaResultados();
        triviaResul.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTerminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalirMenu;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblEnunciado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTriviaFondo;
    private javax.swing.JPanel pnlCompletar;
    private javax.swing.JPanel pnlRespuestas;
    // End of variables declaration//GEN-END:variables
}
