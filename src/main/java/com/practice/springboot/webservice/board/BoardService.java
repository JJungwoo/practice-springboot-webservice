package com.practice.springboot.webservice.board;

import org.springframework.stereotype.Service;

@Service
public class BoardService {

    public BoardRes getBoard() {
        return BoardRes.builder().build();
    }
}
