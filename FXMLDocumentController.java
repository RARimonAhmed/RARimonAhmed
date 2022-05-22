package audio_player;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXSlider;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private Label TitleLabel;
    @FXML
    private JFXButton PlayButton;
    @FXML
    private JFXButton NextButton;
    @FXML
    private JFXButton PreviousButton;
    @FXML
    private JFXButton StopButton;
    @FXML
    private JFXButton ResetButton;
    @FXML
    private JFXComboBox<String> Speed;
    @FXML
    private JFXSlider SoundSlider;
    private File directory;
    private File[] files;
    private ArrayList<File> songs;
    private int songsnumber;
    private boolean running;
    private Media media;
    private MediaPlayer mediaplayer;
    private int[] speeds = {25, 50, 75, 100, 125, 150, 175, 200};
    @FXML
    private JFXButton Openbtn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        songs = new ArrayList<File>();
        directory = new File("F:\\BasicJava\\Audio_Player\\src\\Music");
        files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                songs.add(file);
            }
        }
        media = new Media(songs.get(songsnumber).toURI().toString());
        mediaplayer = new MediaPlayer(media);
        TitleLabel.setText(songs.get(songsnumber).getName());
        for (int i = 0; i < speeds.length; i++) {
            Speed.getItems().add(Integer.toString(speeds[i]));
        }
        Speed.setOnAction(this::Speed);
        SoundSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                mediaplayer.setVolume(SoundSlider.getValue()*0.01);
            }
        });
    }

    @FXML
    private void PlayButton(ActionEvent event) {
        Speed(null);
        mediaplayer.play();
    }

    @FXML
    private void NextButton(ActionEvent event) {
        if (songsnumber < songs.size() - 1) {
            songsnumber++;
            mediaplayer.stop();
            media = new Media(songs.get(songsnumber).toURI().toString());
            mediaplayer = new MediaPlayer(media);
            TitleLabel.setText(songs.get(songsnumber).getName());
            mediaplayer.play();
        } else {
            songsnumber = 0;
            mediaplayer.stop();
            media = new Media(songs.get(songsnumber).toURI().toString());
            mediaplayer = new MediaPlayer(media);
            TitleLabel.setText(songs.get(songsnumber).getName());
            mediaplayer.play();
        }
    }

    @FXML
    private void PreviousButton(ActionEvent event) {
        if (songsnumber > 0) {
            songsnumber--;
            mediaplayer.stop();
            media = new Media(songs.get(songsnumber).toURI().toString());
            mediaplayer = new MediaPlayer(media);
            TitleLabel.setText(songs.get(songsnumber).getName());
            mediaplayer.play();
        } else {
            songsnumber = songs.size() - 1;
            mediaplayer.stop();
            media = new Media(songs.get(songsnumber).toURI().toString());
            mediaplayer = new MediaPlayer(media);
            TitleLabel.setText(songs.get(songsnumber).getName());
            mediaplayer.play();
        }
    }

    @FXML
    private void StopButton(ActionEvent event) {
        mediaplayer.pause();
    }

    private void StartButton(ActionEvent event) {
        mediaplayer.startTimeProperty();
    }

    @FXML
    private void ResetButton(ActionEvent event) {
        mediaplayer.seek(Duration.seconds(0));
    }

    @FXML
    private void Speed(ActionEvent event) {
        if (Speed.getValue() == null) {
            mediaplayer.setRate(1);
        } else {
            mediaplayer.setRate(Integer.parseInt(Speed.getValue()) * 0.01);
        }
    }

    @FXML
    private void SoundSlider(MouseEvent event) {
    }

    @FXML
    private void Openbtn(ActionEvent event) {
    }

}
