package org.example;

public class Cat extends Animal{
    private String color;

    public Cat(String name, int age, double weight, String color){
        super(name, age, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void makeSound(){
        System.out.println("Мяу-мяу!");
    }

    public void purr() {
        System.out.println(getName() + " мурлычет: Муррр");
    }
}
