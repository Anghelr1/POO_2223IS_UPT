package com.cajero.practica4cajero;

public class Cuenta {

    //Atributos
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String numeroCuenta;
    private String nip;
    private double saldo;

    //Constructores
    public Cuenta(){

    }
    public Cuenta(String nombre, String apellidoPaterno, String apellidoMaterno, String numeroCuenta, String nip, double saldo) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.numeroCuenta = numeroCuenta;
        this.nip = nip;
        this.saldo = saldo;
    }

    //Getters y Setters
    protected String getNumeroCuenta() {
        return numeroCuenta;
    }

    protected String getNip() {
        return nip;
    }

    protected String getNombre() {
        return nombre;
    }

    protected String getApellidoPaterno() {
        return apellidoPaterno;
    }

    protected String getApellidoMaterno() {
        return apellidoMaterno;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void setNip(String nip) {
        this.nip = nip;
    }
}
