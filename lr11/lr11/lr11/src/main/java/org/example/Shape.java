package org.example;

public class Shape {
    protected String color;
    protected int x;
    protected int y;

    public Shape(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Рисую фигуру цветом " + color + " в координатах (" + x + ", " + y + ")");
    }

    public void draw(String color) {
        System.out.println("Рисую фигуру цветом " + color);
    }

    public void draw(int size) {
        System.out.println("Рисую фигуру размером " + size);
    }

    public double calculateArea() {
        return 0.0;
    }
}