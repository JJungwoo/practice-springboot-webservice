package com.practice.springboot.webservice.jpa.board.dto;

import com.practice.springboot.webservice.jpa.board.domain.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardCreateReqDto {
    private String title;
    private String author;
    private String contents;

    @Builder
    public BoardCreateReqDto(String title, String author, String contents) {
        this.title = title;
        this.author = author;
        this.contents = contents;
    }

    public Board toEntity() {
        return Board.builder()
                .title(title)
                .author(author)
                .contents(contents)
                .build();
    }
}
