import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        showMenu(scanner);
        scanner.close();
    }

    private static void showMenu(Scanner scanner) {
        int option;

        do {

            System.out.println("====================================");
            System.out.println(" Menu clase 5");
            System.out.println("------------------------------------");
            System.out.println("1. prueba del ciclo while");
            System.out.println("2. prueba del ciclo do while");
            System.out.println("3. prueba del ciclo for");
            System.out.println("0. para salir de la aplicacion");
            System.out.print("Ingresa su opcion: ");
            option = scanner.nextInt();
            scanner.nextLine(); // limpiar el buffer de entrada
            switch (option) {
                case 1:
                    whileTest();
                    
                    break;
                case 2:
                    doWhileTest();
                    
                    break;
                case 3:
                    forTest();
                    
                    break;
                case 0:
                    System.out.println("Hasta la proxima");
                    break;
                default:
                    System.err.println("Numero invalido ingrese una opcion valida");
                    break;
            }
            if (option != 0) {
                presEnter(scanner);
                
            }

        } while (option != 0);
    }

    private static void presEnter(Scanner scanner) {
        System.out.println("Presione ENTER para continuar");
        scanner.nextLine();
    }

    private static void forTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("You win!");

        System.out.println("Termino la aplicacion");
    }

    private static void doWhileTest() {
        var counter = 0;
        do {
            System.out.println(counter);

            // avance
            counter--;
        } while (counter > 0);
        System.out.println("Boom!");
    }

    private static void whileTest() {
        var counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }

    }

}
