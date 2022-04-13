package main;


//8. Pentru autobuzele de noapte se doreste ca oprirea in statie sa se faca doar daca exista persoane in autobuz.
// In caz contrar autobuzul se retrage la autobaza fara sa mai realizeze opriri. Sa se implementeze modul care va
// permite oprirea in statie a autobuzelor doar daca exista calatori in autobuz.

import clase.Autobuz;
import clase.AutobuzDeNoapte;
import clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport mijlocTransport = new Autobuz(6, "Model1");
        mijlocTransport.opresteStatie();

        ((Autobuz)mijlocTransport).setNrCalatori(0);

        MijlocTransport mijlocTransport1 = new AutobuzDeNoapte(mijlocTransport);
        mijlocTransport1.opresteStatie();
    }
}
