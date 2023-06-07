package com.study.board.domain;

import com.study.board.domain.dto.BoardResponseDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    @Builder
    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public BoardResponseDto toDto() {
        return BoardResponseDto.builder()
                .title(this.title)
                .content(this.content)
                .build();
    }

}
