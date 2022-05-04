package clase;

public class Autobuz {
    private String numeSofer;
    private Integer consumMediu;
    private String model;
    private Integer anFabricatie;
    private Integer numarLocuri;

    public Autobuz(String numeSofer, Integer consumMediu, String model, Integer anFabricatie, Integer numarLocuri) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.numarLocuri = numarLocuri;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(Integer consumMediu) {
        this.consumMediu = consumMediu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz ");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", consumMediu=").append(consumMediu);
        sb.append(", model='").append(model).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", numarLocuri=").append(numarLocuri);
        return sb.toString();
    }

    public AutobuzMemento salvareMemento() {
        AutobuzMemento autobuzMemento = new AutobuzMemento(numeSofer, consumMediu);
        return autobuzMemento;
    }

    public void revenireMemento(AutobuzMemento autobuzMemento) {
        this.numeSofer = autobuzMemento.getNumeSofer();
        this.consumMediu = autobuzMemento.getConsumMediu();
    }
}
