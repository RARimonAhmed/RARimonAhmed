/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class FXMLController implements Initializable {
    

    String operator = "",oldtext,newtext,number;
    double num=0,num2;
    boolean start = true;
    @FXML
    private TextField txt;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void operatorAction(ActionEvent event) {
        num = Double.parseDouble(txt.getText());
        operator = ((Button)event.getSource()).getText();
        txt.clear();
    }

    @FXML
    public void numberAction(ActionEvent event) {
        if(start == true){
            txt.setText("");
            start = false;
        }
        oldtext = txt.getText();
        newtext = ((Button)event.getSource()).getText();
        number = oldtext + newtext;
        txt.setText(number);
    }


    @FXML
    private void Clear(ActionEvent event) {
        oldtext = txt.getText();
        if(!oldtext.equals("")){
            String substr = oldtext.substring(0,oldtext.length()-1);
            txt.setText(substr);
        }
    }

    @FXML
    private void allClear(ActionEvent event) {
        txt.clear();
        start = true;
    }

    @FXML
    private void dotAction(ActionEvent event) {
        oldtext = txt.getText();
        if(oldtext.contains(".")){
            return;
        }
        else{
            txt.setText(oldtext+".");
        }
        
    }


    @FXML
    private void offAction(ActionEvent event) {
        System.exit(0);
        System.out.println("Finished");
        
    }

    @FXML
    private void equalsOnAction(ActionEvent event) {
        
        num2 = Double.parseDouble(txt.getText());
        
        if(operator.equals("+")){
            txt.setText(""+(num+num2));
        }
        else if(operator.equals("-")){
            txt.setText(""+(num-num2));
        }
        else if(operator.equals("*")){
            txt.setText(""+(num*num2));
        }
        else if(operator.equals("/")){
            try{
                txt.setText(""+(num/num2));
            }
            catch(ArithmeticException e){
                txt.setText("can't divide by zero"+e);
            }
        }
        else if(operator.equals("%")){
            num2 = num2 / 100;
            txt.setText(""+num*num2);
        }
    }

    
}
