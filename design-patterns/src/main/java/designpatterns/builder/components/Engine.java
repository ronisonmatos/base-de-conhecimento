package designpatterns.builder.components;

import lombok.Getter;

public class Engine {

    @Getter
    private int power;

    public Engine(int power){
        this.power = power;
    }
}
