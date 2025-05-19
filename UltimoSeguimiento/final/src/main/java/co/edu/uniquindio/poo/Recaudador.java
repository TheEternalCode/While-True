package co.edu.uniquindio.poo;

//Me grimlock decir completado

public class Recaudador extends Persona {
    private double sueldo;

    public Recaudador(String nombre, String apellido, String id, String bDay, double sueldo) {
        super(nombre, apellido, id, bDay);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
