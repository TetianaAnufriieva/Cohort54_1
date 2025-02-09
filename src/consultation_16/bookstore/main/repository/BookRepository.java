package consultation_16.bookstore.main.repository;

import consultation_16.bookstore.main.model.Book;

import java.util.ArrayList;

public class BookRepository {
    //'DB' или хранилище
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }
}
