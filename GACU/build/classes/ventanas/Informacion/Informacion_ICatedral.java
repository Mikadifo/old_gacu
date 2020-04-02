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
public class Informacion_ICatedral extends javax.swing.JFrame {

    /**
     * Creates new form hola
     */
    public Informacion_ICatedral() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jTextPane1.setBackground(new java.awt.Color(204, 204, 255));
        jTextPane1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jTextPane1.setText("La Iglesia más antigua es la Catedral o Catedral Vieja como hoy es conocida, se construyó apenas 10 años después de la fundación española de la ciudad. Para levantar el edificio el cabildo reunió fondos y dirigió los trabajos. Piedras labradas traídas de las ruinas de la incásica Tomebamba, sirvieron para los cimientos y las bases de los muros. La actual iglesia nació con la fundación oficial española el 12 de abril de 1557. Junto con el cabildo, la gobernación, la cárcel, carnicería, la casa de fundación, el hospital y los solares repartidos a los primeros vecinos, la iglesia y el cementerio, constituyeron la traza primitiva de concepción renacentista europea. La construcción de la catedral fue ordenada el 7 de julio de 1557 y edificada en 1567, después de la fundación española de la ciudad. Entre 1557 y 1924 la edificación tuvo varias ampliaciones. Se levantaron cuatro capillas hasta inicios de 1600. Hay vestigios del uso de piedras incas traídas del sector de Pumapungo. Dirección: Está situada en la calle Luís Cordero entre las calles Sucre y Bolívar, en el Parque Calderón. ");
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 260, 680, 148);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iglesias/Catedral.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 10, 530, 240);

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
        btnVolver.setBounds(340, 430, 100, 40);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iglesias/iglesiaFondo.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 500);

        pack();
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
