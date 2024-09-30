package Esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        outerloop:
        while(true){
            System.out.println("Inserisci i km percorsi");
            double km = insert();
            System.out.println("Adesso inserisci i litri di carburante consumati");
            double litri = insert();
            try {
                double rapporto = (km/litri);
                if(Double.isInfinite(rapporto)) throw new ArithmeticException();
                System.out.println("Il rapporto km/litri consumati é: " + rapporto);
                break outerloop;
            } catch (ArithmeticException e) {
                System.out.println("Impossibile dividere per zero");
            }
        }

    }
    public static double insert(){
        Scanner sc = new Scanner(System.in);
        double y;
        while (true) {
            String x = sc.nextLine();
            try {
                y = Double.parseDouble(x);
                if (y < 0){
                    System.out.println("Inserisci un valore maggiore di zero");
                } else break ;
            } catch (NumberFormatException e){
                System.out.println("Non hai inserito un numero");
            }
        }
        return y;
    }
}
