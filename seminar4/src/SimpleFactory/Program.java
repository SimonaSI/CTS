package SimpleFactory;

//Pt o autobaza stb se doreste implementarea unui modul care sa creeze tipul de transport public
//in functie de cerintele unui operator.
//Tipul de transport public poate fi Autobuz, Troleu sau Tramvai. Tipurile de transport in comun salvate intr-o enumerare
//Creati acest modul care permite crearea de obiecte din familia de clase a mijlocaelor de transport in comun.

//familia de clase = simple factory

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz;
        MijlocTransportComun mijloc1 = CreatorMijlocTransport.creareMijlocTransport(TipMijlocTransport.Autobuz, "AG.12.AUT");
        MijlocTransportComun mijloc2 = CreatorMijlocTransport.creareMijlocTransport(TipMijlocTransport.Tramvai, "AG.12.TRA");
        MijlocTransportComun mijloc3 = CreatorMijlocTransport.creareMijlocTransport(TipMijlocTransport.Troleibuz, "AG.12.TRO");

        System.out.println(mijloc1);
        System.out.println(mijloc2);
        System.out.println(mijloc3);
    }
}
