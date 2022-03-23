package Factory;

public class AutobuzFactory implements Factory{


    @Override
    public MijlocTransportComun creareMijlocTransportComun(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
