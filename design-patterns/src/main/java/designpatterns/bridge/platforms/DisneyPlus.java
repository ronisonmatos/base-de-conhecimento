package designpatterns.bridge.platforms;

public class DisneyPlus implements IPlatforms{
    public DisneyPlus(){
        configureRMTP();
        System.out.println("DisneyPlus: Transmissão iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DisneyPlus: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: Autorizando aplicação");
    }
}
