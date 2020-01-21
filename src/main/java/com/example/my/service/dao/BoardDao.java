package com.example.my.service.dao;

import com.example.my.service.vo.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * BoardMapper
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

@Mapper
@Repository
public interface BoardDao {
    List<Board> selectAll();
    Board select(Long bno);
    Long insert(Board board);
    Long update(Board board);
}
