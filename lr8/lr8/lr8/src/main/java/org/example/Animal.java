package org.example;

public class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public void displayInfo() {
        System.out.println("Кличка: " + name + ", Возраст: " + age + " лет, Вес: " + weight + " кг");
    }
}
