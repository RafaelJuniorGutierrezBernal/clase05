package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero primo: ");
        var numero = scanner.nextInt();
        if (numeroPrimo(numero)) {
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        } 

        scanner.close();
    }

    public static boolean numeroPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }

        }

        return true;
    }
}