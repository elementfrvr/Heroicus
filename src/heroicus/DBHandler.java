/*This class connects to the database upon object creation. It also contains the database related methods
 */
package heroicus;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;

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
    private static final String DATABASE = "heroicus_test";
    private MysqlDataSource source = new MysqlDataSource();
    Connection conn = null;

    //Constructor
    DBHandler() {

    }

    boolean DBStart(String USERNAME, String PASSWORD) throws SQLException {
        try {
            //Sets Variables for datasource
            source.setUser(USERNAME);
            source.setPassword(PASSWORD);
            source.setUrl(DRIVER + ADDRESS + ":" + PORT+ "/" + DATABASE);
            //Generates connection for login
            conn = source.getConnection();
            System.out.println("Connected");

            //TEST NEW CUSTOMER CALL
            //REMOVE WHEN FINISHED
            newCustomer("Frank Lee", 2, 900, "123 Fort ST" );
            return true;
        }
        catch (SQLException e) {
            return false;
        }
   }

    void newCustomer(String custName, int custAge, int custIncome, String custAddress) throws SQLException {
        conn = source.getConnection();
        //Get current date as SQL date
        long millis = System.currentTimeMillis();
        java.sql.Date custSince = new java.sql.Date(millis);

        //Prepared Statement
        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO customers VALUES(?, ?, ?, ?, ?)");
        pstmt.setString(1, custName);
        pstmt.setInt(2, custAge);
        pstmt.setDate(3, custSince);
        pstmt.setInt(4, custIncome);
        pstmt.setString(5, custAddress);
        //Execute Update
        int i = pstmt.executeUpdate();
        System.out.println(i);
    }
}
