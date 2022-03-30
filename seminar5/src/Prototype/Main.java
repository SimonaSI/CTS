package Prototype;

//2. Pentru crearea de obiecte de tip Autobuz sunt conusmate foarte multe resurse. Din acest motiv trebuie porpusa o varianta prin
// care daca exista deja un obiect creat, sa fie folosit acest obiect pentru viitoarele obiecte, fara a mai fi nevoie de crearea de
// la 0 a obiectelor de tip Autobuz.
//Aceeasi regula se va aplica si pentru alte tipuri de mijloace de transport.

public class Main {
    public static void main(String[] args) {
        Autobuz bus1 = new Autobuz("Ag.12.opo", "Dorel");
        Tramvai tramvai1 = new Tramvai("B.01.bat", "Gigel");

        try {
            MijlocTransport bus2 = bus1.copiaza();
            MijlocTransport tramvai2 = tramvai1.copiaza();

            System.out.println("Original bus " + bus1);
            System.out.println("Original tramvai " + tramvai1);

            System.out.println("Copie bus " + bus2);
            System.out.println("Copie tramvai " + tramvai2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
