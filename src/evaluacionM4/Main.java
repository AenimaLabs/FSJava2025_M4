package evaluacionM4;

import evaluacionM4.clases.Inventario;
import evaluacionM4.clases.Producto;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int siguienteId = 1;

        System.out.println("=== Sistema de Gestión de Inventario ===");

        while (true) {
            mostrarMenu();
            int opcion = leerOpcion(scanner);

            switch (opcion) {
                case 1:
                    agregarProducto(scanner, inventario, siguienteId++);
                    break;
                case 2:
                    buscarProducto(scanner, inventario);
                    break;
                case 3:
                    listarProductos(inventario);
                    break;
                case 4:
                    eliminarProducto(scanner, inventario);
                    break;
                case 5:
                    System.out.println("Stock total: " + inventario.calcularStockTotal());
                    break;
                case 6:
                    System.out.printf("Valor total del inventario: $%.2f%n", inventario.calcularValorTotal());
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.println();
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Agregar producto");
        System.out.println("2. Buscar producto por nombre");
        System.out.println("3. Listar todos los productos");
        System.out.println("4. Eliminar producto por ID");
        System.out.println("5. Calcular stock total");
        System.out.println("6. Calcular valor total del inventario");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int leerOpcion(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor ingrese un número válido: ");
            scanner.next(); // descartar entrada inválida
        }
        return scanner.nextInt();
    }

    private static void agregarProducto(Scanner scanner, Inventario inventario, int id) {
        scanner.nextLine(); // limpiar buffer
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        Producto producto = new Producto(id, nombre, precio, cantidad);
        inventario.agregarProducto(producto);
        System.out.println("✅ Producto agregado con éxito.");
    }

    private static void buscarProducto(Scanner scanner, Inventario inventario) {
        scanner.nextLine(); // limpiar buffer
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombre = scanner.nextLine();
        Producto encontrado = inventario.buscarProductoPorNombre(nombre);
        if (encontrado != null) {
            System.out.println("🔍 Producto encontrado: " + encontrado);
        } else {
            System.out.println("❌ Producto no encontrado.");
        }
    }

    private static void listarProductos(Inventario inventario) {
        System.out.println("\n📋 Lista de Productos:");
        List<Producto> productos = inventario.listarProductos();
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            productos.forEach(System.out::println);
        }
    }

    private static void eliminarProducto(Scanner scanner, Inventario inventario) {
        System.out.print("Ingrese el ID del producto a eliminar: ");
        int id = scanner.nextInt();
        boolean eliminado = inventario.eliminarProductoPorId(id);
        if (eliminado) {
            System.out.println("✅ Producto eliminado con éxito.");
        } else {
            System.out.println("❌ No se encontró producto con ese ID.");
        }
    }
}