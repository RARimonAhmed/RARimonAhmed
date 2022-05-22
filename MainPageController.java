package banking_management_system1;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javax.swing.JOptionPane;

public class MainPageController implements Initializable {

    @FXML
    private Button Withdraw;
    @FXML
    private Button Transactions;
    @FXML
    private Button CustomarList;
    @FXML
    private Button Checkblnc;
    @FXML
    private Button Changebtn;
    @FXML
    private Button Developer;
    @FXML
    private JFXTextField serchBox;
    @FXML
    private JFXButton searchbtn;
    @FXML
    private Button Profile;
    @FXML
    private Button Deposite;
    @FXML
    private Button Transfer;
    @FXML
    private ImageView PrfofileImage;
    @FXML
    private JFXTextField CreateNameField;
    @FXML
    private JFXTextField CreatePhone;
    @FXML
    private JFXTextField CreateEmail;
    @FXML
    private JFXTextField CreateAddress;
    @FXML
    private JFXTextField CreateAccountNumber;
    @FXML
    private JFXTextField CreateAccountType;
    @FXML
    private JFXTextField CreateReligion;
    @FXML
    private JFXPasswordField CreatePassword;
    @FXML
    private JFXButton Editbtn;
    @FXML
    private JFXButton Savebtn;
    DataBaseClassOfBank db = new DataBaseClassOfBank();
    @FXML
    private AnchorPane PaneOfProfile;
    @FXML
    private AnchorPane DepositePane;
    @FXML
    private JFXTextField DepositeName;
    @FXML
    private JFXTextField DepositeCredit;
    @FXML
    private JFXTextField DepositeAvailable;
    @FXML
    private JFXTextField DepositeAmount;
    @FXML
    private JFXTextField DepositeTotal;
    @FXML
    private JFXButton DepositeButton;
    @FXML
    private JFXTextField Depositeserch;
    @FXML
    private JFXButton Depositesearchbtn;
    @FXML
    private AnchorPane TransferPane;
    @FXML
    private JFXTextField TName;
    @FXML
    private JFXTextField TDebit;
    @FXML
    private JFXTextField TAvail;
    @FXML
    private JFXTextField TAmount;
    @FXML
    private JFXTextField TTotal;
    @FXML
    private JFXButton Transferbtn;
    @FXML
    private JFXTextField TtransfarSearch;
    @FXML
    private JFXButton TSearch;
    @FXML
    private AnchorPane CustomarListPane;
    @FXML
    private TableView<CreateAccounts> TableCustomar;
    @FXML
    private TableColumn<CreateAccounts, String> TableName;
    @FXML
    private TableColumn<CreateAccounts, String> TableAddress;
    @FXML
    private AnchorPane ViewBalancePane;
    @FXML
    private JFXTextField ViewSearch;
    @FXML
    private JFXButton ViewSearchbtn;
    @FXML
    private JFXTextField ViewName;
    @FXML
    private JFXTextField ViewCredit;
    @FXML
    private JFXTextField ViewAvailable;
    @FXML
    private JFXTextField ViewDebit;
    @FXML
    private JFXTextField OldPin;
    @FXML
    private JFXTextField NewPin;
    @FXML
    private JFXButton PinSavebtn;
    @FXML
    private AnchorPane ChangeAccountnumber;
    @FXML
    private JFXTextField AccountNumberbox;
    @FXML
    private AnchorPane DeveloperPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void Withdraw(ActionEvent event) {
        PaneOfProfile.setVisible(false);
        DepositePane.setVisible(false);
        TransferPane.setVisible(false);
        CustomarListPane.setVisible(false);
        ViewBalancePane.setVisible(false);
        ChangeAccountnumber.setVisible(false);
        DeveloperPane.setVisible(false);
        JOptionPane.showMessageDialog(null, "Working is progress");
    }

