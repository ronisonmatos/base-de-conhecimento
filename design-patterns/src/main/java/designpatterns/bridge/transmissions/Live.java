package designpatterns.bridge.transmissions;

import designpatterns.bridge.platforms.IPlatforms;

public class Live implements ITransmission {

    //Obs: Abstração

    protected IPlatforms platforms;

    public Live(IPlatforms platforms){
        this.platforms = platforms;
    }

    @Override
    public void broadcasting() {
        System.out.println("Iniciando a transmissão");
    }

    @Override
    public void result() {
        System.out.println("** No Ar **");
    }
}
