package designpatterns.ChainOfResponsibility.middlewares;

import java.util.Objects;

public abstract class Middleware {

    private Middleware next;

    public Middleware linkWith(Middleware next){
        this.next = next;
        return next;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password){
        if(Objects.isNull(next)){
            return Boolean.TRUE;
        }
        return next.check(email, password);
    }
}
