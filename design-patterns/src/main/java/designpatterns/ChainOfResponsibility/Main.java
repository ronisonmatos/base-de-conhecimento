package designpatterns.ChainOfResponsibility;

import designpatterns.ChainOfResponsibility.middlewares.CheckPermissionMiddleware;
import designpatterns.ChainOfResponsibility.middlewares.CheckUserMiddleware;
import designpatterns.ChainOfResponsibility.middlewares.Middleware;
import designpatterns.ChainOfResponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init(){
        server = new Server();
        server.registerUser("ronisonmaria@gmail.com","God!@92Roni%%");
        server.registerUser("user@gmail.com","Dnsdc2512a%%4");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();
        boolean done;

        do{
            System.out.println("Digite o e-mail: ");
            String email = reader.readLine();
            System.out.println("Digite sua senha: ");
            String password = reader.readLine();
            done = server.logIn(email,password);
        }while (!done);
    }
}
