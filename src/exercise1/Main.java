package exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- PARI / DISPARI -----");
        System.out.println("Inserisci una parola:");
        String testo = scanner.nextLine();

        if (stringaPariDispari(testo)) {
            System.out.println("La lunghezza della stringa è pari");
        } else {
            System.out.println("La lunghezza della stringa è dispari");
        }

        System.out.println("----- ANNO BISESTILE -----");
        System.out.println("Inserisci anno");
        int annoInput = scanner.nextInt();

        if (annoBisestile(annoInput)) {
            System.out.println("L'anno " + annoInput + " è bisestile!");
        } else {
            System.out.println("L'anno " + annoInput + " NON è bisestile.");
        }
    }
    public static boolean stringaPariDispari(String stringa) {
        if (stringa.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0){
            if(anno % 100 == 0){
                return anno % 400 == 0;
            }else{
                return true;
            }
        } else{
            return false;
        }
    }
}