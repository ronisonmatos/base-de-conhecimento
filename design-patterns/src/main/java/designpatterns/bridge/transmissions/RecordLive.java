package designpatterns.bridge.transmissions;

import designpatterns.bridge.platforms.IPlatforms;

public class RecordLive extends Live{
    public RecordLive(IPlatforms platforms) {
        super(platforms);
    }

    public void recordLive(){
        System.out.println("Gravação iniciada");
    }
}
