import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InfantryUnitTest {
    InfantryUnit soldado1;
    InfantryUnit soldado2;
    Monk wololo;
    @Before
    public void setUp() throws Exception {
        soldado1 = new InfantryUnit();
        soldado2 = new InfantryUnit();
        wololo = new Monk();
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
    }
}
