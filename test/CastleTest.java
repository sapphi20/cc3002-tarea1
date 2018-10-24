import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CastleTest {
    private Castle castillo1;
    private Castle castillo2;
    private SiegeUnit catapulta;
    private ArcherUnit archer;
    private CavalryUnit caballito;
    private InfantryUnit aragon;
    private Monk aMonk;
    private Villager davidCasas;

    @Before
    public void setUp() throws Exception {
        castillo1 = new Castle();
        catapulta = new SiegeUnit();
        castillo2 = new Castle();
        caballito = new CavalryUnit();
        archer = new ArcherUnit();
        aragon = new InfantryUnit();
        aMonk = new Monk();
        davidCasas = new Villager();
    }

    @Test
    public void attacked() {
        catapulta.attacked(castillo1);
        assertTrue(castillo1.isAlive());
        assertEquals(4720, castillo1.getHP());
        castillo2.attacked(castillo1);
        assertEquals(4718, castillo1.getHP());
        castillo1.setAttackPoints(1000);
        assertEquals(1000, castillo1.getAttackPoints());
        caballito.attacked(castillo1);
        assertEquals(4715, castillo1.getHP());
        aragon.attacked(castillo1);
        aMonk.attacked(castillo1);
        archer.attacked(castillo1);
        davidCasas.attacked(castillo1);
    }
}