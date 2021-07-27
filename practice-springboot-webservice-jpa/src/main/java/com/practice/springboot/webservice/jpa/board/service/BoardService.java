package com.practice.springboot.webservice.jpa.board.service;

import com.practice.springboot.webservice.jpa.board.domain.Board;
import com.practice.springboot.webservice.jpa.board.domain.BoardRepository;
import com.practice.springboot.webservice.jpa.board.dto.BoardCreateReqDto;
import com.practice.springboot.webservice.jpa.board.dto.BoardResDto;
import com.practice.springboot.webservice.jpa.board.dto.BoardUpdateReqDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public Long boardCreate(BoardCreateReqDto boardCreateReqDto) {
        return boardRepository.save(boardCreateReqDto.toEntity()).getId();
    }

    @Transactional
    public Long boardUpdate(Long id, BoardUpdateReqDto boardUpdateReqDto) {
        Board board = boardRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        return boardRepository.save(Board.builder()
                                    .title(boardUpdateReqDto.getTitle())
                                    .author(board.getAuthor())
                                    .contents(boardUpdateReqDto.getContents()).build()).getId();
    }

    @Transactional
    public void boardDelete(Long id) {
        Board board = boardRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        boardRepository.delete(board);
    }

    @Transactional
    public BoardResDto boardFindNyId(Long id) {
        Board board = boardRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        return new BoardResDto(board);
    }
}
