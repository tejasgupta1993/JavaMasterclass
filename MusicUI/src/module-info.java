module MusicUI {

    requires javafx.controls;
    requires javafx.fxml;
    requires sqlite.jdbc;
    requires java.sql;
    opens sample;
    opens sample.model;
}