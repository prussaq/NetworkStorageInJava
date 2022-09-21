module com.example.cloudclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cloudclient to javafx.fxml;
    exports com.example.cloudclient;
}