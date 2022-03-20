package designpatterns.abstractFactory.factories;

import designpatterns.abstractFactory.aircrafts.Helicopter;
import designpatterns.abstractFactory.aircrafts.IAircraft;
import designpatterns.abstractFactory.landvehicles.ILandVehicle;
import designpatterns.abstractFactory.landvehicles.Motocycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motocycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
