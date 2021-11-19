package com.practice.springboot.webservice.jpa.board.domain;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Builder
@Entity
@EqualsAndHashCode(of = "mid")
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    private String mid;

    private String mpassword;

    private String mname;

    // Ordinal 은 숫자, String 은 문자열 그대로 들어가는 것을 의미
    @Enumerated(EnumType.STRING)
    private MemberRole mrole;

    public enum MemberRole {
        MANAGER, USER
    }
}
