package org.example;

public class App 
{
    public static void main( String[] args )
    {

        Car car1 = new Car("Toyota", 80, 15);
        Car car2 = new Car("Audi", 110, 10);
        Car car3 = new Car("Tesla", 90, 40);

        Bicycle bike1 = new Bicycle("Scott", 25, 8);
        Bicycle bike2 = new Bicycle("Giant", 20, 6);

        Movable[] movableVehicles = {car1, car2, car3, bike1, bike2};

        System.out.println("Демонстрация движения");
        for (Movable vehicle : movableVehicles) {
            vehicle.move();
        }

        System.out.println("\nДемонстрация заправки");
        Refuelable[] refuelableVehicles = {car1, car2, car3, bike1, bike2};
        for (Refuelable vehicle : refuelableVehicles) {
            vehicle.refuel(20);
        }

        System.out.println("\nДемонстрация остановки");
        for (Movable vehicle : movableVehicles) {
            vehicle.stop();
        }
    }
}
