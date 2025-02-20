package co.edu.uniquindio.poo;
import java.util.Scanner;

public class Matriculado {

    private String nombre;
    private String apellido;
    private String id;
    private String numeroIdentificacion;
    private String genero;
    private int edad;
    private String nombreAcudiente;
    private String telefono;
    private String alergias;
    Guarderia guarderia= new Guarderia();
    Scanner sc = new Scanner(System.in);

    public Matriculado(String nombre, String apellido, String id, String genero, int edad, String nombreAcudiente,String telefono, String alergias, String numeroIdentificacion, Guarderia guarderia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.genero = genero;
        this.edad = edad;
        this.nombreAcudiente = nombreAcudiente;
        this.telefono = telefono;
        this.alergias = alergias;
        this.numeroIdentificacion=numeroIdentificacion;
        this.guarderia=guarderia;
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
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombreAcudiente() {
        return nombreAcudiente;
    }
    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getAlergias() {
        return alergias;
    }
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    } 
    
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public void agregarMatriculado(){
    mostrarMensaje("Ingrese el nombre del matriculado: ");
    nombre=sc.nextLine();
    mostrarMensaje("Ingrese el apellido del matriculado: ");
    apellido=sc.nextLine();
    mostrarMensaje("Ingrese el número de identificación de "+ nombre+": ");
    numeroIdentificacion=sc.nextLine();
    mostrarMensaje("Ingrese que alergias tiene "+ nombre+": ");
    alergias=sc.nextLine();
    mostrarMensaje("Ingrese el id de "+nombre+": ");
    id=sc.nextLine();
    mostrarMensaje("Ingrese la edad de "+nombre+": ");
    edad=sc.nextInt();
    sc.nextLine();
    mostrarMensaje("Ingrese el genero de "+nombre+": ");
    genero=sc.nextLine();
    mostrarMensaje("Ingrese el nombre del acudiente de "+nombre+": ");
    nombreAcudiente=sc.nextLine();
    mostrarMensaje("Ingrese el número telefónico de "+nombreAcudiente+": ");
    telefono=sc.nextLine();
    guarderia.agregarMatriculadoALista(this);
    guarderia.confirmacion();
    }

    //Posibles función que se pueda utilizar.
    public void mostrarMatriculado(){
        mostrarMensaje("\n");
        mostrarMensaje("Nombre del matriculado es: "+nombre+ " "+apellido);
        mostrarMensaje("Alergias: "+alergias);
        mostrarMensaje("Edad: "+ edad);
        mostrarMensaje("Genero: "+genero);
        mostrarMensaje("Identificación: "+id);
        mostrarMensaje("Nombre del acudiente de: "+nombre+ " "+ apellido+" es: "+nombreAcudiente);
        mostrarMensaje("Número de contacto de "+nombreAcudiente+" : "+telefono);
    }

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
        }
    
    
}
