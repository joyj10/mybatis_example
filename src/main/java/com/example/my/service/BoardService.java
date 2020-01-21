package com.example.my.service;

import com.example.my.service.dao.BoardDao;
import com.example.my.service.vo.Board;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * BoardService
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

@Service
@AllArgsConstructor(onConstructor_ = {@Autowired})
public class BoardService {

    private BoardDao dao;

    public List<Board> selectAllBoard() {
        return dao.selectAll();
    }

    public Board select(Long bno) {
        return dao.select(bno);
    }

    public Long insertBoard(Board board) {
        return dao.insert(board);
    }

    public Long updateBoard(Board board) {
        return dao.update(board);
    }
}
