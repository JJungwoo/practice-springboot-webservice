package com.practice.springboot.webservice.board;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Getter
public class BoardDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    private String author;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String contents;

    @Builder
    public BoardDao(Long id, String title, String author, String contents) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.contents = contents;
    }
}
