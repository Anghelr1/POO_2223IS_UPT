package com.cajero.practica4cajero;

import java.util.ArrayList;

public class Cuentas {

    private ArrayList<Cuenta> cuentas = new ArrayList<>();

    public Cuentas(){
        this.cuentas.add(new Cuenta("Juan", "Perez", "Garcia", "123456789", "1234", 1000));
        this.cuentas.add(new Cuenta("Maria", "Garcia", "Perez", "987654321", "4321", 2000));
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
}
