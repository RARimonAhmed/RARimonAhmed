/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package create;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private BorderPane borderPane;
    String text="";
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            Parent pane = FXMLLoader.load(getClass().getResource("Temp.fxml"));
            borderPane.setCenter(pane);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void btnAction(ActionEvent event) throws IOException {
        text = ((Button)event.getSource()).getText();
        if(text.equals("Add")){
            Parent pane = FXMLLoader.load(getClass().getResource("Add.fxml"));
            borderPane.setCenter(pane);
        }
        else if(text.equals("Sub")){
            Parent pane = FXMLLoader.load(getClass().getResource("Subtruct.fxml"));
            borderPane.setCenter(pane);
        }
        else if(text.equals("Mul")){
            Parent pane = FXMLLoader.load(getClass().getResource("Multiply.fxml"));
            borderPane.setCenter(pane);
        }
        else if(text.equals("Div")){
            Parent pane = FXMLLoader.load(getClass().getResource("Divider.fxml"));
            borderPane.setCenter(pane);
        }
        else if(text.equals("Mod")){
            Parent pane = FXMLLoader.load(getClass().getResource("ModulasTest.fxml"));
            borderPane.setCenter(pane);
        }
        else if(text.equals("Back")){
            Parent pane = FXMLLoader.load(getClass().getResource("Temp.fxml"));
            borderPane.setCenter(pane);
        }
    }

    
}
