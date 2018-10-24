/**
 * @author Alejandra Alarcón
 */
public abstract class Unit extends GameObject implements Attacker {

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

    public int getAttackPoints() {
        this.cantAttack();
        return this.attackPoints;
    }

    @Override
    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    @Override
    public int getMaxHP() {
        return 2 * baseHP;
    }
}
