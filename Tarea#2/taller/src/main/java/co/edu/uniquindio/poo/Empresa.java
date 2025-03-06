package co.edu.uniquindio.poo;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Empresa {
    private String nombre;
    private String nit;
    private Empleado[] listEmpleados;
    private HashMap<String, Double> salariosBase;

    public Empresa(String nombre, String nit){
        this.nombre=nombre;
        this.nit=nit;
        this.listEmpleados=new Empleado[50];
        salariosBase = new HashMap<>();
    }

public void agregarEmpleado(){
    int espacioLibre=buscarEspacio();
    if(espacioLibre != -1){
    JOptionPane.showMessageDialog(null, "Bienvenido al sistema de registro de "+nombre);
    String nombreEmpleado= JOptionPane.showInputDialog("Por favor, ingrese el nombre completo del Empleado: ");
    String cargoEmpleado= JOptionPane.showInputDialog("Por favor, ingrese el cargo de "+nombreEmpleado+" :");
    String cedulaEmpleado= JOptionPane.showInputDialog("Por favor, ingrese el número de cédula de  "+nombreEmpleado+" : ");
    int tiempoEnLaEmpresa=Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese el tiempo que ha trabajado  "+nombreEmpleado+" en la empresa: "));
    JOptionPane.showMessageDialog(null, "Registrando empleado . . .");
    double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario base para el Empleado"));
    Empleado empleado= new Empleado(nombreEmpleado,cargoEmpleado,cedulaEmpleado,tiempoEnLaEmpresa,salarioBase);
        listEmpleados[espacioLibre]=empleado;
    
    } else{
        JOptionPane.showMessageDialog(null, "Error 101, no se ha encontrado espacio disponible en la lista para almacenar este empleado. ");
    } 
}

public void buscarEmpleado(){
    String busqueda= JOptionPane.showInputDialog("Ingrese el número de cédula que desea buscar: ");
    boolean encontrado= false;
    for(int i = 0; i < listEmpleados.length;i++){
        if(listEmpleados[i]!=null && listEmpleados[i].getCedula().equals(busqueda)){
            JOptionPane.showMessageDialog(null, "Empleado encontrado\n"+listEmpleados[i]);
            encontrado=true;
            break;
        }
    }if(!encontrado){
        JOptionPane.showMessageDialog(null, "No se ha podido encontrar al empleado con el número de cédula: " + busqueda);
    } 
}

public boolean eliminarEmpleado(String cedula){
    for(int i = 0; i < listEmpleados.length;i++){
        if(listEmpleados[i]!= null && listEmpleados[i].getCedula().equals(cedula)){
            listEmpleados[i]=null;
            JOptionPane.showMessageDialog(null, "El empleado ha sido eliminado exitosamente.");
            return true;

        }

    }
    JOptionPane.showMessageDialog(null, "No se encontró un empleado con esa cédula.");
    return false;
}

public boolean modificarEmpleado(String cedula){
    for(int i = 0; i < listEmpleados.length;i++){
        if(listEmpleados[i]!= null && listEmpleados[i].getCedula().equals(cedula)){
            String nuevoNombre=JOptionPane.showInputDialog("Por favor, ingrese el nuevo nombre completo del Empleado: ");
            String nuevoCargo=JOptionPane.showInputDialog("Por favor, ingrese el nuevo cargo del Empleado: ");
            int nuevoTiempo=Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese el nuevo tiempo trabajado en la empresa del Empleado: "));
            listEmpleados[i].setNombre(nuevoNombre);
            listEmpleados[i].setCargo(nuevoCargo);
            listEmpleados[i].setTiempoEnEmpresa(nuevoTiempo);
            return true;
        }
    }
    JOptionPane.showMessageDialog(null, "No se encontró un empleado con esa cédula.");
    return false;
}

public int buscarEspacio(){
    for(int i = 0; i < listEmpleados.length;i++){
        if(listEmpleados[i]==null){
            return i;
        }
    }
    return-1;
}

public void calcularSalario(){
    for(int i = 0; i < listEmpleados.length;i++){
        if(listEmpleados[i]!=null){
            double aumento=0;
            if(listEmpleados[i].getTiempoEnEmpresa()>3 && listEmpleados[i].getTiempoEnEmpresa()<5){
                aumento= 0.05;
            }else if(listEmpleados[i].getTiempoEnEmpresa()>5 && listEmpleados[i].getTiempoEnEmpresa()<10){
                aumento= 0.10;
            }else if(listEmpleados[i].getTiempoEnEmpresa()>10){
                aumento= 0.15;
               
            } if(aumento>0){
                double nuevoSalario = listEmpleados[i].getSalarioBase() * (1 + aumento);
                listEmpleados[i].setSalarioBase(nuevoSalario);
            }
        } 
    }

}



public void fundacionEmpresa(){
    JOptionPane.showMessageDialog(null, "Bienvenido al menú de creación de empresas");
    nombre= JOptionPane.showInputDialog("Por favor, ingrese el nombre de la empresa: ");
    nit= JOptionPane.showInputDialog("Por favor, ingrese el nit de "+nombre+" :");
}

public void mostrarEmpleados(){
    for(int i = 0; i < listEmpleados.length;i++){
        if(listEmpleados[i]!= null){ 
        JOptionPane.showMessageDialog(null, listEmpleados[i].toString());
    }
    }
}

public void menu(){
    int opcion;
    do {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al menú de " + nombre + "!\n"
                + "1. Ingresar un nuevo empleado\n"
                + "2. Buscar un empleado\n"
                + "3. Modificar un empleado\n"
                + "4. Eliminar un empleado\n"
                + "5. Calcular el salario total\n"
                + "6. Mostrar lista de empleados\n"
                + "7. Cerrar el programa\n"
                + "Ingrese su opción:"));

        switch(opcion){
            case 1:
                agregarEmpleado();
                break;

            case 2:
                buscarEmpleado();
                break;

            case 3:
                String cedulaBuscar = JOptionPane.showInputDialog("Ingrese la cédula del empleado a modificar:");
                modificarEmpleado(cedulaBuscar);
                break;

            case 4:
                String cedulaBuscarEliminar = JOptionPane.showInputDialog("Ingrese la cédula del empleado a eliminar:");
                eliminarEmpleado(cedulaBuscarEliminar);
                break;

            case 5:
                calcularSalario();
                break; 

            case 6:
                mostrarEmpleados();;
                break;

            case 7:
            JOptionPane.showMessageDialog(null, "Saliendo del programa...");
            System.exit(0);
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida, intente nuevamente.");
        }
    } while(opcion != 7);
}

public void datosDePrueba() {
    listEmpleados[0] = new Empleado("Juan Pérez", "Gerente", "12345678", 6, 5000);
    listEmpleados[1] = new Empleado("María Gómez", "Secretaria", "87654321", 4, 3000);
    listEmpleados[2] = new Empleado("Carlos Rodríguez", "Analista", "11223344", 2, 4000);
    listEmpleados[3] = new Empleado("Laura Torres", "Desarrollador", "44332211", 7, 4500);
    listEmpleados[4] = new Empleado("Pedro López", "Técnico", "56789012", 10, 3500);
    
    JOptionPane.showMessageDialog(null, "Se han cargado datos de prueba.");
}

}
