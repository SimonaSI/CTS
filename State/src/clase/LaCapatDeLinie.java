package clase;

public class LaCapatDeLinie implements StareAutobuz{
    @Override
    public void modificaStare(Autobuz autobuz) {
        if (!(autobuz.getStare() instanceof LaCapatDeLinie)) {
            autobuz.setStare(this);
            System.out.println("Autobuzul cu numarul " + autobuz.getNumarAutobuz() + " este la capat de linie");
        }
        else
        {
            System.out.println("Autobuzul cu numarul " + autobuz.getNumarAutobuz() + " este deja la capat de linie");
        }
    }
}
