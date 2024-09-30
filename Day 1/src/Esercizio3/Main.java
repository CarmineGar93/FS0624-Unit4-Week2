package Esercizio3;

public class Main {
    public static void main(String[] args){
        ContoCorrente mio = new ContoCorrente("Carmine", 100);
        ContoOnLine mio2 = new ContoOnLine("Carmine", 400, 500);
        mio2.preleva(600);
        mio2.preleva(500);
        System.out.println(mio2.restituisciSaldo());
    }
}
