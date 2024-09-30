package Esercizio3;

import Esercizio3.Exceptions.BancaException;

public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    public void preleva(double x) {
        try {
            if (x <= maxPrelievo) super.preleva(x);
            else throw new BancaException("Il prelievo non è disponibile");
        } catch (BancaException e) {
            System.out.println(e.getMessage());
        }
    }
}
