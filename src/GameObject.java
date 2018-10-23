public abstract class GameObject implements Attackable {
    int baseHP;
    int currentHP;
    int attackPoints;

    public boolean isAlive() {
        return getHP() > 0;
    }

    public int getHP() {
        return this.currentHP;
    }

    public void setHP(double attackPoints) {
        if (this.isAlive()) {
            this.currentHP -= attackPoints;
        }
        if (this.currentHP <= 0) {
            this.currentHP = 0;
        }
        if (this.currentHP >= getMaxHP()) {
            this.currentHP = getMaxHP();
        }
    }
}
