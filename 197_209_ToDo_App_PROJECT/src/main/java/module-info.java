module javafx._197_todo_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens javafx._197_209_todo_app to javafx.fxml;
    exports javafx._197_209_todo_app;
}