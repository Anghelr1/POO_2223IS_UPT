module com.cajero.practica4cajero {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cajero.practica4cajero to javafx.fxml;
    exports com.cajero.practica4cajero;
}