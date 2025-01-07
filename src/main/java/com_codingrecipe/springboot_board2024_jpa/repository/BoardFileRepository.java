package com_codingrecipe.springboot_board2024_jpa.repository;

import com_codingrecipe.springboot_board2024_jpa.entity.BoardFileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardFileRepository extends JpaRepository<BoardFileEntity, Long> {
}
