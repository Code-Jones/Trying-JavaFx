package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller {
    @FXML private Text actionTarget;

    @FXML private void handleSubmitButtonAction(ActionEvent actionEvent) {
        actionTarget.setText("Sign in button Pressed");
        System.out.println("Sign in button pressed");
    }
}
