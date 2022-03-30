package Prototype;

public class Tramvai extends MijlocTransport{
    private String numeVatman;

    public Tramvai(String nrInmatriculare, String numeVatman) {
        super(nrInmatriculare);
        this.numeVatman = numeVatman;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) this.clone();
    }

    public String getNumeVatman() {
        return numeVatman;
    }

    public void setNumeVatman(String numeVatman) {
        this.numeVatman = numeVatman;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("numeVatman='").append(numeVatman).append('\'');
        sb.append("numar inmatriculare ").append((getNrInmatriculare()));
        sb.append('}');
        return sb.toString();
    }
}
