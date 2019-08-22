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

    @FXML
    private TextField txtUsername;

    @FXML
    private Button btnLogin;

    @FXML
    private Label lblFeedback;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private void logIn() throws SQLException {
        DBHandler database = new DBHandler();
        database.DBStart(txtUsername.getText(), txtPassword.getText());
    }

}
