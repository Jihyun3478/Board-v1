import persistence.MyBatisConnectionFactory;
import persistence.dao.BoardDAO;
import persistence.dto.BoardDTO;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BoardDAO boardDAO = new BoardDAO(MyBatisConnectionFactory.getSqlSessionFactory());
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setBoard_title("title1");
        boardDTO.setBoard_writer("writer1");
        boardDTO.setBoard_content("content1");
        boardDTO.setBoard_date(LocalDateTime.now());
        boardDAO.insert(boardDTO);

//        BoardDAO boardDAO = new BoardDAO(MyBatisConnectionFactory.getSqlSessionFactory());
//        BoardDTO boardDTO = new BoardDTO();
//        boardDTO.setBoard_title("title2");
//        boardDTO.setBoard_writer("writer2");
//        boardDTO.setBoard_content("content2");
//        boardDTO.setBoard_date(LocalDateTime.now());
//        boardDAO.insert(boardDTO);

//        BoardDAO boardDAO = new BoardDAO(MyBatisConnectionFactory.getSqlSessionFactory());
//        BoardDTO boardDTO = new BoardDTO();
//        boardDTO.setBoard_id(2L);
//        boardDTO.setBoard_title("changed title");
//        boardDTO.setBoard_content("changed content");
//        boardDAO.update(boardDTO);

//        BoardDAO boardDAO = new BoardDAO(MyBatisConnectionFactory.getSqlSessionFactory());
//        boardDAO.delete(2L);

//        BoardDAO boardDAO = new BoardDAO(MyBatisConnectionFactory.getSqlSessionFactory());
//        List<BoardDTO> boardDTOs = boardDAO.selectAll();
//        boardDTOs.forEach(v -> System.out.println("v.toString() = " + v.toString()));
    }
}
