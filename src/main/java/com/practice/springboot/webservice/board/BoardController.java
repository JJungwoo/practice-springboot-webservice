package com.practice.springboot.webservice.board;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/board/v1")
@Api(tags = {"게시판 API"})
@RequiredArgsConstructor
public class BoardController {

}
