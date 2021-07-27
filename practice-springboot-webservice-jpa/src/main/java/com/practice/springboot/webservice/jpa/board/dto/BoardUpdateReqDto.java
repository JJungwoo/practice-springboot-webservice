package com.practice.springboot.webservice.jpa.board.dto;

import com.practice.springboot.webservice.jpa.board.domain.Board;
import lombok.Builder;
import lombok.Getter;

@Getter
public class BoardUpdateReqDto {
    private String title;
    private String contents;

    @Builder
    public BoardUpdateReqDto(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
}
