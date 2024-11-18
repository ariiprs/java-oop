package programmer.zaman.now.application;

import programmer.zaman.now.data.Avanza;
import programmer.zaman.now.data.Car;

public class CarApp {

    public static void main(String[] args) {

        Car car = new Avanza();

        car.drive();
        System.out.println(car.getBrand());
        System.out.println(car.getTire());
    }
}
