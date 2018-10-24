/**
 * @author Alejandra Alarcón
 *
 */
public interface Attacker extends Attackable{
    /**
     *
     * @return
     */
    int getAttackPoints();

    /**
     *
     * @param attackPoints
     */
    void setAttackPoints(int attackPoints);
    /**
     *
     */
    void cantAttack();
    /**
     *
     * @param v
     */
    void attacked(Attackable v);
}
