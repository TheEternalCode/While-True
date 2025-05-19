package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Estacion {
    private String nombre;
    private String id;
    private double recoleccion;
    private List<Vehiculo> listVehiculosPasaron= new LinkedList<Vehiculo>();
    private List<Conductor> listConductores= new LinkedList<Conductor>();
    private List<Recaudador> listRecaudador= new LinkedList<Recaudador>();

    public Estacion(String nombre, String id, double recoleccion) {
        this.nombre = nombre;
        this.id = id;
        this.recoleccion = recoleccion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getRecoleccion() {
        return recoleccion;
    }
    public void setRecoleccion(double recoleccion) {
        this.recoleccion = recoleccion;
    }
    public List<Vehiculo> getListVehiculo() {
        return listVehiculosPasaron;
    }
    public void setListVehiculo(List<Vehiculo> listVehiculo) {
        this.listVehiculosPasaron = listVehiculo;
    }
    public List<Vehiculo> getListVehiculosPasaron() {
        return listVehiculosPasaron;
    }
    public void setListVehiculosPasaron(List<Vehiculo> listVehiculosPasaron) {
        this.listVehiculosPasaron = listVehiculosPasaron;
    }
    public List<Conductor> getListConducto() {
        return listConductores;
    }
    public void setListConducto(List<Conductor> listConducto) {
        this.listConductores = listConducto;
    }
    public List<Recaudador> getListRecaudador() {
        return listRecaudador;
    }
    public void setListRecaudador(List<Recaudador> listRecaudador) {
        this.listRecaudador = listRecaudador;
    }

    //Funcionalidades

    public void agregarVehiculo(Vehiculo vehiculo){
        listVehiculosPasaron.add(vehiculo);
        double peaje = vehiculo.calcularTotal();
        recoleccion+= peaje;
        System.out.println("Vehículo registrado. Peaje pagado: $" + peaje);
    }
    
    public void imprimirResumen() {
        System.out.println("----- VEHÍCULOS QUE PASARON -----");
        for (Vehiculo v : listVehiculosPasaron) {
            System.out.println(v.toString() + ", Peaje: $" + v.calcularTotal());
        }
        System.out.println("TOTAL RECAUDADO: $" + recoleccion);
    }

public Recaudador buscarRecaudador(String nombreBuscar, String apellidoBuscar){
    for(Recaudador r: listRecaudador){
        if(nombreBuscar.equals(r.getNombre()) && apellidoBuscar.equals(r.getApellido())){
                return r;
        }
    }
    return null;
}
public List<Conductor> obtenerConductoresCamionCargaAlta() {
    List<Conductor> listaFiltrada = new LinkedList<>();
    for (Conductor c : listConductores) {
        for (Vehiculo v : c.getVehiculos()) {
            if (v instanceof Camion) {
                Camion cam = (Camion) v;
                if (cam.getCarga() > 10) {
                    listaFiltrada.add(c);
                    break; 
                }
            }
        }
    }
    return listaFiltrada;
}
 public void agregarConductor(Conductor conductor){
        listConductores.add(conductor);
    }
    public void agregarRecaudador(Recaudador recaudador){
        listRecaudador.add(recaudador);
    }
 
    public Vehiculo buscarVehiculo(String placa){
    for(Vehiculo v: listVehiculosPasaron){
        if(placa.equals(v.getPlaca())){
                return v;
        }
    }
    return null;
}

public double calcularTotalRecaudado() {
    double total = 0;
    for (Vehiculo v : listVehiculosPasaron) {
        total += v.calcularTotal();
    }
    return total;
}
    
   
}
