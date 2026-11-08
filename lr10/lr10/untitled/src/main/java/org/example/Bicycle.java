package org.example;

public class Bicycle implements Movable, Refuelable {
    private String brand;
    private int speed;
    private int gearCount;
    private double fuelLevel;

    public Bicycle(String brand, int speed, int gearCount) {
        this.brand = brand;
        this.speed = speed;
        this.gearCount = gearCount;
        this.fuelLevel = 0.0;
    }

    @Override
    public void move() {
        System.out.println("Велосипед " + brand + " едет по велодорожке со скоростью " + speed + " км/ч (передач: " + gearCount + ").");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед " + brand + " остановился с помощью тормозов.");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void refuel(double amount) {
        System.out.println("Велосипед " + brand + " не использует топливо.");
    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }
}