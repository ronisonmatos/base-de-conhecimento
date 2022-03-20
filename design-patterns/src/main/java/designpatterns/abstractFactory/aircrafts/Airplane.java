package designpatterns.abstractFactory.aircrafts;

public class Airplane implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros abordos, vôo ok!");
    }

    @Override
    public void wind() {
        System.out.println("Ventos à 25km, vento ok!");
    }
}
