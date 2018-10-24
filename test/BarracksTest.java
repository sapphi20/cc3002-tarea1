import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarracksTest {
    private Barracks cuartel;
    private Barracks otroCuartel;
    private ArcherUnit legolas;
    private Villager juanito;
    private Monk monje1;
    @Before
    public void setUp() throws Exception {
        cuartel = new Barracks();
        otroCuartel = new Barracks();
        legolas = new ArcherUnit();
        juanito = new Villager();
        monje1 = new Monk();
    }

    @Test
    public void attacked() {
        cuartel.attacked(otroCuartel);
        assertEquals(1200, otroCuartel.getHP());
        while (cuartel.isAlive()) {
            legolas.attacked(cuartel);
        }
        assertFalse(cuartel.isAlive());
        cuartel.attacked(legolas);
        assertEquals(30, legolas.getHP());
        juanito.attacked(cuartel);
        System.out.println(cuartel.getHP());
        assertEquals(0, cuartel.getHP());
        monje1.attacked(otroCuartel);
        assertEquals(1200, otroCuartel.getHP());
    }
}