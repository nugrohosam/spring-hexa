package org.example.configuration;

import org.example.author.adapters.rest.AuthorRestAdapter;
import org.example.book.adapters.db.BookJpaAdapter;
import org.exemple.contract.book.data.BookDto;
import org.exemple.contract.author.data.AuthorDto;
import org.exemple.contract.book.BookPresistance;
import org.exemple.contract.book.BookService;
import org.exemple.usecase.AuthorApplication;
import org.exemple.usecase.BookApplication;
import org.exemple.contract.author.AuthorService;
import org.exemple.contract.author.AuthorPresistance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PortConfig {


    // == DI presist and service of BOOK
    @Bean
    public BookPresistance<BookDto> bookPersistence() {
        return new BookJpaAdapter();
    }

    @Bean
    public BookService<BookDto> bookService() {
        return new BookApplication<BookDto>(bookPersistence());
    }

    // == DI presist and service of AUTHOR
    @Bean
    public AuthorPresistance<AuthorDto> authorPersistence() {
        return new AuthorRestAdapter();
    }

    @Bean
    public AuthorService<AuthorDto> authorService() {
        return new AuthorApplication<AuthorDto>(authorPersistence());
    }
}
