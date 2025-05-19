package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class EstacionTest {
 Estacion estacion = new Estacion("Hola","kjsa",0);

 @Test
public void testImprimirResumen_noException() {
    Estacion estacion = new Estacion("Hola","kjsa",0);
    Vehiculo moto = new Moto("ABC123", 1, 150);
    estacion.agregarVehiculo(moto);
    // Solo que no lance excepción
    estacion.imprimirResumen();
}

@Test
void testBuscarRecaudadorPorId() {
    Recaudador r= new Recaudador("Lenny", "Summers", "'8212'", "1978", 0);
    estacion.agregarRecaudador(r);

    Recaudador resultado = estacion.buscarRecaudador("Lenny","Summers");

    assertNotNull(resultado);
    assertEquals("Lenny", resultado.getNombre());
    assertEquals("Summers", resultado.getApellido());
}
@Test
public void testBuscarVehiculoPorTipo() {
    Vehiculo auto = new Auto("DEF456", 2, 1);
    Vehiculo moto = new Moto("GHI789", 1, 100);
    Conductor conductor= new Conductor(null, null, null, null);
    conductor.agregarVehiculo(auto);
    conductor.agregarVehiculo(moto);
    List<Vehiculo> resultado = conductor.obtenerVehiculosPorTipo("Moto");
    assertEquals(1, resultado.size());
    assertTrue(resultado.get(0) instanceof Moto);
}
@Test
public void testBuscarVehiculoPorPlaca() {
    Vehiculo camion = new Camion("JKL321", 3, 4, 800);
    estacion.agregarVehiculo(camion);
    Vehiculo resultado = estacion.buscarVehiculo("JKL321");
    assertNotNull(resultado);
    assertEquals("JKL321", resultado.getPlaca());
}
@Test
public void testCalcularTotalRecaudado() {
    Vehiculo moto = new Moto("ABC123", 1, 250); // 7000
    Vehiculo auto = new Auto("DEF456", 2, 1);   // 11500
    estacion.agregarVehiculo(moto);
    estacion.agregarVehiculo(auto);

    double total = estacion.calcularTotalRecaudado();

    assertEquals(18500.0, total, 0.001);
}

}
