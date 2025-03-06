package co.edu.uniquindio.poo;

public class Empleado {
    private String nombre;
    private String cargo;
    private String cedula;
    private int tiempoEnEmpresa;
    private double salarioBase;
    
public Empleado(String nombre, String cargo, String cedula, int tiempoEnEmpresa, double salarioBase) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.cedula = cedula;
        this.tiempoEnEmpresa = tiempoEnEmpresa;
        this.salarioBase=salarioBase;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTiempoEnEmpresa() {
        return tiempoEnEmpresa;
    }

    public void setTiempoEnEmpresa(int tiempoEnEmpresa) {
        this.tiempoEnEmpresa = tiempoEnEmpresa;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    @Override
    public String toString() {
        return "Nombre completo: " + nombre +"\n"+ "Cargo: " + cargo +"\n"+ "Cedula: " + cedula +"\n"+ "TiempoEnEmpresa: "
                + tiempoEnEmpresa + "\n"+"El salario base es: "+salarioBase+"\n";
    }
    


    
}
