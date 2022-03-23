package Factory;


//Pt o autobaza stb se doreste implementarea unui modul care sa creeze tipul de transport public
//in functie de cerintele unui operator.
//Tipul de transport public poate fi Autobuz, Troleu sau Tramvai.
//Creati acest modul care permite crearea de obiecte din familia de clase a mijlocaelor de transport in comun.
//Sa nu folosim enum.

public class Main {

    public static void modulAfisareMijlocTransport(Factory fabrica, String nrInmatriculare){
        MijlocTransportComun mijlocTransportComun = fabrica.creareMijlocTransportComun(nrInmatriculare);
        System.out.println(mijlocTransportComun);
    }

    public static void main(String[] args) {
        Factory factory = new AutobuzFactory();
        System.out.println(factory.creareMijlocTransportComun("Merge").getNrInmatriculare());

        Factory factory1 = new MicrobuzFactory();
        System.out.println(factory.creareMijlocTransportComun("Merge microbuz").getNrInmatriculare());

    }
}
