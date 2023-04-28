package persistence.mapper;

import org.apache.ibatis.jdbc.SQL;
import persistence.dto.BoardDTO;

public class BoardSql {
    public String insertPost() {
        return new SQL() {{
            INSERT_INTO("board");
            VALUES("board_title", "#{board_title}");
            VALUES("board_writer", "#{board_writer}");
            VALUES("board_content", "#{board_content}");
            VALUES("board_date", "#{board_date}");
        }}.toString();
    }

    public String updatePost() {
        return new SQL() {{
            UPDATE("board");
            SET("board_title = #{board_title}");
            SET("board_content = #{board_content}");
            WHERE("board_id = #{board_id}");
        }}.toString();
    }

    public String deletePost() {
        return new SQL() {{
            DELETE_FROM("board");
            WHERE("board_id = #{board_id}");
        }}.toString();
    }

    public String selectAllPost(BoardDTO boardDTO) {
        return new SQL() {{
            SELECT("*");
            FROM("board");
        }}.toString();
    }
}
