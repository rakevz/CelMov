/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancaria;

public class CuentaBancaria {

    // Atributos privados
    private int numeroCuenta;
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(int numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Métodos públicos para obtener información
    public int obtenerNumeroCuenta() {
        return numeroCuenta;
    }

    public String obtenerTitular() {
        return titular;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    // Método para modificar el titular
    public void modificarTitular(String nuevoTitular) {
        this.titular = nuevoTitular;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado con éxito. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: El monto a depositar debe ser mayor que cero.");
        }
    }

    // Método para retirar dinero
    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro realizado con éxito. Nuevo saldo: " + saldo);
            return true;
        } else {
            System.out.println("Error: El monto a retirar debe ser mayor que cero y no puede superar el saldo disponible.");
            return false;
        }
    }
}