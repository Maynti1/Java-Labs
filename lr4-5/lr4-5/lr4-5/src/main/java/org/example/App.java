package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер задания: ");
        int task = scanner.nextInt();

        switch (task){
            case 1:
                Book book1 = new Book("Гарри поттер", "Стивен Кинг", 51);
                Book book2 = new Book("Преступление и наказание", "Достоевский", 40);
                Book book3 = new Book("451° по Фаренгейту", "Рэй Брэдбери", 100);

                Book[] books = {book1, book2, book3};

                for(Book book : books){
                    if(book.isOld()){
                        System.out.println(book + "\n");

                    }
                }
                break;

            case 2:

                Student[] students = {
                        new Student("Адинец", 8.6, "Т-395"),
                        new Student("Марцоы", 7.5, "Т-395"),
                        new Student("Альшанец", 5.3, "Т-395"),
                        new Student("Новик", 9.2, "Ф-6"),
                        new Student("Баешко", 7.4, "Л-691"),
                        new Student("Буйлов", 5.7, "Л-392"),
                        new Student("Гутник", 2.0, "П-391")
                };

                Student maxStud = students[0];
                double sum = 0;
                for(int i =1; i<students.length; i++){
                    sum += students[i].getGrade();
                    if(maxStud.getGrade() < students[i].getGrade()){
                        maxStud = students[i];
                    }
                }

                double avg = sum / students.length;

                System.out.println("Студент с макс оценкой\n" + maxStud);
                System.out.println("Средняя оценка: " + avg);

                break;

            case 3:
                for(DayOfWeek day : DayOfWeek.values()){
                    if(day.isWeekend())
                        System.out.println(day + " - выходной");
                    else
                        System.out.println(day + " - раюочий");
                }
        }
    }
}