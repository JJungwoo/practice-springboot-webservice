package com.practice.springboot.webservice.jpa.board.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;

    @BeforeEach
    void before() {
        boardRepository.save(Board.builder().title("Test1").author("tester1").contents("test").build());
        boardRepository.save(Board.builder().title("Test2").author("tester2").contents("test").build());
        boardRepository.save(Board.builder().title("Test3").author("tester3").contents("test").build());
        boardRepository.save(Board.builder().title("Test4").author("tester4").contents("test").build());
        boardRepository.save(Board.builder().title("Test5").author("tester5").contents("test").build());
        boardRepository.save(Board.builder().title("Test6").author("tester6").contents("test").build());
        boardRepository.save(Board.builder().title("Test7").author("tester7").contents("test").build());
    }

    @Transactional
    @Test
    void findByAll() {
        List<Board> boardList = boardRepository.findAll();
        boardList.forEach(System.out::println);
        assertNotNull(boardList);
    }

    @Transactional
    @Test
    void findByTitleEndingWithAndIdGreaterThanEqualOrderByIdDesc() {
        Pageable paging = PageRequest.of(0, 5);
        List<Board> boardList = boardRepository.findByTitleStartingWithAndIdGreaterThanEqualOrderByIdDesc("Test", 1L, paging);
        boardList.forEach(System.out::println);
        assertNotNull(boardList);
    }

    @Transactional
    @Test
    void findByTitleStartingWithAndIdGreaterThanEqualOrderByIdDescQuery() {
        Pageable paging = PageRequest.of(0, 5);
        List<Board> boardList = boardRepository.findByTitleStartingWithAndIdGreaterThanEqualOrderByIdDescQuery("Test", 1L, paging);
        boardList.forEach(System.out::println);
        assertNotNull(boardList);
    }

    @Transactional
    @Test
    void findByTitleStartingWithAndIdGreaterThanEqualOrderByIdDescNativeQuery() {
//        Pageable paging = PageRequest.of(0, 5);
//        List<Board> boardList = boardRepository.findByTitleStartingWithAndIdGreaterThanEqualOrderByIdDescNativeQuery("Test", 1L, paging);
//        boardList.forEach(System.out::println);
//        assertNotNull(boardList);
    }
}