package org.example;

public class Product {
    private String name;
    private  double price;
    private int quantity;
    private int count;

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }

    public Product(String name, double price, int quantity, int count){
        this(name, price, quantity);
        this.count = count;
    }










































    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalCost(){
        return price * quantity;
    }

    public String toString(){
        return "Название: " + name + "\nСтоимость: " + price + "\nКоличество: " + quantity;
    }
}
