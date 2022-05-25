package tests.dubluri;

import claseAgentie.IPachetTuristic;

public class PachetFake implements IPachetTuristic {
    private boolean rezervare;
    private Double pret;

    public void setRezervare(boolean rezervare) {
        this.rezervare = rezervare;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    @Override
    public boolean poateRezerva() {
        return rezervare;
    }

    @Override
    public Double getPret() {
        return pret;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }
}
