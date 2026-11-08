package task4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String fileName = "concentration.txt";
        Scanner console = new Scanner(System.in);

        System.out.println("Введите 15 значений концентрации (например, 12,5 или 0,8):");
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < 15; i++) {
                double val = console.nextDouble();
                writer.write(val + " ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        double sum = 0;
        int count = 0;
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextDouble()) {
                double val = fileScanner.nextDouble();
                sum += val;
                count++;
            }

            if (count > 0) {
                double average = sum / count;
                System.out.println("Средняя концентрация: " + average);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
