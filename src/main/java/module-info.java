module com.example.kazi_office_and_marriage_register_office {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.kazi_office_and_marriage_register_office to javafx.fxml;
    exports com.example.kazi_office_and_marriage_register_office;
    exports com.example.kazi_office_and_marriage_register_office.yasin;
    opens com.example.kazi_office_and_marriage_register_office.yasin to javafx.fxml;
}