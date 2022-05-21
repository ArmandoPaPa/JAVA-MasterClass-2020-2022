module javafx._195_196_ui_thread_and_runnable {
    requires javafx.controls;
    requires javafx.fxml;


    opens javafx._195_196_ui_thread_and_runnable to javafx.fxml;
    exports javafx._195_196_ui_thread_and_runnable;
}