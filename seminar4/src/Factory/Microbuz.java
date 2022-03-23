package Factory;

public class Microbuz extends MijlocTransportComun{
    public Microbuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Microbuz");
        sb.append(getNrInmatriculare());
        return sb.toString();
    }
}
