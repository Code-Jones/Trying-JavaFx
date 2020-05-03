package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample/login.fxml"));
        primaryStage.setTitle("Pirate Key");
        Rectangle2D rectangle2D = Screen.getPrimary().getVisualBounds();
        primaryStage.setScene(new Scene(root, 1000, 800));
//        primaryStage.initStyle(StageStyle.TRANSPARENT);
//        primaryStage.sizeToScene();
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
