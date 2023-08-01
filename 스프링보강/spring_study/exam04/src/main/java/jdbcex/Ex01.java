package jdbcex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        String url = "jdbc:oracle:thin:@localhost:1521:orcl?user=scott&password=tiger";

        try(Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()) {
            String DEPTNO = "부서1";

            String sql = "INSERT INTO DEPT2 VALUES (20, '"+ DEPTNO + "', '서울')";
            int affectedRows = stmt.executeUpdate(sql);
            System.out.println(affectedRows);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
