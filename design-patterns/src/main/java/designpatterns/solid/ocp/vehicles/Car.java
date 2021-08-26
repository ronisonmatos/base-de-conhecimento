package designpatterns.solid.ocp.vehicles;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Getter
@Setter
@Log4j
public class Car implements IVehicleCar {
    private String color;
    private String year;
    private double engine;
    private int seats;
    private String mountedVehicle;

    public Car(String color, String year, double engine, int seats) {
        configureVehicle(color, year, engine, seats);
    }

    @Override
    public void configureVehicle(String color, String year, double engine, int seats) {
        /*this.color = color;
         *this.year = year;
         *this.engine = engine;
         *this.seats = seats;*/
        setColor(color);
        setSeats(seats);
        setYear(year);
        setEngine(engine);
        setMountedVehicle("Criando um carro com Interface: " + getColor() + " " + getEngine());
        startVehicle();
    }

    @Override
    public void startVehicle() {
        log.info(getMountedVehicle());
        log.info("Ligando os Motores com Interface");
    }
}
