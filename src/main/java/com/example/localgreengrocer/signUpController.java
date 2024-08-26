package com.example.localgreengrocer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class signUpController {
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private TextField confirmPasswordField;
    @FXML
    private TextField roleField;
    @FXML
    private CheckBox termsCheckBox; // Add CheckBox field

    @FXML
    private void testButton() {
        auth db_object = new auth();

        String username = usernameField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();
        String role = roleField.getText();

        if (Objects.equals(password, confirmPassword)) {
            try {
                db_object.signUp(username, password, role, termsCheckBox.isSelected());

            } catch (TermsNotAcceptedException e) {
                System.out.println(e.getMessage());
                // Handle the exception as needed, e.g., show an alert to the user
            }
        }
    }


    @FXML
    private void signup(ActionEvent event) throws IOException {
        if (!termsCheckBox.isSelected()) {
            // Show a warning message that Terms of Use & Privacy Policy must be accepted.
            System.out.println("Please accept the Terms of Use & Privacy Policy.");
            return; // Do not proceed further if the checkbox is not selected.
        }

        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/localgreengrocer/login.fxml"));
        Parent signUpRoot = fxmlLoader.load();
        Scene signUpScene = new Scene(signUpRoot);

        stage.setScene(signUpScene);
        stage.setMaximized(true);

        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setWidth(primaryScreenBounds.getWidth());
        stage.setHeight(primaryScreenBounds.getHeight());
    }
}