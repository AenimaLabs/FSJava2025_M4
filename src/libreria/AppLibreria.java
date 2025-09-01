package libreria;

import libreria.clases.Libro;
import libreria.clases.Prestamo;

public class AppLibreria {
    public static void main(String[] args) {
        // Crear 2 préstamos con usuarios no especificados (constructor sin argumentos)
        Prestamo prestamo1 = new Prestamo(); // Nombre: Invitado, estatus: true
        Prestamo prestamo2 = new Prestamo(); // Nombre: Invitado, estatus: true

        // Crear 3 préstamos personalizados con nombres diferentes
        Prestamo prestamo3 = new Prestamo("Ana López", true);
        Prestamo prestamo4 = new Prestamo("Carlos Ruiz", false); // Inactivo
        Prestamo prestamo5 = new Prestamo("María Pérez", true);

        // Crear libros
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 25.50);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 30.00);
        Libro libro3 = new Libro("1984", "George Orwell", 22.00);
        Libro libro4 = new Libro("El Principito", "Antoine de Saint-Exupéry", 18.75);
        Libro libro5 = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 27.30);
        Libro libro6 = new Libro("Matar un Ruiseñor", "Harper Lee", 24.90);
        Libro libro7 = new Libro("Orgullo y Prejuicio", "Jane Austen", 20.00);
        Libro libro8 = new Libro("Harry Potter y la Piedra Filosofal", "J.K. Rowling", 28.50);

        // Añadir al menos 2 libros a cada préstamo

        // Invitados
        prestamo1.agregarLibro(libro1);
        prestamo1.agregarLibro(libro2);

        prestamo2.agregarLibro(libro3);
        prestamo2.agregarLibro(libro4);

        // Personalizados
        prestamo3.agregarLibro(libro5);
        prestamo3.agregarLibro(libro6);

        prestamo4.agregarLibro(libro7);
        prestamo4.agregarLibro(libro8);

        prestamo5.agregarLibro(libro1);
        prestamo5.agregarLibro(libro7);

        // Mostrar detalles de cada préstamo
        prestamo1.mostrarDetallePrestamo();
        prestamo2.mostrarDetallePrestamo();
        prestamo3.mostrarDetallePrestamo();
        prestamo4.mostrarDetallePrestamo();
        prestamo5.mostrarDetallePrestamo();

        // Comprobar funcionalidad de mostrarEstatus
        System.out.println("\n--- Verificación de Estatus ---");
        System.out.println("Préstamo 1 (" + prestamo1.getNombre() + "): " + prestamo1.mostrarEstatus());
        System.out.println("Préstamo 2 (" + prestamo2.getNombre() + "): " + prestamo2.mostrarEstatus());
        System.out.println("Préstamo 3 (" + prestamo3.getNombre() + "): " + prestamo3.mostrarEstatus());
        System.out.println("Préstamo 4 (" + prestamo4.getNombre() + "): " + prestamo4.mostrarEstatus());
        System.out.println("Préstamo 5 (" + prestamo5.getNombre() + "): " + prestamo5.mostrarEstatus());
    }
}
