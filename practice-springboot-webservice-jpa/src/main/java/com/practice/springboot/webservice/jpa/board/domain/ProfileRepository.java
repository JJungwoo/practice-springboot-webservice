package com.practice.springboot.webservice.jpa.board.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

    // default method : save(), findAll(), findById() ...
    // method 추가 (규칙에 맞도록 함수 이름 선언)
    List<Profile> findByPname(String pName);
    List<Profile> findByCurrentYn(Boolean yn);
    List<Profile> findByMember(Member member);

    // JPQL (JPA Query Language)
}
