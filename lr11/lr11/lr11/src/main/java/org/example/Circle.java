package org.example;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, int x, int y, double radius) {
        super(color, x, y);
        super.calculateArea();
        this.radius = radius;
        super.color="";
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Рисую круг с радиусом " + radius + " и цветом " + color);
    }

    public void draw(double strokeWidth) {
        System.out.println("Рисую контур круга толщиной " + strokeWidth + " мм");
    }

    public void draw(int a){
        System.out.println(a);
    }
}
