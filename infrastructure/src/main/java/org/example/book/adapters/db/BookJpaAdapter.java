package org.example.book.adapters.db;

import org.example.book.entity.Book;
import org.example.book.mappers.BookMapper;
import org.exemple.contract.book.BookPresistance;
import org.exemple.contract.book.data.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookJpaAdapter implements BookPresistance<BookDto> {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookDto add(BookDto bookDto) {

        Book book = BookMapper.INSTANCE.bookDtoToBook(bookDto);

        Book bookSaved = bookRepository.save(book);

        return BookMapper.INSTANCE.bookToBookDto(bookSaved);
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public BookDto update(BookDto bookDto) {
        return add(bookDto);
    }

    @Override
    public List<BookDto> get() {

        List<Book> bookList = bookRepository.findAll();

        return BookMapper.INSTANCE.bookListToBookDtoList(bookList);
    }

    @Override
    public BookDto getById(Long bookId) {

        Optional<Book> book = bookRepository.findById(bookId);

        if (book.isPresent()) {
            return BookMapper.INSTANCE.bookToBookDto(book.get());
        }

        return null;
    }
}
