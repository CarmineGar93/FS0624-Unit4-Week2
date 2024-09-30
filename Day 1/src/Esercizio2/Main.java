package Esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Inserisci i km percorsi");
            String km = sc.nextLine();
            System.out.println("Adesso inserisci i litri di carburante consumati");
            String litri = sc.nextLine();
            try {
                int rapporto = (Integer.parseInt(km)/Integer.parseInt(litri));
                System.out.println("Il rapporto km/litri consumati é: " + rapporto);
                break;
            } catch (NumberFormatException ex){
                System.out.println("Non hai inserito un numero");
            } catch (ArithmeticException e) {
                System.out.println("Impossibile dividere per zero");
            }
        }
    }
}
