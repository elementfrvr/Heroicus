/*This class connects to the database upon object creation. It also contains the database related methods
 */
package heroicus;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

final class DBHandler {
    //Database login
    //FOR TESTING ONLY
    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "dbuser";
    //Database address info
    private static final String DRIVER = "jdbc:mysql://";
    private static final String ADDRESS ="localhost";
    private static final String PORT = "3307";
    private static final String TABLE = "heroicus_test";

    //Constructor
    //Calls DBStart on instantiation
    DBHandler() throws SQLException {
        DBStart();
    }

    private void DBStart() throws SQLException {
        Connection con = DriverManager.getConnection(DRIVER + ADDRESS + ":" + PORT + "/" + TABLE, USERNAME, PASSWORD);
        System.out.println("Connected");
    }
}
