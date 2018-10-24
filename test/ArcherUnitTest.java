import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArcherUnitTest {
    private ArcherUnit elfoConArco1;
    private ArcherUnit elfoConArco2;
    private Castle castillo1;
    private CavalryUnit caballito;

    @Before
    public void setUp() throws Exception {
        elfoConArco1 = new ArcherUnit();
        elfoConArco2 = new ArcherUnit();
        castillo1 = new Castle();
        caballito = new CavalryUnit();
    }

    @Test
    public void attacked() {
        elfoConArco1.attacked(elfoConArco2);
        assertEquals(25, elfoConArco2.getHP());
        assertTrue(elfoConArco2.isAlive());
        caballito.attacked(elfoConArco2);
        assertEquals(14, elfoConArco2.getHP());
        castillo1.attacked(elfoConArco2);
        assertEquals(0, elfoConArco2.getHP());
    }
}