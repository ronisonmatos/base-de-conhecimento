package designpatterns.factory;


import designpatterns.factory.vehicles.IVehicle;
import designpatterns.factory.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
