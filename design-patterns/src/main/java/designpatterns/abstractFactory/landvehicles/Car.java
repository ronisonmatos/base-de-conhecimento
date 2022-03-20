package designpatterns.abstractFactory.landvehicles;

public class Car implements ILandVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trageto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegando os passageiros");
    }
}
