package com.cajero.practica4cajero;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CuentaDepositoController implements Initializable {
    Cuenta cuenta;
    @FXML
    Spinner cantidad;
    @FXML
    Label nombreCliente;
    @FXML
    Label saldoActual;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        SpinnerValueFactory<Double> valueFactory = new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 1000000, 50, 50);

        cantidad.setValueFactory(valueFactory);
    }
    public void onLoad(Cuenta cuenta) {
        nombreCliente.setText(cuenta.getNombre());
        saldoActual.setText("$" + cuenta.getSaldo());
        this.cuenta = cuenta;
    }

    public void depositar(){
        double cantidadDeposito = (double) cantidad.getValue();
        if (cantidadDeposito == 0) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Cantidad invalida");
            alert.setHeaderText("No puedes depositar una cantidad de 0");
            alert.showAndWait();
        } else{
            cuenta.setSaldo(cuenta.getSaldo() + cantidadDeposito);
            saldoActual.setText("$" + cuenta.getSaldo());
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Deposito exitoso");
            alert.setHeaderText("Se ha realizado el deposito exitosamente");
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
