package com.quickstart.board.boardweb.service;


import com.quickstart.board.boardweb.domain.Board;
import com.quickstart.board.boardweb.domain.Search;
import org.springframework.data.domain.Page;

public interface BoardService {
    void insertBoard(Board board);
    void updateBoard(Board board);
    void deleteBoard(Board board);
    Board getBoard(Board board);
    Page<Board> getBoardList(Search search);
}
