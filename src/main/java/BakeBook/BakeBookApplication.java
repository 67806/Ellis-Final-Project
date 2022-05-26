package BakeBook;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BakeBookApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
                FXMLLoader fxmlLoader = new FXMLLoader(BakeBookApplication.class.getResource("BakeBook-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 600, 400);
                primaryStage.setScene(scene);
                primaryStage.centerOnScreen();
                primaryStage.setTitle("Bake Book");
                primaryStage.show();

            }
        }

