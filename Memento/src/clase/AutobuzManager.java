package clase;

import java.util.ArrayList;
import java.util.List;

public class AutobuzManager {
    List<AutobuzMemento> autobuze;

    public AutobuzManager() {
        autobuze = new ArrayList<>();
    }

    public void adaugaMemento(AutobuzMemento memento){
        autobuze.add(memento);
    }

    public AutobuzMemento getMemento(int index){
        return autobuze.get(index);
    }
}
