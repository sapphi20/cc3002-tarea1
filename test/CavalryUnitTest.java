import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CavalryUnitTest {
    private CavalryUnit caballo1;
    private CavalryUnit tracer;
    private Monk monjeRandom;
    private Monk otroMonje;
    private ArcherUnit humanoConArco;
    private InfantryUnit tomimi;
    private SiegeUnit aShidio;
    private Villager villager;

    @Before
    public void setUp() throws Exception {
        caballo1 = new CavalryUnit();
        tracer = new CavalryUnit();
        monjeRandom = new Monk();
        otroMonje = new Monk();
        humanoConArco = new ArcherUnit();
        tomimi = new InfantryUnit();
        aShidio = new SiegeUnit();
        villager = new Villager();
    }

    @Test
    public void attacked() {
        monjeRandom.attacked(caballo1);
        System.out.println("The cavalry is here!");
        tracer.attacked(caballo1);
        assertEquals(58, caballo1.getHP());
        caballo1.attacked(monjeRandom);
        assertFalse(monjeRandom.isAlive());
        assertEquals(120, caballo1.getMaxHP());
        otroMonje.attacked(monjeRandom);
        assertEquals(0, monjeRandom.getHP());
        humanoConArco.attacked(caballo1);
        tomimi.attacked(caballo1);
        aShidio.attacked(caballo1);
        villager.attacked(caballo1);
        assertTrue(caballo1.isAlive());
        while (caballo1.getHP() < caballo1.getMaxHP()) {
            otroMonje.attacked(caballo1);
        }
        assertEquals(120, caballo1.getHP());
        otroMonje.attacked(caballo1);
        assertEquals(120, caballo1.getHP());
    }
}