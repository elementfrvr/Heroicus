package heroicus;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    private Button btnConfirm;

    @FXML
    //TODO Error handling
    private void enter() throws SQLException {
        DBHandler.getInstance().newCustomer(txtCustName.getText(), Integer.parseInt(txtCustAge.getText()), Integer.parseInt(txtCustIncome.getText()), txtCustAddress.getText());
    }


}
