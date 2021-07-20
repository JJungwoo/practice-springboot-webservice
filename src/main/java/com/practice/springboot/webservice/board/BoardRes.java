package com.practice.springboot.webservice.board;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class BoardRes {

    private Long id;

    private String title;

    private String author;

    private String contents;

}
