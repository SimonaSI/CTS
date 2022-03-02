package main;

import pachet1.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        IngrijitorZOO ingrijitor1 = new IngrijitorZOO("Ingrijitor1");
        ZOO zoo = new ZOO("Zoo1", ingrijitor1);

        Zebra zebra1 = new Zebra("zebra1");
        Zebra zebra2 = new Zebra("zebra2");
        Girafa girafa = new Girafa("girafa1");
        Girafa chichi = new Girafa("chichi");

        zoo.addAnimal(zebra1);
        zoo.addAnimal(zebra2);
        zoo.addAnimal(girafa);
        zoo.addAnimal(chichi);

        zoo.hranesteAnimale("iarba");


    }
}
