package designpatterns.builder.cars;

import designpatterns.builder.components.CarType;
import designpatterns.builder.components.Engine;
import designpatterns.builder.components.Transmission;
import lombok.Getter;

@Getter
public class Truck {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;

    public Truck(CarType carType, int seats, Engine engine, Transmission transmission){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String result(){
        String truck = "Truck with motor: " + engine.getPower() + "\n";
        truck += "Transmission: " + transmission;
        return truck;
    }

}
