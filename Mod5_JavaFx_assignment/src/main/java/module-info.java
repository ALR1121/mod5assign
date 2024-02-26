module com.example.mod5_javafx_assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mod5_javafx_assignment to javafx.fxml;
    exports com.example.mod5_javafx_assignment;
}