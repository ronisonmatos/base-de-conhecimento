package designpatterns.solid.ocp;

import designpatterns.solid.ocp.vehicles.Car;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testMain() throws Exception {
        Car car = new Car("Azul", "2022", 2.6, 4);
        //Motorcycle motorcycle = new Motorcycle("branca", "2022", 250);
        //makeVehicle(TypeVehicle.CAR);
        Assert.assertEquals(car.getMountedVehicle(), "Criando um carro com Interface: Azul 2.6");
        // Ainda não é o teste que eu quero, pois quero testar a lógica da classe main
    }
}