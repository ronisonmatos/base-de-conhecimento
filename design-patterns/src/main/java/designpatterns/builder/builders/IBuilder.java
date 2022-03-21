package designpatterns.builder.builders;

import designpatterns.builder.components.CarType;
import designpatterns.builder.components.Color;
import designpatterns.builder.components.Engine;
import designpatterns.builder.components.Transmission;

public interface IBuilder {
    void setCarType(CarType carType);
    void setColor(Color color);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}
