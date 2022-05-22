package banking_management_system1;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class FXMLDocumentController implements Initializable {

    @FXML
    private VBox LogInVbox;
    @FXML
    private ImageView LogInImage;
    @FXML
    private JFXTextField LogInAccountNumberText;
    @FXML
    private JFXPasswordField LogInPasswordField;
    @FXML
    private JFXButton LogInbtn;
    @FXML
    private JFXButton LogIn;
    @FXML
    private JFXButton Create;
    @FXML
    private ImageView CreateAccountImage;
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
    private JFXPasswordField CreatePassword;
    @FXML
    private JFXTextField CreateAccountType;
    @FXML
    private JFXTextField CreateReligion;
    @FXML
    private JFXButton CreateAccount;
    @FXML
    private AnchorPane CreateAnchorpane;
    static ObservableList<CreateAccounts> acountlist = FXCollections.observableArrayList();
    DataBaseClassOfBank db = new DataBaseClassOfBank();
    @FXML
    private AnchorPane MainAnchorPane;
    @FXML
    private JFXTextField CreateDepositeBalance;
    @FXML
    private JFXButton ImageChoose;
    @FXML
    private JFXListView<FileChooser> listimage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void LogInbtn(ActionEvent event) throws SQLException {
        if (((LogInAccountNumberText.getText()).equals("")) || ((LogInPasswordField.getText()).equals(""))) {
            JOptionPane.showMessageDialog(null, "Please enter account and password number");
            return;
        }
        String num, pass;
        num = LogInAccountNumberText.getText();
        pass = LogInPasswordField.getText();
        db.getValue(num, pass);
        LogInAccountNumberText.clear();
        LogInPasswordField.clear();
    }

    @FXML
    private void LogIn(ActionEvent event) {
        LogInVbox.setVisible(true);
        CreateAnchorpane.setVisible(false);
    }

    @FXML
    private void Create(ActionEvent event) {
        CreateAnchorpane.setVisible(true);
        LogInVbox.setVisible(false);
    }

    @FXML
    private void CreateAccount(ActionEvent event) throws SQLException {
        if (((CreateAccountNumber.getText()).equals("")) || ((CreatePassword.getText()).equals(""))||((CreateNameField.getText()).equals("")) || ((CreateEmail.getText()).equals(""))) {
            JOptionPane.showMessageDialog(null,"Please fill up this form");
            return;
        }
        String Name = CreateNameField.getText();
        int Phone = Integer.valueOf(CreatePhone.getText());
        String Email = CreateEmail.getText();
        String Address = CreateAddress.getText();
        int AccountNumber = Integer.valueOf(CreateAccountNumber.getText());
        int Password = Integer.valueOf(CreatePassword.getText());
        String AccountType = CreateAccountType.getText();
        String Religion = CreateReligion.getText();
        int Depositebal = Integer.valueOf(CreateDepositeBalance.getText());
        int Avail = Depositebal;
        CreateAccounts ca = new CreateAccounts(AccountNumber, Password, Name, Phone, Email, Address, AccountType, Religion,Depositebal,Avail);
        db.setValue(ca);
        CreateNameField.clear();
        CreatePhone.clear();
        CreateEmail.clear();
        CreateAddress.clear();
        CreateAccountNumber.clear();
        CreatePassword.clear();
        CreateAccountType.clear();
        CreateReligion.clear();
        CreateDepositeBalance.clear();
    }

    @FXML
    private void ImageChoose(ActionEvent event) throws FileNotFoundException, IOException {
        FileChooser fileChooser = new FileChooser();

        //Set extension filter
        FileChooser.ExtensionFilter extFilterJPG
                = new FileChooser.ExtensionFilter("JPG files (*.JPG)", "*.JPG");
        FileChooser.ExtensionFilter extFilterjpg
                = new FileChooser.ExtensionFilter("jpg files (*.jpg)", "*.jpg");
        FileChooser.ExtensionFilter extFilterPNG
                = new FileChooser.ExtensionFilter("PNG files (*.PNG)", "*.PNG");
        FileChooser.ExtensionFilter extFilterpng
                = new FileChooser.ExtensionFilter("png files (*.png)", "*.png");
        fileChooser.getExtensionFilters()
                .addAll(extFilterJPG, extFilterjpg, extFilterPNG, extFilterpng);
        //Show open file dialog
        File file = fileChooser.showOpenDialog(null);

        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            WritableImage image = SwingFXUtils.toFXImage(bufferedImage, null);
            FileInputStream fin = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fin.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            LogInImage.setImage(image);

        } catch (IOException ex) {
            Logger.getLogger("ss");
        }
    }
}