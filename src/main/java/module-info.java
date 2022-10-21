module com.example.test00 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test00 to javafx.fxml;
    exports com.example.test00;
}