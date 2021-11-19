package com.practice.springboot.webservice.jpa.board.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    ProfileRepository profileRepository;

    @Test
    public void insertMember() {
        IntStream.rangeClosed(1, 10).forEach(i -> {
            Member m = Member.builder()
                    .mid("id" + i)
                    .mname("회원" + i)
                    .mpassword("1234")
                    .mrole(Member.MemberRole.USER).build();
            if (i >= 5) {
                m.setMrole(Member.MemberRole.MANAGER);
            }
            memberRepository.save(m);
        });
        assertEquals(10, memberRepository.findAll().size());
    }
}