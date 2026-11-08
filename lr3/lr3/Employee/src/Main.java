class Employee {
    String fullname;
    double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о зарплатах");
        System.out.printf("%-15s %10s\n","ФИО сотрудников", "Зарплата");

        for (Employee emp : employees) {
            System.out.printf("%-15s %10.2f\n", emp.fullname, emp.salary);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee("Альшанец Р.Д.", 500.313),
                new Employee("Новик Е.Ю.", 4000.211),
                new Employee("Адинец Д.О.", 7900.111),
                new Employee("Марцов В.С.", 3000.991)
        };

        Report.generateReport(employees);
    }
}