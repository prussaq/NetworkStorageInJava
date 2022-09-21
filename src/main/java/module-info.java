module com.naumdeveloper.networkstorageinjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.naumdeveloper.networkstorageinjava to javafx.fxml;
    exports com.naumdeveloper.networkstorageinjava;
}