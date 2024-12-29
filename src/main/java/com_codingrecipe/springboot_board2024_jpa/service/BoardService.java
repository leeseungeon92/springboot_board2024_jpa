package com_codingrecipe.springboot_board2024_jpa.service;

import com_codingrecipe.springboot_board2024_jpa.dto.BoardDTO;
import com_codingrecipe.springboot_board2024_jpa.entity.BoardEntity;
import com_codingrecipe.springboot_board2024_jpa.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//DTO => Entity (Entity class)
//Entity => DTO (DTO class)

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
