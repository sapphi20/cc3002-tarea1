import javafx.scene.shape.Arc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InfantryUnitTest {
    private InfantryUnit soldado1;
    private InfantryUnit soldado2;
    private ArcherUnit cosaConArco;
    private CavalryUnit unCaballo;
    private Castle unCastillo;
    private InfantryUnit soldadoDeJuguete;
    private Monk wololo;
    private Monk welele;
    private SiegeUnit carrito;
    private Villager aldeano1;
    @Before
    public void setUp() throws Exception {
        soldado1 = new InfantryUnit();
        soldado2 = new InfantryUnit();
        cosaConArco = new ArcherUnit();
        unCaballo = new CavalryUnit();
        unCastillo = new Castle();
        soldadoDeJuguete = new InfantryUnit();
        wololo = new Monk();
        welele = new Monk();
        carrito = new SiegeUnit();
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
        unCaballo.attacked(soldado1);
        soldadoDeJuguete.attacked(soldado1);
        unCastillo.attacked(soldado1);
        carrito.attacked(soldado1);
        assertEquals(0, soldado1.getHP());
        welele.attacked(soldado1);
        assertEquals(0, soldado1.getHP());
        cosaConArco.attacked(soldado2);
        assertEquals(35, soldado2.getHP());
    }
}
