package com.practice.springboot.webservice.jpa.board.domain;

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

}
