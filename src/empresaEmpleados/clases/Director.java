package empresaEmpleados.clases;

public class Director extends Gerente{
    private double acciones;

    //constructor
    public Director() {
        super();
    }

    //constructor sobrecargado
    public Director(String nombre, int id, double salarioBase, double bono, double acciones) {
        super(nombre, id, salarioBase, bono);
        this.acciones = acciones;
    }

    //getters y setters
    public double getAcciones() {
        return acciones;
    }

    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + getBono() + acciones;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\n" + "Acciones: " + acciones;
    }
}
