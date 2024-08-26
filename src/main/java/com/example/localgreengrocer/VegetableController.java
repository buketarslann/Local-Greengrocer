package com.example.localgreengrocer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class VegetableController {

    @FXML
    private TextField artichokeKg;

    @FXML
    private TextField BroccoliKg;

    @FXML
    private TextField CarrotKg;

    @FXML
    private TextField DaikonKg;

    @FXML
    private TextField EggplantKg;

    @FXML
    private TextField FennelKg;

    @FXML
    private TextField GarlicKg;

    @FXML
    private TextField HorseradishKg;

    @FXML
    private TextField IcebergLettuceKg;

    @FXML
    private TextField jicamaKg;

    @FXML
    private TextField kaleKg;

    @FXML
    private TextField leekKg;

    @FXML
    private Button broccoliAdd;

    @FXML
    private Button artichokeAdd;

    @FXML
    private Button carrotAdd;

    @FXML
    private Button daikonAdd;

    @FXML
    private Button eggplantAdd;

    @FXML
    private Button fennelAdd;

    @FXML
    private Button garlicAdd;

    @FXML
    private Button horseradishAdd;

    @FXML
    private Button IcebergLettuceAdd;

    @FXML
    private Button jicamaAdd;

    @FXML
    private Button kaleAdd;

    @FXML
    private Button leekAdd;

    @FXML
    private ListView<String> VegetableListView;


    @FXML
    private void artichokeAdd() {

        String input = artichokeKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 1) + 1.2;
            VegetableListView.getItems().add(String.format("%.2f Tl Pear", result));
            artichokeKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }
    }

    @FXML
    private void broccoliAdd() {
        String input = BroccoliKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 2) + 1.2;
            VegetableListView.getItems().add(String.format("%.2f Tl Orange", result));
            BroccoliKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }

    @FXML
    private void carrotAdd() {
        String input = CarrotKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 3) + 1.2;
            VegetableListView.getItems().add(String.format("%.2f Tl Mango", result));
            CarrotKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }

    @FXML
    private void daikonAdd() {
        String input = DaikonKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 4) + 1.2;
            VegetableListView.getItems().add(String.format("%.2f Tl Banana", result));
            DaikonKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }

    @FXML
    private void eggplantAdd() {
        String input = EggplantKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 5) + 1.2;
            VegetableListView.getItems().add(String.format("%.2f Tl Blueberry", result));
            EggplantKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }
    }

    @FXML
    private void fennelAdd() {
        String input = FennelKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 6) + 1.2;
            VegetableListView.getItems().add(String.format("%.2f Tl Grape", result));
            FennelKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }

    @FXML
    private void garlicAdd() {
        String input = GarlicKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 7) + 1.2;
            VegetableListView.getItems().add(String.format("%.2f Tl Kiwi", result));
            GarlicKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }

    @FXML
    private void horseradishAdd() {
        String input = HorseradishKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 8) + 1.2;
            VegetableListView.getItems().add(String.format("%.2f Tl Coconut", result));
            HorseradishKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }

    @FXML
    private void IcebergLettuceAdd() {
        String input =IcebergLettuceKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 9) + 1.2;
            VegetableListView.getItems().add(String.format("%.2f Tl Strawberry", result));
            IcebergLettuceKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }

    @FXML
    private void jicamaAdd() {
        String input = jicamaKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 10) + 1.2;
            VegetableListView.getItems().add(String.format("%.2f Tl Apple", result));
            jicamaKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }


    @FXML
    private void kaleAdd() {
        String input = kaleKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 11) + 1.2;
            VegetableListView.getItems().add(String.format("%.2f Tl Cherry", result));
            kaleKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }
    @FXML
    private void leekAdd() {
        String input = leekKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 12) + 1.2;
            VegetableListView.getItems().add(String.format("%.2f Tl Lemon", result));
            leekKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }
    }
    @FXML
    private void shoppingCart(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/localgreengrocer/shoppingcard.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
