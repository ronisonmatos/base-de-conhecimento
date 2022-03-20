package designpatterns.abstractFactory.factories;

import designpatterns.abstractFactory.aircrafts.IAircraft;
import designpatterns.abstractFactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
