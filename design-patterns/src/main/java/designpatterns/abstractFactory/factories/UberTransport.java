package designpatterns.abstractFactory.factories;

import designpatterns.abstractFactory.aircrafts.Airplane;
import designpatterns.abstractFactory.aircrafts.IAircraft;
import designpatterns.abstractFactory.landvehicles.Car;
import designpatterns.abstractFactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
