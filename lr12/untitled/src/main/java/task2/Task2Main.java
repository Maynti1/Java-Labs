package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Task2Main {

    public static void printRestaurants(List<Restaurant> restaurants, int stars) {
        for (int i = 0; i < restaurants.size(); i++) {
            Restaurant r = restaurants.get(i);
            if (r.getStars() == stars) {
                System.out.println(r);
            }
        }
    }

    public static void main(String[] args) {
        List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant(1, "Васильки", "Белорусская", 3, Arrays.asList(5, 4, 5, 4))); // ср. балл 4.5
        restaurants.add(new Restaurant(2, "Быстроежка", "Фастфуд", 1, Arrays.asList(2, 2, 3, 2)));   // ср. балл 2.25 (< 3)
        restaurants.add(new Restaurant(3, "Траттория", "Итальянская", 4, Arrays.asList(5, 5, 4, 5))); // ср. балл 4.75
        restaurants.add(new Restaurant(4, "Сакура", "Японская", 3, Arrays.asList(4, 4, 3, 4)));     // ср. балл 3.75
        restaurants.add(new Restaurant(5, "Угли", "Кавказская", 2, Arrays.asList(2, 1, 3, 2)));      // ср. балл 2.0 (< 3)
        restaurants.add(new Restaurant(6, "Астория", "Европейская", 4, Arrays.asList(5, 5, 4, 5)));  // ср. балл 4.75

        Iterator<Restaurant> iterator = restaurants.iterator();
        while (iterator.hasNext()) {
            Restaurant r = iterator.next();
            if (r.getAverageReview() < 3.0) {
                iterator.remove();
            }
        }


        for (int i = 0; i < restaurants.size(); i++) {
            Restaurant r = restaurants.get(i);
            if (r.getAverageReview() >= 4.0) {
                r.setStars(r.getStars() + 1);
            }
        }

        printRestaurants(restaurants, 4);
        System.out.println();


        Collections.sort(restaurants, new Comparator<Restaurant>() {
            @Override
            public int compare(Restaurant r1, Restaurant r2) {

                if (r2.getAverageReview() > r1.getAverageReview()) {
                    return 1;
                } else if (r2.getAverageReview() < r1.getAverageReview()) {
                    return -1;
                } else {

                    return r1.getName().compareTo(r2.getName());
                }
            }
        });

        for (int i = 0; i < restaurants.size(); i++) {
            Restaurant r = restaurants.get(i);
            System.out.println("ID: " + r.getId() + ", Название: " + r.getName() + ", Рейтинг: " + r.getAverageReview());
        }
    }
}
