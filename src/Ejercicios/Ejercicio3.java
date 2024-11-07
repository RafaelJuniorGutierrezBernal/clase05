package Ejercicios;

import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo: ");
        BigInteger numero = scanner.nextBigInteger();
        if (numero.compareTo(BigInteger.ZERO) <= 0) {
            System.out.println("Por favor ingrese un numero entero positivo");
        } else {
            BigInteger resultado = calculoFactorial(numero);
            System.out.println("El factorial de " + numero + " es: " + resultado);
        }

        scanner.close();

    }

    public static BigInteger calculoFactorial(BigInteger numero) {
        BigInteger factorial = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE; i.compareTo(numero) <= 0; i = i.add(BigInteger.ONE)) {
            factorial = factorial.multiply(i);
        }
        return factorial;
    }
}
