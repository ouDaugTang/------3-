package com.aloha.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aloha.board.dto.Board;

@Mapper
public interface BoardMapper {
    public List<Board> list();
    public Board select(int no);
    public int insert(Board board);
    public int update(Board board);
    public int delete(int no);
}
