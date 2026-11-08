package org.example;

public class Car {
    private String model;
    private  int year;
    private int horsePower;

    static int totalCars = 0;
    static int totalHorsePower = 0;

    public Car(String model, int year, int horsePower){
        this.model = model;
        this.year = year;
        this.horsePower = horsePower;

        totalCars++;
        totalHorsePower+=horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public static double getAveragePower(){
        return (double) totalHorsePower / totalCars;
    }
}
