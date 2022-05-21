module javafx._197_todo_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens javafx._210plus_ToDo_App_PROJECT_improved to javafx.fxml;
    exports javafx._210plus_ToDo_App_PROJECT_improved;
}