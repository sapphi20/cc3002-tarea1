import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VillagerTest {
    private Villager pedrito;
    private Villager juanito;
    private Villager dieguito;
    private ArcherUnit termo;
    private Castle castilloRandom;
    private CavalryUnit orisa;
    private InfantryUnit soldado76;
    private Monk monje;
    private SiegeUnit bastion;

    @Before
    public void setUp() throws Exception {
        pedrito = new Villager();
        juanito = new Villager();
        dieguito = new Villager();
        termo = new ArcherUnit();
        castilloRandom = new Castle();
        orisa = new CavalryUnit();
        soldado76 = new InfantryUnit();
        monje = new Monk();
        bastion = new SiegeUnit();
    }

    @Test
    public void attacked() {
        pedrito.attacked(castilloRandom);
        juanito.attacked(castilloRandom);
        dieguito.attacked(castilloRandom);
        assertEquals(4800, castilloRandom.getHP());
        pedrito.attacked(juanito);
        dieguito.attacked(juanito);
        assertEquals(19, juanito.getHP());
        castilloRandom.attacked(juanito);
        assertEquals(5, juanito.getHP());
        while (juanito.getHP() < juanito.getMaxHP()) {
            monje.attacked(juanito);
        }
        assertEquals(50, juanito.getHP());
        termo.attacked(juanito);
        orisa.attacked(juanito);
        assertEquals(33, juanito.getHP());
        soldado76.attacked(juanito);
        bastion.attacked(juanito);
        assertFalse(juanito.isAlive());
    }
}