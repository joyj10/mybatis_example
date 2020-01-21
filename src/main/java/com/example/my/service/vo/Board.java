package com.example.my.service.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Board
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
@Data
public class Board {

    private Long bno;
    private String title;
    private String writer;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String fileName;
}
