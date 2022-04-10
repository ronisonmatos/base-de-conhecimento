package designpatterns.bridge;

import designpatterns.bridge.platforms.*;
import designpatterns.bridge.transmissions.AdvancedLive;
import designpatterns.bridge.transmissions.Live;
import designpatterns.bridge.transmissions.RecordLive;

public class Main {
    public static void main(String[] args){
        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new Facebook());
        startLive(new DisneyPlus());
    }

    public static void startLive(IPlatforms platforms){
      /*
        System.out.println("Aguarde!...");
        Live live = new Live(platforms);
        live.broadcasting();
        live.result();
       */

        /*
         System.out.println("Transmissão avançada... Aguarde!");
         AdvancedLive advancedLive = new AdvancedLive(platforms);
         advancedLive.broadcasting();
         advancedLive.comments();
         advancedLive.subtitle();
         advancedLive.result();
         */

        // Desafio do curso
        System.out.println("Transmissão com gravação... Aguarde!");
        RecordLive recordLive = new RecordLive(platforms);
        recordLive.recordLive();
        recordLive.broadcasting();
        recordLive.result();
    }
}
