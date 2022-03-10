package org.example.author.adapters.rest;

import java.util.List;

import org.exemple.contract.author.AuthorPresistance;
import org.exemple.contract.author.data.AuthorDto;
import org.springframework.stereotype.Service;

@Service
public class AuthorRestAdapter implements AuthorPresistance<AuthorDto> {

    @Override
    public AuthorDto add(AuthorDto dto) {
        System.out.println("Called add rest adapter");
        return null;
    }

    @Override
    public void deleteById(Long id) {
        System.out.println("Called deleted rest adapter");
    }

    @Override
    public AuthorDto update(AuthorDto dto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<AuthorDto> get() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AuthorDto getById(Long bookId) {
        // TODO Auto-generated method stub
        return null;
    }

}
