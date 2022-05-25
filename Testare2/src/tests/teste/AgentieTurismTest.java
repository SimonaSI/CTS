package tests.teste;

import claseAgentie.AgentieTurism;
import claseAgentie.IPachetTuristic;
import claseAgentie.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import tests.categorii.ITestWithDummy;
import tests.categorii.ITestWithFake;
import tests.categorii.ITestWithRight;
import tests.dubluri.PachetDummy;
import tests.dubluri.PachetFake;

import static org.junit.Assert.*;

public class AgentieTurismTest {

    @Test
    @Category({ITestWithDummy.class})
    public void testAdaugaPachet() {
        AgentieTurism agentie = new AgentieTurism();
        IPachetTuristic pachet = new PachetDummy();

        agentie.adaugaPachet(pachet);
        assertEquals(1,agentie.getNumarPacheteTuristice());
    }

    @Test
    @Category({ITestWithFake.class, ITestWithRight.class})
    public void testCalculSumaPachete() {
        AgentieTurism agentie = new AgentieTurism();
        PachetFake pachet1 = new PachetFake();
        PachetFake pachet2 = new PachetFake();

        pachet1.setPret(100.0);
        pachet2.setPret(10.0);

        agentie.adaugaPachet(pachet1);
        agentie.adaugaPachet(pachet2);

        assertEquals(110.0, agentie.calculareSumaTotalaPachete(), 0.01);

    }



}