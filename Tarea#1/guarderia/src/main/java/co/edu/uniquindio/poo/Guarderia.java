package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guarderia {
    private List<Matriculado> listaMatriculados;
    Scanner sc= new Scanner(System.in);
    
    public Guarderia(){
        this.listaMatriculados=new ArrayList<>();
    }
    

public List<Matriculado> getListaMatriculados() {
        return listaMatriculados;
    }

    public void agregarMatriculadoALista(Matriculado matriculado) {
        listaMatriculados.add(matriculado);
    }
public void setListaMatriculados(List<Matriculado> listaMatriculados) {
        this.listaMatriculados = listaMatriculados;
    }

//Función de Arranque.
public void startUp(){
    Matriculado inicio= new Matriculado(null, null, null, null, 0, null, null, null, null, this);
    inicio.agregarMatriculado();

} 
//Confirmación para agregar un nuevo niñ@ o iniciar el proceso de creación de la lista
public void confirmacion(){
    Matriculado matriculado= new Matriculado(null, null, null, null, 0, null, null, null, null, this);
    int opcion;
    mostrarMensaje("Desea agregar otro matriculado? 1: Si 0:No");
    opcion=sc.nextInt();
    sc.nextLine();
    if(opcion ==1){
        matriculado.agregarMatriculado();
    }else if(opcion ==0){
        mostrarMensaje("\n");
        mostrarMensaje("Cerrando opción de registro. . . \n");
        mostrarMensaje("\n");
        mostrarMensaje("Iniciando proceso de generación de lista. . . \n");
        generarListaMayores();
    }else{
        mostrarMensaje("Opción no válida, intente nuevamente.");
        confirmacion();
    }
}
public void generarListaMayores(){
    mostrarMensaje("Lista de matriculados:");
    for (Matriculado m : listaMatriculados) {
        if(m.getEdad()> 5){
            m.mostrarMatriculado();
        }
     }
}




    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
        }

       //Para Mostrar a Todos
        public void generarLista(){
            mostrarMensaje("Lista de matriculados:");
            for (Matriculado m : listaMatriculados) {
                m.mostrarMatriculado();}
        }
    
}
