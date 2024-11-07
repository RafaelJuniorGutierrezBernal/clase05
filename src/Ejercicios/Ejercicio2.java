package Ejercicios;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();
        
        verificacionPolindromo(cadena);
        scanner.close();
    }

    public static void verificacionPolindromo(String cadena) {
        cadena = cadena.toLowerCase();
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
        if (cadena.equals(cadenaInvertida)) {
            System.out.println("La cadena es un políndromo.");
        } else {
            System.out.println("La cadena no es un políndromo.");
        }
    }
}