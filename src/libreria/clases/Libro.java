package libreria.clases;

public class Libro {

    //atributos privados
    private String titulo;
    private String autor;
    private double precioDeReemplazo;

    //constructor vacío
    public Libro() {
    }

    //constructor con parámetros
    public Libro(String titulo, String autor, double precioDeReemplazo) {
        this.titulo = titulo;
        this.autor = autor;
        this.precioDeReemplazo = precioDeReemplazo;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecioDeReemplazo() {
        return precioDeReemplazo;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecioDeReemplazo(double precioDeReemplazo) {
        this.precioDeReemplazo = precioDeReemplazo;
    }
}
