package models.board;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardDao {

    private final JdbcTemplate jdbcTemplate;

    public boolean register(BoardData boardData) {
        String sql = "INSERT INTO BOARD_DATA (ID, POSTER, SUBJECT, CONTENT) " +
                      " VALUES(BOARD_DATA_SEQ.nextval, ?, ?, ?)";

        int affectedRows = jdbcTemplate.update(sql, boardData.getPoster(), boardData.getSubject(), boardData.getContent());

        return affectedRows > 0;
    }
}
