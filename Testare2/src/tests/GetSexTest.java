package tests;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetSexTest {

    @org.junit.Test
    public void getSex() {
        Persoana persoana = new Persoana("Andrei", "1981212765481");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void bounderyGetSex() {
        Persoana persoana = new Persoana("Stanescu", "3281212765481");
        Persoana persoana2 = new Persoana("Mihai", "6011212765481");

        assertEquals("M", persoana.getSex());
        assertEquals("F", persoana2.getSex());
    }

    @Test
    public void crossCheckGetSex() {
        Persoana persoana = new Persoana("Stanescu", "3281212765481");
        assertEquals(persoana.CNP.charAt(0)%2 == 0 ?"F" : "M", persoana.getSex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void errorConditionsGetSex() {
        Persoana persoana = new Persoana("Stanescu", "0281212765481");
        persoana.getSex();
    }

    @Test(timeout = 100)
    public void performanceGetSex() {
        Persoana persoana = new Persoana("Stanescu", "3281212765481");
        persoana.getSex();
    }

    @Test
    public void conformanceGetSex() {
        Persoana persoana = new Persoana("Stanescu", "3281212765481");
        Persoana persoana2 = new Persoana("StanescuFata", "4281212765481");

        assertEquals("M", persoana.getSex());
        assertEquals("F", persoana2.getSex());
    }

    @Test
    public void rangeGetSex(){
        Persoana persoana = new Persoana("Stanescu", "7981212765481");
        assertEquals("N/A", persoana.getSex());
    }

    @Test(expected = NullPointerException.class)
    public void existanceGetSex(){
        Persoana persoana = new Persoana("Stanescu", null);
        persoana.getSex();
    }

}