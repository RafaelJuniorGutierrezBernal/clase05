package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo");
        var radio = scanner.nextDouble();

        System.out.println("Ingrese el lado del cuadrado");
        var lado = scanner.nextDouble();

        System.out.println("Ingrese la base del triangulo");
        var base = scanner.nextDouble();

        System.out.println("Ingrese la altura del triangulo");
        var altura = scanner.nextDouble();

        System.out.println("Area del cuadrado: " + areaCuadrado(lado));
        System.out.println("Area del circulo: " + areaCirculo(radio));
        System.out.println("Area del triangulo: " + areaTriangulo(base, altura));

        scanner.close();
    }

    public static double areaCirculo(double radio) {

        return Math.PI * radio * radio;

    }

    public static double areaTriangulo(double base, double altura) {

        return (base * altura) / 2;
    }

    public static double areaCuadrado(double lado) {

        return lado * lado;
    }

}
