package co.edu.uniquindio.poo;

//Me grimlock decir completado

public class Auto extends Vehiculo {
    private int tipo;

    public Auto(String placa, int numPeaje, int tipo) {
        super(placa, numPeaje);
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
@Override
public double calcularTotal(){
    double base = 10000;
    double total= 0;
    if(tipo> 1){
        double descuento= base * 0.20;
        total= base - descuento;
    } else{
        double incremento= base * 0.15;
        total=base + incremento;
    }
    return total;
}

@Override
public String toString() {
    return "Auto [tipo=" + tipo + ", placa=" + placa + ", numPeaje=" + numPeaje + "]";
}

}
