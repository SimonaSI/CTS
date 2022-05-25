package tests.dubluri;

import claseAgentie.IPachetTuristic;

public class PachetDummy implements IPachetTuristic {
    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public Double getPret() {
        return null;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }
}
