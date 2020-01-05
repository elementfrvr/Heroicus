package heroicus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class newCustomerController {

    @FXML
    private TextField txtCustIncome;

    @FXML
    private TextField txtCustName;

    @FXML
    private TextField txtCustAddress;

    @FXML
    private TextField txtCustAge;

    @FXML
    private Label lblFeedback;

    @FXML
    private Button btnReturn;


    //Executed by confirm button
    @FXML
    private void enter() {
        //Handles SQLException
        try {
            //Verifies Age and Income are integers
            if (DBHandler.getInstance().intCheck(txtCustAge.getText()) && DBHandler.getInstance().intCheck(txtCustIncome.getText())) {
                //newCustomer returns true when 1 row is added to table
                if (DBHandler.getInstance().newCustomer(txtCustName.getText(), Integer.parseInt(txtCustAge.getText()), Integer.parseInt(txtCustIncome.getText()), txtCustAddress.getText())) {
                    System.out.println("Customer Added.");
                    lblFeedback.setText("Customer added.");
                }
                else {
                    lblFeedback.setText("Error adding customer. Please review customer details.");
                    System.out.println("Customer failure.");
                }
            }
            //Message set when age or income are not integers
            else
                lblFeedback.setText("Customer not added. Please ensure that both customer age and income are entered as integers.");
        }
        //Message set in case of SQLException
        catch(SQLException ex) {
            lblFeedback.setText("Database error has occurred.");
        }
    }

    //Return to main menu
    public void mainMenu(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
        Stage stage = (Stage) btnReturn.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
    }
}
