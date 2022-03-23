package SimpleFactory;

public class Tramvai extends MijlocTransportComun{
    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai ");
        sb.append(getNrInmatriculare());
        return sb.toString();
    }
}
