package ventanas.Clases;

import Interfaces.Categoria_Lugares;
import baseDatos.BaseGACU;
import clases.Categoria_Lugar;
import clases.*;
import java.util.Vector;
import javax.swing.JButton;
import ventanas.Informacion.*;
import ventanas.registro.MenuPrincipal;

public class Institutos_ES extends javax.swing.JFrame implements Categoria_Lugares {

    private String[] codigosImagenes = new String[5];
    private String[] nombresImagenes = new String[5];
    private Usuario usuarioActivo;
    private BaseGACU base = new BaseGACU();
    private Categoria_Lugar categoriaLugar;
    private Info_Lugar ventanaInfo;
    private Vector<Categoria_Lugar> categoriasLugares = new Vector<>();
    private Lugares lugar;
    private Vector<Lugares> lugares = new Vector<>();

    public Institutos_ES() {
        initComponents();
        usuarioActivo = null;
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        crearGuardarCategoriasLugares();
        crearGuardarLugares();
        setLugarBotones();
    }

    public Institutos_ES(Usuario usuarioActivo) {
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

        btnAzuay = new javax.swing.JButton();
        btnCatolica = new javax.swing.JButton();
        btnUps = new javax.swing.JButton();
        btnIsta = new javax.swing.JButton();
        btnCuenca = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnAzuay.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnAzuay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzuayActionPerformed(evt);
            }
        });
        getContentPane().add(btnAzuay);
        btnAzuay.setBounds(60, 110, 590, 40);

        btnCatolica.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnCatolica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatolicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCatolica);
        btnCatolica.setBounds(60, 190, 590, 40);

        btnUps.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnUps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpsActionPerformed(evt);
            }
        });
        getContentPane().add(btnUps);
        btnUps.setBounds(60, 270, 590, 40);

        btnIsta.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnIsta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIstaActionPerformed(evt);
            }
        });
        getContentPane().add(btnIsta);
        btnIsta.setBounds(60, 350, 590, 40);

        btnCuenca.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        btnCuenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuencaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCuenca);
        btnCuenca.setBounds(60, 30, 590, 40);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/fondoESuperior.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 500);

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

    private void btnCuencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuencaActionPerformed
        codigosImagenes[0] = "imgEC01";codigosImagenes[1] = "imgEC02";
        codigosImagenes[2] = "imgEC03";codigosImagenes[3] = "imgEC04";
        nombresImagenes[0] = "estatal1.jpg";nombresImagenes[1] = "estatal2.jpg";
        nombresImagenes[2] = "estatal3.jpg";nombresImagenes[3] = "estatal4.jpg";
        accionLugares("E01");
    }//GEN-LAST:event_btnCuencaActionPerformed

    private void btnAzuayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzuayActionPerformed
        codigosImagenes[0] = "imgEA01";codigosImagenes[1] = "imgEA02";
        codigosImagenes[2] = "imgEA03";codigosImagenes[3] = "imgEA04";
        nombresImagenes[0] = "uda1.jpg";nombresImagenes[1] = "uda2.jpg";
        nombresImagenes[2] = "uda3.jpg";nombresImagenes[3] = "uda4.jpg";
        accionLugares("E02");
        dispose();    }//GEN-LAST:event_btnAzuayActionPerformed

    private void btnCatolicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatolicaActionPerformed
        codigosImagenes[0] = "imgET01";codigosImagenes[1] = "imgET02";
        codigosImagenes[2] = "imgET03";codigosImagenes[3] = "imgET04";
        nombresImagenes[0] = "catolica1.jpg";nombresImagenes[1] = "catolica2.jpg";
        nombresImagenes[2] = "catolica3.jpg";nombresImagenes[3] = "catolica4.PNG";
        accionLugares("E03");
    }//GEN-LAST:event_btnCatolicaActionPerformed

    private void btnUpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpsActionPerformed
        codigosImagenes[0] = "imgEU01";codigosImagenes[1] = "imgEU02";
        codigosImagenes[2] = "imgEU03";codigosImagenes[3] = "imgEU04";
        nombresImagenes[0] = "ups1.jpg";nombresImagenes[1] = "ups2.jpg";
        nombresImagenes[2] = "ups3.jpg";nombresImagenes[3] = "ups4.jpg";
        accionLugares("E04");
    }//GEN-LAST:event_btnUpsActionPerformed

    private void btnIstaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIstaActionPerformed
        codigosImagenes[0] = "imgEI01";codigosImagenes[1] = "imgEI02";
        codigosImagenes[2] = "imgEI03";codigosImagenes[3] = "imgEI04";
        nombresImagenes[0] = "ista1.jpg";nombresImagenes[1] = "ista2.PNG";
        nombresImagenes[2] = "ista3.PNG";nombresImagenes[3] = "ista4.PNG";
        accionLugares("E05");
    }//GEN-LAST:event_btnIstaActionPerformed

    private void accionLugares(String codigoLugar) {
        codigosImagenes[4] = "imgE05"; //temporal
        nombresImagenes[4] = "fondoES.jpg"; //temporal
        if (usuarioActivo != null) {
            Visualiza visualiza = new Visualiza(usuarioActivo.getCedulaUsuario(), base.getCategoria_Lugar("C3E", codigoLugar).getCodigo_lugar());
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
        ventanaInfo = new Info_Lugar(usuarioActivo, "C3E", codigoLugar, codigosImagenes, nombresImagenes);
        ventanaInfo.setVisible(true);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAzuay;
    private javax.swing.JButton btnCatolica;
    private javax.swing.JButton btnCuenca;
    private javax.swing.JButton btnIsta;
    private javax.swing.JButton btnUps;
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
        setCategoriaLugar("C3E", "E01");
        setCategoriaLugar("C3E", "E02");
        setCategoriaLugar("C3E", "E03");
        setCategoriaLugar("C3E", "E04");
        setCategoriaLugar("C3E", "E05");
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
        base.crearCategoria_Lugar(categoriaLugar);
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
        String info = "Es una universidad pública ecuatoriana. Creada oficialmente por decreto legislativo en el año 1867, fue la primera universidad en la ciudad de Cuenca, así como la primera en la región del Austro del Ecuador. Actualmente es considerada como una de las mejores universidades del país, además de ser muy reconocida a nivel de Latinoamérica.\n"
                + "Creada por decreto legislativo del 15 de octubre de 1867 bajo la presidencia de Jerónimo Carrión y Palacio, la Universidad de Cuenca se denominó inicialmente Corporación Universitaria del Azuay con las facultades de Jurisprudencia, de Medicina y Farmacia, de Filosofía y Literatura y de Teología. Su primer rector fue el abogado y político ecuatoriano Benigno Malo Valdivieso. Hoy en día cuenta con las facultades de Arquitectura y Urbanismo, Artes, Ciencias Agropecuarias, de Hospitalidad, Económicas y Administrativas, Médicas, Químicas, Filosofía, Ingenierías, Jurisprudencia, Odontología y Psicología.\n"
                + "Su misión es formar profesionales y científicos comprometidos con el mejoramiento de la calidad de vida, en el contexto de la interculturalidad y en armonía con la naturaleza. La Universidad fundamenta en la calidad académica, en la creatividad y en la innovación, su capacidad para responder a los retos científicos y humanos de la época y sociedad regional, nacional e internacional equitativa, solidaria y eficiente.\n"
                + "Dirección: Av. 12 de abril";
        setLugar("E01", "Universidad de Cuenca", info);
        info = "También conocida como UDA. Nació en el año 1968 como una institución filial de la Universidad Católica Santiago de Guayaquil en la ciudad de Cuenca bajo el nombre de Instituto de Filosofía de la Universidad Católica Santiago de Guayaquil en Cuenca y con la autorización de la Santa Sede, sin embargo, la inauguración oficial de la institución se llevó a cabo el 2 de mayo de 1969.\n"
                + "El Instituto comenzó sus actividades en el curso lectivo 1968-1969, con los profesores Francisco Olmedo Llorente, Claudio Malo González, Carlos Pérez Agustí, Rafael Galiana, José Castellví Queralt y Nelson Yánez Ortega. \"Parece que el primer curso contó con sesenta y ocho alumnos, treinta de ellos, seminaristas\". El primer director del Instituto fue el sacerdote Agustín López Conesa, por delegación del arzobispo de Cuenca. Al inicio del curso 1969-1970, la dirección del Instituto pasó al sacerdote Alonso Montero, cuyo nombramiento oficial se realizó el 11 de noviembre de 1969.\n"
                + "El 3 de diciembre de 1970, con la creación de la Escuela de Contabilidad Superior pasó a llamarse Universidad Católica Santiago de Guayaquil en Cuenca. El 11 de diciembre de 1970, Claudio Malo se posesionó como Director Académico de la Universidad Católica de Santiago de Guayaquil en Cuenca, nombrado por la Junta General de Profesores el 10 de diciembre de 1970.\n"
                + "Más tarde, las dos unidades académicas de la Universidad Católica de Santiago de Guayaquil en Cuenca (el Instituto Superior de Filosofía y la Escuela de Contabilidad Superior y Administración de Empresas) solicitaron su anexión a la Pontificia Universidad Católica del Ecuador, lo que se concretó el 19 de noviembre de 1976 y con ello las unidades se convirtieron en las Facultades de Filosofía, Letras y Ciencias de la Educación así como la de Contabilidad Superior y Ciencias de la Administración. Tiempo después cambió su nombre al de Universidad del Azuay con el cual se mantiene hasta la actualidad. Poco a poco fue incorporando nuevas carreras y con ello la creación de las demás Facultades que componen la Universidad.\n"
                + "Dirección: Av. 24 de mayo 7-77";
        setLugar("E02", "Universidad del Azuay", info);
        info = "La Universidad Católica de Cuenca fue creada por gestiones personales del sacerdote César Cordero Moscoso, quien había creado en 1955 la escuela arzobispo Serrano, en 1962 el colegio normal católico Miguel Cordero Crespo y después otros centros educativos.\n"
                + "Para la empresa de fundar la Universidad recibió el apoyo del primer arzobispo de Cuenca, Manuel Serrano Abad, y el respaldo de ciudadanos encabezados por Enrique Arizaga Toral, Manuel María Palacios Bravo, el exalcalde de Cuenca Luis Cordero Crespo, designado primer rector poco después, el padre José Fidel Hidalgo, redentorista, y cerca de 3.000 firmantes más. El presidente José María Velasco Ibarra firmó el decreto de creación de la universidad el 7 de septiembre de 1970. Con el apoyo de los obispos José Félix Pintado y Raúl Vela Chiriboga se abrieron las extensiones universitarias de Morona Santiago en 1973 y de Azogues en 1980, y las extensiones de La Troncal y Cañar en 1990.\n"
                + "Dirección: Av. Américas &, Humboldt, Cuenca.";
        setLugar("E03", "Universidad Catolica", info);
        info = "Universidad Politécnica Salesiana del Ecuador es una obra de la Congregación Salesiana. La UPS fue fundada el 5 de agosto de 1994 en la ciudad de Cuenca y tiene sedes en Quito y Guayaquil. Se caracteriza por la educación técnica y cristiana que imparte a sus estudiantes. En 2016 registra 25.545 estudiantes en todo el Ecuador.\n"
                + "En 1887 el gobierno de Ecuador firmó un convenio con Don Bosco para que los salesianos tomaran bajo su responsabilidad el Protectorado Católico de Artes y Oficios en Quito. Ecuador llegó a ser uno de los primeros países no-europeos en recibir las obras del santo educador de Turín (el primero fue Argentina en 1877 y pronto el carisma salesiano se estableció en el país andino de la Suramérica septentrional).\n"
                + "Es una institución de estudios superiores, inspiración cristiana con carácter católico, de índole salesiana, que promueve el desarrollo de la persona y el patrimonio cultural de la sociedad mediante la docencia, la investigación, la formación continua y los diversos servicios ofrecidos a la comunidad local, nacional e internacional.\n"
                + "Dirección: Calle Turuhuayco 3-69 y Calle Vieja; Calle Vieja 12-30 y Elia Liut.";
        setLugar("E04", "Universidad Politectica Salesianas", info);
        info = "El Instituto Superior Tecnológico del Azuay es una institución de Educación Superior a nivel técnico y tecnológico, dedicada a formar profesionales comprometidos éticamente con la sociedad, desde una preparación basada en entornos de aprendizaje académicos y experienciales que contribuyan al desarrollo de la matriz productiva de la región y sustentada en principios de igualdad, inclusión, solidaridad, interculturalidad y comprensión de la diversidad."; //Terminar
        setLugar("E05", "Instituto Superior Tecnologico del Azuay", info);
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
        setLugarBoton(btnCuenca, base.getLugar(base.getCategoria_Lugar("C3E", "E01").getCodigo_lugar()));
        setLugarBoton(btnAzuay, base.getLugar(base.getCategoria_Lugar("C3E", "E02").getCodigo_lugar()));
        setLugarBoton(btnCatolica, base.getLugar(base.getCategoria_Lugar("C3E", "E03").getCodigo_lugar()));
        setLugarBoton(btnUps, base.getLugar(base.getCategoria_Lugar("C3E", "E04").getCodigo_lugar()));
        setLugarBoton(btnIsta, base.getLugar(base.getCategoria_Lugar("C3E", "E05").getCodigo_lugar()));
    }
}
