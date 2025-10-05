package evaluacionM4.test;

import evaluacionM4.clases.Inventario;
import evaluacionM4.clases.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InventarioTest {

    private Inventario inventario;

    @BeforeEach
    void setUp() {
        inventario = new Inventario();
    }

    @Test
    void testAgregarProducto() {
        Producto p = new Producto(1, "Laptop", 1000.0, 5);
        inventario.agregarProducto(p);
        assertEquals(1, inventario.listarProductos().size());
        assertEquals(p, inventario.listarProductos().get(0));
    }

    @Test
    void testBuscarProductoPorNombre() {
        Producto p1 = new Producto(1, "Mouse", 25.0, 10);
        Producto p2 = new Producto(2, "Teclado", 50.0, 8);
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);

        Producto encontrado = inventario.buscarProductoPorNombre("mouse");
        assertNotNull(encontrado);
        assertEquals("Mouse", encontrado.getNombre());

        Producto noEncontrado = inventario.buscarProductoPorNombre("Monitor");
        assertNull(noEncontrado);
    }

    @Test
    void testEliminarProductoPorId() {
        Producto p = new Producto(1, "Audífonos", 30.0, 15);
        inventario.agregarProducto(p);

        assertTrue(inventario.eliminarProductoPorId(1));
        assertEquals(0, inventario.listarProductos().size());

        assertFalse(inventario.eliminarProductoPorId(999)); // ID inexistente
    }

    @Test
    void testCalcularStockTotalYValorTotal() {
        inventario.agregarProducto(new Producto(1, "Lápiz", 1.0, 100));
        inventario.agregarProducto(new Producto(2, "Cuaderno", 5.0, 20));

        assertEquals(120, inventario.calcularStockTotal());
        assertEquals(200.0, inventario.calcularValorTotal(), 0.01); // 100*1 + 20*5 = 200
    }
}
