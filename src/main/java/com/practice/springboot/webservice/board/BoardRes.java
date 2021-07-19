package com.practice.springboot.webservice.board;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
public class BoardRes {

    private Long id;

    private String title;

    private String author;

    private String contents;

}
