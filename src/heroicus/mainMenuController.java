package heroicus;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class mainMenuController {

    @FXML
    private Label lblGreeting;

    @FXML
    private void newCustomer() throws IOException {
        //Loads NewCustomer Scene
        FXMLLoader loader = new FXMLLoader(getClass().getResource("NewCustomer.fxml"));
        Stage stage = (Stage) lblGreeting.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
    }
    
}
