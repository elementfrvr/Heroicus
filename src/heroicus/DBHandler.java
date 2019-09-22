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
    private final MysqlDataSource source = new MysqlDataSource();
    private Connection conn = null;

    private static DBHandler singleton;

    //Constructor
    private DBHandler() {

    }

    public static DBHandler getInstance()
    {
        if (singleton==null)
            singleton = new DBHandler();
        return singleton;
    }

    boolean DBStart(String USERNAME, String PASSWORD) {
        try {
            //Sets Variables for datasource
            source.setUser(USERNAME);
            source.setPassword(PASSWORD);
            source.setUrl(DRIVER + ADDRESS + ":" + PORT + "/" + DATABASE);
            //Generates connection for login
            conn = source.getConnection();
            System.out.println("Connected");
            return true;
        }
        //Returns false for failed connection to database
        catch (SQLException ex) {
            return false;
        }
    }

    Boolean newCustomer(String custName, int custAge, int custIncome, String custAddress) throws SQLException {
        conn = source.getConnection();
        //Get current date as SQL date
        long millis = System.currentTimeMillis();
        java.sql.Date custSince = new java.sql.Date(millis);

        //Prepared Statement creation
        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO customers VALUES(?, ?, ?, ?, ?)");
        pstmt.setString(1, custName);
        pstmt.setInt(2, custAge);
        pstmt.setDate(3, custSince);
        pstmt.setInt(4, custIncome);
        pstmt.setString(5, custAddress);

        //Execute Update
        int i = pstmt.executeUpdate();
        System.out.println(i);
        return i == 1;
    }

    //Function to check if string contains an integer number
    public boolean intCheck(String val){
        try{
            Integer.parseInt(val);
        }
        catch(Exception ex ){
            return false;
        }
        return true;
    }
}
