package tests;

import clase.Persoana;
import exceptii.ExceptieCNPGresit;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetVarstaTest {

    @Test
    public void getVarsta() {
        Persoana persoana = new Persoana("Ana", "6010212765481");
        assertEquals(21, persoana.getVarsta());
    }

    @Test
    public void bounderyGetVarsta() {
        Persoana persoana = new Persoana("Maria", "3000101765481");
        assertEquals(222, persoana.getVarsta());
    }

    @Test
    public void boundery2GetVarsta(){
        Persoana persoana2 = new Persoana("Ioana", "6220101765481");
        assertEquals(0, persoana2.getVarsta());
    }

    //cnp are un an mai mare decat cel in care ne aflam(s-a nascut in viitor)
    @Test(expected = ExceptieCNPGresit.class)
    public void errorConditionsGetVarsta() {
        Persoana persoana2 = new Persoana("Ioana", "6250101765481");
        persoana2.getVarsta();
    }

    //cnp e format din litere
    @Test(expected = NumberFormatException.class)
    public void errorConditions2GetVarsta() {
        Persoana persoana2 = new Persoana("Ioana", "abcertghostes");
        persoana2.getVarsta();
    }

    //cnp are prea putine cifre
    @Test(expected = IndexOutOfBoundsException.class)
    public void errorConditions3GetVarsta() {
        Persoana persoana2 = new Persoana("Ioana", "1923");
        persoana2.getVarsta();
    }

    @Test(timeout = 100)
    public void performanceGetVarsta() {
        Persoana persoana2 = new Persoana("Ioana", "6210101765481");
        persoana2.getVarsta();
    }

    @Test
    public void orderGetVarsta() {
        Persoana persoana = new Persoana("Ioana", "2980101765481");
        Persoana persoana2 = new Persoana("Maria", "6000101765481");

        assertTrue(persoana.getVarsta()>persoana2.getVarsta());
    }


    //cnp e null
    @Test(expected = NullPointerException.class)
    public void existanceGetVarsta(){
        Persoana persoana2 = new Persoana("Ioana", null);
        persoana2.getVarsta();
    }

}