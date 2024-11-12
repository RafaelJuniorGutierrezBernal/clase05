package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite el numero del cual desea la tabla de multiplicar: ");
        int numero = sc.nextInt();

        genMultiplicar(numero);

        sc.close();
    }

    private static void genMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d%n", numero, i, resultado);
        }
    }
}
