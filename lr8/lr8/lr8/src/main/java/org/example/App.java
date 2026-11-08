package org.example;

public class App 
{
    public static void main( String[] args ){
        Animal[] animals = {
                new Dog("Оскар", 2, 21.2, "Овчарка"),
                new Dog("Бим", 10, 23.5, "Ретривер"),
                new Dog("Бобик", 2, 5.3, "Дворняга"),
                new Cat("Дымок", 8, 8.3, "Черный"),
                new Cat("Дуся", 18, 4.1, "Серый")
        };

        for(Animal animal : animals){
            animal.displayInfo();
            animal.makeSound();
        }

        ((Dog) animals[0]).fetch();
        ((Dog) animals[1]).fetch();
        ((Dog) animals[2]).fetch();

        ((Cat) animals[3]).purr();
        ((Cat) animals[4]).purr();
    }
}
