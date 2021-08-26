package designpatterns.solid.ocp.vehicles;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Getter
@Setter
public class Motorcycle extends Vehicle {
    private String mountedVehicle;
    public Motorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        configureMotorcycle();
    }

    public void configureMotorcycle() {
        setMountedVehicle("Criando uma moto: " + year + " " + engine + " cilindradas");
        startVehicle();
    }
    @Override
    public void startVehicle() {
        log.info(getMountedVehicle());
    }
}
