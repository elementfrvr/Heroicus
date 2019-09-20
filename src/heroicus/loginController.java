/*UI controller class
 */
package heroicus;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class loginController {
    private Boolean connected = false;
    @FXML
    private TextField txtUsername;


    @FXML
    private Label lblFeedback;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private void logIn() throws SQLException, IOException {
        if (!connected) {
            if (DBHandler.getInstance().DBStart(txtUsername.getText(), txtPassword.getText())) {
                lblFeedback.setText("Connected");
                connected = true;
                //Loads New Scene upon login
                FXMLLoader loader = new FXMLLoader(getClass().getResource("NewCustomer.fxml"));
                Stage stage = (Stage) txtPassword.getScene().getWindow();
                Scene scene = new Scene(loader.load());
                stage.setScene(scene);
            }
            //Handles invalid login
            else {
                lblFeedback.setText("Invalid Username or Password");
                System.out.println("Login Failed");
            }

        }
        //Handles double connection (Unreachable)
        else if (connected = true) {
            lblFeedback.setText("Already Connected");
            System.out.println("Already Connected");
        }
    }

}
