module com.example._184_gridpanelayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._186_borderpanelayout to javafx.fxml;
    exports com.example._186_borderpanelayout;
}