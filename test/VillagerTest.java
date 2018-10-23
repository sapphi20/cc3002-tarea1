import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VillagerTest {
    Villager pedrito;
    Villager juanito;
    Villager dieguito;
    Castle castilloRandom;

    @Before
    public void setUp() throws Exception {
        pedrito = new Villager();
        juanito = new Villager();
        dieguito = new Villager();
        castilloRandom = new Castle();
    }

    @Test
    public void attacked() {
        pedrito.attacked(castilloRandom);
        juanito.attacked(castilloRandom);
        dieguito.attacked(castilloRandom);
        assertEquals(4800, castilloRandom.getHP());
    }
}