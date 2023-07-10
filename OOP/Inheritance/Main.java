package OOP.Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bike = new Bicycle();

        //! Car can have access to vehicle content since it is inherited (extends Vehicle)
        car.go();

        //! Bicycle can have access to vehicle content since it is inherited (extends Vehicle)
        bike.stop();

        //! Unique attribute
        System.out.println(car.brand);
        //! Unique attribute
        System.out.println(bike.brand);
    }
}
