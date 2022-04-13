package client;

import clase.Subject;

import java.util.HashSet;
import java.util.Set;

public class Autobuz implements Subject {

    private Set<Observer> observers;
    private int nrLinie;

    public Autobuz(int nrLinie) {
        observers = new HashSet<>();
        this.nrLinie = nrLinie;
    }

    @Override
    public void aboneaza(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void dezaboneaza(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifica(String mesaj) {
        for (Observer observer : observers) {
            observer.primesteMesaj(mesaj);
        }
    }

    public void pleacaDeLaCapat() {
        notifica( " Autobuzul cu numarul " + nrLinie + " pleaca de la capat de linie");
    }
}
