import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarracksTest {
    Barracks cuartel;
    ArcherUnit legolas;

    @Before
    public void setUp() throws Exception {
        cuartel = new Barracks();
        legolas = new ArcherUnit();
    }

    @Test
    public void attacked() {
        while (cuartel.isAlive()) {
            legolas.attacked(cuartel);
        }
        assertFalse(cuartel.isAlive());
        cuartel.attacked(legolas);
        assertEquals(30, legolas.getHP());
    }
}