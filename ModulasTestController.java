/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package create;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ModulasTestController implements Initializable {

    @FXML
    private TextField txt4;
    @FXML
    private TextField txt5;
    @FXML
    private TextField txt6;
    @FXML
    private Label Result;
    double number1, number2, result;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void modulas(ActionEvent event) {
        number1 = Double.valueOf(txt4.getText());
        number2 = Double.valueOf(txt5.getText());
        try {
            result = number1 % number2;
            txt6.setVisible(true);
            Result.setVisible(true);
            txt6.setText("" + result);
        } catch (ArithmeticException e) {
            txt6.setText("Invalid format");
        }
    }

    @FXML
    private void Clear(ActionEvent event) {
        txt4.clear();
        txt5.clear();
        txt6.clear();
        Result.setVisible(false);
        txt6.setVisible(false);
    }
}
