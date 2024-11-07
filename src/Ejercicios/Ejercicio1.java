package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {

            System.out.println("========================================");
            System.out.println("       CONVERSOR DE TEMPERATURAS        ");
            System.out.println("========================================");
            System.out.println("1. Convertir de Celsius a Fahrenheit");

            System.out.println("2. Convertir de Fahrenheit a Celsius");

            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la temperatura en Celsius: ");
                    if (scanner.hasNextDouble()) {
                        double tempC = scanner.nextDouble();
                        celciusToFahrenheit(tempC);
                    } else {
                        System.out.println("Entrada invalida. ingrese un numero valido");
                        scanner.nextLine();
                    }

                    enterParaContinuar(scanner);

                    break;
                case 2:
                    System.out.println("Ingresa la temperatura en Fahrenheit: ");
                    if (scanner.hasNextDouble()) {
                        double tempF = scanner.nextDouble();
                        fahreinheitToCelcius(tempF);
                    } else {
                        System.out.println("Entrada invalida. ingrese un numero valido");
                        scanner.nextLine();
                    }

                    enterParaContinuar(scanner);
                    break;

                case 3:
                    System.out.println("saliendo del programa ...");
                    break;

                default:
                    System.out.println("Opción inválida, ingrese un numero valido entre 1 y 3");
                    enterParaContinuar(scanner);
                    break;
            }

        } while (opcion != 3);

        scanner.close();

    }

    public static void celciusToFahrenheit(double tempC) {
        double tempF = (tempC * (9.0 / 5)) + 32;
        System.out.println("La temperatura en Fahrenheit es: " + tempF);
    }

    public static void fahreinheitToCelcius(double tempF) {
        double tempC = (tempF - 32) / (9.0 / 5);
        System.out.println("La temperatura en Celsius es: " + tempC);

    }

    public static void enterParaContinuar(Scanner scanner) {

        System.out.println("Presione enter para continuar");
        scanner.nextLine();

    }
}
