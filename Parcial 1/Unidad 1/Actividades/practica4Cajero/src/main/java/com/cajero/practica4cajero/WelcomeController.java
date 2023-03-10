package com.cajero.practica4cajero;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class WelcomeController extends Cuenta {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String cuentaActiva;
    private String nipActivo;
    private int id;
    @FXML
    public TextField numeroCuenta;
    public PasswordField nip;
    public Label labelError;
    private AtomicBoolean usuarioValido = new AtomicBoolean(false);
    private Cuentas cuentas = new Cuentas();



    public void autentificacion(ActionEvent event) throws IOException {
        /*============================= TESTING =============================== */
//        numeroCuenta.setText("123456789");
//        nip.setText("1234");
        /*============================= FIN TESTING =============================== */



        cuentas.getCuentas().forEach(cuenta -> {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta.getText()) && cuenta.getNip().equals(nip.getText())) {
                usuarioValido.set(true);
                cuentaActiva = cuenta.getNumeroCuenta();
                nipActivo = cuenta.getNip();
                id = cuentas.getCuentas().indexOf(cuenta);
            }
        });

        if (!usuarioValido.get()) {
            labelError.setText("Cuenta o NIP incorrectos");
            labelError.setVisible(true);
        } else {
            labelError.setVisible(false);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("cuenta-view.fxml"));
            root = loader.load();

            //Enviando datos a la siguiente ventana
            CuentaController cuentaController = loader.getController();
            cuentaController.onLoad((cuentas.getCuentas().get(id)));

            //Renderizando nueva ventana
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }

    public void actualizarInfo(Cuenta cuenta){

        cuentas.getCuentas().forEach(n->{
            if(n.getNumeroCuenta().equals(cuenta.getNumeroCuenta())){
                n.setSaldo(cuenta.getSaldo());
                n.setNip(cuenta.getNip());
            }
        });

    }


}
