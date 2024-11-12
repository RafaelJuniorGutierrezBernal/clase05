package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite su peso en kg: ");
        var peso = sc.nextDouble();
        System.out.println("Digite su altura en metros: ");
        var altura = sc.nextDouble();
        var IMC = calculadorImc(peso, altura);
        if (IMC < 18.5) {
            System.out.println("Tu IMC es: " + IMC);
            System.out.println("Categoría: Bajo peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Tu IMC es: " + IMC);
            System.out.println("Categoría: Peso normal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Tu IMC es: " + IMC);
            System.out.println("Categoría: Sobrepeso");
        } else if (IMC >= 30 && IMC <= 34.9) {
            System.out.println("Tu IMC es: " + IMC);
            System.out.println("Categoría: Obesidad Grado 1");
        } else if (IMC >= 35 && IMC <= 39.9) {
            System.out.println("Tu IMC es: " + IMC);
            System.out.println("Categoría: Obesidad Grado 2");
        } else if (IMC >= 40) {
            System.out.println("Tu IMC es: " + IMC);
            System.out.println("Categoría: Obesidad Grado 3");
        }

        sc.close();
    }

    private static double calculadorImc(double peso, double altura) {
        double IMC = peso / Math.pow(altura, 2);
        return IMC;
    }

}