module com.example._184_gridpanelayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._187_otherlayout to javafx.fxml;
    exports com.example._187_otherlayout;
}