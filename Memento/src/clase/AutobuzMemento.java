package clase;

public class AutobuzMemento {
    private String numeSofer;
    private Integer consumMediu;

    public AutobuzMemento(String numeSofer, Integer consumMediu) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public Integer getConsumMediu() {
        return consumMediu;
    }
}
