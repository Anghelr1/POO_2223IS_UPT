package com.cajero.practica4cajero;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class CuentaSaldoController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Cuenta cuenta;
    @FXML
    Label nombreCliente;
    @FXML
    Label saldoCliente;


    public void obtenerSaldo(Cuenta cuenta){
        this.cuenta = cuenta;
        nombreCliente.setText(cuenta.getNombre());
        saldoCliente.setText("$" + String.valueOf(cuenta.getSaldo()));

    }

    public void regresar(ActionEvent event) throws IOException {
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
