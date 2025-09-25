package evaluacionM4.clases;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> productos;

    //constructor vacío
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    //constructor con parámetros
    public Inventario(List<Producto> productos) {
        this.productos = productos;
    }

    //agregar producto
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    //buscar producto por nombre
    public Producto buscarProductoPorNombre(String nombre){
        for (Producto p: productos){
            if (p.getNombre().equals(nombre)){
                return p;
            }
        }
        return null;
    }

    //eliminar producto por id
    public boolean elimarProductoPorId(int id){
        return productos.removeIf(p -> p.getId() == id);
    }

    //listar producto por id
    public List<Producto> listarProductos(){
        return new ArrayList<>(productos); // se devuelve una copia para no alterar el inventario
    }

    //calcular stock total
    public int calcularStockTotal(){
        return productos.stream().mapToInt(Producto::getCantidad).sum();
    }

    //calcular valor total del inventario
    public double calcularValorTotal(){
        return productos.stream().mapToDouble(p-> p.getPrecio() * p.getCantidad()).sum();
    }
}
