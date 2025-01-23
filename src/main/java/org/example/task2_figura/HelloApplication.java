package org.example.task2_figura;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 600);
        stage.setTitle("Рисование фигур!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();


    }
}

class Bmi {
    private float height, weight;

    public Bmi(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }
    public float getBMI() {
        return weight / this.height / this.height * 10000;
    }
    public float getHeight() {
        return height;
    }
    @Override
    public String toString () {
        return "Bmi =" + String.format("%. 1f", getBMI()) + " ";
    }
}