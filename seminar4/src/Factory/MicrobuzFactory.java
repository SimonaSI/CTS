package Factory;

public class MicrobuzFactory implements Factory{
    @Override
    public MijlocTransportComun creareMijlocTransportComun(String nrInmatriculare) {
        return new Microbuz(nrInmatriculare);
    }
}
