package Main;

import clase.Autobuz;
import clase.Grup;
import clase.NodAbstract;

//6. Pentru a gestiona garanția asigurată pentru fiecare autobuz disponibil în cadrul flotei companiei, se dorește
// implementrea unei soluții ce permite vizualizarea fiecărui autobuz în funcție de tipul acestuia si grupul pentru care
// este destinat. Structura definește o ierarhie între tipurile de autobuze din flotă, grupate pe dimensiunea acestora
// (grupuri mici – 10 locuri, grupuri medii – 30 locuri, grupuri mari – 50 locuri). Fiecare autobuz este descris de
// producător, model si număr de locuri.

public class Main {
    public static void main(String[] args) {
        NodAbstract nod = new Autobuz("aaa", "Dacia",7);
        NodAbstract nod2 = new Autobuz("bbb", "Dacia",12);
        NodAbstract nod3 = new Autobuz("ccc", "Dacia",45);
        NodAbstract grupMici = new Grup("Autobuze mici");
        NodAbstract grupMari = new Grup("Autobuze mari");
        NodAbstract flota = new Grup("Flota");
        try {
            grupMici.add(nod);
            grupMici.add(nod2);
            grupMari.add(nod3);
            flota.add(grupMari);
            flota.add(grupMici);
            flota.afiseazaDescriere();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