    @FXML
    private void Transactions(ActionEvent event) {
        
        PaneOfProfile.setVisible(false);
        DepositePane.setVisible(false);
        TransferPane.setVisible(false);
        CustomarListPane.setVisible(false);
        ViewBalancePane.setVisible(false);
        ChangeAccountnumber.setVisible(false);
        DeveloperPane.setVisible(false);
        JOptionPane.showMessageDialog(null, "Working is progress");
    }

    @FXML
    private void CustomarList(ActionEvent event) throws SQLException {
        
        CustomarListPane.setVisible(true);
        PaneOfProfile.setVisible(false);
        DepositePane.setVisible(false);
        TransferPane.setVisible(false);
        ViewBalancePane.setVisible(false);
        ChangeAccountnumber.setVisible(false);
        DeveloperPane.setVisible(false);
        getsShow();
//        Connection conn = db.getConnection();
//        Statement st = conn.createStatement();
//        String sql = "select Name,Address,Account_Type,Religion from login";
//        st.executeQuery(sql);
    }

    @FXML
    private void Checkblnc(ActionEvent event) {
        ViewBalancePane.setVisible(true);
        PaneOfProfile.setVisible(false);
        DepositePane.setVisible(false);
        TransferPane.setVisible(false);
        ChangeAccountnumber.setVisible(false);
        CustomarListPane.setVisible(false);
        DeveloperPane.setVisible(false);
    }

    @FXML
    private void Changebtn(ActionEvent event) {
        ChangeAccountnumber.setVisible(true);
        ViewBalancePane.setVisible(false);
        PaneOfProfile.setVisible(false);
        DepositePane.setVisible(false);
        TransferPane.setVisible(false);
        CustomarListPane.setVisible(false);
        DeveloperPane.setVisible(false);
    }

    @FXML
    private void Developer(ActionEvent event) {
        DeveloperPane.setVisible(true);
        ViewBalancePane.setVisible(false);
        PaneOfProfile.setVisible(false);
        DepositePane.setVisible(false);
        TransferPane.setVisible(false);
        CustomarListPane.setVisible(false);
        ChangeAccountnumber.setVisible(false);
        
    }

    @FXML
    private void searchbtn(ActionEvent event) throws SQLException {
        if (serchBox.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter account number to show details");
            return;
        }
        int acnumber = Integer.valueOf(serchBox.getText());
        getsShow(acnumber);
        serchBox.clear();
    }

    @FXML
    private void Profile(ActionEvent event) throws SQLException {
        PaneOfProfile.setVisible(true);
        DepositePane.setVisible(false);
        TransferPane.setVisible(false);
        CustomarListPane.setVisible(false);
        ChangeAccountnumber.setVisible(false);
        ViewBalancePane.setVisible(false);
        DeveloperPane.setVisible(false);
    }

    @FXML
    private void Deposite(ActionEvent event) {
        DepositePane.setVisible(true);
        PaneOfProfile.setVisible(false);
        TransferPane.setVisible(false);
        CustomarListPane.setVisible(false);
        ChangeAccountnumber.setVisible(false);
        ViewBalancePane.setVisible(false);
        DeveloperPane.setVisible(false);
    }

    @FXML
    private void Transfer(ActionEvent event) {
        TransferPane.setVisible(true);
        DepositePane.setVisible(false);
        PaneOfProfile.setVisible(false);
        CustomarListPane.setVisible(false);
        ChangeAccountnumber.setVisible(false);
        ViewBalancePane.setVisible(false);
        DeveloperPane.setVisible(false);
    }

