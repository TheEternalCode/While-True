package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.util.List;

//Me grimlock decir completado

public class Conductor extends Persona {
   private List<Vehiculo> listVehiculo= new LinkedList<Vehiculo>();
 public Conductor(String nombre, String apellido, String id, String bDay) {
        super(nombre, apellido, id, bDay); 
    }

public List<Vehiculo> getVehiculos() {
        return listVehiculo;
    }

public void agregarVehiculo(Vehiculo vehiculo){
    listVehiculo.add(vehiculo);
}

public void mostrarPagosPeaje(){
double total= 0;
for(Vehiculo v: listVehiculo){
    double pago= v.calcularTotal();
    System.out.println("Vehículo: " + v.toString() + " | Pago peaje: $" + pago);
    total+=pago;
}
System.out.println("Total pagado por conductor: $" + total);
}

public List<Vehiculo> obtenerVehiculosPorTipo(String tipo) {
    List<Vehiculo> listaFiltrada = new LinkedList<>();
    for (Vehiculo v : listVehiculo) {
        if (v.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
            listaFiltrada.add(v);
        }
    }
    return listaFiltrada;
}

}
