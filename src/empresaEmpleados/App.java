package empresaEmpleados;

import empresaEmpleados.clases.Director;
import empresaEmpleados.clases.Empleado;
import empresaEmpleados.clases.Gerente;

public class App {
    public static void main(String[] args) {
        //Instanciar un empleado
        Empleado empleado = new Empleado("Juan", 1, 1000);

        //Instanciar un gerente
        Gerente gerente = new Gerente("Pedro", 2, 2000, 500);

        //Instanciar un director
        Director director = new Director("Maria", 3, 3000, 1000, 10);

        //Mostrar informacion de los empleados
        System.out.println(empleado.mostrarInformacion());
        System.out.println(gerente.mostrarInformacion());
        System.out.println(director.mostrarInformacion());
    }
}
