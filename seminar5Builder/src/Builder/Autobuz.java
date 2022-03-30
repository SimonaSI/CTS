package Builder;

import java.util.TreeMap;

public class Autobuz {
    private String model;
    private String numeSofer;
    private String nrInmatriculare;
    private String text;
    private Boolean stop;
    private Boolean openDoors;
    private Integer nrLinie;
    private Boolean isNew;

     Autobuz() {
        model = "mercedes";
        numeSofer = "Dorel";
        nrInmatriculare = "Ag.12.opo";
        stop = true;
        openDoors = true;
        text = "Buna ziua, pasageri";
        nrLinie = 555;
        isNew = true;
    }

    public Autobuz(String model, String numeSofer, String nrInmatriculare, String text, Boolean stop, Boolean openDoors, Integer nrLinie, Boolean isNew) {
        this.model = model;
        this.numeSofer = numeSofer;
        this.nrInmatriculare = nrInmatriculare;
        this.text = text;
        this.stop = stop;
        this.openDoors = openDoors;
        this.nrLinie = nrLinie;
        this.isNew = isNew;
    }

    void setModel(String model) {
        this.model = model;
    }

     void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

     void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

     void setText(String text) {
        this.text = text;
    }

     void setStop(Boolean stop) {
        this.stop = stop;
    }

     void setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
    }

     void setNrLinie(Integer nrLinie) {
        this.nrLinie = nrLinie;
    }

     void setNew(Boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", text='").append(text).append('\'');
        sb.append(", stop=").append(stop);
        sb.append(", openDoors=").append(openDoors);
        sb.append(", nrLinie=").append(nrLinie);
        sb.append(", isNew=").append(isNew);
        sb.append('}');
        return sb.toString();
    }
}
