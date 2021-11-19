package com.practice.springboot.webservice.jpa.board.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProfileRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    ProfileRepository profileRepository;

    @BeforeEach
    public void insertMemberAndProfile() {
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

        Member m1 = memberRepository.getById("id1");
        Member m10 = memberRepository.getById("id10");

        IntStream.rangeClosed(1, 5).forEach(i -> {
            Profile p = Profile.builder()
                    .pname("face" + i)
                    .currentYn(i == 5)
                    .member(m1)
                    .build();
            profileRepository.save(p);
        });

        IntStream.rangeClosed(1, 5).forEach(i -> {
            Profile p = Profile.builder()
                    .pname("myprofile" + i)
                    .currentYn(i == 5)
                    .member(m10)
                    .build();
            profileRepository.save(p);
        });
    }

    @Test
    public void findAllProfile() {
        assertEquals(10, profileRepository.findAll().size());
        profileRepository.findAll().forEach(System.out::println);
    }

    @Test
    void findByPname() {
        profileRepository.findByPname("face3").forEach(profile -> {
            System.out.println(profile.toString());
        });
    }

    @Test
    void findByCurrentYn() {
        profileRepository.findByCurrentYn(true).forEach(profile -> {
            System.out.println(profile.toString());
        });
    }

    @Test
    void findByMember() {
        Member m = Member.builder().mid("id3").build();
        profileRepository.findByMember(m).forEach(profile -> {
            System.out.println(profile.toString());
        });
    }
}