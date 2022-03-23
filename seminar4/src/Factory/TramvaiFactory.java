package Factory;

public class TramvaiFactory implements Factory{
    @Override
    public MijlocTransportComun creareMijlocTransportComun(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
