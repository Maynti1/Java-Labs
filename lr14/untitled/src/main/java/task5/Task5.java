package task5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String fileName = "f.txt";

        int[] numbers = { 6, 12, 5, 18, 7, 24, 11, 30, 9, 14 };

        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < numbers.length; i++) {
                writer.write(numbers[i] + " ");
            }
            System.out.println("Файл f.txt записан.");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        int count = 0;
        System.out.print("Числа из файла: ");
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");

                if (num % 2 == 0 && num % 3 == 0) {
                    count++;
                }
            }
            System.out.println();
            System.out.println("Количество чисел, кратных 2 и 3 одновременно: " + count);
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}