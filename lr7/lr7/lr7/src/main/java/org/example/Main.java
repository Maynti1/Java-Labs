package org.example;

public class Main
{
    public static void main( String[] args ){
        Car car1 = new Car("Audi", 2026, 300);
        Car car2 = new Car("BMW", 2022, 250);
        Car car3 = new Car("БелАЗ", 2020, 4600);
        Car car4 = new Car("Lada", 2026, 150);
        Car car5 = new Car("Xiaomi", 2026, 1000);

        System.out.println("Средняя мощность: " + Car.getAveragePower() + " лс");
    }
}
