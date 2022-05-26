package BakeBook;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class BakeBookController {
    public Button homeButtonClick;

    @FXML
    ImageView imageView = new ImageView();

    @FXML
    BakeBook photos = new BakeBook();


    public void btnNext() {
        imageView.setImage(photos.getNextImage());
    }

    public void btnBack() {
        imageView.setImage(photos.getPreviousImage());


    }

    public void CccButtonClick(ActionEvent event) throws IOException {
        Parent ChocolateChipCookies = FXMLLoader.load(getClass().getResource("ChocolateChipCookies-view.fxml"));
        Scene scene = new Scene(ChocolateChipCookies);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Chocolate Chip Cookies");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public void Browniesbuttonclick(ActionEvent event) throws IOException {
        Parent Brownies = FXMLLoader.load(getClass().getResource("Brownies-view.fxml"));
        Scene scene = new Scene(Brownies);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Brownies");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public void AcmButtonClick(ActionEvent event) throws IOException {
        Parent AppleCrumbleMuffins = FXMLLoader.load(getClass().getResource("AppleCrumbleMuffins-view.fxml"));
        Scene scene = new Scene(AppleCrumbleMuffins);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Apple Crumble Muffins");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public void RvcButtonClick(ActionEvent event) throws IOException {
        Parent RedVelvetCupcakes = FXMLLoader.load(getClass().getResource("RedVelvetCupcakes-view.fxml"));
        Scene scene = new Scene(RedVelvetCupcakes);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Red Velvet Cupcakes");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }

    public void conversionBtnClick(ActionEvent event) throws IOException {
        Parent CCC = FXMLLoader.load(getClass().getResource("Conversion-view.fxml"));
        Scene scene = new Scene(CCC);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Conversion");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }

    public void conversionBrownies(ActionEvent event) throws IOException {
        Parent Brownies = FXMLLoader.load(getClass().getResource("Conversion1.fxml"));
        Scene scene = new Scene(Brownies);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Conversion");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }

    public void conversionRVC(ActionEvent event) throws IOException {
        Parent RVC = FXMLLoader.load(getClass().getResource("Conversion3.fxml"));
        Scene scene = new Scene(RVC);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Conversion");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }

    public void conversionACM(ActionEvent event) throws IOException {
        Parent ACM = FXMLLoader.load(getClass().getResource("Conversion2.fxml"));
        Scene scene = new Scene(ACM);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Conversion");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }


        public void homeButtonClick(ActionEvent event) throws IOException {
            Parent BakeBook = FXMLLoader.load(getClass().getResource("BakeBook-view.fxml"));
            Scene scene = new Scene(BakeBook);
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setTitle("BakeBook");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }

    public void btnRecipeRVC(ActionEvent event) {
    }
}



