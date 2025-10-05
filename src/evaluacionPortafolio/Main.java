package evaluacionPortafolio;

import evaluacionPortafolio.clases.Agenda;
import evaluacionPortafolio.clases.Tarea;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

/**
 * Punto de entrada de la aplicación.
 * Controla el flujo del menú interactivo.
 */

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("=== Agenda Digital para Empleados ===");

        do {
            mostrarMenu();
            opcion = leerEntero(scanner);

            switch (opcion) {
                case 1:
                    agregarTarea(agenda, scanner);
                    break;
                case 2:
                    listarTareas(agenda);
                    break;
                case 3:
                    filtrarPorEstado(agenda, scanner);
                    break;
                case 4:
                    marcarCompletada(agenda, scanner);
                    break;
                case 5:
                    System.out.println("Saliendo... ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Listar todas las tareas");
        System.out.println("3. Filtrar por estado");
        System.out.println("4. Marcar tarea como completada");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int leerEntero(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void agregarTarea(Agenda agenda, Scanner scanner) {
        System.out.print("Descripción de la tarea: ");
        String desc = scanner.nextLine().trim();
        if (desc.isEmpty()) {
            System.out.println("La descripción no puede estar vacía.");
            return;
        }

        System.out.print("Fecha (YYYY-MM-DD): ");
        try {
            LocalDate fecha = LocalDate.parse(scanner.nextLine().trim());
            agenda.agregarTarea(desc, fecha);
            System.out.println("✅ Tarea agregada correctamente.");
        } catch (DateTimeParseException e) {
            System.out.println("❌ Formato de fecha inválido. Use YYYY-MM-DD.");
        }
    }

    private static void listarTareas(Agenda agenda) {
        List<Tarea> tareas = agenda.obtenerTodasLasTareas();
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
        } else {
            System.out.println("\n--- Todas las tareas ---");
            tareas.forEach(System.out::println);
        }
    }

    private static void filtrarPorEstado(Agenda agenda, Scanner scanner) {
        System.out.print("Estado (1 = Pendiente, 2 = Completada): ");
        int estado = leerEntero(scanner);
        boolean completada = (estado == 2);

        List<Tarea> filtradas = agenda.filtrarPorEstado(completada);
        if (filtradas.isEmpty()) {
            System.out.println("No hay tareas con ese estado.");
        } else {
            System.out.println("\n--- Tareas " + (completada ? "completadas" : "pendientes") + " ---");
            filtradas.forEach(System.out::println);
        }
    }

    private static void marcarCompletada(Agenda agenda, Scanner scanner) {
        System.out.print("ID de la tarea a completar: ");
        int id = leerEntero(scanner);
        if (id <= 0) {
            System.out.println("ID inválido.");
            return;
        }

        if (agenda.marcarComoCompletada(id)) {
            System.out.println("✅ Tarea marcada como completada.");
        } else {
            System.out.println("❌ No se encontró una tarea con ese ID.");
        }
    }
}
