package clases;

public final class OpcionesTrivia2 {
    
    private String[] opcionesTrivia = new String[3];
    private String[] opcionesTriviaSiglos;
    private String[] opcionesTriviaAnyos;
    private String[] opcionesTriviaPalabras;

    public OpcionesTrivia2() {
        llenarVectores();
    }
    
    protected void llenarVectores() {
        llenarVectorSiglos();
        llenarVectorAnyos();
        llenarVectorPalabras();
    }
    
    protected void llenarVectorSiglos() {
        String siglos = "X,Xll,XX,XV,Xl,XlX,V,Vll,Vlll,XlV ";
        opcionesTriviaSiglos = siglos.split(",");
    }
    
    protected void llenarVectorAnyos() {
        String anyos = "1800,1910,1920,1975,1971,1990,1885,1883,1790";
        opcionesTriviaAnyos = anyos.split(",");
    }
    
    protected void llenarVectorPalabras() {
        String palabras = "Una estatua,Un altar,Sillas,Moderno,Coloquial,Vulgar,San Martín,San Blas,San Pedro,Zoológico,Sala arquitectónica,Baños,Naturaleza,Vegetación,Religión,Picaso,Van Gogh,Da Vinci,Monay,Sayausi,Miraflores,Jefferson Pérez,Pista de atletismo,Cancha de basket,San Sebastián,San José,Sagrados corazones,Gil Ramírez Dávalos,Francisco Calderon,Octavio Cordero Palacios,Ing. William Trelles,Ing. Jessica Pinos,Ing. Jessica Herrera,José Félix Pintado,Raúl Vela Chiriboga,Juan Francisco Peláez,Pedro José Álvarez,Claudio Malo Gonzales,Carlos Pérez Agustino,Ganar dinero,Ganar prestigio,Ganar fama,Arte moderno,Arte contemporáneo,Actividades culturales";
        opcionesTriviaPalabras = palabras.split(",");
    }
    //generar numeros en lista{}
    
    protected String[] getOpcionesSiglos() {
        int[] posiciones = generarNumerosRandom(0, (opcionesTriviaPalabras.length - 1), 4);
        for (int i = 0; i < opcionesTrivia.length; i++) {
            opcionesTrivia[i] = opcionesTriviaSiglos[posiciones[i]];
        }
        return opcionesTrivia;
    }
    
    protected String[] getOpcionesAnyos() {
        int[] posiciones = generarNumerosRandom(0, (opcionesTriviaPalabras.length - 1), 4);
        for (int i = 0; i < opcionesTrivia.length; i++) {
            opcionesTrivia[i] = opcionesTriviaAnyos[posiciones[i]];
        }
        return opcionesTrivia;
    }
    
    protected String[] getOpcionesPalabras() {
        int[] posiciones = generarNumerosRandom(0, (opcionesTriviaPalabras.length - 1), 4);
        for (int i = 0; i < opcionesTrivia.length; i++) {
            opcionesTrivia[i] = opcionesTriviaPalabras[posiciones[i]];
        }
        return opcionesTrivia;
    }
    
    public String[] getOpcionesTrivia(String respuesta) {
        if (respuesta.matches("\\d{4}")) { //anyos
            opcionesTrivia = getOpcionesAnyos();
        } else if (respuesta.matches("^(V|I|X)+(V|I|X)+(V|I|X)+$")) { //siglos revisar regex
            opcionesTrivia = getOpcionesSiglos();
        } else {
            opcionesTrivia = getOpcionesPalabras();
        }
        return opcionesTrivia;
    }
    
    public String[] getOpcionesTrivia() {
        return opcionesTrivia;
    }

    public void setOpcionesTrivia(String[] opcionesTrivia) {
        this.opcionesTrivia = opcionesTrivia;
    }

    public String[] getOpcionesTriviaSiglos() {
        return opcionesTriviaSiglos;
    }

    public void setOpcionesTriviaSiglos(String[] opcionesTriviaSiglos) {
        this.opcionesTriviaSiglos = opcionesTriviaSiglos;
    }

    public String[] getOpcionesTriviaAnyos() {
        return opcionesTriviaAnyos;
    }

    public void setOpcionesTriviaAnyos(String[] opcionesTriviaAnyos) {
        this.opcionesTriviaAnyos = opcionesTriviaAnyos;
    }

    public String[] getOpcionesTriviaPalabras() {
        return opcionesTriviaPalabras;
    }

    public void setOpcionesTriviaPalabras(String[] opcionesTriviaPalabras) {
        this.opcionesTriviaPalabras = opcionesTriviaPalabras;
    }
    
    private int generarNumeroRandom(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }
    
    private int[] generarNumerosRandom(int min, int max, int tamanoArray) {
        String nums = String.valueOf(generarNumeroRandom(min, max));
        String[] numsArray = new String[tamanoArray];
        for (int i = 1; i < numsArray.length; i++) {
            do {
                String num = String.valueOf(generarNumeroRandom(min, max));
                if (!nums.contains(num)) {
                    nums += ("," + num);
                    break;
                }
            } while (true);
        }
        numsArray = nums.split(",");
        return toIntArray(numsArray);
    }
    
    private int[] toIntArray(String[] stringArray) {
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.valueOf(stringArray[i]);
        }
        return intArray;
    }
    
}
