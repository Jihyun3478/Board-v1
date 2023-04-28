package persistence.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class BoardDTO {
    private Long board_id;
    private String board_title;
    private String board_writer;
    private String board_content;
    private LocalDateTime board_date;
}
