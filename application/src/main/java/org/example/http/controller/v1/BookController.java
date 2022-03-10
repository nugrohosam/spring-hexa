package org.example.http.controller.v1;

import org.example.http.requests.v1.book.BookCreate;
import org.example.http.requests.v1.book.BookUpdate;
import org.exemple.contract.book.BookService;
import org.exemple.contract.book.data.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {

    @Autowired
    private BookService<BookDto> bookApp;

    @PostMapping("/add")
    public BookDto addBook(@RequestBody BookCreate bookReq) {
        return bookApp.add(bookReq.toDto());
    }

    @PutMapping("/update")
    public BookDto updateBook(@RequestBody BookUpdate bookReq) {
        return bookApp.update(bookReq.toDto());
    }

    @GetMapping("/get/{id}")
    public BookDto getBookByID(@PathVariable long id) {
        return bookApp.getById(id);
    }

    @GetMapping("/get")
    public List<BookDto> getAllBooks() {
        return bookApp.get();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBookByID(@PathVariable long id) {
        bookApp.deleteById(id);
    }
}
