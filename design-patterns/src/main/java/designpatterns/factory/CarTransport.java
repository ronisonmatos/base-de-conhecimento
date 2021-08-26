package designpatterns.factory;


import designpatterns.factory.vehicles.Car;
import designpatterns.factory.vehicles.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
