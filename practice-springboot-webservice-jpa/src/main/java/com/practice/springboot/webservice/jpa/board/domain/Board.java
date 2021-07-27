package com.practice.springboot.webservice.jpa.board.domain;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Board {

    @Id
    private Long id;

    private String title;

    private String author;

    private String contents;

    @Builder
    public Board(Long id, String title, String author, String contents) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.contents = contents;
    }
}
