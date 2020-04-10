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

public class Iglesias extends javax.swing.JFrame implements Categoria_Lugares{

    private Usuario usuarioActivo;
    private BaseGACU base = new BaseGACU();
    private Categoria_Lugar categoriaLugar;
    private Info_Iglesias ventanaInfo;
    private Vector<Categoria_Lugar> categoriasLugares = new Vector<>();
    private Lugares lugar;
    private Vector<Lugares> lugares = new Vector<>();
    
    public Iglesias() {
        initComponents();
        usuarioActivo = null;
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        crearGuardarCategoriasLugares();
        crearGuardarLugares();
        setLugarBotones();
    }

    public Iglesias(Usuario usuarioActivo) {
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

        btnInmaculada = new javax.swing.JButton();
        btnAsuncion = new javax.swing.JButton();
        btnFrancisco = new javax.swing.JButton();
        btnSantos = new javax.swing.JButton();
        btnSagrario = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        btnInmaculada.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnInmaculada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInmaculadaActionPerformed(evt);
            }
        });
        getContentPane().add(btnInmaculada);
        btnInmaculada.setBounds(60, 100, 590, 40);

        btnAsuncion.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnAsuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsuncionActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsuncion);
        btnAsuncion.setBounds(60, 180, 590, 40);

        btnFrancisco.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnFrancisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFranciscoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFrancisco);
        btnFrancisco.setBounds(60, 260, 590, 40);

        btnSantos.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnSantos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSantosActionPerformed(evt);
            }
        });
        getContentPane().add(btnSantos);
        btnSantos.setBounds(60, 350, 590, 40);

        btnSagrario.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnSagrario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSagrarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnSagrario);
        btnSagrario.setBounds(60, 20, 590, 40);

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
        btnVolver.setBounds(300, 420, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iglesias/iglesiaFondo.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(800, 500));
        jLabel2.setMinimumSize(new java.awt.Dimension(800, 500));
        jLabel2.setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnSagrarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSagrarioActionPerformed
        mostarVentanaInfo();
    }//GEN-LAST:event_btnSagrarioActionPerformed

    private void btnInmaculadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInmaculadaActionPerformed
        mostarVentanaInfo();
    }//GEN-LAST:event_btnInmaculadaActionPerformed

    private void btnAsuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsuncionActionPerformed
        mostarVentanaInfo();
    }//GEN-LAST:event_btnAsuncionActionPerformed

    private void btnFranciscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFranciscoActionPerformed
        mostarVentanaInfo();
    }//GEN-LAST:event_btnFranciscoActionPerformed

    private void btnSantosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSantosActionPerformed
        mostarVentanaInfo();
    }//GEN-LAST:event_btnSantosActionPerformed

    private void mostarVentanaInfo() {
        ventanaInfo = new Info_Iglesias();//Usuario usuarioActivo
        ventanaInfo.setVisible(true);
        dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsuncion;
    private javax.swing.JButton btnFrancisco;
    private javax.swing.JButton btnInmaculada;
    private javax.swing.JButton btnSagrario;
    private javax.swing.JButton btnSantos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void crearGuardarCategoriasLugares() {
        crearCategoriasLugares();
        guardarCategoriasLugaresBase(categoriasLugares);
    }

    @Override
    public void crearCategoriasLugares() {
        setCategoriaLugar("C2I", "I01");
        setCategoriaLugar("C2I", "I02");
        setCategoriaLugar("C2I", "I03");
        setCategoriaLugar("C2I", "I04");
        setCategoriaLugar("C2I", "I05");
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
            System.err.println("Se ha creado categoria lugar " + categoriaLugar.getCodigo_categoria() + categoriaLugar.getCodigo_lugar() + "correctamente");
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
        String info = "Esta iglesia es ..."; //Terminar
        setLugar("I01", "Asuncion", info);
        info = "Esta iglesia no necesita..."; //Terminar
        setLugar("I02", "El Sagrario", info);
        info = "Esta iglesia no necesita..."; //Terminar
        setLugar("I03", "San Francisco", info);
        info = "Esta iglesia no necesita..."; //Terminar
        setLugar("I04", "Todos Santos", info);
        info = "Esta iglesia no necesita..."; //Terminar
        setLugar("I05", "La Inmaculada", info);
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
        setLugarBoton(btnAsuncion, base.getLugar(base.getCategoria_Lugar("C2I", "I01").getCodigo_lugar()));
        setLugarBoton(btnSagrario, base.getLugar(base.getCategoria_Lugar("C2I", "I01").getCodigo_lugar()));
        setLugarBoton(btnFrancisco, base.getLugar(base.getCategoria_Lugar("C2I", "I01").getCodigo_lugar()));
        setLugarBoton(btnSantos, base.getLugar(base.getCategoria_Lugar("C2I", "I01").getCodigo_lugar()));
        setLugarBoton(btnInmaculada, base.getLugar(base.getCategoria_Lugar("C2I", "I01").getCodigo_lugar()));
    }
}
