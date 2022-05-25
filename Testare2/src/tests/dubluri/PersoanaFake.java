package tests.dubluri;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {

    private int varsta;
    private boolean check;
    private String sex;

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
