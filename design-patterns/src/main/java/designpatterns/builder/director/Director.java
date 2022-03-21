package designpatterns.builder.director;

import designpatterns.builder.builders.IBuilder;
import designpatterns.builder.components.CarType;
import designpatterns.builder.components.Color;
import designpatterns.builder.components.Engine;
import designpatterns.builder.components.Transmission;

public class Director {

    public void constructorSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructorTruck(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUECIAL);
        builder.setEngine(new Engine(13000));
    }

    public void constructorPorscheCar(IBuilder builder){
        builder.setCarType(CarType.SPORTCAR);
        builder.setColor(Color.YELLOW);
        builder.setSeats(2);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(4000));
    }

}
