package javafx._213_javafx_transforming_nodes_and_choosers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader
                (Application.class.getResource("sample.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 275);
//        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}