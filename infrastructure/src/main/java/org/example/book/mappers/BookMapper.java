package org.example.book.mappers;

import org.example.book.entity.Book;
import org.exemple.contract.book.data.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDto bookToBookDto(Book book);

    Book bookDtoToBook(BookDto bookDto);

    List<BookDto> bookListToBookDtoList(List<Book> bookList);

    List<Book> BookDtoListTobookList(List<BookDto> BookDtoList);
}
