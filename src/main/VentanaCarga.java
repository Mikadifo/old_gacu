package main;

import baseDatos.BaseGACU;
import ventanas.registro.MenuRegistro;
import clases.*;
import java.io.*;
import java.util.Vector;

public class VentanaCarga extends javax.swing.JFrame implements Runnable {

    Thread tiempo = null;
    static int progreso = 0;

    public VentanaCarga() {
        initComponents();
        this.txtCargaImagenesBien.setVisible(false);
        this.setSize(490, 152);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        tiempo = new Thread(this);
        tiempo.start();
    }

    public void cargar() {
        //MENU
        guardarCategorias();
        cargarImagenes();
        txtCargaImagenesBien.setVisible(true);
        txtCargaImagenes.setVisible(false);
        //FIN MENU

        //LUGARES
        crearGuardarCategoriasLugares();
        crearGuardarLugares();
        //FIN LUGARES
    }

    public void iniciarApp() {
        new MenuRegistro().setVisible(true);
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        txtCargandoImagenes = new javax.swing.JLabel();
        panelCargaEstado = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        txtCargaImagenes = new javax.swing.JLabel();
        txtCargaImagenesBien = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlFondo.setBackground(new java.awt.Color(0, 129, 175));
        pnlFondo.setPreferredSize(new java.awt.Dimension(490, 300));
        pnlFondo.setSize(new java.awt.Dimension(100, 302));
        pnlFondo.setLayout(null);

        txtCargandoImagenes.setFont(new java.awt.Font("SansSerif", 3, 15)); // NOI18N
        txtCargandoImagenes.setForeground(new java.awt.Color(255, 255, 255));
        txtCargandoImagenes.setText("CARGANDO IMAGENES...");
        pnlFondo.add(txtCargandoImagenes);
        txtCargandoImagenes.setBounds(20, 30, 250, 35);

        panelCargaEstado.setBackground(new java.awt.Color(76, 84, 84));
        panelCargaEstado.setLayout(null);

        jProgressBar1.setMaximum(88);
        panelCargaEstado.add(jProgressBar1);
        jProgressBar1.setBounds(20, 10, 450, 30);

        pnlFondo.add(panelCargaEstado);
        panelCargaEstado.setBounds(0, 80, 490, 50);

        txtCargaImagenes.setFont(new java.awt.Font("SansSerif", 3, 15)); // NOI18N
        txtCargaImagenes.setForeground(new java.awt.Color(255, 255, 255));
        txtCargaImagenes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCargaImagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Principal/loader.gif"))); // NOI18N
        pnlFondo.add(txtCargaImagenes);
        txtCargaImagenes.setBounds(350, 30, 40, 35);

        txtCargaImagenesBien.setFont(new java.awt.Font("SansSerif", 3, 15)); // NOI18N
        txtCargaImagenesBien.setForeground(new java.awt.Color(255, 255, 255));
        txtCargaImagenesBien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCargaImagenesBien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Trivia/comprobado.png"))); // NOI18N
        pnlFondo.add(txtCargaImagenesBien);
        txtCargaImagenesBien.setBounds(350, 30, 40, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel panelCargaEstado;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JLabel txtCargaImagenes;
    private javax.swing.JLabel txtCargaImagenesBien;
    private javax.swing.JLabel txtCargandoImagenes;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (tiempo != null) {
            cargar();
            dispose();
            iniciarApp();
            break;
        }
    }
    
    public final BaseGACU base = new BaseGACU();

    //Menu Principal
    public Categoria categorias = new Categoria();
    public Imagenes imagenes = new Imagenes();
    public File carpetaImg;
    public String rutaCarpeta;
    public String signoRuta;
    public File ruta;
    public byte[] icono;

    public void guardarCategorias() {
        categorias.setCodigo_categoria("C1P");
        categorias.setNombre_categoria("Parques");
        guardarCategoriaBase(categorias);
        categorias.setCodigo_categoria("C2I");
        categorias.setNombre_categoria("Iglesias");
        guardarCategoriaBase(categorias);
        categorias.setCodigo_categoria("C3M");
        categorias.setNombre_categoria("Museos");
        guardarCategoriaBase(categorias);
        categorias.setCodigo_categoria("C4E");
        categorias.setNombre_categoria("Educacion Superior");
        guardarCategoriaBase(categorias);
    }

    public void guardarCategoriaBase(Categoria categoria) {
        base.crearCategoria(categoria);
    }

    public void cargarImagenes() {
        //PRINCIPAL
        carpetaImg = new File("Imagenes_Principal");
        rutaCarpeta = carpetaImg.getAbsolutePath();
        signoRuta = (rutaCarpeta.contains("/")) ? "/" : "\\";
        
        cargarImagen("img01", "imgIglesia.PNG");
        jProgressBar1.setValue(++progreso);
        cargarImagen("img02", "imgParque.PNG");
        jProgressBar1.setValue(++progreso);
        cargarImagen("img03", "imgMuseo.PNG");
        jProgressBar1.setValue(++progreso);
        cargarImagen("img04", "imgUniversidad.PNG");
        jProgressBar1.setValue(++progreso);
        //PARQUES
        carpetaImg = new File("Imagenes_Parques");
        rutaCarpeta = carpetaImg.getAbsolutePath();
        signoRuta = (rutaCarpeta.contains("/")) ? "/" : "\\";
        
        for (int i = 1; i <= 4; i++) {
            cargarImagen("imgPC0" + i, "calderon" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
            cargarImagen("imgPP0" + i, "paraiso" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
            cargarImagen("imgPM0" + i, "madre" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
            cargarImagen("imgPB0" + i, "blas" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
            cargarImagen("imgPS0" + i, "sebastian" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
        }
        
        cargarImagen("imgP05", "fondoParques.jpg");
        jProgressBar1.setValue(++progreso);
        //MUSEOS
        carpetaImg = new File("Imagenes_Museo");
        rutaCarpeta = carpetaImg.getAbsolutePath();
        signoRuta = (rutaCarpeta.contains("/")) ? "/" : "\\";

        for (int i = 1; i <= 4; i++) {
            cargarImagen("imgMP0" + i, "pumapungo" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
            cargarImagen("imgMA0" + i, "aborigen" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
            cargarImagen("imgMM0" + i, "moderno" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
            cargarImagen("imgME0" + i, "esqueleto" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
            cargarImagen("imgMS0" + i, "santos" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
        }
        
        cargarImagen("imgM05", "fondoMuseo.jpg");
        jProgressBar1.setValue(++progreso);
        //E_SUPERIORES
        carpetaImg = new File("Imagenes_Institutos");
        rutaCarpeta = carpetaImg.getAbsolutePath();
        signoRuta = (rutaCarpeta.contains("/")) ? "/" : "\\";
        
        cargarImagen("imgE05", "fondoES.jpg");
        jProgressBar1.setValue(++progreso);
        
        for (int i = 1; i <= 4; i++) {
            cargarImagen("imgEC0" + i, "estatal" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
            cargarImagen("imgEA0" + i, "uda" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
            cargarImagen("imgEU0" + i, "ups" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
        }

        cargarImagen("imgET01", "catolica1.jpg");
        jProgressBar1.setValue(++progreso);
        cargarImagen("imgET02", "catolica2.jpg");
        jProgressBar1.setValue(++progreso);
        cargarImagen("imgET03", "catolica3.jpg");
        jProgressBar1.setValue(++progreso);
        cargarImagen("imgET04", "catolica4.PNG");
        jProgressBar1.setValue(++progreso);

        cargarImagen("imgEI01", "ista1.jpg");
        jProgressBar1.setValue(++progreso);
        cargarImagen("imgEI02", "ista2.PNG");
        jProgressBar1.setValue(++progreso);
        cargarImagen("imgEI03", "ista3.PNG");
        jProgressBar1.setValue(++progreso);
        cargarImagen("imgEI04", "ista4.PNG");
        jProgressBar1.setValue(++progreso);
        //IGLESIAS
        carpetaImg = new File("Imagenes_Iglesias");
        rutaCarpeta = carpetaImg.getAbsolutePath();
        signoRuta = (rutaCarpeta.contains("/")) ? "/" : "\\";
        
        cargarImagen("imgI05", "fondoiglesia.jpg");
        jProgressBar1.setValue(++progreso);

        for (int i = 1; i <= 4; i++) {
            cargarImagen("imgIS0" + i, "sagrario" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
            cargarImagen("imgIA0" + i, "asuncion" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
            cargarImagen("imgIB0" + i, "blas" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
            cargarImagen("imgIT0" + i, "santos" + i + ".jpg");
            jProgressBar1.setValue(++progreso);
        }

        cargarImagen("imgII01", "inmaculada1.jpg");
        jProgressBar1.setValue(++progreso);
        cargarImagen("imgII02", "inmaculada2.png");
        jProgressBar1.setValue(++progreso);
        cargarImagen("imgII03", "inmaculada3.jpg");
        jProgressBar1.setValue(++progreso);
        cargarImagen("imgII04", "inmaculada4.jpg");
        jProgressBar1.setValue(++progreso);
    }

    public void cargarImagen(String codigoImagen, String nombreImagen) {
        ruta = new File(rutaCarpeta + signoRuta + nombreImagen);
        guardarImagenBase(codigoImagen, ruta);
    }

    public void guardarImagenBase(String codigo, File rutaImg) {
        imagenes.setCodigo_imagen(codigo);
        try {
            icono = new byte[(int) rutaImg.length()];
            InputStream input = new FileInputStream(rutaImg);
            input.read(icono);
            imagenes.setImagen(icono);
        } catch (IOException ex) {
            imagenes.setImagen(null);
        }
        base.crearImagen(imagenes);
    }
    //FIN Menu Principal

    //LUGARES
    public Vector<Categoria_Lugar> categoriasLugares = new Vector<>();
    public Categoria_Lugar categoriaLugar;
    public Vector<Lugares> lugares = new Vector<>();
    public Lugares lugar;

    public void crearGuardarCategoriasLugares() {
        crearCategoriasLugares();
        guardarCategoriasLugaresBase(categoriasLugares);
    }

    public void guardarCategoriasLugaresBase(Vector<Categoria_Lugar> categoriasLugares) {
        categoriasLugares.forEach((elemento) -> guardarCategoriaLugarBase(elemento));
    }

    public void crearCategoriasLugares() {
        for (int i = 1; i <= 5; i++) {
            setCategoriaLugar("C1P", "P0" + i);//PARQUES
            setCategoriaLugar("C4M", "M0" + i);//MUSEOS
            setCategoriaLugar("C3E", "E0" + i);//ESUPERIOR
            setCategoriaLugar("C2I", "I0" + i);//IGLESIAS
        }
    }

    public void setCategoriaLugar(String codigoCategoria, String codigoLugar) {
        categoriaLugar = new Categoria_Lugar(codigoCategoria, codigoLugar);
        categoriasLugares.addElement(categoriaLugar);
    }

    public void guardarCategoriaLugarBase(Categoria_Lugar categoriaLugar) {
        base.crearCategoria_Lugar(categoriaLugar);
    }

    public void crearGuardarLugares() {
        crearLugares();
        guardarLugaresBase(lugares);
    }

    public void crearLugares() {
        //PARQUES INFO
        String info = "Luego de fundar la ciudad el español Gil Ramírez Dávalos, tomo un terreno al cual bautizo con el nombre de Plaza República. Alrededor de esta se expandió la ciudad. El parque poseía una pila en el centro, con vasijas de mármol, las cuales adornaron el lugar durante algunos años en siglo. En torno a esta plaza se encuentran ubicadas: la Gobernación, la Municipalidad, las dos Catedrales, el antiguo seminario y el Palacio de Justicia.\n"
                + "Luís Cordero, trajo de Chile unas pequeñas plantas de pino de la especie de las araucarias, las sembró alrededor de la pila y allí se aclimataron, hasta convertirse en árboles enormes que son los que observamos en la actualidad. El 20 de marzo de 1887, fue ejecutado el revolucionario liberal Luís Vargas Torres, en la municipalidad. Con el triunfo del liberalismo, en el gobierno de Eloy Alfaro se nombró a esta plaza Luís Vargas Torres, en honor a éste. Pero la ciudadanía no aceptó tal denominación y lo seguían llamando Plaza República o de Armas. En el año de 1920 la Municipalidad encomendó rediseñar el parque a Octavio Cordero Palacios, él fue quien los bautizó en ese mismo año con el nombre de Parque Abdón Calderón, y más tarde se sustituyó la pila por el monumento de Abdón Calderón. Abdón Calderón Garaicoa: Nació en Cuenca, el 31 de julio de 1804 y muere en mayo de 1822, sus padres fueron el coronel Francisco Calderón y Manuela Garaicoa. Siendo muy joven ingresó al ejército patriota. Sucre lo aceptó en sus filas y lo nombró Abanderado del Batallón Yaguachi. Su valentía y patriotismo lo demostró durante la histórica \"Batalla de Pichincha\", en la cual murió, siendo sus últimas palabras \"Ya puedo morir contento porque mi patria es libre\".\n"
                + "Dirección: Se encuentra ubicado en las calles Simón Bolívar, Benigno Malo, Antonio José de Sucre y Luís Cordero."; //Terminar
        setLugar("P01", "Parque Calderon", info);
        info = "Es un parque destinado a la recreación y al deporte, cuenta con espacios verdes y juegos infantiles, así como de un sendero para atletas.\n"
                + "Dentro del parque se encuentra las instalaciones de la Escuela de Marcha, deporte de atletismo que es muy común entre los jóvenes cuencanos siguiendo así los pasos del campeón olímpico y múltiple campeón mundial de Marcha Jefferson Pérez, al cual se lo ha honrado con una estatua dentro del propio parque.\n"
                + "También se puede acceder al planetario municipal en donde se puede disfrutar de documentales a cerca de la tierra y el espacio de gran interés especialmente para los niños.\n"
                + "Dirección: ubicado a las riveras del Tomebamba en la Av. Federico Malo y 12 de abril.";
        setLugar("P02", "Parque de la Madre", info);
        info = "El Parque de El Paraíso ubicado en el área de Gapal, junto a las sedes de las Facultades de Ciencias Médicas y Odontología de la Universidad de Cuenca, es sin duda el parque atractivo más grande de Cuenca.\n"
                + "Dispone en efecto de canchas para prácticas deportivas de niños y jóvenes, de juegos infantiles, una laguna artificial provista de pequeños botes plásticos utilizados para remar y navegar, hay un estanque o un pequeño lago con patos senderos y sitios para acampar, también encontramos  senderos para bicicletas, cuenta con abundante vegetación, árboles grandes de eucaliptos y de otras especies forestales, además sus llamativos senderos por donde la gente puede pasear y recorrer los bordes del parque.\n"
                + "El Paraíso, el parque más grande de Cuenca, es un atractivo turístico de la ciudad y el Azuay., inaugurado el 19 de marzo del 2003; los visitantes pueden acceder de manera gratuita, de lunes a domingo con restricción de horario nocturno, se permite la estancia dentro de este espacio solo hasta las 21H00.\n"
                + "Tiene una extensión de 17 hectáreas, brinda al público en general hermosos muelles de ingreso y un islote en el centro de la laguna. Conocer este hermoso lugar es indispensable, disfrutar de coloridos paisajes y exuberante vegetación nos traslada a un espacio de tranquilidad. Caminar detenidamente y observar múltiples perspectivas llenan de emoción y satisfacción, logrando equilibrio y armonía dentro de nosotros."; //Terminar
        setLugar("P03", "Parque Paraiso", info);
        info = "Es un lugar de concentración de desfiles, es ocupado por turistas nacionales y extranjeros disfrutando una recreación pasiva. El parque de San Blas, es un parque tradicional de la ciudad de Cuenca, adornado por hermosos jardines y una llamativa pileta de agua en cuyo centro se levanta el busto de Manuel J. Calle; se encuentra al frente de la Iglesia de San Blas, se localiza en la parroquia del mismo nombre. Este es un espacio público de recreación pasiva, que concentra a mucha gente, que acude a Misa; principalmente los días sábados y domingos.\n"
                + "La presencia de las Heladerías convoca a un gran número de ciudadanos y turistas nacionales y extranjeros. Es un lugar de concentración para desfiles cívicos estudiantiles, folklóricos y políticos, congrega a jóvenes estudiantes de los equipamientos educativos cercanos al lugar, por lo tanto, es un sitio ideal para realizar actividades culturales.\n"
                + "Dirección: Situada entre las calles Simón Bolívar, Tomás Ordoñez, San Blas y Manuel Vega";
        setLugar("P04", "Parque San Blas", info);
        info = "Un espacio excelentemente renovado, es el parque de San Sebastián, se halla ubicado en la parroquia del mismo nombre, posee una encantadora pileta, aquí se levanta el busto al poeta cuencano Miguel Moreno, contiguamente esta la Iglesia de San Sebastián.\n"
                + "Al frente se encuentra el Museo de Arte Moderno en el que se realiza la Bienal de pintura. Sus árboles y coloridos jardines hacen de este sitio un lugar placentero para el descanso y la recreación pasiva, es muy frecuentado por los turistas nacionales y extranjeros. Según Cabrera, morador del barrio, se realiza actividades artísticas culturales en el Bienal de pintura.\n"
                + "Dirección: Entre las calles Mariscal Sucre y coronel Talbot.";
        setLugar("P05", "Parque San Sebastian", info);
        //MUSEOS INFO
        info = "El museo ofrece varios componentes interesantes como: la sala etnográfica nacional, la sala arqueológica y museo de sitio donde se puede aprender sobre la historia de Pumapungo desde la época cañarí, inka y la actualidad, la exposición sobre el tejido patrimonial de Gualaceo “IKAT”, la exposición “Oro y Plata Milenarios”, hermosa exposición que ilustra la maestranza en el trabajo de los metales y su simbología para las culturas prehispánicas e Inca en el Ecuador, el Parque Ancestral Pumapungo conformado por el parque arqueológico de varias hectáreas, vestigios del majestuoso centro administrativo, militar y religioso que fue Pumapungo, el parque etnobotánico y chacra andina, que contienen más de 200 especies de plantas nativas, diariamente visitado por más de 30 especies de aves, y el centro de rescate y avifauna donde se pueden apreciar más de 50 aves que han sido rescatadas del tráfico ilícito de especies, loros, tucanes, águilas, pavas de monte, llamas, entre otros.\n"
                + "El Museo y Parque Ancestral Pumapungo – Ministerio de Cultura del Ecuador son parte del patrimonio que hace de Cuenca una ciudad llena de interesantes propuestas artístico culturales, testimonio de la constante evolución de la ciudad y su gente a través del tiempo. Es deber de todos valorarlo y respetarlo, por esto al visitar estos espacios es importante tratarlo con cuidado en modo de poder preservarlo y que todos podamos disfrutar de lo que tiene para ofrecer.\n"
                + "Dirección: Calle Larga y Huayna Cápac Esquina."; //Terminar
        setLugar("M01", "Museo Pumapungo", info);
        info = "Este es un museo que promueve y rescata los valores patrimoniales y culturales, cuenta con más de 8000 piezas arqueológicas correspondientes a todos los periodos de la historia aborigen de Ecuador, es considerado el Museo más completo de la ciudad de Cuenca y de la región.\n"
                + "El Museo de las Culturas Aborígenes, especializado en Arqueología ecuatoriana, fundado por la familia Cordero López, forma parte del Centro Cultural Cordero. Desde su apertura en 1992 tiene como objetivo trabajar en la enseñanza, la valoración, el mantenimiento y la protección del Patrimonio Cultural de los ecuatorianos. Promociona el desarrollo cultural de la región sur del país, investigaciones y actividades culturales. Cuenta con especialistas en museos y patrimonio que desarrollan estrategias didácticas de mediación para distintos públicos, que permiten al visitante explorar costumbres y creencias de nuestros antepasados, participando de manera activa. El Museo funciona en una casa del siglo XVIII ubicada en el Centro Patrimonial de Cuenca. Ofrece diversos actos culturales, cursos, conferencias, servicios de biblioteca y del fondo documental que preserva datos, imágenes y documentos únicos de la historia de Cuenca y el Ecuador, así como libros de arte, historia, geografía y literatura. La exposición permanente del Museo, está concebida como un encuentro con quince momentos fundamentales de la arqueología ecuatoriana. Su didáctica tiene un ordenamiento geográfico y temático de objetos de los pueblos originarios de todo el Ecuador. En su recorrido se puede apreciar la increíble destreza y conocimiento con la que estos pueblos trabajaron distintos materiales como piedra, cerámica, concha, hueso, metales, textiles. Se observan objetos utilitarios, ceremoniales, ornamentales y escultura\n"
                + "Dirección: Barrio Todos Santos. Calle Larga 5-24, entre Hermano Miguel y Mariano Cueva."; //Terminar
        setLugar("M02", "Museo Aborigenes", info);
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
        setLugar("M05", "Museo de Todos Santos", info);
        //E_SUPERIOR INFO
        info = "Es una universidad pública ecuatoriana. Creada oficialmente por decreto legislativo en el año 1867, fue la primera universidad en la ciudad de Cuenca, así como la primera en la región del Austro del Ecuador. Actualmente es considerada como una de las mejores universidades del país, además de ser muy reconocida a nivel de Latinoamérica.\n"
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
        //IGLESIAS
        info = "Al pie de la Plaza de las Flores, un lugar turístico bastante visitado, ubicado en el centro histórico de la ciudad, construida en honor a la Virgen en la advocación de la Asunción, su fundación estuvo a cargo de las religiosas del convento de San José y está a cargo de Carmelitas Descalzas de Nuestra Señora de la Asunción.\n"
                + "El retablo que posee en su interior tiene un origen de corte neoclásico Y el pulpito está cubierto con pan de oro, la parte del coro está todo cubierto de malla, debido a que las religiosas debían estar cubiertas para cantar durante los servicios religiosos especiales.\n"
                + "Tiene una fachada donde se puede ver como resalta una portada tallada de mármol de estilo barroco. La iglesia comprende un estilo renacentista, las columnas que enmarcan la puerta mantiene un estilo salomónico distinguiendo las imágenes de San Pedro y San Pablo.\n"
                + "Dirección: Calle Mariscal Sucre y Padre Aguirre.";
        setLugar("I01", "Iglesia Asuncion", info);
        info = "La Iglesia más antigua es la Catedral o Catedral Vieja como hoy es conocida, se construyó apenas 10 años después de la fundación española de la ciudad. Para levantar el edificio el cabildo reunió fondos y dirigió los trabajos. Piedras labradas traídas de las ruinas de la incásica Tomebamba, sirvieron para los cimientos y las bases de los muros. La actual iglesia nació con la fundación oficial española el 12 de abril de 1557. Junto con el cabildo, la gobernación, la cárcel, carnicería, la casa de fundación, el hospital y los solares repartidos a los primeros vecinos, la iglesia y el cementerio, constituyeron la traza primitiva de concepción renacentista europea.\n"
                + "La construcción de la catedral fue ordenada el 7 de julio de 1557 y edificada en 1567, después de la fundación española de la ciudad. Entre 1557 y 1924 la edificación tuvo varias ampliaciones. Se levantaron cuatro capillas hasta inicios de 1600. Hay vestigios del uso de piedras incas traídas del sector de Pumapungo.\n"
                + "Dirección: Está situada en la calle Luís Cordero entre las calles Sucre y Bolívar, en el Parque Calderón."; //Terminar
        setLugar("I02", " Iglesia el Sagrario", info);
        info = "La Iglesia de San Blas representaba el límite oriental de la ciudad por aproximadamente 400 años en la zona que, durante la época colonial, se llamaba \"Barrios de Abajo\". La construcción de este templo fue dedicada a San Blas y se remonta al último tercio del siglo XVI, en mayo de 1557, a pocos días de fundada la ciudad de Cuenca. Esta construcción se estableció por parte de los estudiosos sacerdotes Carlos Terán Zenteno y José María Vargas, quienes ocuparon piedras de los destruidos edificios de Tomebamba para su edificación.\n"
                + "En 1935 se construye un nuevo templo restaurado tanto en su interior como en su exterior, conservando su estructura original como base. Esta restauración fue posible gracias a una inversión conjunta de la Curia Arquidiocesana y la Municipalidad.\n"
                + "Dirección: Calles Bolívar y Manuel Vega.";
        setLugar("I03", "Iglesia San Blas", info);
        info = "Según lo relatan los historiadores esta fue la primera ermita de Cuenca (Ecuador) y llevaba el nombre de Usno o Iglesia de San Marcos, en donde se llevó a cabo por primera vez una misa realizada por Fray Alonso de Mercadillo. Lleva el nombre de Todos Santos en honor a todos los santos que se veneraron en este templo. El templo en la actualidad, a pesar de los años, continua con sus características principales de su origen. En el interior del templo se puede apreciar una bella pintura moral en el área del altar mayor. El cielo raso está elaborado de latón y fue traído por Matovelle desde Francia. En el altar destaca imágenes del corazón de Jesús y corazón de María y José. Tres puntos a destacar de esta iglesia es la existencia de 2 estatuas de ángeles gigantes de los cuales Julio Matovelle era devoto, un lienzo que muestra a la ciudad de Cuenca y un ángel donado por Gil Ramírez Dávalos, entre otras imágenes y figuras de devoción.\n"
                + "Dirección: Calle Larga s/n E 001, 010101";
        setLugar("I04", "Iglesia Todos Santos", info);
        info = "La Catedral Nueva es el símbolo religioso más representativo de la ciudad. Su ubicación responde a la condición de centralidad y del poder religioso, frente a la plaza central, ocupando la mitad de la manzana situada al lado occidental. Su volumen, textura y color, se divisan desde todos los ángulos de Cuenca, inclusive de los alrededores. Su fachada es de piedra y mármol local, mientras que el piso está cubierto con mármoles rosas, importados de Carrara (Italia).\n"
                + "Se puede visitar las Cúpulas y Cripta de la Catedral todos los días. El recorrido dura alrededor de una hora y permite visitar las torres de la Catedral, desde donde se puede observar la ciudad. En cambio, la cripta, que mide 96 metros de largo y 12 de ancho, aloja cientos de nichos y las tumbas de cuatro Obispos. Tiene una hermosa cúpula azul con otras menores que caracterizan el paisaje de la ciudad.\n"
                + "Esta monumental obra comenzó a construirse en la segunda mitad de la década de 1880, por iniciativa del Obispo Miguel León y con el diseño del hermano redentorista Juan Stiehle. El 28 de mayo de 1967 se realizó la ceremonia de consagración de la mayor iglesia de Cuenca que fue culminada después de mucho esfuerzo.\n"
                + "Dirección: La Catedral Nueva de Cuenca se encuentra en las calles Benigno Malo y Mariscal Sucre. Parroquia Gil Ramírez Dávalos."; //Terminar
        setLugar("I05", "Iglesia la Inmaculada", info);
    }

    public void setLugar(String codigo, String nombre, String info) {
        lugar = new Lugares(codigo, nombre, info);
        lugares.addElement(lugar);
    }

    public void guardarLugaresBase(Vector<Lugares> lugaresGuardar) {
        lugaresGuardar.forEach((elemento) -> guardarLugarBase(elemento));
    }

    public void guardarLugarBase(Lugares lugarGuardar) {
        base.crearLugar(lugarGuardar);
    }
    //FIN LUGARES
}
