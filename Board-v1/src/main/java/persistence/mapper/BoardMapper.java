package persistence.mapper;

import org.apache.ibatis.annotations.*;
import persistence.dto.BoardDTO;

import java.util.List;

public interface BoardMapper {
    @InsertProvider(type = persistence.mapper.BoardSql.class, method = "insertPost")
    @ResultMap("boardResultsSet")
    void insert(BoardDTO boardDTO);

    @UpdateProvider(type = persistence.mapper.BoardSql.class, method = "updatePost")
    @ResultMap("boardResultsSet")
    void update(BoardDTO boardDTO);

    @DeleteProvider(type = persistence.mapper.BoardSql.class, method = "deletePost")
    @ResultMap("boardResultsSet")
    void delete(Long id);

    @SelectProvider(type = persistence.mapper.BoardSql.class, method = "selectAllPost")
    List<BoardDTO> selectAll();
}
