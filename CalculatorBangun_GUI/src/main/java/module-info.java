module com.example.calculatorbangun_gui {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.calculatorbangun_gui to javafx.fxml;
    exports com.example.calculatorbangun_gui;
}