package main;

//14. Un tramvai circula de fiecare data pe aceeasi linie, astfel el are de parcurs confom unui patern bine stabilit statiile de pe acea linie:
//Statia1, Statia2, Statia3, Statia4, Statia5, Statia6 atunci cand merge intr-un sens si invers atunci cand parcurge traseul in sens invers.
//Sa se implementeze modului care asigura oprirea in statiile stabilite de catre patern pentru Tramvai.

import clase.Tramvai;
import clase.TramvaiAbstract;
import clase.TramvaiProbe;

public class Main {
    public static void main(String[] args) {
        TramvaiAbstract tramvai1 = new Tramvai();
        TramvaiAbstract tramvai2 = new TramvaiProbe();
        tramvai1.parcurgeTraseu();
        tramvai1.parcurgeTraseuInvers();
        tramvai2.parcurgeTraseu();
        tramvai2.parcurgeTraseuInvers();


    }
}
