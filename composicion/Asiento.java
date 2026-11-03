public class Asiento {

    private String codigo;
    private boolean ocupado;


    // Constructor

    // El asiento inicia siempre en desocupado
    public Asiento(String codigo) {
        this.codigo = codigo;
        this.ocupado = false;
    }
    
    
    // Getters

    public String getCodigo() {
        return codigo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    // Metodos

    public void ocupar() {
        if (ocupado) {
            System.out.println("El asiento " + codigo + " ya está ocupado.");
        } else {
            ocupado = true;
            System.out.println("El asiento " + codigo + " ha sido ocupado.");
        }
    }

    public void liberar (){
        ocupado = false;
        System.out.println("El asiento " + codigo + " ha sido liberado.");
    }

    public void mostrarEstado(){
        System.out.println("Asiento " + codigo + ": " + (ocupado ? "Ocupado" : "Libre"));
    }
}