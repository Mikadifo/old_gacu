package ventanas.Clases;

import clases.*;
import baseDatos.BaseGACU;
import java.util.Vector;
import ventanas.Informacion.*;
import ventanas.registro.MenuPrincipal;
import Interfaces.Categoria_Lugares;

public class Parques extends javax.swing.JFrame implements Categoria_Lugares{

    private BaseGACU base = new BaseGACU();
    private Usuario usuarioActivo;
    private Categoria_Lugar categoriaLugar;
    private Info_Lugar ventanaInfo;
    private Vector<Categoria_Lugar> categoriasLugares = new Vector<>();
    private Lugares lugar;
    private Vector<Lugares> lugares = new Vector<>();
    
    public Parques() {
        initComponents();
        usuarioActivo = null;
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        crearGuardarCategoriasLugares();
        crearGuardarLugares();
        setLugarBotones();
    }
    
    public Parques(Usuario usuarioActivo) {
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

        btnSebastian = new javax.swing.JButton();
        btnCalderon = new javax.swing.JButton();
        btnParaiso = new javax.swing.JButton();
        btnMadre = new javax.swing.JButton();
        btnBlas = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnSebastian.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnSebastian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSebastianActionPerformed(evt);
            }
        });
        getContentPane().add(btnSebastian);
        btnSebastian.setBounds(60, 360, 590, 40);

        btnCalderon.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnCalderon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalderonActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalderon);
        btnCalderon.setBounds(60, 30, 590, 40);

        btnParaiso.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnParaiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaisoActionPerformed(evt);
            }
        });
        getContentPane().add(btnParaiso);
        btnParaiso.setBounds(60, 110, 590, 40);

        btnMadre.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMadreActionPerformed(evt);
            }
        });
        getContentPane().add(btnMadre);
        btnMadre.setBounds(60, 190, 590, 40);

        btnBlas.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnBlas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlasActionPerformed(evt);
            }
        });
        getContentPane().add(btnBlas);
        btnBlas.setBounds(60, 270, 590, 40);

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
        btnVolver.setBounds(310, 430, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Parques/ParqueFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void crearGuardarCategoriasLugares() {
        crearCategoriasLugares();
        guardarCategoriasLugaresBase(categoriasLugares);
    }
    
    @Override
    public void guardarCategoriasLugaresBase(Vector<Categoria_Lugar> categoriasLugares) {
        categoriasLugares.forEach((elemento) -> guardarCategoriaLugarBase(elemento));
    }
    
    @Override
    public void crearCategoriasLugares() {
        setCategoriaLugar("C1P", "P01");
        setCategoriaLugar("C1P", "P02");
        setCategoriaLugar("C1P", "P03");
        setCategoriaLugar("C1P", "P04");
        setCategoriaLugar("C1P", "P05");
    }
    
    @Override
    public void setCategoriaLugar(String codigoCategoria, String codigoLugar) {
        categoriaLugar = new Categoria_Lugar(codigoCategoria, codigoLugar);
        categoriasLugares.addElement(categoriaLugar);
    }
    
    @Override
    public void guardarCategoriaLugarBase(Categoria_Lugar categoriaLugar) {
        if (base.crearCategoria_Lugar(categoriaLugar)) {
            System.err.println("Se ha creado categoria lugar " + categoriaLugar.getCodigo_categoria() + " " + categoriaLugar.getCodigo_lugar() + "correctamente");
        } else {
            System.err.println("Categoria Lugar ya existe");
        }
    }
    
    @Override
    public void setLugarBotones() { //Si la base existira mas de 5 lugares se usaria metodo getLugares y se asiganiar con una vector
        setLugarBoton(btnCalderon, base.getLugar(base.getCategoria_Lugar("C1P", "P01").getCodigo_lugar()));
        setLugarBoton(btnMadre, base.getLugar(base.getCategoria_Lugar("C1P", "P02").getCodigo_lugar()));
        setLugarBoton(btnParaiso, base.getLugar(base.getCategoria_Lugar("C1P", "P03").getCodigo_lugar()));
        setLugarBoton(btnBlas, base.getLugar(base.getCategoria_Lugar("C1P", "P04").getCodigo_lugar()));
        setLugarBoton(btnSebastian, base.getLugar(base.getCategoria_Lugar("C1P", "P05").getCodigo_lugar()));
    }
    
    @Override
    public void setLugarBoton(javax.swing.JButton boton, Lugares lugarMostrar) {
        boton.setText(lugarMostrar.getNombre_lugar());
    }
    
    @Override
    public void crearGuardarLugares() { //temporal
        crearLugares();
        guardarLugaresBase(lugares);
    }
    
    @Override
    public void crearLugares() {
        String info = "Este parque es ..."; //Terminar
        setLugar("P01", "Parque Calderon", info);
        info = "Este parque no necesita..."; //Terminar
        setLugar("P02", "Parque de la Madre", info);
        info = "Este parque no necesita..."; //Terminar
        setLugar("P03", "Parque Paraiso", info);
        info = "Este parque no necesita..."; //Terminar
        setLugar("P04", "Parque San Blas", info);
        info = "Este parque no necesita..."; //Terminar
        setLugar("P05", "Parque San Sebastian", info);
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

    private void btnCalderonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalderonActionPerformed
        mostarVentanaInfo();
    }//GEN-LAST:event_btnCalderonActionPerformed

    private void btnParaisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaisoActionPerformed
        mostarVentanaInfo();
    }//GEN-LAST:event_btnParaisoActionPerformed

    private void btnMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMadreActionPerformed
        mostarVentanaInfo();
    }//GEN-LAST:event_btnMadreActionPerformed

    private void btnBlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlasActionPerformed
        mostarVentanaInfo();
    }//GEN-LAST:event_btnBlasActionPerformed

    private void btnSebastianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSebastianActionPerformed
        mostarVentanaInfo();
    }//GEN-LAST:event_btnSebastianActionPerformed

    private void mostarVentanaInfo() {
        ventanaInfo = new Info_Lugar(usuarioActivo, "Parques");
        ventanaInfo.setVisible(true);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlas;
    private javax.swing.JButton btnCalderon;
    private javax.swing.JButton btnMadre;
    private javax.swing.JButton btnParaiso;
    private javax.swing.JButton btnSebastian;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
