package designpatterns.solid.ocp.vehicles;

import org.junit.Assert;
import org.junit.Test;

public class MotorcycleTest {
    @Test
    public void testMain() throws Exception {
        Motorcycle motorcycle = new Motorcycle("branca", "2022", 250);
        Assert.assertEquals(motorcycle.getMountedVehicle(), "Criando uma moto: 2022 250.0 cilindradas");
    }

}