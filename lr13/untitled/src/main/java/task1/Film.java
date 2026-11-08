package task1;

public class Film {
    private String title;
    private String director;
    private int year;
    private double rating;
    private String genre;

    public Film(String title, String director, int year, double rating, String genre)
            throws InvalidFilmDataException, RatingUpdateException {
        setTitle(title);
        setYear(year);
        setRating(rating);
        this.director = director;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws InvalidFilmDataException {
        if (title == null || title.isEmpty()) {
            throw new InvalidFilmDataException("Название фильма не может быть пустым.");
        }
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws InvalidFilmDataException {
        if (year < 1900 || year > 2025) {
            throw new InvalidFilmDataException("Неверный год фильма: " + year + ". Допустимо: 1900-2025.");
        }
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) throws RatingUpdateException {
        if (rating < 1.0 || rating > 10.0) {
            throw new RatingUpdateException("Неверный рейтинг: " + rating + ". Рейтинг должен быть от 1 до 10.");
        }
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void updateRating(double newRating) throws RatingUpdateException {
        setRating(newRating);
        System.out.println("Рейтинг фильма \"" + title + "\" успешно обновлен на: " + this.rating);
    }

    public void displayInfo() {
        System.out.println("Фильм: \"" + title + "\", Режиссер: " + director + ", Год: " + year + ", Рейтинг: " + rating + ", Жанр: " + genre);
    }
}
