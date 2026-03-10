package exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals(":q")) {
            System.out.println("Inserisci una stringa (o ':q' per uscire):");
            input = scanner.nextLine();

            if (!input.equals(":q")) {
                suddividiStringa(input);
            }
        }

        System.out.println("Programma terminato.");
        scanner.close();
    }

    public static void suddividiStringa(String s) {
        int i = 0;
        while (i < s.length()) {
            System.out.print(s.charAt(i));

            if (i < s.length() - 1) {
                System.out.print(",");
            }
            i++;
        }
        System.out.println();
    }
}
