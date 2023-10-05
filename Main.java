// Definición de la clase "Main"
public class Main {

    public static void main(String[] args) {

        // Creación de una instancia de la clase "Biblioteca" llamada "bibliotecaKonradLorenz"
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();

        // Registro de libros en la biblioteca "bibliotecaKonradLorenz" utilizando el método "registrarLibro"
        bibliotecaKonradLorenz.registrarLibro(new libro("Cien años de soledad", "Gabriel García Márquez", 496));
        bibliotecaKonradLorenz.registrarLibro(new libro("El código Da Vinci", "Dan Brown", 656));
        bibliotecaKonradLorenz.registrarLibro(new libro("1984", "George Orwell", 326));
        bibliotecaKonradLorenz.registrarLibro(new libro("El Hobbit", "J.R.R. Tolkien", 310));
        bibliotecaKonradLorenz.registrarLibro(new libro("La Odisea", "Homero", 448));

        // Mostrar los libros disponibles en la biblioteca utilizando el método "mostrarLibrosDisponibles"
        bibliotecaKonradLorenz.mostrarLibrosDisponibles();
    }
}
