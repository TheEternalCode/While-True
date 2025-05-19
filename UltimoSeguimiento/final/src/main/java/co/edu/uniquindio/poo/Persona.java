package co.edu.uniquindio.poo;

//Me grimlock decir completado

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String id;
    protected String bDay;
    public Persona(String nombre, String apellido, String id, String bDay) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.bDay = bDay;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getbDay() {
        return bDay;
    }
    public void setbDay(String bDay) {
        this.bDay = bDay;
    }

}
