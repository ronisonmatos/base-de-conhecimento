package designpatterns.builder.builders;

import designpatterns.builder.cars.Truck;
import designpatterns.builder.components.CarType;
import designpatterns.builder.components.Color;
import designpatterns.builder.components.Engine;
import designpatterns.builder.components.Transmission;

public class TruckBuilder implements IBuilder{
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setColor(Color color) {

    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Truck getResult(){
        return new Truck(carType,seats,engine,transmission);
    }
}
