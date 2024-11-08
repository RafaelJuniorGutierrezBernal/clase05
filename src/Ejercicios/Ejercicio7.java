package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

        public static void main(String[] args) {
            var scanner  = new Scanner(System.in);
            System.out.println("Ingrese la base: ");
            var base = scanner.nextInt();
            System.out.println("Ingrese el exponente: ");
            var expo = scanner.nextInt();

            int resultado = potencia(base, expo);
            System.out.println("El resultado es: " + resultado );

            scanner.close();
        }


        public static int potencia(int base, int expo){

            if (expo != 0 ) {
                
                return (int) Math.pow(base, expo);
            }else{
                return 1;
            }



        }

}