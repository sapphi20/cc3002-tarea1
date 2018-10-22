public abstract class Unit extends GameObject implements Attacker {

    public Unit(int HP, int attackPoints) {
        this.baseHP = HP;
        this.attackPoints = attackPoints;
        this.currentHP = baseHP;
    }

    @Override
    public int getMaxHP() {
        return 2 * baseHP;
    }
}
