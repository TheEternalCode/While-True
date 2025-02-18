package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private String apellido;
    private String id;
    private String puesto;
    private String correo;
    private String telefono;
    private String fechaContratacion;
    Scanner sc = new Scanner(System.in);

public Empleado (String nombre, String apellido, String id, String puesto, String correo, String telefono, String fechaContratacion){
    this.nombre=nombre;
    this.apellido=apellido;
    this.id=id;
    this.puesto=puesto;
    this.correo=correo;
    this.telefono=telefono;
    this.fechaContratacion=fechaContratacion;
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

public String getPuesto() {
    return puesto;
}

public void setPuesto(String puesto) {
    this.puesto = puesto;
}

public String getCorreo() {
    return correo;
}

public void setCorreo(String correo) {
    this.correo = correo;
}

public String getTelefono() {
    return telefono;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}

public String getFechaContratacion() {
    return fechaContratacion;
}

public void setFechaContratacion(String fechaContratacion) {
    this.fechaContratacion = fechaContratacion;
}

public void mostrarMensaje(String mensaje){
    System.out.println(mensaje);
}
//Registro de empleado

public void agregarEmpleado(){
    mostrarMensaje("Ingrese el nombre del empleado: ");
    nombre=sc.nextLine();
    mostrarMensaje("Ingrese el apellido del empleado: ");
    apellido=sc.nextLine();
    mostrarMensaje("Ingrese el número de identificación del empleado: ");
    id=sc.nextLine();
    mostrarMensaje("Ingrese el puesto del empleado: ");
    puesto=sc.nextLine();
    mostrarMensaje("Ingrese el correo del empleado: ");
    correo=sc.nextLine();
    mostrarMensaje("Ingrese el número telefónico del empleado: ");
    telefono=sc.nextLine();
    mostrarMensaje("Ingrese la fecha de contratación del empleado: ");
    fechaContratacion=sc.nextLine();
    }

public void mostrarEmpleado(){
    mostrarMensaje("\n");
    mostrarMensaje("Nombre: "+nombre);
    mostrarMensaje("Apellido: "+apellido);
    mostrarMensaje("Número de identificación: "+id);
    mostrarMensaje("Puesto: "+puesto);
    mostrarMensaje("Correo electrónico: "+correo);
    mostrarMensaje("Número telefónico: "+telefono);
    mostrarMensaje("Fecha de contratación: "+fechaContratacion);
}

@Override
public String toString() {
    return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", puesto=" + puesto + ", correo="
            + correo + ", telefono=" + telefono + ", fechaContratacion=" + fechaContratacion + ", sc=" + sc + "]";
}








}
