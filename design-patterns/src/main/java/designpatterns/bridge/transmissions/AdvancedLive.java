package designpatterns.bridge.transmissions;

import designpatterns.bridge.platforms.IPlatforms;

public class AdvancedLive extends Live{
    public AdvancedLive(IPlatforms platforms) {
        super(platforms);
    }

    public void subtitle(){
        System.out.println("Legenda ativada na Transmisão!");
    }

    public void comments(){
        System.out.println("Comentários liberados na live");
    }
}
