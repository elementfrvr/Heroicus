/*This class connects to the database upon object creation. It also contains the database related methods
 */
package heroicus;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;
import java.sql.Types;

final class DBHandler {
    /*Database login
    //FOR TESTING ONLY
    //private static final String USERNAME = "dbuser";
    //private static final String PASSWORD = "dbuser";
     */
    //Database address info
    private static final String DRIVER = "jdbc:mysql://";
    private static final String ADDRESS = "localhost";
    private static final String PORT = "3306";
    private static final String TABLE = "heroicus_test";
    private MysqlDataSource dataSource = new MysqlDataSource();
    Connection conn = null;

    //Constructor
    DBHandler() {

    }

    boolean DBStart(String USERNAME, String PASSWORD) throws SQLException {
        //try {
            /* OLD DriverManager implementation of connection
            //Connection conn = DriverManager.getConnection(DRIVER + ADDRESS + ":" + PORT + "/" + TABLE, USERNAME, PASSWORD);
             */
            //New implementation using DataSource
            dataSource.setUser(USERNAME);
            dataSource.setPassword(PASSWORD);
            dataSource.setUrl(DRIVER + ADDRESS + ":" + PORT);
            dataSource.setDatabaseName(TABLE);
            conn = dataSource.getConnection();
            System.out.println("Connected");


            //TEST NEW CUSTOMER CALL
            //REMOVE WHEN FINISHED
            //newCustomer("Bob", 22, 365, "123 Forest ST" );
            newCustomer();

            return true;
        }
        /*catch (SQLException e) {
            return false;
        }*/
   // }

    void newCustomer(/*String custName, int custAge, int custIncome, String custAddress*/) throws SQLException {
        //long millis = System.currentTimeMillis();
        //java.sql.Date custSince = new java.sql.Date(millis);
        //conn = dataSource.getConnection();
        //Statement stmt = conn.createStatement();
        /*
        String customer = "INSERT INTO customers VALUES(" + custName + ", " + custAge + ", " + custSince + ", " +
                + custIncome + ", " + custAddress + ")";
         */
        //String customer = "INSERT INTO customers VALUES('jeff', 23, null, 365, 'Fake')";
        //System.out.println(stmt.executeUpdate(customer));

        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO customers VALUES(?, ?, ?, ?, ?)");
        pstmt.setString(1, "Bob");
        pstmt.setInt(2, 23);
        pstmt.setNull(3, Types.DATE);
        pstmt.setInt(4, 365);
        pstmt.setString(5, "123 Sesame Street");
        boolean i = pstmt.execute();
        System.out.println(i);
    }
}
