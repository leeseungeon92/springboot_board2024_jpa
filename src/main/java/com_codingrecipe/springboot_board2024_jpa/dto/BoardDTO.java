package com_codingrecipe.springboot_board2024_jpa.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString //필드값 확인 시
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;

}
