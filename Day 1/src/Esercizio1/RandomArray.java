package Esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Scanner;

public class RandomArray {
    private static final Logger logger = LoggerFactory.getLogger(RandomArray.class);
   public int[] randoms = new int[5];

    public RandomArray(){
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int) (Math.random()* 10) + 1;
        }
    }

    public int[] getRandoms() {
        return randoms;
    }

    @Override
    public String toString() {
        return "randoms=" + Arrays.toString(randoms) +
                '}';
    }

    public void inserisci(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Indica la posizione nella quale inserire un numero casuale 0 per terminare");
            String x = sc.nextLine();
            try {
                logger.debug("Sto provando a parsare");
                if(Integer.parseInt(x) == 0) break;
                randoms[Integer.parseInt(x)-1] = (int) (Math.random()* 10) + 1;
                System.out.println("Il nuovo array è: ");
                System.out.println(toString());
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException ex) {
                logger.error("Errore della lunghezza array");
                System.out.println(ex.getMessage());
                System.out.println("Riprova");
            }
        }

    }
}
