package com.example.my.service.dao;

import com.example.my.service.vo.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * BoardMapperTest
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

@SpringBootTest
@Transactional
class BoardDaoTest {

    @Autowired
    private BoardDao boardDao;

    @Test
    public void testGetList() {
        List<Board> list = boardDao.selectAll();
        System.out.println(list);
    }

    @Test
    public void testInsert() {
        Board board = new Board();
        board.setTitle("title3");
        board.setWriter("writer3");
        board.setContent("content3");
        Long re = boardDao.insert(board);
        System.out.println("-----insert : "+re);
    }

    @Test
    public void testUpdate() {
        Board board = boardDao.select(1L);
        System.out.println("----as-is : " + board);
        board.setTitle("title1_update");
        System.out.println("----to-be : " + board);
        Long re = boardDao.update(board);
        System.out.println("update success : "+re);

    }

}
