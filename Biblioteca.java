import java.util.ArrayList;

// Definición de la clase "Biblioteca"
public class Biblioteca {
    // Atributo privado para almacenar libros disponibles en la biblioteca
    private ArrayList<libro> librosDisponibles;

    // Constructor para inicializar los atributos
    public Biblioteca() {
        librosDisponibles = new ArrayList<>(); // Inicializa la lista de libros disponibles
    }

    // Método para registrar un libro en la biblioteca
    public void registrarLibro(libro libro) {
        librosDisponibles.add(libro); // Agrega el libro a la lista de libros disponibles
    }

    // Método para buscar un libro por título
    public libro buscarLibro(String titulo) {
        for (libro libro : librosDisponibles) {
            // Compara el título del libro actual con el título proporcionado
            if (libro.getTitulo().equals(titulo)) {
                return libro; // Devuelve el libro si se encuentra
            }
        }
        return null; // Devuelve null si no se encuentra el libro
    }

    // Método para mostrar los libros disponibles en la biblioteca
    public void mostrarLibrosDisponibles() {
        for (libro libro : librosDisponibles) {
            System.out.println(libro.getTitulo()); // Imprime el título del libro
        }
    }
}
