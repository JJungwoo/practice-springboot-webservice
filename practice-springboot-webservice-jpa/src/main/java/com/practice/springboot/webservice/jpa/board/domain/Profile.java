package com.practice.springboot.webservice.jpa.board.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@Builder
@Entity
@EqualsAndHashCode(of = {"pid"})
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;

    private String pname;

    private Boolean currentYn;

    @ManyToOne
    private Member member;
}
