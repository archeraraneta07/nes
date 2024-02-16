module com.nes {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nes to javafx.fxml;
    exports com.nes;
}
