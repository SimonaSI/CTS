package main;

//11. Se doreste implementarea unei aplicatii prin care utilizatorii se pot inregistra intr-o lista de calatori care sa fie anuntati atunci cand
// autobuzul pleaca de la capat de linie. Autobuzul cand pleaca in cursa de la capatul de linie trebuie sa anunte toti acesti calatori că s-a pus
// in miscare. Calatorii vor putea in acest mod sa stie cand trebuie sa astepte autobuzul in statie.

import clase.Calator;
import client.Autobuz;

public class Main {

    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz(1);
        Calator calator1 = new Calator("Gigel");
        Calator calator2 = new Calator("Dorel");
        Calator calator3 = new Calator("Marcel");

        autobuz1.aboneaza(calator1);
        autobuz1.aboneaza(calator2);
        autobuz1.aboneaza(calator3);

//        autobuz1.notifica("Am plecat, asteapta-ma!");
//        autobuz1.pleacaDeLaCapat();
        autobuz1.dezaboneaza(calator2);
        autobuz1.pleacaDeLaCapat();

    }
}
