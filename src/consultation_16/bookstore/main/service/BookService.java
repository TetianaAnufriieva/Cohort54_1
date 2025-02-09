package consultation_16.bookstore.main.service;

import consultation_16.bookstore.main.model.Book;
import consultation_16.bookstore.main.repository.BookRepository;

import java.util.ArrayList;

public class BookService {

    private BookRepository bookRepository;

    public BookService (BookRepository bookRepository) {
        this.bookRepository = bookRepository;

    }

    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    public ArrayList<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }
}
