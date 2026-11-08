package org.example;

public class Book {
    private String title;
    private String author;
    private int year;

    public String getTtile(){
        return title;
    }

    public String setTitle(String title){
        return this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public String setAuthor(String author){
        return this.author = author;
    }

    public int getYear(){
        return year;
    }

    public int setYear(int year){
        return this.year = year;
    }

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public boolean isOld(){
        if(year > 50){
            return true;
        }
        else
            return false;
    }

    public String toString(){
        return "Название книги: " + title + "\nАвтор: " + author + "\nВозраст: " + year;
    }
}
