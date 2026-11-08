package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Vehicle[] vehicles = {
                new Car("Toyota Camry", 2021, 210, 4),
                new Car("BMW M3", 2023, 250, 4),
                new Car("Porsche 911", 2022, 290, 2),
                new Motorcycle("Ural", 2019, 120, true),
                new Motorcycle("Yamaha R1", 2024, 299, false)
        };

        for(Vehicle vehicle : vehicles){
            vehicle.displayInfo();
            vehicle.move();
            System.out.println("Расход топлива: " + vehicle.fuelConsumption());
            System.out.println();
        }

        //Vehicle vehicle = new Vehicle("Машина1", 2020, 210);
    }
}
