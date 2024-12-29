package com_codingrecipe.springboot_board2024_jpa.repository;

import com_codingrecipe.springboot_board2024_jpa.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
