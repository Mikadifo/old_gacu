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
public class Informacion_PCalderon extends javax.swing.JFrame {

    /**
     * Creates new form Informacion_Parques
     */
    public Informacion_PCalderon() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Parques/ParqueCalderon.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(120, 20, 560, 220);

        jTextPane1.setBackground(new java.awt.Color(153, 153, 0));
        jTextPane1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jTextPane1.setText("Luego de fundar la ciudad el español Gil Ramírez Dávalos, tomo un terreno al cual bautizo con el nombre de Plaza República. Alrededor de esta se expandió la ciudad. El parque poseía una pila en el centro, con vasijas de mármol, las cuales adornaron el lugar durante algunos años en siglo. En torno a esta plaza se encuentran ubicadas: la Gobernación, la Municipalidad, las dos Catedrales, el antiguo seminario y el Palacio de Justicia. Luís Cordero, trajo de Chile unas pequeñas plantas de pino de la especie de las araucarias, las sembró alrededor de la pila y allí se aclimataron, hasta convertirse en árboles enormes que son los que observamos en la actualidad. El 20 de marzo de 1887, fue ejecutado el revolucionario liberal Luís Vargas Torres, en la municipalidad. Con el triunfo del liberalismo, en el gobierno de Eloy Alfaro se nombró a esta plaza Luís Vargas Torres, en honor a éste. Pero la ciudadanía no aceptó tal denominación y lo seguían llamando Plaza República o de Armas. En el año de 1920 la Municipalidad encomendó rediseñar el parque a Octavio Cordero Palacios, él fue quien los bautizó en ese mismo año con el nombre de Parque Abdón Calderón, y más tarde se sustituyó la pila por el monumento de Abdón Calderón. Abdón Calderón Garaicoa: Nació en Cuenca, el 31 de julio de 1804 y muere en mayo de 1822, sus padres fueron el Coronel Francisco Calderón y Manuela Garaicoa. Siendo muy joven ingresó al ejército patriota. Sucre lo aceptó en sus filas y lo nombró Abanderado del Batallón Yaguachi. Su valentía y patriotismo lo demostró durante la histórica \"Batalla de Pichincha\", en la cual murió, siendo sus últimas palabras \"Ya puedo morir contento porque mi patria es libre\". Dirección: Se encuentra ubicado en las calles Simón Bolívar, Benigno Malo, Antonio José de Sucre y Luís Cordero. ");
        jScrollPane1.setViewportView(jTextPane1);

        jPanel2.add(jScrollPane1);
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
        jPanel2.add(btnVolver);
        btnVolver.setBounds(340, 430, 100, 40);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Parques/ParqueFondo.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 500);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 500);

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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
