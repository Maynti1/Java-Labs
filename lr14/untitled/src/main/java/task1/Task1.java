package task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String fileName = "family.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Моя семья:\n");
            writer.write("Отец: Денис, начальник\n");
            writer.write("Мать: Елена, повар\n");
            writer.write("Брат: Роман, школьник\n");
            System.out.println("Файл успешно создан и заполнен.");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        File file = new File(fileName);
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Полный путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Существует: " + file.exists());
        System.out.println("Доступен для чтения: " + file.canRead());


        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
