package task1;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static Film getFilmByYear(List<Film> films, int year) throws FilmNotFoundException {
        for (int i = 0; i < films.size(); i++) {
            Film film = films.get(i);
            if (film.getYear() == year) {
                return film;
            }
        }
        throw new FilmNotFoundException("Фильм за " + year + " год не найден.");
    }

    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();


        try {
            films.add(new Film("Начало", "Кристофер Нолан", 2010, 8.8, "Фантастика"));
            films.add(new Film("Интерстеллар", "Кристофер Нолан", 2014, 8.7, "Фантастика"));
            films.add(new Film("Зеленая миля", "Фрэнк Дарабонт", 1999, 9.1, "Драма"));
        } catch (InvalidFilmDataException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        } catch (RatingUpdateException e) {
            System.out.println("Ошибка рейтинга: " + e.getMessage());
        }


        for (int i = 0; i < films.size(); i++) {
            films.get(i).displayInfo();
        }
        System.out.println();


        try {
            Film badFilm = new Film("Фильм из будущего", "Режиссер", 2050, 7.0, "Боевик");
        } catch (InvalidFilmDataException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        } catch (RatingUpdateException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        System.out.println();


        try {
            Film film = films.get(0);
            film.setYear(1800); // Ошибка: год раньше 1900
        } catch (InvalidFilmDataException e) {
            System.out.println("Ошибка в сеттере года: " + e.getMessage());
        }

        try {
            Film film = films.get(0);
            film.setRating(15.0); // Ошибка: рейтинг больше 10
        } catch (RatingUpdateException e) {
            System.out.println("Ошибка в сеттере рейтинга: " + e.getMessage());
        }

        System.out.println();


        try {
            Film film = films.get(0);
            film.updateRating(9.5);
        } catch (RatingUpdateException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        System.out.println();


        try {
            Film foundFilm = getFilmByYear(films, 2014);
            System.out.print("Найден фильм: ");
            foundFilm.displayInfo();
        } catch (FilmNotFoundException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }


        try {
            Film notFound = getFilmByYear(films, 1980);
            notFound.displayInfo();
        } catch (FilmNotFoundException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }
}
