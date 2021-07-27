package com.practice.springboot.webservice.jpa.board.dto;

import com.practice.springboot.webservice.jpa.board.domain.Board;

public class BoardResDto {
    private Long id;
    private String title;
    private String author;
    private String contents;

    public BoardResDto(Board entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.contents = entity.getContents();
    }
}
