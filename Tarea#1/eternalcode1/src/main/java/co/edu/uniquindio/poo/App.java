package co.edu.uniquindio.poo;

/**Observación: Dado que el enunciado especifíca que será UN solo empleado, el programa solo almacena la información de un empleado.
**/
public class App {
    public static void main(String[] args) {
        Empleado nuevoEmpleado= new Empleado(null, null, null, null, null, null, null);
        nuevoEmpleado.agregarEmpleado();
        nuevoEmpleado.mostrarEmpleado();
    }
}
