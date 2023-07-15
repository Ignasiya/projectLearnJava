package javaPLO.seminar12.ex01.search;

import javaPLO.seminar12.ex01.book.Book;

import java.util.List;

public interface Searchable {
    public List<Book> booksSearchByAuthor(String author);
}
