/**
 * @author Alejandra Alarcón
 *
 */
public interface Attacker extends Attackable{
    /**
     * Entrega la cantidad de puntos de ataque de la entidad
     * @return int
     */
    int getAttackPoints();

    /**
     * Cambia los puntos de ataque de una entidad por el valor dado
     * @param attackPoints int
     */
    void setAttackPoints(int attackPoints);
    /**
     * Verifica si la unidad puede atacar, si no puede cambia
     * los puntos de ataque a 0
     */
    void cantAttack();
    /**
     * Ataca a la entidad v, los puntos de vida perdidos dependen de
     * quien atacó y a quién
     * @param v Attackable
     */
    void attacked(Attackable v);
}
