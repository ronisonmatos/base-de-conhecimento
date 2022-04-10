package designpatterns.bridge.platforms;

public class Facebook implements IPlatforms{

    public Facebook(){
        configureRMTP();
        System.out.println("Facebook: Transmissão iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando aplicação");
    }
}
