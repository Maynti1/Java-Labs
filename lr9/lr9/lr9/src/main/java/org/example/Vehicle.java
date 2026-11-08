package org.example;

public abstract class Vehicle {
    private String brand;
    private int year;
    private int speed;

    public Vehicle(String brand, int year, int speed){
        this.brand = brand;
        this.year = year;
        this.speed = speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract void move();
    public abstract double fuelConsumption();

    public void displayInfo() {
        System.out.println("Марка: " + brand + ", Год выпуска: " + year + ", Скорость: " + speed + " км/ч");
    }
}
