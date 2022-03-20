package designpatterns.abstractFactory;

import designpatterns.abstractFactory.app.Application;
import designpatterns.abstractFactory.factories.BoatTransport;
import designpatterns.abstractFactory.factories.ITransportFactory;
import designpatterns.abstractFactory.factories.NineNineTransport;
import designpatterns.abstractFactory.factories.UberTransport;

public class Main {

    public static Application configureApplication(){
        Application app;
        ITransportFactory factory = null;

        String company = "boat";
    /*
        if(company.equals("99")){
            factory = new UberTransport();
        }else{
            factory = new NineNineTransport();
        }
     */

        switch (company){
            case "uber":
                factory = new UberTransport();
                break;
            case "99":
            case "ninenine":
                factory = new NineNineTransport();
                break;
            case "boat":
                factory = new BoatTransport();
                break;
            default:
                System.out.println("Empresa não cadastrada!");
        }
        return  app = new Application(factory);
    }

    public static void main(String[] args){
        Application app = configureApplication();
        app.startRoute();
    }
}
