package com.practice.springboot.webservice.jpa.board.domain;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {


    // paging
    List<Board> findByTitleStartingWithAndIdGreaterThanEqualOrderByIdDesc(String title, Long id, Pageable paging);
}
