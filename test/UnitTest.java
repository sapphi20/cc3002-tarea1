import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {
    private ArcherUnit arquero1;

    @Before
    public void setUp() {
        arquero1 = new ArcherUnit();
    }

    @Test
    public void getMaxHP() {
        assertEquals(arquero1.getMaxHP(), 60);
    }

    @Test
    public void setHP() {
        arquero1.setHP(1);
        assertEquals(arquero1.getHP(), 29);
        arquero1.setHP(300);
        assertFalse(arquero1.isAlive());
    }
}