package ventanas.Informacion;

import ventanas.Clases.Institutos_ES;

public class Informacion_UUps extends javax.swing.JFrame {

    public Informacion_UUps() {
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Institutos/Politecnica.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 30, 544, 240);

        jTextPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTextPane1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jTextPane1.setText("Universidad Politécnica Salesiana del Ecuador es una obra de la Congregación Salesiana. La UPS fue fundada el 5 de agosto de 1994 en la ciudad de Cuenca y tiene sedes en Quito y Guayaquil. Se caracteriza por la educación técnica y cristiana que imparte a sus estudiantes. En 2016 registra 25.545 estudiantes en todo el Ecuador. En 1887 el gobierno de Ecuador firmó un convenio con Don Bosco para que los salesianos tomaran bajo su responsabilidad el Protectorado Católico de Artes y Oficios en Quito. Ecuador llegó a ser uno de los primeros países no-europeos en recibir las obras del santo educador de Turín (el primero fue Argentina en 1877 y pronto el carisma salesiano se estableció en el país andino de la Suramérica septentrional). Es una institución de estudios superiores, inspiración cristiana con carácter católico, de índole salesiana, que promueve el desarrollo de la persona y el patrimonio cultural de la sociedad mediante la docencia, la investigación, la formación continua y los diversos servicios ofrecidos a la comunidad local, nacional e internacional. Dirección: Calle Turuhuayco 3-69 y Calle Vieja; Calle Vieja 12-30 y Elia Liut. ");
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 280, 680, 148);

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
        btnVolver.setBounds(350, 440, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Institutos/InstitutoFondo.jpg"))); // NOI18N
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Institutos_ES institutosEs= new Institutos_ES();
        institutosEs.setVisible(true);
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
