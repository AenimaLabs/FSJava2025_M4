package empresaEmpleados.clases;

public class Empleado {
    private String nombre;
    private int id;
    private double salarioBase;

    //constructor
    public Empleado() {
    }

    //constructor sobrecargado
    public Empleado(String nombre, int id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    //getters y setters
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //metodo para calcular salario
    public double calcularSalarioTotal() {
        return salarioBase*160;
    }

    //metodo para mostrar informacion del empleado
    public String mostrarInformacion() {
        return "Nombre: " + nombre + "\n" + "ID: " + id + "\n" + "Salario base: " + salarioBase + "\n" + "Salario total: " + calcularSalarioTotal();
    }
}
