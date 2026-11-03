package asociacion;
public class Lector {

    private String nombre;
    private String cedula;
    private Libro libroActual; // referencia a un objeto Libro - puede ser null

    // Constructores

    public Lector() {
    }

    public Lector(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    // --- Getters ---

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public Libro getLibroActual() {
        return libroActual;
    }

    // --- Setters ---

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    // --- Metodos ---

    // Toma un libro prestado
    public void tomarPrestado(Libro libro) {
        if (libroActual != null) {
            System.out.println(nombre + " ya tiene el libro \"" + libroActual.getTitulo()
                    + "\" Debe devolver primero.");
        } else {
            if (libro.prestar()) {
                libroActual = libro;
            }
        }
    }

    // Devuelve el libro actual - llama al metodo devolver() del libro
    public void regresarLibro() {
        if (libroActual == null) {
            System.out.println(nombre + " no tiene ningún libro.");
        } else {
            libroActual.devolver();
            libroActual = null;
        }
    }

    // Muestra el estado del lector 
    public void mostrarEstado() {
        String estado = (libroActual != null) ? libroActual.getTitulo() : "Sin libro";
        System.out.println("Lector: " + nombre + " | Libro: " + estado);
    }
}
