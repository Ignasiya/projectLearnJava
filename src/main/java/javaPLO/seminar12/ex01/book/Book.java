package javaPLO.seminar12.ex01.book;

import javaPLO.seminar12.ex01.genre.GenreBook;

public class Book {
    private String name;
    private String author;
    private int year;
    private GenreBook genre;

    public Book(String name, String author, int year, GenreBook genre) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
