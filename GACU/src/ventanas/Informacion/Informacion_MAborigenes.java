package ventanas.Informacion;

import ventanas.Clases.Museos;

public class Informacion_MAborigenes extends javax.swing.JFrame {

    public Informacion_MAborigenes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Museo/MuseoAborigenes.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 30, 560, 210);

        jTextPane1.setBackground(new java.awt.Color(204, 255, 255));
        jTextPane1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jTextPane1.setText("La Catedral Nueva es el símbolo religioso más representativo de la ciudad. Su ubicación responde a la condición de centralidad y del poder religioso, frente a la plaza central, ocupando la mitad de la manzana situada al lado occidental. Su volumen, textura y color, se divisan desde todos los ángulos de Cuenca, inclusive de los alrededores. Su fachada es de piedra y mármol local, mientras que el piso está cubierto con mármoles rosas, importados de Carrara (Italia). Se puede visitar las Cúpulas y Cripta de la Catedral todos los días. El recorrido dura alrededor de una hora y permite visitar las torres de la Catedral, desde donde se puede observar la ciudad. En cambio, la cripta, que mide 96 metros de largo y 12 de ancho, aloja cientos de nichos y las tumbas de cuatro Obispos. Tiene una hermosa cúpula azul con otras menores que caracterizan el paisaje de la ciudad. Esta monumental obra comenzó a construirse en la segunda mitad de la década de 1880, por iniciativa del Obispo Miguel León y con el diseño del hermano redentorista Juan Stiehle. El 28 de mayo de 1967 se realizó la ceremonia de consagración de la mayor iglesia de Cuenca que fue culminada después de mucho esfuerzo. Dirección: La Catedral Nueva de Cuenca se encuentra en las calles Benigno Malo y Mariscal Sucre. Parroquia Gil Ramírez Dávalos. ");
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 260, 680, 148);

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
        jPanel1.add(btnVolver);
        btnVolver.setBounds(340, 430, 100, 40);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Museo/MuseoFondo.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -1, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Museos mus= new Museos();
        mus.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
