package designpatterns.abstractFactory.aircrafts;

public class Helicopter implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros ok! - Ligando as hélices");
    }

    @Override
    public void wind() {
        System.out.println("Ventos à 25 km, sudeste, vento ok!");
    }
}
