module javamasterclass2022._183_helloworld_mod {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens javamasterclass2022._183_helloworld_mod to javafx.fxml;
    exports javamasterclass2022._183_helloworld_mod;
}