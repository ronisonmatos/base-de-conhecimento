package designpatterns.builder;

import designpatterns.builder.builders.CarBuilder;
import designpatterns.builder.builders.TruckBuilder;
import designpatterns.builder.cars.Car;
import designpatterns.builder.cars.Truck;
import designpatterns.builder.director.Director;

public class Main {

    public static void main(String[] args){
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructorSedanCar(builder);
        Car car = builder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructorTruck(truckBuilder);
        Truck truck = truckBuilder.getResult();
        System.out.println("Caminhão: " + truck.result());

        // Exercício
        CarBuilder builderPorche = new CarBuilder();
        director.constructorPorscheCar(builderPorche);
        Car carPorche = builderPorche.getResult();
        System.out.println(carPorche.result());
        System.out.println(carPorche.getCarType() + " produzido com sucesso!");

    }
}
