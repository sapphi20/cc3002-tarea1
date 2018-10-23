import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameObjectTest {
    Barracks barracas1;
    Barracks barracas2;
    Villager aldeano1;


    @Before
    public void setUp() throws Exception {
        barracas1 = new Barracks();
        barracas2 = new Barracks();
        aldeano1 = new Villager();
    }

    @Test
    public void test() throws Exception{
        barracas2.attacked(barracas1);
        assertEquals(1200, barracas1.getHP());
        aldeano1.attacked(barracas1);
        assertEquals(1200, barracas1.getHP());
    }
}