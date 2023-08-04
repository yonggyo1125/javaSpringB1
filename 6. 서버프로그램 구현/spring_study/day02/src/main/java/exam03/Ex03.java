package exam03;

import java.sql.*;

public class Ex03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "BOARD_B1", password = "_aA123456";
        String sql = "INSERT INTO BOARD_DATA (ID, POSTER, SUBJECT, CONTENT) VALUES (BOARD_DATA_SEQ.nextval, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql, new String[] { "ID"})) {
            pstmt.setString(1, "작성자");
            pstmt.setString(2, "제목1");
            pstmt.setString(3, "내용1");

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    long id = rs.getLong(1);
                    System.out.println("게시글 번호 : " + id);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
