package banking_management_system1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class DataBaseClassOfBank {

    ObservableList<CreateAccounts> ac = FXCollections.observableArrayList();
    PreparedStatement pst;

    Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking_management_system", "root", "");
//        JOptionPane.showMessageDialog(null, "Connection Succcessfully");
        return conn;
    }

    public void getValue(String number, String password) throws SQLException {
        Connection conn = getConnection();
        String Number = "", Password = "";
        Statement statement = conn.createStatement();
        String sql = "select Account_Number,Passwords from login where Account_Number = "+number;
        ResultSet resultset = statement.executeQuery(sql);
        while (resultset.next()) {
            Number = resultset.getString("Account_Number");
            Password = resultset.getString("Passwords");
            
        }
        if ((number.equals(Number)) && (password.equals(Password))) {
            JOptionPane.showMessageDialog(null, "Log In Successfully");
            try {
                Parent pane = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
                Scene scene = new Scene(pane);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(DataBaseClassOfBank.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Log In Unsuccessful");
        }
        
    }

    public String setValue(CreateAccounts acounts) throws SQLException {
        //FXMLDocumentController fd = new FXMLDocumentController();
        Connection conn = getConnection();
        Statement statement = conn.createStatement();
        String checksql = "select Account_Number from login";
        ResultSet resultset = statement.executeQuery(checksql);
        String Number = "";
        while (resultset.next()) {
            Number = resultset.getString("Account_Number");
        }
//        String sql = "insert into login values(" + acounts.acnum + "," + acounts.pass + ",'" + acounts.name + "'," + acounts.phn + ",'" + acounts.email + "','" + acounts.address + "','" + acounts.actype + "','" + acounts.rel + "'," + acounts.depositeBal + "," + acounts.avail + ")";
//        statement.executeUpdate(sql);

        if (Number.equals(acounts.acnum)) {
            JOptionPane.showMessageDialog(null, "Account created unsuccessful");
        } else {
            JOptionPane.showMessageDialog(null, "Account created successfully");
            String sql = "insert into login values(" + acounts.acnum + "," + acounts.pass + ",'" + acounts.name + "'," + acounts.phn + ",'" + acounts.email + "','" + acounts.address + "','" + acounts.actype + "','" + acounts.rel + "'," + acounts.depositeBal + "," + acounts.avail + ")";
            statement.executeUpdate(sql);
        }
        return "";
    }
}
