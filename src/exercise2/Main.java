package exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi un numero compreso tra 0 e 3");
        int number = Integer.parseInt(scanner.nextLine());

        switch (number){
            case 0: {
                System.out.println("ZERO");
                break;
            }
            case 1: {
                System.out.println("UNO");
                break;
            }
            case 2: {
                System.out.println("DUE");
                break;
            }
            case 3: {
                System.out.println("TRE");
                break;
            }
            default: {
                System.out.println("ERRORE");
            }
        }
    }
}
