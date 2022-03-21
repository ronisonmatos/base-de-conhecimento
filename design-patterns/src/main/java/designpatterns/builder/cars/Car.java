package designpatterns.builder.cars;

import designpatterns.builder.components.CarType;
import designpatterns.builder.components.Color;
import designpatterns.builder.components.Engine;
import designpatterns.builder.components.Transmission;
import lombok.Getter;

@Getter
public class Car {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private  final Color color;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, Color color){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
    }

    public String result(){
        String car = null;
        car = "Car with motor: " + engine.getPower() + "\n";
        car += "Transmission: " + transmission + "\n";
        car += "Color: " + color;
        return car;
    }
}
