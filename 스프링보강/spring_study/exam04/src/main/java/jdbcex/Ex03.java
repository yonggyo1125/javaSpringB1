package jdbcex;

import java.sql.*;

public class Ex03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "scott", password = "tiger";

        String sql = "INSERT INTO DEPT2 VALUES (DEPT2_SEQ.nextval, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            conn.setAutoCommit(false); // 트랜잭션의 수동 관리
            PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"DEPTNO"});
            pstmt.setString(1, "부서3");
            pstmt.setString(2, "인천");

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) { // 쿼리 수행 성공
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    int DEPTNO = rs.getInt(1);
                    System.out.println(DEPTNO);
                }
            }
            conn.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
