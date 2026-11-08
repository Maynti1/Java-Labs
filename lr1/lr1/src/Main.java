import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Выберите задание: ");
        int task = scanner.nextInt();

        switch (task){
            case 1:
                String name = scanner.next();
                int age = scanner.nextInt();
                System.out.println(name);
                System.out.println(age);
                break;

            case 2:
                System.out.print("Введите число: ");
                int num = scanner.nextInt();

                if(num % 2 == 0)
                    System.out.println("Да");
                else
                    System.out.println("Нет");
                break;

            case 3:
                for(int i = 10; i>=1; i--)
                    System.out.print(i + " ");
                
                break;
            default:
                System.out.print("Выбрано неверное задание");
        }
        scanner.close();
    }
}