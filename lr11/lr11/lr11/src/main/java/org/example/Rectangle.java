package org.example;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, int x, int y, double width, double height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public void draw(boolean isFilled) {
        if (isFilled) {
            System.out.println("Рисую закрашенный прямоугольник " + width + "x" + height);
        } else {
            System.out.println("Рисую рамку прямоугольника " + width + "x" + height);
        }
    }
}
