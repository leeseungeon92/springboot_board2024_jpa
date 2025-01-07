package com_codingrecipe.springboot_board2024_jpa.repository;

import com_codingrecipe.springboot_board2024_jpa.entity.BoardEntity;
import com_codingrecipe.springboot_board2024_jpa.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    List<CommentEntity> findAllByBoardEntityOrderByIdDesc(BoardEntity boardEntity);
}
