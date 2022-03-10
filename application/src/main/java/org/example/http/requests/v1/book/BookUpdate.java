package org.example.http.requests.v1.book;

import org.exemple.contract.book.data.BookDto;

import lombok.Data;

@Data
public class BookUpdate {

    private String title;

    private String description;

    private Double price;

    public BookDto toDto() {
        var book = new BookDto();
        book.setTitle(this.title);
        book.setDescription(this.description);
        book.setPrice(this.price);

        return book;
    }
}
