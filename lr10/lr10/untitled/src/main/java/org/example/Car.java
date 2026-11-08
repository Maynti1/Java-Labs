package org.example;

public class Car implements Movable, Refuelable{
    private String brand;
    private int speed;
    private double fuelLevel;

    public Car(String brand, int speed, double fuelLevel) {
        this.brand = brand;
        this.speed = speed;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void move() {
        System.out.println("Автомобиль " + brand + " едет со скоростью " + speed + " км/ч.");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль " + brand + " остановился.");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println("Автомобиль " + brand + " заправлен на " + amount + " л. Текущий уровень топлива: " + fuelLevel + " л.");
    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }
}