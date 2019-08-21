package UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main extends Application {
    //Database login
    //FOR TESTING ONLY
    private static final String USERNAME = "dbuser";
    private static final String PASSWORD ="dbuser";
    private static final String CONN = "jdbc:mysql://localhost";
    private static final String PORT ="3307";
    private static final String TABLE = "heroicus_test";


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Heroicus Agent Management");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setMaximized(true);
    }


    public static void main(String[] args) throws SQLException {
        launch(args);
        Connection con = null;
        con = DriverManager.getConnection(CONN+":"+PORT+"/" +TABLE, USERNAME, PASSWORD);
        System.out.println("Connected");
    }
}
