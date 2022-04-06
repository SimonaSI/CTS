package Main;

import clase.Autobuz;
import clase.Grup;
import clase.NodAbstract;

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
