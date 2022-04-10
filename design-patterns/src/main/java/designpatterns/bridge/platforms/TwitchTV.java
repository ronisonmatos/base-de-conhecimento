package designpatterns.bridge.platforms;

public class TwitchTV implements IPlatforms{

    public TwitchTV(){
        configureRMTP();
        System.out.println("TwitchTV: Transmissão iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: Configurando RMTP");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Validando o Canal");
    }
}
