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
import java.sql.*;

public class FruitsController {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/user_authentication?allowPublicKeyRetrieval=true&&useSSL=false";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "temmuz*167BA.";

    @FXML
    private TextField AppleKg;

    @FXML
    private TextField BananaKg;

    @FXML
    private TextField BlueBerryKg;

    @FXML
    private TextField CherryKg;

    @FXML
    private TextField CoconutKg;

    @FXML
    private TextField GrapeKg;

    @FXML
    private TextField KiwiKg;

    @FXML
    private TextField LemonKg;

    @FXML
    private TextField MangoKg;

    @FXML
    private TextField OrangeKg;

    @FXML
    private TextField PearKg;

    @FXML
    private TextField StrawberryKg;

    @FXML
    private Button PearAdd;

    @FXML
    private Button OrangeAdd;

    @FXML
    private Button MangoAdd;

    @FXML
    private Button BananaAdd;

    @FXML
    private Button BlueberryAdd;

    @FXML
    private Button GrapeAdd;

    @FXML
    private Button KiwiAdd;

    @FXML
    private Button CoconutAdd;

    @FXML
    private Button StrawberryAdd;

    @FXML
    private Button AppleAdd;

    @FXML
    private Button CherryAdd;

    @FXML
    private Button LemonAdd;

    @FXML
    private ListView<String> FruitListView;


    @FXML
    private void handleAddPearAction() {

        String input = PearKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 1) + 1.2;
            FruitListView.getItems().add(String.format("%.2f Tl Pear", result));
            PearKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }

    @FXML
    private void handleAddOrangeAction() {
        String input = OrangeKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 2) + 1.2;
            FruitListView.getItems().add(String.format("%.2f Tl Orange", result));
            OrangeKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }

    @FXML
    private void handleAddMangoAction() {
        String input = MangoKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 3) + 1.2;
            FruitListView.getItems().add(String.format("%.2f Tl Mango", result));
            MangoKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }

    @FXML
    private void handleAddBananaAction() {
        String input = BananaKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 4) + 1.2;
            FruitListView.getItems().add(String.format("%.2f Tl Banana", result));
            BananaKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }

    @FXML
    private void handleAddBlueberryAction() {
        String input = BlueBerryKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 5) + 1.2;
            FruitListView.getItems().add(String.format("%.2f Tl Blueberry", result));
            AppleKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }
    }

    @FXML
    private void handleAddGrapeAction() {
        String input = GrapeKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 6) + 1.2;
            FruitListView.getItems().add(String.format("%.2f Tl Grape", result));
            GrapeKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }

    @FXML
    private void handleAddKiwiAction() {
        String input = KiwiKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 7) + 1.2;
            FruitListView.getItems().add(String.format("%.2f Tl Kiwi", result));
            KiwiKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }

    @FXML
    private void handleAddCoconutAction() {
        String input = CoconutKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 8) + 1.2;
            FruitListView.getItems().add(String.format("%.2f Tl Coconut", result));
            CoconutKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }

    @FXML
    private void handleAddStrawberryAction() {
        String input =StrawberryKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 9) + 1.2;
            FruitListView.getItems().add(String.format("%.2f Tl Strawberry", result));
            StrawberryKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }

    @FXML
    private void handleAddAppleAction() {
        String input = AppleKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 10) + 1.2;
            FruitListView.getItems().add(String.format("%.2f Tl Apple", result));
            AppleKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }

    }

    @FXML
    private void handleAddCherryAction() {
        String input = CherryKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 11) + 1.2;
            FruitListView.getItems().add(String.format("%.2f Tl Cherry", result));
            CherryKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }
    }
    @FXML
    private void handleAddLemonAction() {
        String input = LemonKg.getText();

        try {
            double number = Double.parseDouble(input);
            double result = (number * 12) + 1.2;
            FruitListView.getItems().add(String.format("%.2f Tl Lemon", result));
            LemonKg.clear();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number:");
        }
    }
    @FXML
    private void handleCardButton(ActionEvent event) {
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
    @FXML
    private void handleConfirmAction() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String query = "INSERT INTO products (name, price) VALUES (?, ?)";
            for (String item : FruitListView.getItems()) {
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    String[] parts = item.split(" kg ");
                    String name = parts[1];
                    double price = Double.parseDouble(parts[0]);

                    preparedStatement.setString(1, name);
                    preparedStatement.setDouble(2, price);
                    preparedStatement.executeUpdate();
                }
            }
            System.out.println("products are registered.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
