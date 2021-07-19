package com.practice.springboot.webservice.board;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BoardService {

    private BoardMapper boardMapper;

    @Transactional
    public BoardRes getBoard(Long id) {
        BoardDao boardDao = boardMapper.selectBoardById(id);
        return BoardRes.builder()
                .id(boardDao.getId())
                .title(boardDao.getTitle())
                .author(boardDao.getAuthor())
                .contents(boardDao.getContents())
                .build();
    }

    @Transactional
    public void createBoard(BoardDao boardDao) {
        boardMapper.insertBoard(boardDao);
    }

    @Transactional
    public void updateBoard() {

    }

    @Transactional
    public void deleteBoard() {

    }
}
