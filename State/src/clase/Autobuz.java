package clase;

public class Autobuz {
    private StareAutobuz stare;
    private Integer numarAutobuz;

    public Autobuz(Integer numarAutobuz) {
        this.stare = new LaCapatDeLinie();
        this.numarAutobuz = numarAutobuz;
    }

    public StareAutobuz getStare() {
        return stare;
    }

    protected void setStare(StareAutobuz stare) {
        this.stare = stare;
    }

    public Integer getNumarAutobuz() {
        return numarAutobuz;
    }

    public void pleacaInCursa() {
        StareAutobuz cursa = new InCursa();
        cursa.modificaStare(this);
    }

    public void ajungeLaCapatDeLinie() {
        StareAutobuz capatLinie = new LaCapatDeLinie();
        capatLinie.modificaStare(this);
    }

    public void trimisInService() {
        StareAutobuz reparat = new LaReparat();
        reparat.modificaStare(this);
    }

    public void scosDinService() {
        StareAutobuz capatLinie = new LaCapatDeLinie();
        capatLinie.modificaStare(this);
    }



}
