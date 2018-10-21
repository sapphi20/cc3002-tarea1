public abstract class Unit extends Attacker {

    public Unit(int HP, int attackPoints) {
        super(HP, attackPoints);
    }


    @Override
    public int getMaxHP() {
        return 2 * baseHP;
    }
}
