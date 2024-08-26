package com.example.localgreengrocer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.TextField;


public class loginController {

    @FXML
    private void handleSignUpButton(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/localgreengrocer/signup.fxml"));
        Parent signUpRoot = fxmlLoader.load();
        Scene signUpScene = new Scene(signUpRoot);

        stage.setScene(signUpScene);
        stage.setMaximized(true);

        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setWidth(primaryScreenBounds.getWidth());
        stage.setHeight(primaryScreenBounds.getHeight());
    }
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private void loginButton(ActionEvent event) throws IOException {
        String enteredUsername = usernameField.getText();
        String enteredPassword = passwordField.getText();

        auth dbObject = new auth();
        String role = dbObject.authenticate(enteredUsername, enteredPassword);

        if (role != null) {
            // Credentials are valid, proceed to the relevant interface
            System.out.println("User role: " + role);

            FXMLLoader fxmlLoader = new FXMLLoader();
            Parent root;

            switch (role.toLowerCase()) {
                case "carrier":
                    fxmlLoader.setLocation(getClass().getResource("/com/example/localgreengrocer/carrieranasayfa.fxml"));
                    root = fxmlLoader.load();
                    break;
                case "owner":
                    fxmlLoader.setLocation(getClass().getResource("/com/example/localgreengrocer/ownermain.fxml"));
                    root = fxmlLoader.load();
                    break;
                case "customer":
                    fxmlLoader.setLocation(getClass().getResource("/com/example/localgreengrocer/FruitVegetableMainPart.fxml"));
                    root = fxmlLoader.load();
                    break;
                default:
                    // Handle unexpected role here (show an alert, log, etc.)
                    return;
            }

            Scene scene = new Scene(root);

            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setMaximized(true);

            Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
            stage.setWidth(primaryScreenBounds.getWidth());
            stage.setHeight(primaryScreenBounds.getHeight());

        } else {
            // Invalid credentials, show an alert or handle accordingly
            System.out.println("Invalid credentials. Please try again.");
        }
    }


}