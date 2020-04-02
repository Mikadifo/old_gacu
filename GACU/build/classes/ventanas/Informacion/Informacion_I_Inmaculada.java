/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.Informacion;

/**
 *
 * @author Steve
 */
public class Informacion_I_Inmaculada extends javax.swing.JFrame {

    /**
     * Creates new form Informacion_Inmaculada
     */
    public Informacion_I_Inmaculada() {
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
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iglesias/CatedrlaVieja.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 10, 540, 250);

        jTextPane1.setBackground(new java.awt.Color(204, 204, 255));
        jTextPane1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jTextPane1.setText("La Catedral Nueva es el símbolo religioso más representativo de la ciudad. Su ubicación responde a la condición de centralidad y del poder religioso, frente a la plaza central, ocupando la mitad de la manzana situada al lado occidental. Su volumen, textura y color, se divisan desde todos los ángulos de Cuenca, inclusive de los alrededores. Su fachada es de piedra y mármol local, mientras que el piso está cubierto con mármoles rosas, importados de Carrara (Italia). Se puede visitar las Cúpulas y Cripta de la Catedral todos los días. El recorrido dura alrededor de una hora y permite visitar las torres de la Catedral, desde donde se puede observar la ciudad. En cambio, la cripta, que mide 96 metros de largo y 12 de ancho, aloja cientos de nichos y las tumbas de cuatro Obispos. Tiene una hermosa cúpula azul con otras menores que caracterizan el paisaje de la ciudad. Esta monumental obra comenzó a construirse en la segunda mitad de la década de 1880, por iniciativa del Obispo Miguel León y con el diseño del hermano redentorista Juan Stiehle. El 28 de mayo de 1967 se realizó la ceremonia de consagración de la mayor iglesia de Cuenca que fue culminada después de mucho esfuerzo. Dirección: La Catedral Nueva de Cuenca se encuentra en las calles Benigno Malo y Mariscal Sucre. Parroquia Gil Ramírez Dávalos. ");
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 270, 680, 150);

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
        jPanel1.add(btnVolver);
        btnVolver.setBounds(370, 440, 100, 40);

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(520, 20, 230, 130);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iglesias/iglesiaFondo.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 800, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-1, 0, 800, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnVolverMouseExited

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
