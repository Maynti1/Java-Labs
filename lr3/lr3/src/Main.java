import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер задания: ");
        int task = scanner.nextInt();

        switch (task){
            case 1:
                System.out.print("Введите строку: ");
                String str1 = scanner.nextLine();

                char ch = str1.charAt(0);

                System.out.print("Первый символ строчки: " + ch);
                break;

            case 2:
                scanner.nextLine();
                System.out.print("Введите строку: ");
                String str2 = scanner.nextLine().trim();

                String[] words = str2.split("\\s+");

                System.out.print("Количество слов в строке: " + words.length);
                break;

            case 3:
                String text = "aeeea aeea aea axa axxa axxxa";

                Pattern pattern = Pattern.compile("\\ba(e{2}|x+)a\\b");
                Matcher matcher = pattern.matcher(text);

                System.out.println("Найденные строки:");
                while(matcher.find()){
                    System.out.println(matcher.group());
                }
                break;
            default:
                System.out.print("Выбрано неверное задание");
        }
    }
}