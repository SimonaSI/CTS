package main;

//12. Trebuie implementat un modul care sa ii spuna calatorului ce mijloc de transport trebuie sa foloseasca in functie de distanta pe care
// o are de parcurs. Astfel, daca un calator are de parcurs o distanta mai mica de 3 km, este recomandat sa mearga cu Troleibuzul.
// Daca are o distanta cuprinsa intre 3 si 5 km i se recomanda sa foloseasca autobuzul, iar daca are o distanta mai mare de 5 km, dar
// mai mica decat 10,  i se recomanda sa foloseasca Tramvaiul. In cazul in care distanta este mai mare decat 10 km i se recomanda sa
// foloseasca Metroul.
//Sa se implementeze acest modul in cadrul aplicatiei.

import clase.*;

public class Main {
    public static void main(String[] args) {
        TransportHandler autobuz = new AutobuzHandler(5);
        TransportHandler tramvai = new TramvaiHandler(10);
        TransportHandler troleibuz = new TroleibuzHandler(3);
        TransportHandler metrou = new MetrouHandler(1000);

        troleibuz.setHandler(autobuz);
        autobuz.setHandler(tramvai);
        tramvai.setHandler(metrou);

        Integer distanta = 99;
        troleibuz.deplaseazaRequest(distanta);

        TransportHandler autobuzArad = new AutobuzHandler(1000);
        TransportHandler tramvaiArad = new TramvaiHandler(2);
        tramvaiArad.setHandler(autobuzArad);
        tramvaiArad.deplaseazaRequest(5);


    }
}
