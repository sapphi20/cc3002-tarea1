import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SiegeUnitTest {
    private SiegeUnit unaCatapulta;
    private SiegeUnit otraCatapulta;
    private Monk unMonje;
    private InfantryUnit soldadito;

    @Before
    public void setUp() throws Exception {
        unaCatapulta = new SiegeUnit();
        otraCatapulta = new SiegeUnit();
        unMonje = new Monk();
        soldadito = new InfantryUnit();
    }

    @Test
    public void attacked() {
        unaCatapulta.attacked(otraCatapulta);
        assertEquals(0, otraCatapulta.getHP());
        assertFalse(otraCatapulta.isAlive());
        unMonje.attacked(unaCatapulta);
        assertEquals(50, unaCatapulta.getHP());
        soldadito.attacked(unaCatapulta);
        assertEquals(45, unaCatapulta.getHP());
    }
}