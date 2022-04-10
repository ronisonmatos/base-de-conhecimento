package designpatterns.ChainOfResponsibility.middlewares;

public class CheckPermissionMiddleware extends Middleware{
    @Override
    public boolean check(String email, String password) {
        if(email.equals("ronisonmaria@gmail.com")){
            System.out.println("Bem vindo Administrador!");
            return Boolean.TRUE;
        }
        System.out.println("Bem vindo!");
        return checkNext(email, password);
    }
}
