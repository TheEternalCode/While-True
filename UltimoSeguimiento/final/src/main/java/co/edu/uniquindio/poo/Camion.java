package co.edu.uniquindio.poo;

//Me grimlock decir completado

public class Camion extends Vehiculo {
    private int eje;
    private double carga;
    public Camion(String placa, int numPeaje, int eje, double carga) {
        super(placa, numPeaje);
        this.eje = eje;
        this.carga = carga;
    }
    public int getEje() {
        return eje;
    }
    public void setEje(int eje) {
        this.eje = eje;
    }
    public double getCarga() {
        return carga;
    }
    public void setCarga(double carga) {
        this.carga = carga;
    }
@Override
public double calcularTotal(){
    double recargoUno= eje * 7000;
    double total= 0;
    if(carga> 10){
        double recargoDos= recargoUno * 0.10;
        total = recargoDos+ recargoUno;
    } else{
        total+= recargoUno;
    }
    return total;
}
@Override
public String toString() {
    return "Camion [eje=" + eje + ", placa=" + placa + ", carga=" + carga + ", numPeaje=" + numPeaje + "]";
} 

}
