package clase;

public class InCursa implements StareAutobuz{
    @Override
    public void modificaStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatDeLinie) {
            System.out.println("Autobuzul cu numarul " + autobuz.getNumarAutobuz() + " se duce in cursa");
            autobuz.setStare(this);
        }
        else {
            System.out.println("Autobuzul cu numarul " + autobuz.getNumarAutobuz() + " nu poate sa plece in cursa");
        }
    }
}
