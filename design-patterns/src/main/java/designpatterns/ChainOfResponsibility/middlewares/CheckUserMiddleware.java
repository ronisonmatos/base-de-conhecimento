package designpatterns.ChainOfResponsibility.middlewares;

import designpatterns.ChainOfResponsibility.server.Server;

public class CheckUserMiddleware extends Middleware{
    private Server server;

    public CheckUserMiddleware(Server server){
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {

        if(isEmailFailed(email)){
            System.out.println("E-mail Inválido");
            return Boolean.FALSE;
        }

        if(isFailedUserAuthentication(email, password)){
            System.out.println("E-mail ou Senha Inválidos");
            return Boolean.FALSE;
        }
        return checkNext(email, password);
    }

    private boolean isFailedUserAuthentication(String email, String password) {
        return !server.isValidPassword(email, password);
    }

    private boolean isEmailFailed(String email) {
        return !server.hasEmail(email);
    }
}
