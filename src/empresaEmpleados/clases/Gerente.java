package empresaEmpleados.clases;

public class Gerente extends Empleado{

    private double bono;

    //constructor

    public Gerente() {
    }

    public Gerente(String nombre, int id, double salarioBase, double bono) {
        super(nombre, id, salarioBase);
        this.bono = bono;
    }

    //getters y setters
   public double getBono() {
        return bono;
   }

   //Sobrescribir el metodo calcularSalarioTotal
   @Override
    public double calcularSalarioTotal() {
        return super.calcularSalarioTotal() + bono;
   }

   //Sobrescribir el metodo mostrarInformacion
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\n" + "Bono: " + bono;
    }
}
