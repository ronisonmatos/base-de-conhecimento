package designpatterns.abstractFactory.app;

import designpatterns.abstractFactory.aircrafts.IAircraft;
import designpatterns.abstractFactory.factories.ITransportFactory;
import designpatterns.abstractFactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
    }

}
