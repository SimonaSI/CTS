package clase;

public class SoferAutobuz {
    private static SoferAutobuz soferAutobuz = null;
    private String nume;

    public String getNume() {
        return nume;
    }

    private SoferAutobuz(String nume) {
        this.nume = nume;
    }

    public synchronized static SoferAutobuz getInstance(String nume) {
        if(soferAutobuz == null) {
            soferAutobuz = new SoferAutobuz(nume);
        }
        return soferAutobuz;
    }
}
