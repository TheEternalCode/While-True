package co.edu.uniquindio.poo;

//Me grimlock decir completado

public abstract class Vehiculo implements Calculable {
    protected String placa;
    protected int numPeaje;
    public Vehiculo(String placa, int numPeaje) {
        this.placa = placa;
        this.numPeaje = numPeaje;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getNumPeaje() {
        return numPeaje;
    }
    public void setNumPeaje(int numPeaje) {
        this.numPeaje = numPeaje;
    }

  public abstract double calcularTotal();
  
  @Override
  public String toString() {
    return "Vehiculo [placa=" + placa + ", numPeaje=" + numPeaje + "]";
  }  
  
}
