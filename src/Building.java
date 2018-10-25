/**
 * @author Alejandra Alarcón
 */
public abstract class Building extends GameObject {
    /**
     * Constructor para las construcciones
     * baseHP es la vida inicial de la construccion
     * attackPoints son los puntos de ataque (0 para las Barracks)
     * currentHP es la vida actual de la construccion (inicialmente es igual a baseHP)
     * @param HP int
     * @param attackPoints int
     */
    public Building(int HP, int attackPoints) {
        this.baseHP = HP;
        this.attackPoints = attackPoints;
        this.currentHP = baseHP;
    }

    @Override
    public int getMaxHP() {
        return baseHP;
    }

}
