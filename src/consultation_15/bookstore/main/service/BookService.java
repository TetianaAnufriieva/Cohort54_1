package consultation_15.bookstore.main.service;

import consultation_15.bookstore.main.model.Book;
import consultation_15.bookstore.main.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService (BookRepository bookRepository) {
        this.bookRepository = bookRepository;

    }

    public void addBook(Book book) {
        bookRepository.addBook(book);

    }
}
