package libreria.clases;

import java.util.ArrayList;

public class Prestamo {

    //atributos privados
    private String nombre;
    private ArrayList<Libro> libros;
    private boolean estatus;

    //constructor sin argumentos
    public Prestamo() {
        this.nombre = "Invitado";
        this.estatus = true;
        this.libros = new ArrayList<>();
    }

    //constructor sobrecargado
    public Prestamo(String nombre, boolean estatus) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.estatus = estatus;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    //metodo para añadir un libro
    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    //metodo para retornar mensaje segun estatus
    public String mostrarEstatus() {
        return estatus ? "Prestamo realizado" : "Prestamo no realizado";
    }

    //metodo para mostrar detalles del préstamo
    public void mostrarDetallePrestamo() {
            System.out.println("\n=== Detalles del Préstamo ===");
            System.out.println("Usuario: " + nombre);
            System.out.println("Estatus: " + (estatus ? "Activo" : "Inactivo"));
            System.out.println("Libros prestados:");

            if(libros.isEmpty()) {
                System.out.println("No hay libros prestados.");
            } else {
                for(Libro libro : libros) {
                    System.out.printf("  - %s por %s (Precio reemplazo: $%.2f)%n",
                            libro.getTitulo(), libro.getAutor(), libro.getPrecioDeReemplazo());
                }
            }

        System.out.printf("Total a pagar por reemplazo: $%.2f%n", calcularTotalDeReemplazo());
    }

    //metodo para calcular el total de reemplazo
    public double calcularTotalDeReemplazo() {
        double total = 0;
        for(Libro libro : libros) {
            total += libro.getPrecioDeReemplazo();
        }
        return total;
    }
}
