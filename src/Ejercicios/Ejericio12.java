package Ejercicios;

import java.util.Scanner;

public class Ejericio12 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite los segundos para el calculo: ");
        var seconds = sc.nextDouble();

        conversion(seconds);
        sc.close();
            }
        
            private static void conversion(double seconds) {
               long Dias = (long) (seconds/86400);
               long Horas =  (long)((seconds%86400) / 3600);
               long Minutos = (long)((seconds%3600) / 60);
               long secondsR  = (long)(seconds % 60);

               System.out.println(Dias + " dias " + Horas + " horas " + Minutos + " minutos " + secondsR + " segundos");
            }
}