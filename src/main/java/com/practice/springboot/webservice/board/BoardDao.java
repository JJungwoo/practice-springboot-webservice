package com.practice.springboot.webservice.board;

import lombok.Builder;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Builder
public class BoardDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    private String author;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String contents;

}
