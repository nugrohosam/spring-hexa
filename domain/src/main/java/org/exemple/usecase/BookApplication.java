package org.exemple.usecase;

import java.util.List;

import org.exemple.contract.book.BookService;
import org.exemple.shareds.BasePersistencePort;

public class BookApplication<BookDto> implements BookService<BookDto> {

    private BasePersistencePort<BookDto> bookPersistencePort;

    public BookApplication(BasePersistencePort<BookDto> bookPersistencePort) {
        this.bookPersistencePort = bookPersistencePort;
    }

    @Override
    public BookDto add(BookDto bookDto) {
        return bookPersistencePort.add(bookDto);
    }

    @Override
    public void deleteById(Long id) {
        bookPersistencePort.deleteById(id);
    }

    @Override
    public BookDto update(BookDto bookDto) {
        return bookPersistencePort.update(bookDto);
    }

    @Override
    public List<BookDto> get() {
        return bookPersistencePort.get();
    }

    @Override
    public BookDto getById(Long bookId) {
        return bookPersistencePort.getById(bookId);
    }
}
