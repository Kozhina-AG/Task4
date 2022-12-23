package com.example.demo;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import model.ImageCollection;
import model.Iterator;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    public ImageView img_viwer;
    @FXML
    public ImageCollection img_collection = new ImageCollection();
    @FXML
    public Iterator iter_main = img_collection.getIterator();
    @FXML
    public Timeline timeline = new Timeline();


    public void onNext(ActionEvent actionEvent) {
        if (iter_main.hasNext()) {
            Image name = (Image) iter_main.next();
            img_viwer.setImage(name);
        }
    }

    public void onPrev(ActionEvent event) {
        if (iter_main.hasPreview()) {
            Image name = (Image) iter_main.preview();
            img_viwer.setImage(name);
        }
    }

    public void onStop(ActionEvent event) {
        timeline.stop();
    }

    public void onPlay(ActionEvent event) {
        timeline.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        timeline.setCycleCount(Timeline.INDEFINITE);

        timeline.getKeyFrames().add(new KeyFrame(new Duration(1500), new EventHandler() {

            @Override
            public void handle(Event event) {
                if (iter_main.hasNext()) {
                    Image name = (Image) iter_main.next();
                    img_viwer.setImage(name);
                }
            }
        }));
    }
}