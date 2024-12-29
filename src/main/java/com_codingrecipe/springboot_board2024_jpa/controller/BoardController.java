package com_codingrecipe.springboot_board2024_jpa.controller;

import com_codingrecipe.springboot_board2024_jpa.dto.BoardDTO;
import com_codingrecipe.springboot_board2024_jpa.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/save")
    public String saveForm() {
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO) {
        System.out.println("BoardController.save");
        boardService.save(boardDTO);
        return "index";
    }
}
