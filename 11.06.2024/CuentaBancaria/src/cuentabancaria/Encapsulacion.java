package cuentabancaria;

public class Encapsulacion {
    

    public static void main(String[] args) {
        // Crear una cuenta bancaria
        CuentaBancaria cuenta1 = new CuentaBancaria(123456, "Juan Pérez");

        // Obtener información de la cuenta
        System.out.println("Número de cuenta: " + cuenta1.obtenerNumeroCuenta());
        System.out.println("Titular: " + cuenta1.obtenerTitular());
        System.out.println("Saldo: " + cuenta1.obtenerSaldo());

        // Modificar el titular de la cuenta
        cuenta1.modificarTitular("María Gómez");
        System.out.println("Titular actualizado: " + cuenta1.obtenerTitular());

        // Depositar dinero en la cuenta
        cuenta1.depositar(500.00);
        cuenta1.depositar(-100.00); // Depósito inválido

        // Retirar dinero de la cuenta
        cuenta1.retirar(200.00);
        cuenta1.retirar(600.00); // Retiro inválido
    }    
}
