package com.practice.springboot.webservice.board;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/board/v1")
@Api(tags = {"게시판 API"})
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/get/{id}")
    public BoardRes get(@PathVariable Long id) {
        return boardService.getBoard(id);
    }

    @PostMapping("/create")
    public void save(@RequestBody BoardDao boardDao) {
        boardService.createBoard(boardDao);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        boardService.deleteBoard(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody BoardDao boardDao) {
        boardService.updateBoard(boardDao);
    }
}
