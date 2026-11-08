package task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        try (FileWriter writerF = new FileWriter("f.txt")) {
            for (int i = 0; i < 15; i++) {
                int num = random.nextInt(200) + 1;
                writerF.write(num + " ");
            }
            System.out.println("Файл f.txt успешно заполнен случайными числами.");
        } catch (IOException e) {
            System.out.println("Ошибка записи f.txt: " + e.getMessage());
        }

        try (Scanner scanner = new Scanner(new File("f.txt"));
             FileWriter writerG = new FileWriter("g.txt");
             FileWriter writerH = new FileWriter("h.txt")) {

            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number < 100) {
                    writerG.write(number + " ");
                } else {
                    writerH.write(number + " ");
                }
            }
            System.out.println("Числа < 100 записаны в g.txt");
            System.out.println("Остальные числа записаны в h.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при обработке файлов: " + e.getMessage());
        }
    }
}