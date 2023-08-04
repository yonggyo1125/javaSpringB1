package models.board;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

    public List<BoardData> gets() {
        String sql = "SELECT * FROM BOARD_DATA ORDER BY REGDT DESC";
        List<BoardData> datas = jdbcTemplate.query(sql, this::mapper);

        return datas;
    }

    public BoardData get(long id) {
        try {
            String sql = "SELECT * FROM BOARD_DATA WHERE ID = ?";
            BoardData data = jdbcTemplate.queryForObject(sql, this::mapper, id);
            return data;
        } catch (Exception e) {
            return null;
        }
    }

    private BoardData mapper(ResultSet rs, int i) throws SQLException {
        return BoardData.builder()
                .id(rs.getLong("ID"))
                .poster(rs.getString("POSTER"))
                .subject(rs.getString("SUBJECT"))
                .content(rs.getString("CONTENT"))
                .regDt(rs.getTimestamp("REGDT").toLocalDateTime())
                .build();
    }
}
