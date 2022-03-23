package SimpleFactory;

public class Autobuz extends MijlocTransportComun{
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz ");
        sb.append(getNrInmatriculare());
        return sb.toString();
    }

    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);


    }
}
