package exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.println("Inserisci una stringa (o ':q' per uscire):");
            input = scanner.nextLine();
            
            if (input.equals(":q")) {
                break;
            }

            // Usiamo il trucco veloce per la virgola
            System.out.println(String.join(",", input.split("")));
        }

        System.out.println("Fine!");
    }
}
