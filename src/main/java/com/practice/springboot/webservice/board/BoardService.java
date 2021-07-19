package com.practice.springboot.webservice.board;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BoardService {

    @Transactional
    public BoardRes getBoard() {
        return BoardRes.builder().build();
    }

    @Transactional
    public void createBoard() {

    }

    @Transactional
    public void updateBoard() {

    }

    @Transactional
    public void deleteBoard() {

    }
}
