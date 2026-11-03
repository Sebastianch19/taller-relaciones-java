public class Vuelo {

    private String numero;
    private String origen;
    private String destino;
    private int capacidadMaxima;
    private Asiento[] asientos; // Composición: El vuelo crea y posee sus asientos


    // -- Constructores --

    public Vuelo(){
    }

    public Vuelo(String numero, String origen, String destino){
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
    }

    // Al construir el vuelo con capacidad, se creen automáticamente los asientos
    public Vuelo(String numero, String origen, String destino, int capacidadMaxima) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.capacidadMaxima = capacidadMaxima;
        // El vuelo crea sus propios asientos - composición
        this.asientos = new Asiento[capacidadMaxima];
        for (int i = 0; i < capacidadMaxima; i++) {
            asientos[i] = new Asiento("A" + (i + 1));
        }
    }
    
    
    // --- Getters ---

    public String getNumero() {
        return numero;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    // --- Metodos ---


    public void mostarInfo(){
        System.out.println("--- Vuelo "+ numero + " ---");
        System.out.println("Ruta: " + origen + " -> " + destino);
        System.out.println("Capacidad: " + capacidadMaxima + " asientos");
    }

    // Muestra el estado de cada asiento
    public void mostrarAsientos(){
        
    }


}