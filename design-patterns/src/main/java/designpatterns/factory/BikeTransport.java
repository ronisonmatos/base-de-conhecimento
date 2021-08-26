package designpatterns.factory;


import designpatterns.factory.vehicles.Bike;
import designpatterns.factory.vehicles.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
