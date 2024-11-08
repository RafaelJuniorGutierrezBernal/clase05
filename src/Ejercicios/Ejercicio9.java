package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("=================================");
            System.out.println("     CALCULADOR DE INTERESES     ");
            System.out.println("=================================");
            System.out.println();
            System.out.println("1. Para calcular el interes simple");
            System.out.println("2. Para calcular el interes compuesto");
            System.out.println("3. SALIR.");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el capital inicial");
                    double pSimple = scanner.nextDouble();

                    System.out.println("Ingrese la tasa de interes anual(%): ");
                    double rSimple = scanner.nextDouble() / 100;

                    System.out.println("Ingrese el tiempo en años: ");
                    double tSimple = scanner.nextDouble();


                    double interesSimple = Isimple(pSimple, rSimple, tSimple);
                    System.out.println("El interes simple es: " + interesSimple);
                    break;
                case 2:
                    System.out.println("Ingrese el capital inicial: ");
                    double pCompuesto = scanner.nextDouble();

                    System.out.println("Ingrese la tasa de interes anual (%): ");
                    double rCompuesto = scanner.nextDouble() / 100;

                    System.out.println("Ingrese el numero de veces que se capitaliza por año");
                    double n = scanner.nextDouble();

                    System.out.println("Ingrese el tiempo en años: ");
                    double tCompuesto = scanner.nextDouble();

                    double montoCompuesto = Icompuesto(pCompuesto, rCompuesto, n, tCompuesto);
                    System.out.println("El monto compuesto es: " + montoCompuesto);
                    break;
                case 3:
                    System.out.println("Saliendo del programa :)");
                    break;

                default:
                    System.out.println("Ingrese un numero valido.");
                    break;
            }

        } while (opcion != 3);

        scanner.close();    

    }

    public static double Isimple(double p, double r, double t) {

        return p * r * t;

    }

    public static double Icompuesto(double p, double r, double n, double t) {

        return p * Math.pow((1 + (r / n)), (n * t));
    }
}
