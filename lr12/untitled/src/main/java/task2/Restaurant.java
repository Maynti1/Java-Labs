package task2;

import java.util.List;

public class Restaurant {
    private int id;
    private String name;
    private String cuisine;
    private int stars;
    private List<Integer> customerReviews;

    public Restaurant(int id, String name, String cuisine, int stars, List<Integer> customerReviews) {
        this.id = id;
        this.name = name;
        this.cuisine = cuisine;
        this.stars = stars;
        this.customerReviews = customerReviews;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public double getAverageReview() {
        if (customerReviews == null || customerReviews.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < customerReviews.size(); i++) {
            sum += customerReviews.get(i);
        }
        return sum / customerReviews.size();
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Название: " + name + ", Кухня: " + cuisine +
                ", Звезды: " + stars + ", Средний рейтинг: " + getAverageReview();
    }
}
