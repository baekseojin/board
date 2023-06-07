package com.study.board.service;

import com.study.board.domain.Board;
import com.study.board.domain.dto.BoardRequestDto;
import com.study.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void save(BoardRequestDto dto) {
        boardRepository.save(dto.toEntity());
    }

    public List<Board> findAll() {
        return boardRepository.findAll();
    }
}
