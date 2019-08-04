package pl.sda.windows.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {

    @FXML
    private Button Button1;

    @FXML
    private Button Button2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void test(){

        System.out.println("Uruchomilem się");
    }
}
