module com.example.personmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.personmanager to javafx.fxml;
    exports com.example.personmanager;
}