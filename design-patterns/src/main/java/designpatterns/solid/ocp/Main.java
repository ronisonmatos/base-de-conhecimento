package designpatterns.solid.ocp;

import designpatterns.solid.ocp.vehicles.Car;
import designpatterns.solid.ocp.vehicles.Motorcycle;
import lombok.extern.log4j.Log4j;

/*
 * OCP: Princípio do Aberto/Fechado (Open-Closed Principle) Bertrand Meyer popularizou este princípio na
década de 1980. Em essência, para que os sistemas de software sejam fáceis de mudar, eles devem ser projetados
de modo a permitirem que o comportamento desses sistemas mude pela ADIÇÃO de um novo código em vez da
alteração do código existente.*/

@Log4j
public class Main {
    private static TypeVehicle typeVehicle;
    public static Car car;
    public static Motorcycle motorcycle;

    public static void main(String[] args) {
        typeVehicle = TypeVehicle.CAR;
        makeVehicle(typeVehicle);
    }

    public static void makeVehicle(TypeVehicle typeVehicle) {
        if (typeVehicle == TypeVehicle.CAR) {
            car = new Car("Azul", "2022", 2.6, 4);
        } else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
            /*
             *  Vehicle vehicle = new Vehicle("","2022",250,1);
             * 	vehicle.motorcycle();
             */
            motorcycle = new Motorcycle("branca", "2022", 250);
        } else {
            log.info("Não é um tipo de veículo cadastrado");
        }
    }
}
