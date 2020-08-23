package com.reestts.javafx;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        File file = new File("JavaFX/src/main/resources/video.mp4");
        Media media = new Media(file.toURI().toURL().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        DoubleProperty width = mediaView.fitWidthProperty();
        DoubleProperty height = mediaView.fitHeightProperty();
        width.bind(Bindings.selectDouble(mediaView.sceneProperty(), "width"));
        height.bind(Bindings.selectDouble(mediaView.sceneProperty(), "height"));
        mediaView.setPreserveRatio(true);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(mediaView);
        Scene scene = new Scene(stackPane, 500, 500, Color.BLACK);

        stage.setScene(scene);
        stage.setTitle("Lithuania voyage");
        stage.setFullScreen(true);
        stage.show();

        mediaPlayer.play();
    }
}