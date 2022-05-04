package main;

//13.  Pentru fiecare Autobuz se solicita salvarea acestora in memorie pentru posibilitatea de a reveni la o forma
// anterioara a obiectului respectiv. Se doreste implementarea unui modul care sa asigure aceasta salvare cu consum
// optim de memorie in conditiile in care este cunoscut faptul ca atributele care se vor modifica cu o frecventa mai
// mare sunt cele legate de soferul care il conduce, consumul mediu, etc. Celelalte atribute precum model, an
// fabricatie, numar locuri nu se vor modifca frecvent.

//AM IESIT LA TABLA
import clase.Autobuz;
import clase.AutobuzManager;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz("Mihai", 12, "dacia",2000, 30);
        AutobuzManager manager=new AutobuzManager();

        System.out.println(autobuz.toString());
        manager.adaugaMemento(autobuz.salvareMemento());
        autobuz.setNumeSofer("Andrei");
        System.out.println(autobuz.toString());
        autobuz.setNumeSofer("Aurel");
        manager.adaugaMemento(autobuz.salvareMemento());
        System.out.println(autobuz.toString());
        autobuz.setConsumMediu(200);
        System.out.println(autobuz.toString());
        manager.adaugaMemento(autobuz.salvareMemento());

        autobuz.revenireMemento(manager.getMemento(2));
        System.out.println("Memento");
        System.out.println(autobuz.toString());
    }
}
