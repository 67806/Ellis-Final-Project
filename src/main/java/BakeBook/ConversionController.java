package BakeBook;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class ConversionController implements Initializable {


    @FXML
    private ComboBox combFrom;

    @FXML
    private ComboBox combTo;

    @FXML
    private Label labelFrom;

    @FXML
    private Label labelTo;

    @FXML
    private TextArea convertedAnswer;

    @FXML
    private TextField toConvert;


    @FXML
    public void select(ActionEvent event) {
        String sFrom = combFrom.getSelectionModel().getSelectedItem().toString();
        labelFrom.setText(sFrom);
    }

    @FXML
    public void selectTo(ActionEvent event) {
        String sTo = combTo.getSelectionModel().getSelectedItem().toString();
        labelTo.setText(sTo);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> list = FXCollections.observableArrayList("grams", "cups", "tablespoons", "ml");
        combFrom.setItems(list);

        ObservableList<String> listTo = FXCollections.observableArrayList("grams", "cups", "tablespoons", "ml");
        combTo.setItems(listTo);
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

    public void btnRecipeChocolateChipCookies(ActionEvent event) throws IOException {
        Parent ChocolateChipCookies = FXMLLoader.load(getClass().getResource("ChocolateChipCookies-view.fxml"));
        Scene scene = new Scene(ChocolateChipCookies);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Chocolate Chip Cookies");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }


    public void btnRecipeBrownies(ActionEvent event) throws IOException {
        Parent Brownies = FXMLLoader.load(getClass().getResource("Brownies-view.fxml"));
        Scene scene = new Scene(Brownies);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Brownies");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public void btnRecipeRVC(ActionEvent event) throws IOException {
        Parent RedVelvetCupcakes = FXMLLoader.load(getClass().getResource("RedVelvetCupcakes-view.fxml"));
        Scene scene = new Scene(RedVelvetCupcakes);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Red Velvet Cupcakes");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public void btnRecipeACM(ActionEvent event) throws IOException {
        Parent ACM = FXMLLoader.load(getClass().getResource("AppleCrumbleMuffins-view.fxml"));
        Scene scene = new Scene(ACM);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Apple Crumble Muffins");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    int result;
    Conversion cv;




    public String getAnswer(int toConvert, Label labelFrom, Label labelTo, TextArea convertedAnswer) {
        int gramsToCups = 220;
        if (labelFrom.toString() == "grams" && labelTo.toString() == "cups"){
            result = toConvert*gramsToCups;
        }
        return String.valueOf(result);
}


    public void convertBtn(ActionEvent event) {
    }
}



