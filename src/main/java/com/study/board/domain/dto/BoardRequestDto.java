package com.study.board.domain.dto;

import com.study.board.domain.Board;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardRequestDto {

    private String title;
    private String content;

    public Board toEntity() {
        return Board.builder()
                .title(this.title)
                .content(this.content)
                .build();
    }
}
