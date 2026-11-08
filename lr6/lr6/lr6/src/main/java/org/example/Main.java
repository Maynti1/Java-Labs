package org.example;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Product product = new Product("Шоколадка", 5.42, 10);

        System.out.println("Товар\n" + product);
        System.out.println("Итоговая стоимость товара: " + product.totalCost());
    }
}