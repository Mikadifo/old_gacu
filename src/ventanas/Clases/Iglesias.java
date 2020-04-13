package ventanas.Clases;

import Interfaces.Categoria_Lugares;
import baseDatos.BaseGACU;
import clases.Categoria_Lugar;
import clases.*;
import java.util.Vector;
import javax.swing.JButton;
import ventanas.Informacion.*;
import ventanas.registro.MenuPrincipal;

public class Iglesias extends javax.swing.JFrame implements Categoria_Lugares {

    private String[] codigosImagenes = new String[5];
    private String[] nombresImagenes = new String[5];
    private Usuario usuarioActivo;
    private BaseGACU base = new BaseGACU();
    private Categoria_Lugar categoriaLugar;
    private Info_Lugar ventanaInfo;
    private Vector<Categoria_Lugar> categoriasLugares = new Vector<>();
    private Lugares lugar;
    private Vector<Lugares> lugares = new Vector<>();

    public Iglesias() {
        initComponents();
        usuarioActivo = null;
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        crearGuardarLugares();
        crearGuardarCategoriasLugares();
        setLugarBotones();
    }

    public Iglesias(Usuario usuarioActivo) {
        initComponents();
        this.usuarioActivo = usuarioActivo;
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        crearGuardarLugares();
        crearGuardarCategoriasLugares();
        setLugarBotones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInmaculada = new javax.swing.JButton();
        btnAsuncion = new javax.swing.JButton();
        btnBlas = new javax.swing.JButton();
        btnSantos = new javax.swing.JButton();
        btnSagrario = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        btnBlas.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnBlas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlasActionPerformed(evt);
            }
        });
        getContentPane().add(btnBlas);
        btnBlas.setBounds(60, 260, 590, 40);

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/fondoIglesias.jpg"))); // NOI18N
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
        codigosImagenes[0] = "imgIS01";codigosImagenes[1] = "imgIS02";
        codigosImagenes[2] = "imgIS03";codigosImagenes[3] = "imgIS04";
        nombresImagenes[0] = "sagrario1.jpg";nombresImagenes[1] = "sagrario2.jpg";
        nombresImagenes[2] = "sagrario3.jpg";nombresImagenes[3] = "sagrario4.jpg";
        accionLugares("I02");
    }//GEN-LAST:event_btnSagrarioActionPerformed

    private void btnInmaculadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInmaculadaActionPerformed
        codigosImagenes[0] = "imgII01";codigosImagenes[1] = "imgII02";
        codigosImagenes[2] = "imgII03";codigosImagenes[3] = "imgII04";
        nombresImagenes[0] = "inmaculada1.jpg";nombresImagenes[1] = "inmaculada2.png";
        nombresImagenes[2] = "inmaculada3.jpg";nombresImagenes[3] = "inmaculada4.jpg";
        accionLugares("I05");
    }//GEN-LAST:event_btnInmaculadaActionPerformed

    private void btnAsuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsuncionActionPerformed
        codigosImagenes[0] = "imgIA01";codigosImagenes[1] = "imgIA02";
        codigosImagenes[2] = "imgIA03";codigosImagenes[3] = "imgIA04";
        nombresImagenes[0] = "asuncion1.jpg";nombresImagenes[1] = "asuncion2.jpg";
        nombresImagenes[2] = "asuncion3.jpg";nombresImagenes[3] = "asuncion4.jpg";
        accionLugares("I01");
    }//GEN-LAST:event_btnAsuncionActionPerformed

    private void btnBlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlasActionPerformed
        codigosImagenes[0] = "imgIB01";codigosImagenes[1] = "imgIB02";
        codigosImagenes[2] = "imgIB03";codigosImagenes[3] = "imgIB04";
        nombresImagenes[0] = "blas1.jpg";nombresImagenes[1] = "blas2.jpg";
        nombresImagenes[2] = "blas3.jpg";nombresImagenes[3] = "blas4.jpg";
        accionLugares("I03");
    }//GEN-LAST:event_btnBlasActionPerformed

    private void btnSantosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSantosActionPerformed
        codigosImagenes[0] = "imgIT01";codigosImagenes[1] = "imgIT02";
        codigosImagenes[2] = "imgIT03";codigosImagenes[3] = "imgIT04";
        nombresImagenes[0] = "santos1.jpg";nombresImagenes[1] = "santos2.jpg";
        nombresImagenes[2] = "santos3.jpg";nombresImagenes[3] = "santos4.jpg";
        accionLugares("I04");
    }//GEN-LAST:event_btnSantosActionPerformed

    private void accionLugares(String codigoLugar) {
        codigosImagenes[4] = "imgI05"; //temporal
        nombresImagenes[4] = "fondoiglesia.jpg"; //temporal
        if (usuarioActivo != null) {
            Visualiza visualiza = new Visualiza(usuarioActivo.getCedulaUsuario(), base.getCategoria_Lugar("C2I", codigoLugar).getCodigo_lugar());
            guadarVisualizaBase(visualiza);
        }
        mostarVentanaInfo(codigoLugar);
    }

    private void guadarVisualizaBase(Visualiza visualiza) {
        if (base.crearVisualiza(visualiza)) {
            System.err.println("Visualiza " + visualiza + " creado");
        } else {
            System.err.println("Visualiza ya creado");
        }
    }

    private void mostarVentanaInfo(String codigoLugar) {
        ventanaInfo = new Info_Lugar(usuarioActivo, "C2I", codigoLugar, codigosImagenes, nombresImagenes);
        ventanaInfo.setVisible(true);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsuncion;
    private javax.swing.JButton btnBlas;
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
            System.err.println("Se ha creado categoria lugar " + categoriaLugar.getCodigo_categoria() + " " + categoriaLugar.getCodigo_lugar() + "correctamente");
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
        String info = "Al pie de la Plaza de las Flores, un lugar turístico bastante visitado, ubicado en el centro histórico de la ciudad, construida en honor a la Virgen en la advocación de la Asunción, su fundación estuvo a cargo de las religiosas del convento de San José y está a cargo de Carmelitas Descalzas de Nuestra Señora de la Asunción.\n"
                + "El retablo que posee en su interior tiene un origen de corte neoclásico Y el pulpito está cubierto con pan de oro, la parte del coro está todo cubierto de malla, debido a que las religiosas debían estar cubiertas para cantar durante los servicios religiosos especiales.\n"
                + "Tiene una fachada donde se puede ver como resalta una portada tallada de mármol de estilo barroco. La iglesia comprende un estilo renacentista, las columnas que enmarcan la puerta mantiene un estilo salomónico distinguiendo las imágenes de San Pedro y San Pablo.\n"
                + "Dirección: Calle Mariscal Sucre y Padre Aguirre.";
        setLugar("I01", "Asuncion", info);
        info = "La Iglesia más antigua es la Catedral o Catedral Vieja como hoy es conocida, se construyó apenas 10 años después de la fundación española de la ciudad. Para levantar el edificio el cabildo reunió fondos y dirigió los trabajos. Piedras labradas traídas de las ruinas de la incásica Tomebamba, sirvieron para los cimientos y las bases de los muros. La actual iglesia nació con la fundación oficial española el 12 de abril de 1557. Junto con el cabildo, la gobernación, la cárcel, carnicería, la casa de fundación, el hospital y los solares repartidos a los primeros vecinos, la iglesia y el cementerio, constituyeron la traza primitiva de concepción renacentista europea.\n"
                + "La construcción de la catedral fue ordenada el 7 de julio de 1557 y edificada en 1567, después de la fundación española de la ciudad. Entre 1557 y 1924 la edificación tuvo varias ampliaciones. Se levantaron cuatro capillas hasta inicios de 1600. Hay vestigios del uso de piedras incas traídas del sector de Pumapungo.\n"
                + "Dirección: Está situada en la calle Luís Cordero entre las calles Sucre y Bolívar, en el Parque Calderón."; //Terminar
        setLugar("I02", "El Sagrario", info);
        info = "La Iglesia de San Blas representaba el límite oriental de la ciudad por aproximadamente 400 años en la zona que, durante la época colonial, se llamaba \"Barrios de Abajo\". La construcción de este templo fue dedicada a San Blas y se remonta al último tercio del siglo XVI, en mayo de 1557, a pocos días de fundada la ciudad de Cuenca. Esta construcción se estableció por parte de los estudiosos sacerdotes Carlos Terán Zenteno y José María Vargas, quienes ocuparon piedras de los destruidos edificios de Tomebamba para su edificación.\n"
                + "En 1935 se construye un nuevo templo restaurado tanto en su interior como en su exterior, conservando su estructura original como base. Esta restauración fue posible gracias a una inversión conjunta de la Curia Arquidiocesana y la Municipalidad.\n"
                + "Dirección: Calles Bolívar y Manuel Vega.";
        setLugar("I03", "San Blas", info);
        info = "Según lo relatan los historiadores esta fue la primera ermita de Cuenca (Ecuador) y llevaba el nombre de Usno o Iglesia de San Marcos, en donde se llevó a cabo por primera vez una misa realizada por Fray Alonso de Mercadillo. Lleva el nombre de Todos Santos en honor a todos los santos que se veneraron en este templo. El templo en la actualidad, a pesar de los años, continua con sus características principales de su origen. En el interior del templo se puede apreciar una bella pintura moral en el área del altar mayor. El cielo raso está elaborado de latón y fue traído por Matovelle desde Francia. En el altar destaca imágenes del corazón de Jesús y corazón de María y José. Tres puntos a destacar de esta iglesia es la existencia de 2 estatuas de ángeles gigantes de los cuales Julio Matovelle era devoto, un lienzo que muestra a la ciudad de Cuenca y un ángel donado por Gil Ramírez Dávalos, entre otras imágenes y figuras de devoción.\n"
                + "Dirección: Calle Larga s/n E 001, 010101";
        setLugar("I04", "Todos Santos", info);
        info = "La Catedral Nueva es el símbolo religioso más representativo de la ciudad. Su ubicación responde a la condición de centralidad y del poder religioso, frente a la plaza central, ocupando la mitad de la manzana situada al lado occidental. Su volumen, textura y color, se divisan desde todos los ángulos de Cuenca, inclusive de los alrededores. Su fachada es de piedra y mármol local, mientras que el piso está cubierto con mármoles rosas, importados de Carrara (Italia).\n"
                + "Se puede visitar las Cúpulas y Cripta de la Catedral todos los días. El recorrido dura alrededor de una hora y permite visitar las torres de la Catedral, desde donde se puede observar la ciudad. En cambio, la cripta, que mide 96 metros de largo y 12 de ancho, aloja cientos de nichos y las tumbas de cuatro Obispos. Tiene una hermosa cúpula azul con otras menores que caracterizan el paisaje de la ciudad.\n"
                + "Esta monumental obra comenzó a construirse en la segunda mitad de la década de 1880, por iniciativa del Obispo Miguel León y con el diseño del hermano redentorista Juan Stiehle. El 28 de mayo de 1967 se realizó la ceremonia de consagración de la mayor iglesia de Cuenca que fue culminada después de mucho esfuerzo.\n"
                + "Dirección: La Catedral Nueva de Cuenca se encuentra en las calles Benigno Malo y Mariscal Sucre. Parroquia Gil Ramírez Dávalos."; //Terminar
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
        setLugarBoton(btnSagrario, base.getLugar(base.getCategoria_Lugar("C2I", "I02").getCodigo_lugar()));
        setLugarBoton(btnBlas, base.getLugar(base.getCategoria_Lugar("C2I", "I03").getCodigo_lugar()));
        setLugarBoton(btnSantos, base.getLugar(base.getCategoria_Lugar("C2I", "I04").getCodigo_lugar()));
        setLugarBoton(btnInmaculada, base.getLugar(base.getCategoria_Lugar("C2I", "I05").getCodigo_lugar()));
    }
}
