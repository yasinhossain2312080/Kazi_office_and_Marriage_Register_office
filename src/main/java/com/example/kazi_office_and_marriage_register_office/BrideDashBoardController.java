package com.example.kazi_office_and_marriage_register_office;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class BrideDashBoardController
{
    @javafx.fxml.FXML
    private BorderPane boarderPaneDashBoard;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void downloadCertificateButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void requestCorrectionButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void applyForMarriageButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("marriageConsent-view.fxml"));
        boarderPaneDashBoard.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void viewApplicationStatusButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void scheduleMarriageDateButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("schedule-marriage-view.fxml"));
        boarderPaneDashBoard.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void updatePersonalInformationButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void payRegistrationFeeButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void uploadDocumentsButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("upload-documents-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Upload Documents!");
        nextStage.setScene(scene);
        nextStage.show();
    }
}