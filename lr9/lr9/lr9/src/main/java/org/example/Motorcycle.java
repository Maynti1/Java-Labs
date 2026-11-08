package org.example;

public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, int speed, boolean hasSidecar){
        super(brand, year, speed);
        this.hasSidecar = hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    @Override
    public void move() {
        System.out.println("Едет по дороге");
    }

    @Override
    public double fuelConsumption() {
        return 5.5;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Наличие коляски: " + (hasSidecar ? "да" : "нет"));
    }
}
