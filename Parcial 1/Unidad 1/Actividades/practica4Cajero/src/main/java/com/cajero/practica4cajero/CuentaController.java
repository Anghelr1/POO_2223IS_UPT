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

public class CuentaController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Cuenta cuenta;

    @FXML
    public Label nombreCliente;



    public void onLoad(Cuenta cuenta) {
        nombreCliente.setText(nombreCliente.getText() + " " + cuenta.getNombre() + " " + cuenta.getApellidoPaterno());
        this.cuenta = cuenta;
    }

    public void consultaSaldo(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("cuentaSaldo-view.fxml"));
        root = loader.load();

        //Enviando datos a la siguiente ventana
        CuentaSaldoController cuentaSaldoController = loader.getController();
        cuentaSaldoController.obtenerSaldo(cuenta);

        //Renderizando nueva ventana
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void retiro(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("cuentaRetiro-view.fxml"));
        root = loader.load();

        //Enviando datos a la siguiente ventana
        CuentaRetiroController cuentaRetiroController = loader.getController();
        cuentaRetiroController.onLoad(cuenta);

        //Renderizando nueva ventana
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void deposito(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("cuentaDeposito-view.fxml"));
        root = loader.load();

        //Enviando datos a la siguiente ventana
        CuentaDepositoController cuentaDepositoController = loader.getController();
        cuentaDepositoController.onLoad(cuenta);

        //Renderizando nueva ventana
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }




}
