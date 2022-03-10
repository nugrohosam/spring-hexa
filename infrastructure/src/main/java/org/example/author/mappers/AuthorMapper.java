package org.example.author.mappers;

import org.example.author.entity.Author;
import org.exemple.contract.author.data.AuthorDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorDto AuthorDto(Author book);

    Author bookDtoToAuthor(AuthorDto bookDto);

    List<AuthorDto> AuthorDtoList(List<Author> bookList);

    List<Author> AuthorDtoListTobookList(List<AuthorDto> AuthorDtoList);
}
