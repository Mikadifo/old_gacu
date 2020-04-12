package ventanas.Clases;

import clases.*;
import baseDatos.BaseGACU;
import java.util.Vector;
import ventanas.Informacion.*;
import ventanas.registro.MenuPrincipal;
import Interfaces.Categoria_Lugares;
import baseDatos.DefaultBase;

public class Parques extends javax.swing.JFrame implements Categoria_Lugares {

    private String[] codigosImagenes = new String[5];
    private String[] nombresImagenes = new String[5];
    private DefaultBase baseTrivias = new DefaultBase();
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
        String info = "Luego de fundar la ciudad el español Gil Ramírez Dávalos, tomo un terreno al cual bautizo con el nombre de Plaza República. Alrededor de esta se expandió la ciudad. El parque poseía una pila en el centro, con vasijas de mármol, las cuales adornaron el lugar durante algunos años en siglo. En torno a esta plaza se encuentran ubicadas: la Gobernación, la Municipalidad, las dos Catedrales, el antiguo seminario y el Palacio de Justicia.\n"
                + "Luís Cordero, trajo de Chile unas pequeñas plantas de pino de la especie de las araucarias, las sembró alrededor de la pila y allí se aclimataron, hasta convertirse en árboles enormes que son los que observamos en la actualidad. El 20 de marzo de 1887, fue ejecutado el revolucionario liberal Luís Vargas Torres, en la municipalidad. Con el triunfo del liberalismo, en el gobierno de Eloy Alfaro se nombró a esta plaza Luís Vargas Torres, en honor a éste. Pero la ciudadanía no aceptó tal denominación y lo seguían llamando Plaza República o de Armas. En el año de 1920 la Municipalidad encomendó rediseñar el parque a Octavio Cordero Palacios, él fue quien los bautizó en ese mismo año con el nombre de Parque Abdón Calderón, y más tarde se sustituyó la pila por el monumento de Abdón Calderón. Abdón Calderón Garaicoa: Nació en Cuenca, el 31 de julio de 1804 y muere en mayo de 1822, sus padres fueron el coronel Francisco Calderón y Manuela Garaicoa. Siendo muy joven ingresó al ejército patriota. Sucre lo aceptó en sus filas y lo nombró Abanderado del Batallón Yaguachi. Su valentía y patriotismo lo demostró durante la histórica \"Batalla de Pichincha\", en la cual murió, siendo sus últimas palabras \"Ya puedo morir contento porque mi patria es libre\".\n"
                + "Dirección: Se encuentra ubicado en las calles Simón Bolívar, Benigno Malo, Antonio José de Sucre y Luís Cordero."; //Terminar
        setLugar("P01", "Parque Calderon", info);
        info = "Es un parque destinado a la recreación y al deporte, cuenta con espacios verdes y juegos infantiles, así como de un sendero para atletas.\n"
                + "Dentro del parque se encuentra las instalaciones de la Escuela de Marcha, deporte de atletismo que es muy común entre los jóvenes cuencanos siguiendo así los pasos del campeón olímpico y múltiple campeón mundial de Marcha Jefferson Pérez, al cual se lo ha honrado con una estatua dentro del propio parque.\n"
                + "También se puede acceder al planetario municipal en donde se puede disfrutar de documentales a cerca de la tierra y el espacio de gran interés especialmente para los niños.\n"
                + "Dirección: ubicado a las riveras del Tomebamba en la Av. Federico Malo y 12 de abril."; //Terminar
        setLugar("P02", "Parque de la Madre", info);
        info = "El Parque de El Paraíso ubicado en el área de Gapal, junto a las sedes de las Facultades de Ciencias Médicas y Odontología de la Universidad de Cuenca, es sin duda el parque atractivo más grande de Cuenca.\n"
                + "Dispone en efecto de canchas para prácticas deportivas de niños y jóvenes, de juegos infantiles, una laguna artificial provista de pequeños botes plásticos utilizados para remar y navegar, hay un estanque o un pequeño lago con patos senderos y sitios para acampar, también encontramos  senderos para bicicletas, cuenta con abundante vegetación, árboles grandes de eucaliptos y de otras especies forestales, además sus llamativos senderos por donde la gente puede pasear y recorrer los bordes del parque.\n"
                + "El Paraíso, el parque más grande de Cuenca, es un atractivo turístico de la ciudad y el Azuay., inaugurado el 19 de marzo del 2003; los visitantes pueden acceder de manera gratuita, de lunes a domingo con restricción de horario nocturno, se permite la estancia dentro de este espacio solo hasta las 21H00.\n"
                + "Tiene una extensión de 17 hectáreas, brinda al público en general hermosos muelles de ingreso y un islote en el centro de la laguna. Conocer este hermoso lugar es indispensable, disfrutar de coloridos paisajes y exuberante vegetación nos traslada a un espacio de tranquilidad. Caminar detenidamente y observar múltiples perspectivas llenan de emoción y satisfacción, logrando equilibrio y armonía dentro de nosotros."; //Terminar
        setLugar("P03", "Parque Paraiso", info);
        info = "Es un lugar de concentración de desfiles, es ocupado por turistas nacionales y extranjeros disfrutando una recreación pasiva. El parque de San Blas, es un parque tradicional de la ciudad de Cuenca, adornado por hermosos jardines y una llamativa pileta de agua en cuyo centro se levanta el busto de Manuel J. Calle; se encuentra al frente de la Iglesia de San Blas, se localiza en la parroquia del mismo nombre. Este es un espacio público de recreación pasiva, que concentra a mucha gente, que acude a Misa; principalmente los días sábados y domingos.\n"
                + "La presencia de las Heladerías convoca a un gran número de ciudadanos y turistas nacionales y extranjeros. Es un lugar de concentración para desfiles cívicos estudiantiles, folklóricos y políticos, congrega a jóvenes estudiantes de los equipamientos educativos cercanos al lugar, por lo tanto, es un sitio ideal para realizar actividades culturales.\n"
                + "Dirección: Situada entre las calles Simón Bolívar, Tomás Ordoñez, San Blas y Manuel Vega"; //Terminar
        setLugar("P04", "Parque San Blas", info);
        info = "Un espacio excelentemente renovado, es el parque de San Sebastián, se halla ubicado en la parroquia del mismo nombre, posee una encantadora pileta, aquí se levanta el busto al poeta cuencano Miguel Moreno, contiguamente esta la Iglesia de San Sebastián.\n"
                + "Al frente se encuentra el Museo de Arte Moderno en el que se realiza la Bienal de pintura. Sus árboles y coloridos jardines hacen de este sitio un lugar placentero para el descanso y la recreación pasiva, es muy frecuentado por los turistas nacionales y extranjeros. Según Cabrera, morador del barrio, se realiza actividades artísticas culturales en el Bienal de pintura.\n"
                + "Dirección: Entre las calles Mariscal Sucre y coronel Talbot."; //Terminar
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
        codigosImagenes[0] = "imgPC01";codigosImagenes[1] = "imgPC02";
        codigosImagenes[2] = "imgPC03";codigosImagenes[3] = "imgPC04";
        nombresImagenes[0] = "calderon1.jpg";nombresImagenes[1] = "calderon2.jpg";
        nombresImagenes[2] = "calderon3.jpg";nombresImagenes[3] = "calderon4.jpg";
        accionLugares("P01");
    }//GEN-LAST:event_btnCalderonActionPerformed

    private void btnParaisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaisoActionPerformed
        codigosImagenes[0] = "imgPP01";codigosImagenes[1] = "imgPP02";
        codigosImagenes[2] = "imgPP03";codigosImagenes[3] = "imgPP04";
        nombresImagenes[0] = "paraiso1.jpg";nombresImagenes[1] = "paraiso2.jpg";
        nombresImagenes[2] = "paraiso3.jpg";nombresImagenes[3] = "paraiso4.jpg";
        accionLugares("P02");
    }//GEN-LAST:event_btnParaisoActionPerformed

    private void btnMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMadreActionPerformed
        codigosImagenes[0] = "imgPM01";codigosImagenes[1] = "imgPM02";
        codigosImagenes[2] = "imgPM03";codigosImagenes[3] = "imgPM04";
        nombresImagenes[0] = "madre1.jpg";nombresImagenes[1] = "madre2.jpg";
        nombresImagenes[2] = "madre3.jpg";nombresImagenes[3] = "madre4.jpg";
        accionLugares("P03");
    }//GEN-LAST:event_btnMadreActionPerformed

    private void btnBlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlasActionPerformed
        codigosImagenes[0] = "imgPB01";codigosImagenes[1] = "imgPB02";
        codigosImagenes[2] = "imgPB03";codigosImagenes[3] = "imgPB04";
        nombresImagenes[0] = "blas1.jpg";nombresImagenes[1] = "blas2.jpg";
        nombresImagenes[2] = "blas3.jpg";nombresImagenes[3] = "blas4.jpg";
        accionLugares("P04");
    }//GEN-LAST:event_btnBlasActionPerformed

    private void btnSebastianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSebastianActionPerformed
        codigosImagenes[0] = "imgPS01";codigosImagenes[1] = "imgPS02";
        codigosImagenes[2] = "imgPS03";codigosImagenes[3] = "imgPS04";
        nombresImagenes[0] = "sebastian1.jpg";nombresImagenes[1] = "sebastian2.jpg";
        nombresImagenes[2] = "sebastian3.jpg";nombresImagenes[3] = "sebastian4.jpg";
        accionLugares("P05");
    }//GEN-LAST:event_btnSebastianActionPerformed

    private void accionLugares(String codigoLugar) {
        codigosImagenes[4] = "imgP05"; //temporal
        nombresImagenes[4] = "fondoParques.png"; //temporal
        if (usuarioActivo != null) {
            Visualiza visualiza = new Visualiza(usuarioActivo.getCedulaUsuario(), base.getCategoria_Lugar("C1P", codigoLugar).getCodigo_lugar());
            guadarVisualizaBase(visualiza);
            if (baseTrivias.crearGuardarTriviaPRParques(codigoLugar)) {
                System.err.println("TriviaPR de lugar " + codigoLugar + " creado");
            } else {
                System.err.println("TriviaPR de lugar " + codigoLugar + " ya existente");
            }
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
        ventanaInfo = new Info_Lugar(usuarioActivo, "C1P", codigoLugar, codigosImagenes, nombresImagenes);
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
