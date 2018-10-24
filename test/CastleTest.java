import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CastleTest {
    private Castle castillo1;
    private SiegeUnit catapulta;

    @Before
    public void setUp() throws Exception {
        castillo1 = new Castle();
        catapulta = new SiegeUnit();
    }

    @Test
    public void attacked() {
        catapulta.attacked(castillo1);
        assertTrue(castillo1.isAlive());
        assertEquals(4720, castillo1.getHP());
    }
}