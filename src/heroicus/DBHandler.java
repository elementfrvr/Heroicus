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
    private static final String PASSWORD ="dbuser";
    private static final String CONN = "jdbc:mysql://localhost";
    private static final String PORT ="3307";
    private static final String TABLE = "heroicus_test";

    //Constructor
    //Creates Database connection on instantiation
    DBHandler() throws SQLException {
        Connection con = DriverManager.getConnection(CONN+":"+PORT+"/" +TABLE, USERNAME, PASSWORD);
        System.out.println("Connected");
    }
}
