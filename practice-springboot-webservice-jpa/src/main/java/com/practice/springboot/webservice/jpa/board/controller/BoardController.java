package com.practice.springboot.webservice.jpa.board.controller;


import com.practice.springboot.webservice.jpa.board.dto.BoardCreateReqDto;
import com.practice.springboot.webservice.jpa.board.dto.BoardResDto;
import com.practice.springboot.webservice.jpa.board.dto.BoardUpdateReqDto;
import com.practice.springboot.webservice.jpa.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/api/v1/board")
    public Long create(@RequestBody BoardCreateReqDto reqDto) {
        return boardService.boardCreate(reqDto);
    }

    @PutMapping("/api/v1/board/{id}")
    public Long update(@PathVariable Long id, @RequestBody BoardUpdateReqDto reqDto) {
        return boardService.boardUpdate(id, reqDto);
    }

    @GetMapping("/api/v1/board/{id}")
    public BoardResDto findById(@PathVariable Long id) {
        return boardService.boardFindNyId(id);
    }

    @DeleteMapping("/api/v1/board/{id}")
    public Long delete(@PathVariable Long id) {
        boardService.boardDelete(id);
        return id;
    }
}
