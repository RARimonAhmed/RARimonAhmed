package calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator_In_Java_Fx extends Application {
    double num1,num2;
    String result="",operator="";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
        public void start
        (Stage stage) throws Exception {
            BorderPane br = new BorderPane();
            br.setMinHeight(400);
            br.setMinWidth(500);

            HBox hbox = new HBox();
            hbox.setMinHeight(50);
            hbox.setMinWidth(500);
            hbox.setStyle("-fx-background-color:gold");

            Label lb = new Label("Calculator");
            hbox.setStyle("-fx-background-color:Blue");

            final TextField txt = new TextField();
            txt.setMinHeight(40);
            txt.setMinWidth(400);
            txt.setStyle("-fx-background-color:white;");

            hbox.setSpacing(20);
            hbox.getChildren().addAll(lb, txt);
            br.setTop(hbox);

            AnchorPane anp = new AnchorPane();
            anp.setMaxHeight(280);
            anp.setMaxWidth(280);
            anp.setStyle("-fx-background-color:brown");

            final Button btn1 = new Button();
            btn1.setText("1");
            btn1.setLayoutX(20);
            btn1.setLayoutY(50);
            btn1.setMinHeight(30);
            btn1.setMinWidth(50);
            btn1.setOnAction(new EventHandler<ActionEvent>() {
                
                @Override
                public void handle(ActionEvent t) {
                    String s = txt.getText();
                    txt.setText(s+btn1.getText());
                }
            });
            anp.getChildren().addAll(btn1);
            btn1.setStyle("-fx-background-color:white");

            final Button btn2 = new Button();
            btn2.setText("2");
            btn2.setLayoutX(80);
            btn2.setLayoutY(50);
            btn2.setMinHeight(30);
            btn2.setMinWidth(50);
            anp.getChildren().addAll(btn2);
            btn2.setStyle("-fx-background-color:white");
            btn2.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    String s = txt.getText();
                    txt.setText(s+btn2.getText());
                }
            });
            
            final Button btn3 = new Button();
            btn3.setText("3");
            btn3.setLayoutX(140);
            btn3.setLayoutY(50);
            btn3.setMinHeight(30);
            btn3.setMinWidth(50);
            anp.getChildren().addAll(btn3);
            btn3.setStyle("-fx-background-color:white");
            btn3.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    String s = txt.getText();
                    txt.setText(s+btn3.getText());
                }
            });

            final Button btn4 = new Button();
            btn4.setText("4");
            btn4.setLayoutX(20);
            btn4.setLayoutY(100);
            btn4.setMinHeight(30);
            btn4.setMinWidth(50);;
            anp.getChildren().addAll(btn4);
            btn4.setStyle("-fx-background-color:white");
            btn4.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    String s = txt.getText();
                    txt.setText(s+btn4.getText());
                }
            });

            final Button btn5 = new Button();
            btn5.setText("5");
            btn5.setLayoutX(80);
            btn5.setLayoutY(100);
            btn5.setMinHeight(30);
            btn5.setMinWidth(50);
            anp.getChildren().addAll(btn5);
            btn5.setStyle("-fx-background-color:white");
            btn5.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    String s = txt.getText();
                    txt.setText(s+btn5.getText());
                }
            });

            final Button btn6 = new Button();
            btn6.setText("6");
            btn6.setLayoutX(140);
            btn6.setLayoutY(100);
            btn6.setMinHeight(30);
            btn6.setMinWidth(50);
            anp.getChildren().addAll(btn6);
            btn6.setStyle("-fx-background-color:white");
            btn6.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    String s = txt.getText();
                    txt.setText(s+btn6.getText());
                }
            });

            final Button btn7 = new Button();
            btn7.setText("7");
            btn7.setLayoutX(20);
            btn7.setLayoutY(160);
            btn7.setMinHeight(30);
            btn7.setMinWidth(50);
            anp.getChildren().addAll(btn7);
            btn7.setStyle("-fx-background-color:white");
            btn7.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    String s = txt.getText();
                    txt.setText(s+btn7.getText());
                }
            });

            final Button btn8 = new Button();
            btn8.setText("8");
            btn8.setLayoutX(80);
            btn8.setLayoutY(160);
            btn8.setMinHeight(30);
            btn8.setMinWidth(50);
            anp.getChildren().addAll(btn8);
            btn8.setStyle("-fx-background-color:white");
            btn8.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    String s = txt.getText();
                    txt.setText(s+btn8.getText());
                }
            });

            final Button btn9 = new Button();
            btn9.setText("9");
            btn9.setLayoutX(140);
            btn9.setLayoutY(160);
            btn9.setMinHeight(30);
            btn9.setMinWidth(50);
            anp.getChildren().addAll(btn9);
            btn9.setStyle("-fx-background-color:white");
            btn9.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    String s = txt.getText();
                    txt.setText(s+btn9.getText());
                }
            });

            
            br.setCenter(anp);
            
            
            VBox vbox = new VBox();
            vbox.setMaxHeight(320);
            vbox.setMinWidth(120);
            vbox.setStyle("-fx-background-color:red");
            
            final Button btnAdd = new Button();
            btnAdd.setText("+");
            btnAdd.setStyle("-fx-background-color:white");
            btnAdd.setMinHeight(30);
            btnAdd.setMinWidth(50);
            btnAdd.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    operator = "+";
                    num1 = Double.parseDouble(txt.getText());
                    txt.clear();
                }
            });
            Button btnMinus = new Button();
            btnMinus.setText("-");
            btnMinus.setStyle("-fx-background-color:white");
            btnMinus.setMinHeight(30);
            btnMinus.setMinWidth(50);
            btnMinus.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    operator="-";
                    num1 = Double.parseDouble(txt.getText());
                    txt.clear();
                }
            });
            final Button btnMultiply = new Button();
            btnMultiply.setText("*");
            btnMultiply.setStyle("-fx-background-color:white");
            btnMultiply.setMinHeight(30);
            btnMultiply.setMinWidth(50);
            btnMultiply.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    operator = "*";
                    num1 = Double.parseDouble(txt.getText());
                    txt.clear();
                }
            });
            Button btnDivision = new Button();
            btnDivision.setText("/");
            btnDivision.setStyle("-fx-background-color:white");
            btnDivision.setMinHeight(30);
            btnDivision.setMinWidth(50);
            btnDivision.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    operator="/";
                    num1 = Double.parseDouble(txt.getText());
                    txt.clear();
                }
            });
            final Button btnZero = new Button();
            btnDivision.setText("0");
            btnDivision.setStyle("-fx-background-color:white");
            btnDivision.setMinHeight(30);
            btnDivision.setMinWidth(50);
            btnDivision.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    String s = txt.getText();
                    txt.setText(s+btnZero.getText());
                }
            });
            final Button btnClear = new Button();
            btnClear.setText("C");
            btnClear.setStyle("-fx-background-color:white");
            btnClear.setMinHeight(30);
            btnClear.setMinWidth(50);
            btnClear.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    txt.clear();
                }
            });
            final Button btnEquals = new Button();
            btnEquals.setText("=");
            btnEquals.setStyle("-fx-background-color:white");
            btnEquals.setMinHeight(30);
            btnEquals.setMinWidth(50);
            btnEquals.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    num2 = Double.parseDouble(txt.getText());
                    if("+".equals(operator)){
                        result = String.valueOf(num1 + num2);
                        txt.setText(result);
                    }
                    else if("-".equals(operator)){
                        result = String.valueOf(num1 - num2);
                        txt.setText(result);
                    }
                    else if("*".equals(operator)){
                        result = String.valueOf(num1 * num2);
                        txt.setText(result);
                    }
                    else if("/".equals(operator)){
                        result = String.valueOf(num1 / num2);
                        txt.setText(result);
                    }
                }
            });
            vbox.getChildren().addAll(btnAdd,btnMinus,btnMultiply,btnDivision,btnZero,btnClear,btnEquals);
            vbox.setAlignment(Pos.CENTER);
            br.setRight(vbox);
            
            
            HBox hbox2 = new HBox();
            hbox2.setMaxHeight(320);
            hbox2.setMinWidth(80);
            hbox2.setStyle("-fx-background-color:yellow");
            
            Button btncross = new Button("Delete");
            btncross.setMinWidth(50);
            btncross.setMinHeight(25);
            hbox2.setAlignment(Pos.CENTER);
            btn8.setStyle("-fx-background-color:white");
            
            
            hbox2.getChildren().addAll(btncross);
            
            btncross.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    txt.deleteNextChar();
                }
            });
            
            br.setLeft(hbox2);
            
            
            Scene scene = new Scene(br);
            stage.setScene(scene);
            stage.show();
        }
    }
