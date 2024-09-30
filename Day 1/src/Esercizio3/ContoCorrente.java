package Esercizio3;

import Esercizio3.Exceptions.BancaException;

public class ContoCorrente {
    protected String titolare;
    protected int nMovimenti;
    protected final int maxMovimenti = 1;
    protected double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) {
        if (nMovimenti < maxMovimenti) saldo = saldo - x;
        else saldo = saldo - x - 0.50;
        if(saldo < 0) try {
            throw new BancaException("Conto in rosso");
        } catch (BancaException e) {
            System.out.println(e.getMessage());
        } finally {
            nMovimenti++;
        }

    }

    public double restituisciSaldo() {
        return saldo;
    }
}
