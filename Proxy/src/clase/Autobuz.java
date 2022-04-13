package clase;

public class Autobuz implements MijlocTransport {
    private Integer nrCalatori;
    private String model;

    public Autobuz(Integer nrCalatori, String model) {
        this.nrCalatori = nrCalatori;
        this.model = model;
    }

    public Integer getNrCalatori() {
        return nrCalatori;
    }

    public void setNrCalatori(Integer nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void opresteStatie() {
        System.out.println("Autobuzul a oprit in statie cu " + nrCalatori + " calatori!");
    }
}
