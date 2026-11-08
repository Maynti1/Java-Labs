import java.util.Scanner;
import java.util.Random;

public class Main{
    static void main(){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер задания: ");
        int task = scanner.nextInt();

        switch (task){
            case 1:
                System.out.print("Введите размер массива: ");
                int size = scanner.nextInt();

                int[] arr =  new int[size];

                System.out.println("Заполните массив");
                for(int i =0; i<size; i++){
                    arr[i] = scanner.nextInt();
                }

                for(int i=size-1; i>=0; i--)
                    System.out.print(arr[i] + " ");

                break;

            case 2:
                System.out.print("Введите размер квадратной матрицы: ");
                int size2 = scanner.nextInt();

                int[][] arr1 = new int[size2][size2];

                System.out.println("Заполните матрицу");
                for(int i=0; i<size2; i++){
                    for(int j=0; j<size2; j++){
                        //System.out.print("arr1[" + i + "][" + j + "]: ");
                        // arr1[i][j] = scanner.nextInt();
                        arr1[i][j] = rand.nextInt(10);
                    }
                }

                System.out.println("Исходная матрица\n");
                for(int i=0; i<size2; i++){
                    for(int j=0; j<size2; j++){
                        System.out.print( arr1[i][j] + " ");
                    }
                    System.out.println();
                }

                int sum = 0;

                for(int i=0; i<size2; i++){
                        sum += arr1[i][size2-i-1];
                }

                System.out.println("\nСумма на главной диагонали: " +  sum);

                break;

            default:
                System.out.print("Введено не верное значение");
        }
    }
}