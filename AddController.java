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
public class AddController implements Initializable {

    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;
    @FXML
    private TextField txt3;
    double number1,number2,result;
    @FXML
    private Label Result;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Addition(ActionEvent event) {
        number1 = Double.valueOf(txt1.getText());
        number2 = Double.valueOf(txt2.getText());
        result = number1 + number2;
        Result.setVisible(true);
        txt3.setVisible(true);
        txt3.setText(""+result);
    }

    @FXML
    private void Clear(ActionEvent event) {
        txt1.clear();
        txt2.clear();
        txt3.clear();
        Result.setVisible(false);
        txt3.setVisible(false);
    }
    
}
