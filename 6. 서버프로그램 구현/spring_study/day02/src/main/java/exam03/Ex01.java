package exam03;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        String  url = "jdbc:oracle:thin:@localhost:1521:orcl?user=BOARD_B1&password=_aA123456";

        try (Connection conn = DriverManager.getConnection(url)) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
