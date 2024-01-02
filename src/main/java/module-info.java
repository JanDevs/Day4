module org.example.hexaconvert {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.hexaconvert to javafx.fxml;
    exports org.example.hexaconvert;
}