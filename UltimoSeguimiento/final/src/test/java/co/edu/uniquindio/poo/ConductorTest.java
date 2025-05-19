package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConductorTest {
 
    @Test
    public void testAgregarVehiculos() {
        Conductor conductor = new Conductor("Grimlock", "King", "12345", "01-01-1990");

        Auto auto = new Auto("ABC123", 1, 2);
        Moto moto = new Moto("XYZ789", 2, 250);
        Camion camion = new Camion("CAM456", 3, 4, 12.0);

        conductor.agregarVehiculo(auto);
        conductor.agregarVehiculo(moto);
        conductor.agregarVehiculo(camion);

        assertEquals(3, conductor.getVehiculos().size(), "Debe tener 3 vehículos");
        assertTrue(conductor.getVehiculos().contains(auto), "Debe contener el auto");
        assertTrue(conductor.getVehiculos().contains(moto), "Debe contener la moto");
        assertTrue(conductor.getVehiculos().contains(camion), "Debe contener el camión");
    }
}
