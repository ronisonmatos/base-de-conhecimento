package designpatterns.abstractFactory.factories;

import designpatterns.abstractFactory.aircrafts.Airplane;
import designpatterns.abstractFactory.aircrafts.IAircraft;
import designpatterns.abstractFactory.landvehicles.ILandVehicle;
import designpatterns.abstractFactory.landvehicles.Boat;

public class BoatTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Boat();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
