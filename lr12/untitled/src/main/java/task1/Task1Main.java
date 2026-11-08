package task1;

import java.util.HashMap;
import java.util.Map;

public class Task1Main {
    public static void main(String[] args) {

        Map<String, Student> studentMap = new HashMap<>();


        Undergraduate u1 = new Undergraduate("Алексей", 101, 4.5, 2);
        Undergraduate u2 = new Undergraduate("Мария", 102, 4.8, 1);
        Undergraduate u3 = new Undergraduate("Иван", 103, 3.9, 3);

        Graduate g1 = new Graduate("Ольга", 201, 4.9, "Базы данных");
        Graduate g2 = new Graduate("Дмитрий", 202, 4.2, "Искусственный интеллект");
        Graduate g3 = new Graduate("Елена", 203, 4.7, "Информационная безопасность");


        PhD p1 = new PhD("Сергей", 301, 5.0, 8);
        PhD p2 = new PhD("Анна", 302, 4.6, 5);


        studentMap.put(u1.getName(), u1);
        studentMap.put(u2.getName(), u2);
        studentMap.put(u3.getName(), u3);

        studentMap.put(g1.getName(), g1);
        studentMap.put(g2.getName(), g2);
        studentMap.put(g3.getName(), g3);

        studentMap.put(p1.getName(), p1);
        studentMap.put(p2.getName(), p2);

        for (String key : studentMap.keySet()) {
            Student s = studentMap.get(key);
            System.out.println("Ключ (Имя): " + key + " -> " + s);
        }
    }
}
