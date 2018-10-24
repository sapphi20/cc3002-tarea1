import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CavalryUnitTest {
    CavalryUnit caballo1;
    CavalryUnit caballo2;
    Monk monjeRandom;
    Monk otroMonje;

    @Before
    public void setUp() throws Exception {
        caballo1 = new CavalryUnit();
        caballo2 = new CavalryUnit();
        monjeRandom = new Monk();
        otroMonje = new Monk();
    }

    @Test
    public void attacked() {
        monjeRandom.attacked(caballo1);
        caballo2.attacked(caballo1);
        assertEquals(58, caballo1.getHP());
        caballo1.attacked(monjeRandom);
        assertFalse(monjeRandom.isAlive());
        assertEquals(120, caballo1.getMaxHP());
        otroMonje.attacked(monjeRandom);
        assertEquals(0, monjeRandom.getHP());
    }
}