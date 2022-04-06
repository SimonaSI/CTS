package clase;

import jdk.jshell.spi.ExecutionControl;

public interface NodAbstract {
    void afiseazaDescriere();

    NodAbstract get(int index) throws ExecutionControl.NotImplementedException;
    void add(NodAbstract nodAbstract) throws ExecutionControl.NotImplementedException;
    void remove(NodAbstract nodAbstract) throws ExecutionControl.NotImplementedException;
}
