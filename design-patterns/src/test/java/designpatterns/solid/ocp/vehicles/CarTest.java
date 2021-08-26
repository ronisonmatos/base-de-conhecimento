package designpatterns.solid.ocp.vehicles;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void testMain() throws Exception {
        Car car = new Car("Azul", "2022", 2.6, 4);
        Assert.assertEquals(car.getMountedVehicle(), "Criando um carro com Interface: Azul 2.6");
    }
}