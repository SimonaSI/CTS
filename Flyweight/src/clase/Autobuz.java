package clase;

public class Autobuz {
    private String model;
    private int anFabricatie;
    private int nrLocuri;

    public Autobuz(String model, int anFabricatie, int nrLocuri) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
