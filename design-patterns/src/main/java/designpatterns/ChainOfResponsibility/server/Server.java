package designpatterns.ChainOfResponsibility.server;

import designpatterns.ChainOfResponsibility.middlewares.Middleware;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter
public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    public boolean logIn(String email, String password){
        if(middleware.check(email,password)){
            System.out.println("Usuário autenticado com sucesso!");
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public void registerUser(String email, String password){
        users.put(email, password);
    }

    public boolean hasEmail(String email){
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password){
        return users.get(email).equals(password);
    }
}
