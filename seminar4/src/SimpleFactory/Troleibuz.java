package SimpleFactory;

public class Troleibuz extends MijlocTransportComun{
    public Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Troleibuz ");
        sb.append(getNrInmatriculare());
        return sb.toString();
    }
}
