/**
 * @author Alejandra Alarcón
 */
public abstract class Unit extends GameObject implements Attacker {
    /**
     * Constructor para las unidades
     * baseHP es la vida inicial de la unidad
     * attackPoints son los puntos de ataque
     * currentHP es la vida actual de la unidad (inicialmente es igual a baseHP)
     * @param HP int
     * @param attackPoints int
     */
    public Unit(int HP, int attackPoints) {
        this.baseHP = HP;
        this.attackPoints = attackPoints;
        this.currentHP = baseHP;
    }

    @Override
    public void cantAttack() {
        if (!this.isAlive()) {
            this.setAttackPoints(0);
        }
    }

    /**
     * Primero ve si la unidad no puede atacar (en ese caso se dejan los puntos de ataque en cero),
     * luego entrega los puntos de ataque
     * @return int
     */
    public int getAttackPoints() {
        this.cantAttack();
        return this.attackPoints;
    }

    @Override
    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    /**
     * Entrega el doble de la vida inicial como vida maxima
     * que puede tener la unidad
     * @return int
     */
    @Override
    public int getMaxHP() {
        return 2 * baseHP;
    }
}
