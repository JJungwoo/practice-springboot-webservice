package com.practice.springboot.webservice.board;

import lombok.Builder;

@Builder
public class BoardRes {

    private Long id;

    private String title;

    private String author;

    private String contents;

}
