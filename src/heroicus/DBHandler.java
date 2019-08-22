/*This class connects to the database upon object creation. It also contains the database related methods
 */
package heroicus;
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
    DBHandler() throws SQLException {

    }

    boolean DBStart(String userName, String password) throws SQLException {
        USERNAME = userName;
        PASSWORD = password;
        try {
            Connection con = DriverManager.getConnection(DRIVER + ADDRESS + ":" + PORT + "/" + TABLE, USERNAME, PASSWORD);
            System.out.println("Connected");
            return true;
        }
        catch(SQLException e){
            return false;

        }

    }
}
