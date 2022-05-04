package clase;

public class LaReparat implements StareAutobuz{
    @Override
    public void modificaStare(Autobuz autobuz) {
        if (autobuz.getStare()instanceof LaCapatDeLinie) {
            System.out.println("Autobuzul "+ autobuz.getNumarAutobuz() + " este la reparat");
            autobuz.setStare(this);
        }
        else {
            System.out.println("Autobuzul "+ autobuz.getNumarAutobuz() + " nu este la capat de linie");
        }
    }
}
