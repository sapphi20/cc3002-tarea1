public abstract class Building extends Attacker {

    public Building(int HP, int attackPoints) {
        super(HP, attackPoints);
    }

    @Override
    public int getMaxHP() {
        return baseHP;
    }

}
