package co.edu.uniquindio.poo;

//Me grimlock decir completado

public class Moto extends Vehiculo {
    private int cilindro;

    public Moto(String placa, int numPeaje, int cilindro) {
        super(placa, numPeaje);
        this.cilindro = cilindro;
    }

    public int getCilindro() {
        return cilindro;
    }

    public void setCilindro(int cilindro) {
        this.cilindro = cilindro;
    }
@Override
public double calcularTotal(){
    double total= 0;
    double base = 5000;
    if(cilindro>200){
        total= base+2000;
    }else{
        total+= base;
    }
    return total;
}

@Override
public String toString() {
    return "Moto [cilindro=" + cilindro + ", placa=" + placa + ", numPeaje=" + numPeaje + "]";
}
 

}
