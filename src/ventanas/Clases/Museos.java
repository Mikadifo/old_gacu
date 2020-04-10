
package ventanas.Clases;

import Interfaces.Categoria_Lugares;
import baseDatos.BaseGACU;
import clases.Categoria_Lugar;
import clases.Lugares;
import clases.Usuario;
import java.util.Vector;
import javax.swing.JButton;
import ventanas.Informacion.*;
import ventanas.registro.MenuPrincipal;

public class Museos extends javax.swing.JFrame implements Categoria_Lugares {

    private Usuario usuarioActivo;
    private BaseGACU base = new BaseGACU();
    private Categoria_Lugar categoriaLugar;
    private Vector<Categoria_Lugar> categoriasLugares = new Vector<>();
    private Lugares lugar;
    private Vector<Lugares> lugares = new Vector<>();
   
    public Museos() {
        initComponents();
        usuarioActivo = null;
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        crearGuardarCategoriasLugares();
        crearGuardarLugares();
        setLugarBotones();
    }

    public Museos(Usuario usuarioActivo) {
        initComponents();
        this.usuarioActivo = usuarioActivo;
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        crearGuardarCategoriasLugares();
        crearGuardarLugares();
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
        setPreferredSize(new java.awt.Dimension(700, 500));
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Museo/MuseoFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new java.awt.Color(30, 168, 150));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new java.awt.Color(76, 84, 84));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal menu= new MenuPrincipal(usuarioActivo);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnPumapungoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPumapungoActionPerformed
        Informacion_MSPumapungo puma= new Informacion_MSPumapungo();
        puma.setVisible(true);
        puma.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnPumapungoActionPerformed

    private void btnAborigenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAborigenesActionPerformed
        Informacion_MAborigenes aborigen= new Informacion_MAborigenes();
        aborigen.setVisible(true);
        aborigen.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnAborigenesActionPerformed

    private void btnModernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModernoActionPerformed
        Informacion_MSModerno moderno= new Informacion_MSModerno();
        moderno.setVisible(true);
        moderno.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnModernoActionPerformed

    private void btnEsqueletologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueletologiaActionPerformed
        Informacion_MSEsqueletologia esqueleto= new Informacion_MSEsqueletologia();
        esqueleto.setVisible(true);
        esqueleto.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnEsqueletologiaActionPerformed

    private void btnSantosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSantosActionPerformed
        Informacion_MSRuinas ruinas= new Informacion_MSRuinas();
        ruinas.setVisible(true);
        ruinas.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnSantosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAborigenes;
    private javax.swing.JButton btnEsqueletologia;
    private javax.swing.JButton btnModerno;
    private javax.swing.JButton btnPumapungo;
    private javax.swing.JButton btnSantos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void crearGuardarCategoriasLugares() {
        crearCategoriasLugares();
        guardarCategoriasLugaresBase(categoriasLugares);
    }

    @Override
    public void crearCategoriasLugares() {
        setCategoriaLugar("C4M", "M01");
        setCategoriaLugar("C4M", "M02");
        setCategoriaLugar("C4M", "M03");
        setCategoriaLugar("C4M", "M04");
        setCategoriaLugar("C4M", "M05");
    }

    @Override
    public void setCategoriaLugar(String codigoCategoria, String codigoLugar) {
        categoriaLugar = new Categoria_Lugar(codigoCategoria, codigoLugar);
        categoriasLugares.addElement(categoriaLugar);
    }

    @Override
    public void guardarCategoriasLugaresBase(Vector<Categoria_Lugar> categoriasLugares) {
        categoriasLugares.forEach((elemento) -> guardarCategoriaLugarBase(elemento));
    }

    @Override
    public void guardarCategoriaLugarBase(Categoria_Lugar categoriaLugar) {
        if (base.crearCategoria_Lugar(categoriaLugar)) {
            System.err.println("Se ha creado categoria lugar " + categoriaLugar.getCodigo_categoria() + "" + categoriaLugar.getCodigo_lugar() + "correctamente");
        } else {
            System.err.println("Categoria Lugar ya existe");
        }
    }

    @Override
    public void setLugarBoton(JButton boton, Lugares lugarMostrar) {
        boton.setText(lugarMostrar.getNombre_lugar());
    }

    @Override
    public void crearGuardarLugares() {
        crearLugares();
        guardarLugaresBase(lugares);
    }

    @Override
    public void crearLugares() {
        String info = "Este parque es ..."; //Terminar
        setLugar("M01", "Pumapungo", info);
        info = "Este parque no necesita..."; //Terminar
        setLugar("M02", "Aborigenes", info);
        info = "Este parque no necesita..."; //Terminar
        setLugar("M03", "Museo Moderno", info);
        info = "Este parque no necesita..."; //Terminar
        setLugar("M04", "Museo de Esqueletologia", info);
        info = "Este parque no necesita..."; //Terminar
        setLugar("M05", "Todos Santos", info);
    }

    @Override
    public void setLugar(String codigo, String nombre, String info) {
        lugar = new Lugares(codigo, nombre, info);
        lugares.addElement(lugar);
    }

    @Override
    public void guardarLugaresBase(Vector<Lugares> lugaresGuardar) {
        lugaresGuardar.forEach((elemento) -> guardarLugarBase(elemento));
    }

    @Override
    public void guardarLugarBase(Lugares lugarGuardar) {
        if (base.crearLugar(lugarGuardar)) {
            System.err.println("Lugar " + lugarGuardar.getNombre_lugar() + " creado");
        } else {
            System.err.println("Lugar " + lugarGuardar.getNombre_lugar() + " ya existe");
        }
    }

    @Override
    public void setLugarBotones() {
        setLugarBoton(btnPumapungo, base.getLugar(base.getCategoria_Lugar("C4M", "M01").getCodigo_lugar()));
        setLugarBoton(btnAborigenes, base.getLugar(base.getCategoria_Lugar("C4M", "M02").getCodigo_lugar()));
        setLugarBoton(btnModerno, base.getLugar(base.getCategoria_Lugar("C4M", "M03").getCodigo_lugar()));
        setLugarBoton(btnEsqueletologia, base.getLugar(base.getCategoria_Lugar("C4M", "M04").getCodigo_lugar()));
        setLugarBoton(btnSantos, base.getLugar(base.getCategoria_Lugar("C4M", "M05").getCodigo_lugar()));
    }
}
