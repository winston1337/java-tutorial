package Inheritance;

public class Main {
    public static void main(String[] args) {
        // inheritance is a process by which one class acquires another
        //classes attributes and methods

        Car car = new Car();
        car.go();

        Bicycle bike = new Bicycle();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(car.doors);

        System.out.println(bike.pedals);
    }
}