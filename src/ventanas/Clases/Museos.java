package ventanas.Clases;

import Interfaces.Categoria_Lugares;
import baseDatos.BaseGACU;
import baseDatos.DefaultBase;
import clases.Categoria_Lugar;
import clases.*;
import java.util.Vector;
import javax.swing.JButton;
import ventanas.Informacion.*;
import ventanas.registro.MenuPrincipal;

public class Museos extends javax.swing.JFrame implements Categoria_Lugares {

    private String[] codigosImagenes = new String[5];
    private String[] nombresImagenes = new String[5];
    private Usuario usuarioActivo;
    private DefaultBase baseTrivias = new DefaultBase();
    private BaseGACU base = new BaseGACU();
    private Categoria_Lugar categoriaLugar;
    private Info_Lugar ventanaInfo;
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
        MenuPrincipal menu = new MenuPrincipal(usuarioActivo);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnPumapungoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPumapungoActionPerformed
        codigosImagenes[0] = "imgMP01";codigosImagenes[1] = "imgMP02";
        codigosImagenes[2] = "imgMP03";codigosImagenes[3] = "imgMP04";
        nombresImagenes[0] = "pumapungo1.jpg";nombresImagenes[1] = "pumapungo2.jpg";
        nombresImagenes[2] = "pumapungo3.jpg";nombresImagenes[3] = "pumapungo4.jpg";
        accionLugares("M01");
    }//GEN-LAST:event_btnPumapungoActionPerformed

    private void btnAborigenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAborigenesActionPerformed
        codigosImagenes[0] = "imgMA01";codigosImagenes[1] = "imgMA02";
        codigosImagenes[2] = "imgMA03";codigosImagenes[3] = "imgMA04";
        nombresImagenes[0] = "aborigen1.jpg";nombresImagenes[1] = "aborigen2.jpg";
        nombresImagenes[2] = "aborigen3.jpg";nombresImagenes[3] = "aborigen4.jpg";
        accionLugares("M02");
    }//GEN-LAST:event_btnAborigenesActionPerformed

    private void btnModernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModernoActionPerformed
        codigosImagenes[0] = "imgMM01";codigosImagenes[1] = "imgMM02";
        codigosImagenes[2] = "imgMM03";codigosImagenes[3] = "imgMM04";
        nombresImagenes[0] = "moderno1.jpg";nombresImagenes[1] = "moderno2.jpg";
        nombresImagenes[2] = "moderno3.jpg";nombresImagenes[3] = "moderno4.jpg";
        accionLugares("M03");
    }//GEN-LAST:event_btnModernoActionPerformed

    private void btnEsqueletologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueletologiaActionPerformed
        codigosImagenes[0] = "imgME01";codigosImagenes[1] = "imgME02";
        codigosImagenes[2] = "imgME03";codigosImagenes[3] = "imgME04";
        nombresImagenes[0] = "esqueleto1.jpg";nombresImagenes[1] = "esqueleto2.jpg";
        nombresImagenes[2] = "esqueleto3.jpg";nombresImagenes[3] = "esqueleto4.jpg";
        accionLugares("M04");
    }//GEN-LAST:event_btnEsqueletologiaActionPerformed

    private void btnSantosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSantosActionPerformed
        codigosImagenes[0] = "imgMS01";codigosImagenes[1] = "imgMS02";
        codigosImagenes[2] = "imgMS03";codigosImagenes[3] = "imgMS04";
        nombresImagenes[0] = "santos1.jpg";nombresImagenes[1] = "santos2.jpg";
        nombresImagenes[2] = "santos3.jpg";nombresImagenes[3] = "santos4.jpg";
        accionLugares("M05");
    }//GEN-LAST:event_btnSantosActionPerformed

    private void accionLugares(String codigoLugar) {
        codigosImagenes[4] = "imgM05"; //temporal
        nombresImagenes[4] = "fondoMuseo.png"; //temporal
        if (usuarioActivo != null) {
            Visualiza visualiza = new Visualiza(usuarioActivo.getCedulaUsuario(), base.getCategoria_Lugar("C4M", codigoLugar).getCodigo_lugar());
            guadarVisualizaBase(visualiza);
            if (baseTrivias.crearGuardarTriviaPRMuseos(codigoLugar)) {
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
        ventanaInfo = new Info_Lugar(usuarioActivo, "C4M", codigoLugar, codigosImagenes, nombresImagenes);
        ventanaInfo.setVisible(true);
        dispose();
    }

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
        String info = "El museo ofrece varios componentes interesantes como: la sala etnográfica nacional, la sala arqueológica y museo de sitio donde se puede aprender sobre la historia de Pumapungo desde la época cañarí, inka y la actualidad, la exposición sobre el tejido patrimonial de Gualaceo “IKAT”, la exposición “Oro y Plata Milenarios”, hermosa exposición que ilustra la maestranza en el trabajo de los metales y su simbología para las culturas prehispánicas e Inca en el Ecuador, el Parque Ancestral Pumapungo conformado por el parque arqueológico de varias hectáreas, vestigios del majestuoso centro administrativo, militar y religioso que fue Pumapungo, el parque etnobotánico y chacra andina, que contienen más de 200 especies de plantas nativas, diariamente visitado por más de 30 especies de aves, y el centro de rescate y avifauna donde se pueden apreciar más de 50 aves que han sido rescatadas del tráfico ilícito de especies, loros, tucanes, águilas, pavas de monte, llamas, entre otros.\n"
                + "El Museo y Parque Ancestral Pumapungo – Ministerio de Cultura del Ecuador son parte del patrimonio que hace de Cuenca una ciudad llena de interesantes propuestas artístico culturales, testimonio de la constante evolución de la ciudad y su gente a través del tiempo. Es deber de todos valorarlo y respetarlo, por esto al visitar estos espacios es importante tratarlo con cuidado en modo de poder preservarlo y que todos podamos disfrutar de lo que tiene para ofrecer.\n"
                + "Dirección: Calle Larga y Huayna Cápac Esquina."; //Terminar
        setLugar("M01", "Pumapungo", info);
        info = "Este es un museo que promueve y rescata los valores patrimoniales y culturales, cuenta con más de 8000 piezas arqueológicas correspondientes a todos los periodos de la historia aborigen de Ecuador, es considerado el Museo más completo de la ciudad de Cuenca y de la región.\n"
                + "El Museo de las Culturas Aborígenes, especializado en Arqueología ecuatoriana, fundado por la familia Cordero López, forma parte del Centro Cultural Cordero. Desde su apertura en 1992 tiene como objetivo trabajar en la enseñanza, la valoración, el mantenimiento y la protección del Patrimonio Cultural de los ecuatorianos. Promociona el desarrollo cultural de la región sur del país, investigaciones y actividades culturales. Cuenta con especialistas en museos y patrimonio que desarrollan estrategias didácticas de mediación para distintos públicos, que permiten al visitante explorar costumbres y creencias de nuestros antepasados, participando de manera activa. El Museo funciona en una casa del siglo XVIII ubicada en el Centro Patrimonial de Cuenca. Ofrece diversos actos culturales, cursos, conferencias, servicios de biblioteca y del fondo documental que preserva datos, imágenes y documentos únicos de la historia de Cuenca y el Ecuador, así como libros de arte, historia, geografía y literatura. La exposición permanente del Museo, está concebida como un encuentro con quince momentos fundamentales de la arqueología ecuatoriana. Su didáctica tiene un ordenamiento geográfico y temático de objetos de los pueblos originarios de todo el Ecuador. En su recorrido se puede apreciar la increíble destreza y conocimiento con la que estos pueblos trabajaron distintos materiales como piedra, cerámica, concha, hueso, metales, textiles. Se observan objetos utilitarios, ceremoniales, ornamentales y escultura\n"
                + "Dirección: Barrio Todos Santos. Calle Larga 5-24, entre Hermano Miguel y Mariano Cueva."; //Terminar
        setLugar("M02", "Aborigenes", info);
        info = "La casa en donde funciona el Museo Municipal de Arte Moderno, pertenece a la arquitectura regional antigua de tipo institucional. La portada de ingreso es de estilo neogótico, por la composición y tratamiento de sus elementos: pilastras, frisos, óculo, tímpano levantado y pináculo de remate.\n"
                + "Volumétricamente la casa tiene una organización que se despliega en torno a varios patios porticados, destacándose el volumen de la antigua capilla emplazada en el centro, y que sirve a su vez, de articulador de los otros volúmenes del complejo.\n"
                + "El Museo Municipal de Arte Moderno abrió sus puertas el 1 de agosto de 1981. El Museo se fue transformando poco a poco en el centro de las manifestaciones artísticas más notables del espíritu moderno de Cuenca. Gracias a su constante actividad, el Museo acogió muestras de arte provenientes de diversos lugares de la patria y fuera del país, exhibió para la admiración de los cuencanos las creaciones desconocidas de nuestros grandes artistas, como Honorato Vázquez, a quien se le dedicó una exposición antológica, y ha marcado su historia con exhibiciones como las de los grabados de Goya, y las producciones de Jesús Soto, Pérez Celis, Luis Felipe Noé, Juan Villafuerte; varias muestras de Guayasamín, Tábara, Oswaldo Muñoz Mariño, Oswaldo Moreno, y una larga lista de nombres de enorme trascendencia o de notable juventud e impulso creativo.\n"
                + "Dirección: Ubicado en las calles Mariscal Sucre y Estévez de Toral de Cuenca."; //Terminar
        setLugar("M03", "Museo Moderno", info);
        info = "Constituye desde el 10 de abril del 2001 un nuevo y original espacio que contribuye para ampliar los conocimientos acerca del mundo animal, a través de la investigación científica se recrea la necesidad de conservar la naturaleza, conocer la diversidad de fauna en el Ecuador y profundizar en la educación ambiental.\n"
                + "Juan Pablo Martínez Moscoso, director del museo, indica que el objetivo primordial es el de difundir conocimientos científicos referentes a la fauna nativa del Ecuador, los mismos que contribuyen a aumentar el sentimiento de valoración de nuestras especies. El museo es una herramienta para tratar de acercar a la ciencia y a la sociedad y de esta manera crear un aporte a la cultura, afirma.\n"
                + "El montaje en sí del museo, que es único en su clase a nivel del país y de Latinoamérica, representa una iniciativa novedosa, ya que, por medio de esqueletos de diversos animales, se pretende ayudar al entendimiento de la naturaleza, además de que se indican aspectos que normalmente no se los muestra en un museo de historia natural, ya que en los esqueletos están presentes varios aspectos de adaptaciones y evolución que son fáciles de observar.\n"
                + "Dirección: Centro Histórico de Cuenca, en la calle Simón Bolívar 6-57 y presidente Borrero."; //Terminar
        setLugar("M04", "Museo de Esqueletologia", info);
        info = "Las Ruinas de Todos los Santos, constituye un sitio arqueológico. Aquí podemos encontrar vestigios que fueron descubiertos durante los trabajos de excavación, para construir la casa del Señor Fernando Estrella. Entre los objetos hallados se pudo identificar que los restos pertenecían a las culturas: Cañaris, Incásicos e Hispánica.\n"
                + "Fue descubierta en noviembre de 1972, al realizar excavaciones para la construcción de una casa del propietario Fernando Estrella. En 1973 se dio a conocer el informe de la Comisión sobre las Ruinas de Todos Santos el que se refería a la parte baja del Sitio. En 1975 se descubrió nuevos elementos arqueológicos. Durante las excavaciones arqueológicas que se iniciaron a partir de 1972, se rescataron alrededor de veinte mil fragmentos y piezas enteras de cerámica, piedra y letal, que se exhiben en el Museo de Sitios Manuel Agustín Landívar.\n"
                + "Dirección: El espacio arqueológico de Todos Santos, está localizado en el margen izquierdo del Río Tomebamba, a 100 metros del puente de Todos Santos."; //Terminar
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
