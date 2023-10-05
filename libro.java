// Definición de la clase "libro"
public class libro {
    // Atributos privados de la clase
    private String titulo;           // Título del libro
    private String autor;            // Autor del libro
    private int numeroPaginas;       // Número de páginas del libro

    // Constructor para inicializar los atributos al crear una instancia de la clase
    public libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;         // Asigna el valor del parámetro "titulo" al atributo "titulo"
        this.autor = autor;           // Asigna el valor del parámetro "autor" al atributo "autor"
        this.numeroPaginas = numeroPaginas; // Asigna el valor del parámetro "numeroPaginas" al atributo "numeroPaginas"
    }

    // Métodos get y set para acceder y modificar los atributos de la clase

    // Método get para obtener el título del libro
    public String getTitulo() {
        return titulo;
    }

    // Método set para modificar el título del libro
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método get para obtener el autor del libro
    public String getAutor() {
        return autor;
    }

    // Método set para modificar el autor del libro
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método get para obtener el número de páginas del libro
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    // Método set para modificar el número de páginas del libro
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
