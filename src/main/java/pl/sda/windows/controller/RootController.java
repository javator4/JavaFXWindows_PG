package pl.sda.windows.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import pl.sda.windows.App;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {

    @FXML
    private Button Button1;

    @FXML
    private Button Button2;
    private App app;

    public void setApp(App app) {
        this.app = app;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void test(){

        System.out.println("Uruchomilem się");
    }

    public void openWindow1(ActionEvent actionEvent){

        this.app.loadOneView();

    }

    public void openWindow2(ActionEvent actionEvent){

        this.app.loadTwoView();


    }
}
