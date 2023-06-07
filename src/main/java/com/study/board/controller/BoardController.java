package com.study.board.controller;

import com.study.board.domain.Board;
import com.study.board.domain.dto.BoardRequestDto;
import com.study.board.domain.dto.BoardResponseDto;
import com.study.board.service.BoardService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/api/save")
    public void save(@RequestBody BoardRequestDto dto) {
        boardService.save(dto);
    }

    @GetMapping("/api/list")
    public List<Board> list() {
        return boardService.findAll();
    }
}
