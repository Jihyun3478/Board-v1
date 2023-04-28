package persistence.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import persistence.dto.BoardDTO;
import persistence.mapper.BoardMapper;

import java.time.LocalDateTime;
import java.util.List;

public class BoardDAO {
    private SqlSessionFactory sqlSessionFactory = null;

    public BoardDAO(SqlSessionFactory sqlSessionFactory) { this.sqlSessionFactory = sqlSessionFactory; }

    public void insert(BoardDTO boardDTO) {
        SqlSession session = sqlSessionFactory.openSession();
        BoardMapper mapper = session.getMapper(BoardMapper.class);
        mapper.insert(boardDTO);
        session.commit();
    }

    public void update(BoardDTO boardDTO) {
        SqlSession session = sqlSessionFactory.openSession();
        BoardMapper mapper = session.getMapper(BoardMapper.class);
        mapper.update(boardDTO);
        session.commit();
    }

    public void delete(Long id) {
        SqlSession session = sqlSessionFactory.openSession();
        BoardMapper mapper = session.getMapper(BoardMapper.class);
        mapper.delete(id);
        session.commit();
    }

    public List<BoardDTO> selectAll() {
        SqlSession session = sqlSessionFactory.openSession();
        BoardMapper mapper = session.getMapper(BoardMapper.class);
        return mapper.selectAll();
    }
}
