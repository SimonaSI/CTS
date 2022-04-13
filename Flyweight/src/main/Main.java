package main;

//9.  Pentru fiecare AutobuzLinie sunt salvate in memorie, informatii precum: model autobuz, an fabricatie, numar locuri, numar linie,prima statie,
// ultima statie. Aceste informatii sunt salvate pentru fiecare AutobuzLinie din oras. Se doreste implementarea unui modul care sa asigure gestiunea
// in mod optim a memoriei, tinandu-se cont de faptul ca anumite informatii sunt redundante, deoarece pe o linie vor merge mai multe autobuze.

import clase.Autobuz;
import clase.Linie;
import clase.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("model1", 2000, 20);
        Autobuz autobuz2 = new Autobuz("model2", 1999, 18);
        Autobuz autobuz3 = new Autobuz("model1", 1990, 13);
        Autobuz autobuz4 = new Autobuz("model3", 2012, 40);

        LinieFactory linieFactory = new LinieFactory();

        Linie linie1 = linieFactory.getLinie(168);
        Linie linie2 = linieFactory.getLinie(137);

        linie1.afiseazaDescriere(autobuz1);
        linie1.afiseazaDescriere(autobuz4);
        linie2.afiseazaDescriere(autobuz2);
        linie2.afiseazaDescriere(autobuz3);



    }
}
