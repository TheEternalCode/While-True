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
    mostrarMensaje("Presione:\n");
    mostrarMensaje("1. para agregar un nuevo matriculado.\n");
    mostrarMensaje("2. para Modificar un matriculado.\n");
    mostrarMensaje("3. Para eliminar un matriculado.\n");
    mostrarMensaje("4. Para generar la lista de mayores de 5 años.\n");
    opcion=sc.nextInt();
    sc.nextLine();
    if(opcion ==1){
        matriculado.agregarMatriculado();
    }
    
    else if(opcion ==2){
        mostrarMensaje("Ingrese el id del matriculado.");
        String modificar= sc.nextLine();
        modificarEstudiante(modificar);
    }
    
    else if(opcion ==3){
        mostrarMensaje("Ingrese el id del matriculado.");
        String eliminar= sc.nextLine();
        eliminarEstudiante(eliminar);
    }
    
    else if(opcion ==4){
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

    public void eliminarEstudiante(String idEstudianteEliminar){

    for (int i = listaMatriculados.size() - 1; i >= 0; i--) {
      if (listaMatriculados.get(i).getId().equals(idEstudianteEliminar)){
        listaMatriculados.remove(i);
        mostrarMensaje("Matriculado eliminado exitosamente.\n");
        break;
      }
    }
    confirmacion();
  }

  public void modificarEstudiante(String idEstudianteEliminar){
    for (int i = listaMatriculados.size() - 1; i >= 0; i--) {
        if (listaMatriculados.get(i).getId().equals(idEstudianteEliminar)){
          mostrarMensaje("Matriculado encontrado, ingrese los nuevos datos\n");
          mostrarMensaje("Ingrese el nuevo nombre: ");
          String nuevoNombre=sc.nextLine();
          mostrarMensaje("Ingrese el nuevo apellido: ");
          String nuevoApellido=sc.nextLine();
          mostrarMensaje("Ingrese el nuevas alergias: ");
          String nuevaAlergia=sc.nextLine();
          mostrarMensaje("Ingrese el nueva edad: ");
          int nuevoEdad=sc.nextInt();
          sc.nextLine();
          mostrarMensaje("Ingrese el nuevo nombre del acudiente de: "+nuevoNombre);
          String nuevoAcudiente=sc.nextLine();
          mostrarMensaje("Ingrese el nuevo número telefónico de: "+nuevoAcudiente);
          String nuevoTelefono=sc.nextLine();
          listaMatriculados.get(i).setNombre(nuevoNombre);
          listaMatriculados.get(i).setApellido(nuevoApellido);
          listaMatriculados.get(i).setAlergias(nuevaAlergia);
          listaMatriculados.get(i).setEdad(nuevoEdad);
          listaMatriculados.get(i).setNombreAcudiente(nuevoAcudiente);
          listaMatriculados.get(i).setTelefono(nuevoTelefono);
          break;
        }
      }
      confirmacion();
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
