package com.practice.springboot.webservice.board;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardMapper boardMapper;

    @Transactional
    public BoardRes getBoard(Long id) {
        System.out.println("id: "+ id);
        BoardDao boardDao = boardMapper.selectBoardById(id);

        if (boardDao == null) {
            return null;
        }
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
    public void deleteBoard(Long id) {
        boardMapper.deleteBoardById(id);
    }

    @Transactional
    public void updateBoard(BoardDao boardDao) {
        boardMapper.updateBoardById(boardDao);
    }

}
