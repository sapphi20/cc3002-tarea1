public abstract class Attacker implements Attackable {
    int HP;
    int attackPoints;

    public Attacker(int HP, int attackPoints) {
        this.HP = HP;
        this.attackPoints = attackPoints;
    }

    public boolean isAlive() {
        return getHP() > 0;
    }

    public int getHP() {
        return this.HP;
    }

    public int getAttackPoints() {
        return attackPoints;
    }
}
