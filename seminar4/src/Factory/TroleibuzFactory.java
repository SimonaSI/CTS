package Factory;

public class TroleibuzFactory implements Factory{
    @Override
    public MijlocTransportComun creareMijlocTransportComun(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
