/*This class connects to the database upon object creation. It also contains the database related methods
 */
package heroicus;
import com.mysql.cj.jdbc.MysqlDataSource;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

final class DBHandler {
    //Database login
    //FOR TESTING ONLY
    //private static final String USERNAME = "dbuser";
    //private static final String PASSWORD = "dbuser";
    //Database address info
    private static final String DRIVER = "jdbc:mysql://";
    private static final String ADDRESS ="localhost";
    private static final String PORT = "3307";
    private static final String TABLE = "heroicus_test";
    private String USERNAME;
    private String PASSWORD;

    //Constructor
    DBHandler() {

    }

    boolean DBStart(String userName, String password){
        USERNAME = userName;
        PASSWORD = password;
        try {
            //Connection con = DriverManager.getConnection(DRIVER + ADDRESS + ":" + PORT + "/" + TABLE, USERNAME, PASSWORD);
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser(USERNAME);
            dataSource.setPassword(PASSWORD);
            dataSource.setUrl(DRIVER+ADDRESS+ ":" + PORT);
            dataSource.setDatabaseName("heroicus_test");
            Connection conn = (Connection) dataSource.getConnection();
            System.out.println("Connected");
            return true;
        }
        catch(SQLException e){
            return false;
        }

    }
}
