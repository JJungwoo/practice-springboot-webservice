package com.practice.springboot.webservice.board;

import org.mapstruct.Mapper;

@Mapper
public interface BoardMapper {

    BoardDao selectBoardById(Long id);
    void insertBoard(BoardDao boardDao);
//    void deleteBoardById(Long id);
//    void updateBoardById(BoardDao boardDao);
}
