package com.example.my.controller;

import com.example.my.service.BoardService;
import com.example.my.service.vo.Board;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * BoardController
 * <pre>
 * Describe here
 * </pre>
 *
 * <pre>
 * <b>History:</b>
 * lia.jung, 1.0, 2020/01/21 초기작성
 * </pre>
 *
 * @author lia.jung
 * @version 1.0,
 */
@Slf4j
@AllArgsConstructor(onConstructor_ = {@Autowired})
@RestController
@RequestMapping("board")
public class BoardController {

    private BoardService service;

    @GetMapping
    public List<Board> selectAllBoard() {
        return service.selectAllBoard();
    }

    @GetMapping("/detail")
    public Board selectBoard(Long bno) {
        return service.select(bno);
    }

    @PostMapping
    public Long insertBoard(Board board) {
        return service.insertBoard(board);
    }

    @PutMapping
    public Long updateBoard(Board board) {
        return service.updateBoard(board);
    }
}
