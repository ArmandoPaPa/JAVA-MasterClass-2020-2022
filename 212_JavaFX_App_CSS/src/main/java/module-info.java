module javafx._211_javafx_app_css {
    requires javafx.controls;
    requires javafx.fxml;


    opens javafx._212_javafx_app_css to javafx.fxml;
    exports javafx._212_javafx_app_css;
}