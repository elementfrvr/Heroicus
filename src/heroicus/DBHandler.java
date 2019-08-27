/*This class connects to the database upon object creation. It also contains the database related methods
 */
package heroicus;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

final class DBHandler {
    /*Database login
    //FOR TESTING ONLY
    //private static final String USERNAME = "dbuser";
    //private static final String PASSWORD = "dbuser";
     */
    //Database address info
    private static final String DRIVER = "jdbc:mysql://";
    private static final String ADDRESS ="localhost";
    private static final String PORT = "3307";
    private static final String TABLE = "heroicus_test";
    private final MysqlDataSource dataSource = new MysqlDataSource();

    //Constructor
    DBHandler() {

    }

    boolean DBStart(String USERNAME, String PASSWORD){
        try {
            /* OLD DriverManager implementation of connection
            //Connection conn = DriverManager.getConnection(DRIVER + ADDRESS + ":" + PORT + "/" + TABLE, USERNAME, PASSWORD);
             */
            //New implementation using DataSource
            dataSource.setUser(USERNAME);
            dataSource.setPassword(PASSWORD);
            dataSource.setUrl(DRIVER+ADDRESS+ ":" + PORT);
            dataSource.setDatabaseName(TABLE);
            Connection conn = dataSource.getConnection();
            System.out.println("Connected");
            return true;
        }
        catch(SQLException e){
            return false;
        }

    }
}
