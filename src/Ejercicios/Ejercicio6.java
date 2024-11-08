package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int opcion = 0;
        var scanner = new Scanner(System.in);
        do {
            System.out.println("=============================");
            System.out.println("    CONVERSOR DE UNIDADES    ");
            System.out.println("=============================");
            System.out.println();
            System.out.println("1.Para convertir de kilometros a metros ");
            System.out.println("2.Para convertir de metros a kilometros ");
            System.out.println("3.Para convertir de kilogramos a gramos ");
            System.out.println("4.Para convertir de gramos a kilogramos ");
            System.out.println("5.Para salir ");
            System.out.println("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad en kilometros: ");
                    double kilometros = scanner.nextDouble();
                    System.out.println("Resultado: " + kilometrosMetros(kilometros) + " metros");

                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de metros: ");
                    double metros = scanner.nextDouble();
                    System.out.println("Resultado: " + metrosKilometros(metros) + " kilometros");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad en kilogramos:  ");
                    double kilogramos = scanner.nextDouble();
                    System.out.println("Resultado " + kilogramosGramos(kilogramos) + " gramos");
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad en gramos: ");
                    double gramos = scanner.nextDouble();
                    System.out.println("Resultado " + gramosKilogramos(gramos) + " kilogramos");
                    break;
                case 5:
                    System.out.println("SALIENDO DEL PROGRAMA GRACIAS POR USARLOS :)");
                    break;
                default:
                    System.err.println("ERROR NUMERO INVALIDO INGRESE UN NUMERO DEL 1-5.");
                    break;
            }
            
        } while (opcion != 5);
        scanner.close();

    }

    public static double kilometrosMetros(double kilometros) {

        return kilometros * 1000;

    }

    public static double metrosKilometros(double metros) {

        return metros / 1000;
    }

    public static double kilogramosGramos(double kilogramos) {

        return kilogramos * 1000;

    }

    public static double gramosKilogramos(double gramos) {

        return gramos / 1000;

    }

}
