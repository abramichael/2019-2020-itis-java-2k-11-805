package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.PrintWriter;
import java.net.Socket;

public class Client extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        String host = "localhost";
        int port = 1234;
        Socket s = new Socket(host, port);
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

        Parent root = FXMLLoader.load(getClass().getResource("interface.fxml"));
        primaryStage.setTitle("Client");
        primaryStage.setScene(new Scene(root, 600, 400));

        TextField tf = (TextField) root.lookup("#msg");
        TextArea ta = (TextArea) root.lookup("#dialog");

        tf.setOnKeyPressed(
                event -> {
                    if (event.getCode() == KeyCode.ENTER) {
                        ta.appendText("CLIENT: " + tf.getText() + "\n");
                        pw.println(tf.getText());
                        tf.clear();
                    }
                }
        );

        tf.requestFocus();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
