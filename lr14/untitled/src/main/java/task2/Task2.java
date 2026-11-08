package task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String fileName = "f.txt";
        Scanner console = new Scanner(System.in);

        System.out.println("Введите 10 целых чисел:");
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < 10; i++) {
                int number = console.nextInt();
                writer.write(number + " ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        int positiveCount = 0;
        System.out.println("\nЧисла из файла:");
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();
                System.out.print(number + " ");
                if (number > 0) {
                    positiveCount++;
                }
            }
            System.out.println();
            System.out.println("Количество положительных чисел: " + positiveCount);
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
