package clase;

public class AutobuzDeNoapte implements MijlocTransport{

    private MijlocTransport autobuz;

    public AutobuzDeNoapte(MijlocTransport autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteStatie() {
        if (autobuz.getNrCalatori() > 0) {
            autobuz.opresteStatie();
        }
        else {
            System.out.println("Autobuzul nu are calatori, nu mai opreste in statie");
        }
    }

    @Override
    public Integer getNrCalatori() {
        return autobuz.getNrCalatori();
    }
}
