package org.example.http.controller.v1;

import org.example.http.requests.v1.author.AuthorCreate;
import org.example.http.requests.v1.author.AuthorUpdate;
import org.exemple.contract.author.data.AuthorDto;
import org.exemple.contract.author.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/author")
public class AuthorController {

    @Autowired
    private AuthorService<AuthorDto> authorApp;

    @PostMapping("/add")
    public AuthorDto addAuthor(@RequestBody AuthorCreate authorReq) {
        return authorApp.add(authorReq.toDto());
    }

    @PutMapping("/update")
    public AuthorDto updateAuthor(@RequestBody AuthorUpdate authorReq) {
        return authorApp.update(authorReq.toDto());
    }

    @GetMapping("/get/{id}")
    public AuthorDto getAuthorByID(@PathVariable long id) {
        return authorApp.getById(id);
    }

    @GetMapping("/get")
    public List<AuthorDto> getAllAuthors() {
        return authorApp.get();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAuthorByID(@PathVariable long id) {
        authorApp.deleteById(id);
    }
}
