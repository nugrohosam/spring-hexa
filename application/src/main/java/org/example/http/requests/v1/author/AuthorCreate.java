package org.example.http.requests.v1.author;

import org.exemple.contract.author.data.AuthorDto;

import lombok.Data;

@Data
public class AuthorCreate {

    private Long id;

    private String name;

    private String dob;

    public AuthorDto toDto() {
        var author = new AuthorDto();
        author.setId(this.id);
        author.setDob(this.dob);
        author.setName(this.name);

        return author;
    }
}
