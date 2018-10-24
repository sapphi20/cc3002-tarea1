import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InfantryUnitTest {
    private InfantryUnit soldado1;
    private InfantryUnit soldado2;
    private Monk wololo;
    private Villager aldeano1;
    @Before
    public void setUp() throws Exception {
        soldado1 = new InfantryUnit();
        soldado2 = new InfantryUnit();
        wololo = new Monk();
        aldeano1 = new Villager();
    }
    @Test
    public void attackedTest(){
        wololo.attacked(soldado1);
        assertEquals(45,soldado1.getHP());
        soldado1.attacked(wololo);
        assertFalse(wololo.isAlive());
        soldado2.attacked(soldado1);
        assertEquals(41,soldado1.getHP());
        assertEquals(0, wololo.getAttackPoints());
        aldeano1.attacked(soldado1);
        assertEquals(38, soldado1.getHP());

    }
}
