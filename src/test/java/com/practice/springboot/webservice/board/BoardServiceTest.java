package com.practice.springboot.webservice.board;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

//@Slf4j
@Log4j2
@SpringBootTest
class BoardServiceTest {

    @Autowired
    private BoardService boardService;

    @Transactional
    @Test
    void getBoard() {
        boardService.createBoard(new BoardDao(1L, "title", "jungwoo", "안녕"));
        BoardRes boardRes = boardService.getBoard(1L);
        System.out.println("getBoard : " + boardRes);
    }

    @Transactional
    @Test
    void createBoard() {
        boardService.createBoard(new BoardDao(1L, "title", "jungwoo", "안녕"));
    }

    @Transactional
    @Test
    void deleteBoard() {
        boardService.createBoard(new BoardDao(1L, "title", "jungwoo", "안녕"));
        boardService.deleteBoard(1L);
    }

    @Transactional
    @Test
    void updateBoard() {
        boardService.createBoard(new BoardDao(1L, "title", "jungwoo", "안녕"));
        boardService.updateBoard(new BoardDao(1L, "제목", "jungwoo", "Hi"));
    }

}