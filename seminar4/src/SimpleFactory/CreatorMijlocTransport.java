package SimpleFactory;

public class CreatorMijlocTransport {
    public static MijlocTransportComun creareMijlocTransport(TipMijlocTransport tip, String nrInmatriculare) {
        switch (tip) {
            case Autobuz:
                return new Autobuz(nrInmatriculare);
            case Tramvai:
                return new Tramvai(nrInmatriculare);
            case Troleibuz:
                return new Troleibuz(nrInmatriculare);
            default:
                return null;
        }
    }
}
