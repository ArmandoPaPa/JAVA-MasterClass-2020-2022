package javafx._197_209_todo_app;

import datamodel.ToDoData;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.
                getResource("mainWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 500);
        stage.setTitle("To-Do List App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void stop() throws Exception {
        try {
            ToDoData.getInstance().storeToDoItems();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void init() throws Exception {
        try {
            ToDoData.getInstance().loadTodoItems();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}