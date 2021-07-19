package com.practice.springboot.webservice.board;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class BoardServiceTest {

    @Autowired
    private BoardService boardService;

    @Transactional
    @Test
    void getBoard() {
        boardService.createBoard(new BoardDao(1L, "title", "jungwoo", "나 퇴사한다"));
        BoardRes boardRes = boardService.getBoard(1L);
//        log.info("getBoard : {}", boardRes);
        System.out.println("getBoard : " + boardRes);
    }

    @Transactional
    @Test
    void createBoard() {
        boardService.createBoard(new BoardDao(1L, "title", "jungwoo", "나 퇴사한다"));
    }

    @Test
    void updateBoard() {
    }

    @Test
    void deleteBoard() {
    }
}