package org.example;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, int age, double weight, String breed){
        super(name, age, weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void makeSound(){
        System.out.println("Гав-гав!");
    }

    public void fetch(){
        System.out.println(getName() + " приносит палку!");
    }
}
