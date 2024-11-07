package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        var num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        var num2 = scanner.nextDouble();
        System.out.println("Ingrese el tercer numero: ");
        var num3 = scanner.nextDouble();

        double promedio = divisionDePromedio(num1,num2,num3);

        System.out.println("El promedio de los numeros es: "+ promedio);
        scanner.close();
    }

    public static double divisionDePromedio(double num1, double num2, double num3){

        double resultado = num1 + num2 + num3;
        double resultadoF = resultado / 3;
        return resultadoF;
    }
}
