package tests.teste;

import clase.IPersoana;
import claseAgentie.IPachetTuristic;
import claseAgentie.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import tests.categorii.ITestWithFake;
import tests.categorii.ITestWithRight;
import tests.categorii.ITestWithStub;
import tests.dubluri.PersoanaFake;
import tests.dubluri.PersoanaStub;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    @Category({ITestWithStub.class})
    public void testPoateRezerva() {
        IPersoana persoana = new PersoanaStub();
        IPachetTuristic pachet = new PachetTuristic(persoana, "Mamaia", 100.0);
        assertTrue(pachet.poateRezerva());
    }

    @Test
    @Category({ITestWithFake.class, ITestWithRight.class})
    public void testNuPoateRezerva() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(15);
        IPachetTuristic pachet = new PachetTuristic(persoana, "Mamaia", 100.0);
        assertFalse(pachet.poateRezerva());
    }

}