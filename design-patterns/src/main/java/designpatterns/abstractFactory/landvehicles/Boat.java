package designpatterns.abstractFactory.landvehicles;

public class Boat implements ILandVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando navegação.");
    }

    @Override
    public void getCargo() {
        System.out.println("Já coletamos a carga!");
    }
}
