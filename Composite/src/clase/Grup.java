package clase;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class Grup implements NodAbstract{

    private List<NodAbstract> listaNoduri = new ArrayList<>();
    private String denumire;

    public Grup(String denumire) {
        super();
        this.listaNoduri = new ArrayList<>();
        this.denumire = denumire;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Denumirea grupului este: " + denumire);
        for(NodAbstract nod:listaNoduri) {
            nod.afiseazaDescriere();
        }
    }

    @Override
    public NodAbstract get( int index) throws ExecutionControl.NotImplementedException {
        return listaNoduri.get(index);
    }

    @Override
    public void add(NodAbstract nodAbstract) throws ExecutionControl.NotImplementedException {
        listaNoduri.add(nodAbstract);
    }

    @Override
    public void remove(NodAbstract nodAbstract) throws ExecutionControl.NotImplementedException {
        listaNoduri.remove(nodAbstract);
    }
}