    ObservableList<CreateAccounts> getsShow(int id) throws SQLException {
        int ID = id;
        Connection conn = db.getConnection();
        ObservableList<CreateAccounts> accountlist = FXCollections.observableArrayList();
        Statement statement = conn.createStatement();
        String sql = "select * from  login where Account_Number = " + ID + "";
        //String customarsql = "select Name,Address,Account_Type,Religion from login";
        ResultSet rs = statement.executeQuery(sql);
        //ResultSet customarrs = statement.executeQuery(customarsql);
        while (rs.next()) {
            String acnum = rs.getString("Account_Number");
            String acpass = rs.getString("Passwords");
            String name = rs.getString("Name");
            String Dname = rs.getString("Name");
            String phone = rs.getString("Phone");
            String email = rs.getString("Email");
            String address = rs.getString("Address");
            String actype = rs.getString("Account_Type");
            String rel = rs.getString("Religion");
            String credit = rs.getString("Credit_Amount");
            String bal = rs.getString("Available_Balance");
            String tname = rs.getString("Name");
            String debit = rs.getString("Credit_Amount");
            String tbal = rs.getString("Available_Balance");
            CreateAccountNumber.setText(acnum);
            CreatePassword.setText(acpass);
            CreateNameField.setText(name);
            DepositeName.setText(Dname);
            CreatePhone.setText(phone);
            CreateEmail.setText(email);
            CreateAddress.setText(address);
            CreateAccountType.setText(actype);
            CreateReligion.setText(acnum);
            DepositeCredit.setText(credit);
            DepositeAvailable.setText(bal);
            TName.setText(tname);
            TDebit.setText(debit);
            TAvail.setText(tbal);
        }
        return null;
    }

    ObservableList<CreateAccounts> getsShow() throws SQLException {
        Connection conn = db.getConnection();
        ObservableList<CreateAccounts> Custlist = FXCollections.observableArrayList();
        //ObservableList<CreateAccounts> customarlist = FXCollections.observableArrayList();
        Statement statement = conn.createStatement();
        String customarsql = "select Name,Address,Account_Type,Religion from login";
        ResultSet customarrs = statement.executeQuery(customarsql);
        while (customarrs.next()) {
            String cname, cactype, crel, caddress;
            cname = customarrs.getString("Name");
            caddress = customarrs.getString("Address");
            //cactype = customarrs.getString("Account_Type");
            //crel = customarrs.getString("Religion");
            CreateAccounts ct = new CreateAccounts(cname, caddress);
            Custlist.add(ct);
        }
        TableName.setCellValueFactory(new PropertyValueFactory<CreateAccounts, String>("Name"));
        TableAddress.setCellValueFactory(new PropertyValueFactory<CreateAccounts, String>("Address"));
        //TAc.setCellValueFactory(new PropertyValueFactory<CreateAccounts, String>("Account_Type"));
        //TRel.setCellValueFactory(new PropertyValueFactory<CreateAccounts, String>("Religion"));
        TableCustomar.setItems(Custlist);
        return Custlist;
    }

    @FXML
    private void Editbtn(ActionEvent event) {

        CreateNameField.setEditable(true);
        CreatePhone.setEditable(true);
        CreateEmail.setEditable(true);
        CreateAddress.setEditable(true);
        CreateReligion.setEditable(true);
        JOptionPane.showMessageDialog(null, "Now Edit what do you want to change.");
    }

    @FXML
    private void Updatebtn(ActionEvent event) throws SQLException {
        Connection conn = db.getConnection();
        int id = Integer.valueOf(CreateAccountNumber.getText());
        String name = CreateNameField.getText();
        String phone = CreatePhone.getText();
        String email = CreateEmail.getText();
        String address = CreateAddress.getText();
        String religion = CreateReligion.getText();
        //ObservableList<CreateAccounts> accountlist = FXCollections.observableArrayList();
        Statement statement = conn.createStatement();
        String sql = "update login set Name = '" + name + "',Phone = '" + phone + "',Email = '" + email + "',Address = '" + address + "',Religion = '" + religion + "' where Account_Number = " + id;
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Edited things are saved successfully");
    }

