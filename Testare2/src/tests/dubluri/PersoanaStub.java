package tests.dubluri;

import clase.IPersoana;

public class PersoanaStub implements IPersoana {
    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() {
        return 18;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
