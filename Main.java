public class Main {

    public static void main(String[] args) {

        Biblioteca bibliotecaKonradLorenz = new Biblioteca();

        bibliotecaKonradLorenz.registrarLibro(new libro("Cien años de soledad", "Gabriel García Márquez", 496));
        bibliotecaKonradLorenz.registrarLibro(new libro("El código Da Vinci", "Dan Brown", 656));
        bibliotecaKonradLorenz.registrarLibro(new libro("1984", "George Orwell", 326));
        bibliotecaKonradLorenz.registrarLibro(new libro("El Hobbit", "J.R.R. Tolkien", 310));
        bibliotecaKonradLorenz.registrarLibro(new libro("La Odisea", "Homero", 448));

        bibliotecaKonradLorenz.mostrarLibrosDisponibles();
    }
}