    @FXML
    private void DepositeButton(ActionEvent event) throws SQLException {
        if (Depositeserch.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter account number to show details");
            return;
        }
        int addbal = Integer.valueOf(DepositeAmount.getText());
        int total = Integer.valueOf(DepositeAvailable.getText()) + addbal;
        DepositeTotal.setText(String.valueOf(total));
        Connection conn = db.getConnection();
        Statement statement = conn.createStatement();
        String sql = "update login set Available_Balance = " + total + " where Account_Number = " + Integer.valueOf(Depositeserch.getText());
        if (!(DepositeAmount.getText().equals(""))) {
            statement.executeUpdate(sql);
        } else {
            JOptionPane.showMessageDialog(null, "Please add balance");
        }
        DepositeAmount.clear();
        DepositeTotal.clear();
    }

    @FXML
    private void Depositesearchbtn(ActionEvent event) throws SQLException {
        if (Depositeserch.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter account number for deposite");
            return;
        }
        int acnumber = Integer.valueOf(Depositeserch.getText());
        getsShow(acnumber);
        Depositeserch.clear();
    }

    @FXML
    private void TSearch(ActionEvent event) throws SQLException {
        if (TtransfarSearch.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter account number");
            return;
        }
        int acnumber = Integer.valueOf(TtransfarSearch.getText());
        getsShow(acnumber);
        TtransfarSearch.clear();
    }

    @FXML
    private void Transferbtn(ActionEvent event) throws SQLException {
        if (TtransfarSearch.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter account number for show details");
            return;
        }
        int subbal = Integer.valueOf(TAmount.getText());
        int total = Integer.valueOf(TAvail.getText()) - subbal;
        TTotal.setText(String.valueOf(total));
        Connection conn = db.getConnection();
        Statement statement = conn.createStatement();
        String sql = "update login set Available_Balance = " + total + " where Account_Number = " + Integer.valueOf(TtransfarSearch.getText());
        if (!(TtransfarSearch.getText().equals(""))) {
            statement.executeUpdate(sql);
        } else {
            JOptionPane.showMessageDialog(null, "Please add balance");
        }
        TAmount.clear();
        TTotal.clear();
    }

    @FXML
    private void ViewSearchbtn(ActionEvent event) throws SQLException {
        if (ViewSearch.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter an account number in searchbox");
            return ;
        }
        ViewName.setVisible(true);
        ViewCredit.setVisible(true);
        ViewAvailable.setVisible(true);
        ViewDebit.setVisible(true);
        int number = Integer.parseInt(ViewSearch.getText());
        Connection conn = db.getConnection();
        Statement st = conn.createStatement();
        String sql = "select Name,Credit_Amount,Available_Balance from login where Account_Number = "+number;
        ResultSet res = st.executeQuery(sql);
        String name="";
        int amount=0,available=0;
        while(res.next()){
            name = res.getString("Name");
            amount = res.getInt("Credit_Amount");
            available = res.getInt("Available_Balance");
        }
        double devt = available - amount;
        ViewName.setText(name);
        ViewCredit.setText(amount+"");
        ViewAvailable.setText(available+"");
        ViewDebit.setText(devt+"");
        ViewSearch.clear();
    }

    @FXML
    private void PinSavebtn(ActionEvent event) throws SQLException {
        if ((AccountNumberbox.getText().equals(""))|| (OldPin.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Please enter an account number and pin number");
            return ;
        }
//        int acnum = Integer.parseInt(AccountNumberbox.getText());
//        int oldpin = Integer.parseInt(OldPin.getText());
        String newpin = NewPin.getText();
        Connection conn = db.getConnection();
        String Number = "", Password = "";
        Statement statement = conn.createStatement();
        String sql = "select Account_Number,Passwords from login";
        ResultSet resultset = statement.executeQuery(sql);
        while (resultset.next()) {
            Number = resultset.getString("Account_Number");
            Password = resultset.getString("Passwords");
        }
        if (((AccountNumberbox.getText()).equals(Number)) && ((OldPin.getText()).equals(Password))) {
            String upsql = "update login set Passwords = "+newpin+ " where Account_Number = "+Number;
            statement.executeUpdate(upsql);
            JOptionPane.showMessageDialog(null, "Password changed successfull");
        }else{
            JOptionPane.showMessageDialog(null, "Wrong Input");
        }
    }
}