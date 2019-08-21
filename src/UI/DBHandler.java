package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler {
    //Database login
    //FOR TESTING ONLY
    private static final String USERNAME = "dbuser";
    private static final String PASSWORD ="dbuser";
    private static final String CONN = "jdbc:mysql://localhost";
    private static final String PORT ="3307";
    private static final String TABLE = "heroicus_test";
    public DBHandler() throws SQLException {
        Connection con = null;
        con = DriverManager.getConnection(CONN+":"+PORT+"/" +TABLE, USERNAME, PASSWORD);
        System.out.println("Connected");
    }
}
