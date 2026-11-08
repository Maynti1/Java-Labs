package org.example;

public class App 
{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Shape("Черный", 0, 0),
                new Circle("Красный", 10, 20, 5.0),
                new Rectangle("Синий", 5, 5, 4.0, 6.0)
        };

        System.out.println("Демострация динамического полиморфизма");
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Площадь: " + shape.calculateArea());
        }
        System.out.println("\nДемонстрация перегрузки в наследниках:");

        Circle circle = (Circle) shapes[1];
        circle.draw(2.5);

        Rectangle rectangle = (Rectangle) shapes[2];
        rectangle.draw(true);

        System.out.println("\nДемострация статического полиморфизма");
        Shape demoShape = shapes[1];

        demoShape.draw();
        demoShape.draw("Зеленый");
        demoShape.draw(15);
    }
}