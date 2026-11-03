package asociacion;

public class App {
    public static void main(String[] args) throws Exception {
        // Libros creados de forma independiente
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry");

        // Lectores
        Lector lector1 = new Lector("Ana Torres", "1001234567");
        Lector lector2 = new Lector("Carlos Ruiz", "1009876543");

        // Cada lector toma un libro
        lector1.tomarPrestado(libro1);
        lector2.tomarPrestado(libro2);

        System.out.println();
        lector1.mostrarEstado();
        lector2.mostrarEstado();

        // Intento de tomar otro libro sin devolver el actual
        System.out.println();
        lector1.tomarPrestado(libro2);

        // lector1 devuelve su libro y toma el otro
        System.out.println();
        lector1.regresarLibro();
        lector1.tomarPrestado(libro2);

        System.out.println();
        lector1.mostrarEstado();
        lector2.mostrarEstado();

    }
}