package pachet1;

import pachet1.Animal;

public class IngrijitorZOO {
    private String nume;

    public void hranesteAnimal(Animal animal, String hrana) {
        animal.mananca(hrana);
    }

    public IngrijitorZOO(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
