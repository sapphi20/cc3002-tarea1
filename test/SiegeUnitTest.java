import javafx.scene.shape.Arc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SiegeUnitTest {
    private SiegeUnit unaCatapulta;
    private SiegeUnit otraCatapulta;
    private ArcherUnit centinela;
    private Castle sanAnselmo;
    private CavalryUnit jinete;
    private Monk unMonje;
    private InfantryUnit soldadito;
    private Villager amiibo;

    @Before
    public void setUp() throws Exception {
        unaCatapulta = new SiegeUnit();
        otraCatapulta = new SiegeUnit();
        centinela = new ArcherUnit();
        sanAnselmo = new Castle();
        jinete = new CavalryUnit();
        unMonje = new Monk();
        soldadito = new InfantryUnit();
        amiibo = new Villager();
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
        amiibo.attacked(unaCatapulta);
        jinete.attacked(unaCatapulta);
        centinela.attacked(unaCatapulta);
        sanAnselmo.attacked(unaCatapulta);
        assertTrue(unaCatapulta.isAlive());
    }
}