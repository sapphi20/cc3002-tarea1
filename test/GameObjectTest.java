import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameObjectTest {
    private Barracks barracas1;
    private Barracks barracas2;
    private Villager aldeano1;
    private Castle castillo1;
    private Attackable castillo2;
    private CavalryUnit caballito;

    @Before
    public void setUp() throws Exception {
        barracas1 = new Barracks();
        barracas2 = new Barracks();
        aldeano1 = new Villager();
        castillo1 = new Castle();
        castillo2 = new Castle();
        caballito = new CavalryUnit();
    }

    @Test
    public void test() throws Exception {
        aldeano1.attacked(barracas1);
        assertEquals(1200, barracas1.getHP());
        castillo2.attacked(castillo1);
        assertEquals(4798, castillo1.getHP());
        castillo1.setAttackPoints(1000);
        assertEquals(1000, castillo1.getAttackPoints());
        caballito.attacked(castillo1);
        assertEquals(4795, castillo1.getHP());
        castillo1.attacked(caballito);
        assertEquals(0, caballito.getHP());
        assertFalse(caballito.isAlive());
    }
}