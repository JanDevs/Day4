package org.example.hexaconvert;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;


import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
    @FXML
    private Label res;

    @FXML //fx:id comboBox
    private ComboBox<String> opCombo;

    @FXML
    private TextField iniValue;
    @FXML
    protected void onButtonClick() {
        String conv = iniValue.getText();
        switch(opCombo.getValue()){
            case "Binario a Hexadecimal":
                int v = Integer.parseInt(conv);
                String hexa = Integer.toHexString(v);
                res.setText("El resultado es: " + hexa);
            break;
            case "Hexadecimal a Binario":
                int hex = Integer.parseInt(conv, 16);
                String binary = Integer.toBinaryString(hex);
                res.setText(binary);
                break;
        }

    }

    @Override
    public void initialize(URL fxmlFileLocation, ResourceBundle resources){

        opCombo.getItems().addAll("Hexadecimal a Binario", "Binario a Hexadecimal");
    }

}