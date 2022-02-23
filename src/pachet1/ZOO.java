package pachet1;

import pachet1.Animal;
import pachet1.IngrijitorZOO;

import java.util.*;

public class ZOO {
    private String nume;
    private IngrijitorZOO ingrijitor;
    private List<Animal> animale;

    public ZOO(String nume, IngrijitorZOO ingrijitor) {
        this.nume = nume;
        this.ingrijitor = ingrijitor;
        this.animale = new ArrayList<Animal>();
    }

    public ZOO(String nume, IngrijitorZOO ingrijitor, List<Animal> animale) {
        this.nume = nume;
        this.ingrijitor = ingrijitor;
        this.animale = animale;
    }

    public void addAnimal(Animal animal) {
        animale.add(animal);
    }

    public void hranesteAnimale(String hrana) {
        for (Animal animal:animale) {
            ingrijitor.hranesteAnimal(animal,hrana);
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZOO getIngrijitor() {
        return ingrijitor;
    }

    public void setIngrijitor(IngrijitorZOO ingrijitor) {
        this.ingrijitor = ingrijitor;
    }


}
