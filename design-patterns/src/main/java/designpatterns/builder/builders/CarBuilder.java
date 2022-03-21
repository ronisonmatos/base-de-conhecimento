package designpatterns.builder.builders;

import designpatterns.builder.cars.Car;
import designpatterns.builder.components.CarType;
import designpatterns.builder.components.Color;
import designpatterns.builder.components.Engine;
import designpatterns.builder.components.Transmission;

public class CarBuilder implements IBuilder{

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private Color color;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
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

    public Car getResult(){
        return new Car(carType,seats,engine,transmission,color);
    }
}
