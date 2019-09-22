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
    private void enter() throws SQLException {
        if (DBHandler.getInstance().intCheck(txtCustAge.getText())&& DBHandler.getInstance().intCheck(txtCustIncome.getText())){
            if (DBHandler.getInstance().newCustomer(txtCustName.getText(), Integer.parseInt(txtCustAge.getText()), Integer.parseInt(txtCustIncome.getText()), txtCustAddress.getText())) {
                System.out.println("Customer Added.");
                lblFeedback.setText("Customer added.");
            } else {
                lblFeedback.setText("Customer not added. Please review customer details.");
                System.out.println("Customer failure.");
            }
        }
        else
            lblFeedback.setText("Customer not added. Please ensure that both customer age and income are entered as integers.");
    }
}
