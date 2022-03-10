package org.exemple.usecase;

import java.util.List;

import org.exemple.contract.author.AuthorService;
import org.exemple.shareds.BasePersistencePort;

public class AuthorApplication<AuthorDto> implements AuthorService<AuthorDto> {

    private BasePersistencePort<AuthorDto> bookPersistencePort;

    public AuthorApplication(BasePersistencePort<AuthorDto> bookPersistencePort) {
        this.bookPersistencePort = bookPersistencePort;
    }

    @Override
    public AuthorDto add(AuthorDto bookDto) {
        return bookPersistencePort.add(bookDto);
    }

    @Override
    public void deleteById(Long id) {
        bookPersistencePort.deleteById(id);
    }

    @Override
    public AuthorDto update(AuthorDto bookDto) {
        return bookPersistencePort.update(bookDto);
    }

    @Override
    public List<AuthorDto> get() {
        return bookPersistencePort.get();
    }

    @Override
    public AuthorDto getById(Long bookId) {
        return bookPersistencePort.getById(bookId);
    }
}
