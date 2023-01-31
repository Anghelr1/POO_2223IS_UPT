package com.cajero.practica4cajero;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;

public class CuentaCambioNipController {
    @FXML
    Label nombreCliente;
    @FXML
    PasswordField nipActual;
    @FXML
    PasswordField nipNuevo;
    @FXML
    PasswordField nipConfirmacion;
    private Cuenta cuenta;

    public void onLoad(Cuenta cuenta) {
        nombreCliente.setText(cuenta.getNombre());
        this.cuenta = cuenta;
    }

    public void cambioNip(){
        if (cuenta.getNip().equals(nipActual.getText())) {
            if (nipNuevo.getText().equals(nipConfirmacion.getText())) {
                cuenta.setNip(nipNuevo.getText());
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                nipActual.setText("");
                nipNuevo.setText("");
                nipConfirmacion.setText("");
                alert.setTitle("Cambio de NIP");
                alert.setHeaderText("NIP actualizado con éxito");
                alert.showAndWait();
            } else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("NIP nuevo y confirmación no coinciden");
                alert.showAndWait();
            }
        } else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("NIP incorrecto");
            alert.showAndWait();
        }
    }

    public void regresar(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;
        Parent root;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("cuenta-view.fxml"));
        root = loader.load();

        CuentaController cuentaController = loader.getController();
        cuentaController.onLoad(cuenta);


        //Renderizando nueva ventana
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



}
