module javafx._221_224_contactapp_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens javafx.app to javafx.fxml;
    exports javafx.app;
}