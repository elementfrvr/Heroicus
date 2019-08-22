/*UI controller class
*/
package heroicus;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.sql.SQLException;

public class loginController {
    private Boolean connected = false;
    @FXML
    private TextField txtUsername;

    @FXML
    private Button btnLogin;

    @FXML
    private Label lblFeedback;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private void logIn() {
        //TODO SqlTimeout exception. Change boolean DBStart to int, add try catch for exception
        if (!connected) {
            DBHandler database = new DBHandler();
            if (database.DBStart(txtUsername.getText(), txtPassword.getText())) {
                lblFeedback.setText("Connected");
                connected = true;
            }
            else {
                lblFeedback.setText("Invalid Username or Password");
                System.out.println("Login Failed");
            }
        }
        else if (connected= true) {
            lblFeedback.setText("Already Connected");
            System.out.println("Already Connected");
        }
    }

}
