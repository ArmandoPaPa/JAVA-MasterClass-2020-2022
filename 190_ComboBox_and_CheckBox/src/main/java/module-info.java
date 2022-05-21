module javafx._190_combobox_and_checkbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens javafx._190_combobox_and_checkbox to javafx.fxml;
    exports javafx._190_combobox_and_checkbox;
}