public abstract class Building extends GameObject {

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
