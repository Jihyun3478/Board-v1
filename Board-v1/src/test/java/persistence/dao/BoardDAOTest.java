package persistence.dao;

import org.junit.jupiter.api.Test;
import persistence.MyBatisConnectionFactory;
import persistence.dto.BoardDTO;

import java.time.LocalDateTime;
import java.util.List;

class BoardDAOTest {
    BoardDAO boardDAO = new BoardDAO(MyBatisConnectionFactory.getSqlSessionFactory());
    BoardDTO boardDTO = new BoardDTO();
    @Test
    void insert() {
        boardDTO.setBoard_title("title1");
        boardDTO.setBoard_writer("writer1");
        boardDTO.setBoard_content("content1");
        boardDTO.setBoard_date(LocalDateTime.now());
        boardDAO.insert(boardDTO);
    }

    @Test
    void insert2() {
        boardDTO.setBoard_title("title2");
        boardDTO.setBoard_writer("writer2");
        boardDTO.setBoard_content("content2");
        boardDTO.setBoard_date(LocalDateTime.now());
        boardDAO.insert(boardDTO);
    }

    @Test
    void update() {
        boardDTO.setBoard_id(2L);
        boardDTO.setBoard_title("changed title");
        boardDTO.setBoard_content("changed content");
        boardDAO.update(boardDTO);
    }

    @Test
    void delete() {
        boardDAO.delete(2L);
    }

    @Test
    void selectAll() {
        List<BoardDTO> boardDTOs = boardDAO.selectAll();
        boardDTOs.forEach(v -> System.out.println("v.toString() = " + v.toString()));
    }
}