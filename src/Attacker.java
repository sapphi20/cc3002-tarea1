public abstract class Attacker implements Attackable {
    int baseHP;
    int currentHP;
    int attackPoints;

    public Attacker(int baseHP, int attackPoints) {
        this.baseHP = baseHP;
        this.attackPoints = attackPoints;
        this.currentHP = baseHP;
    }

    public boolean isAlive() {
        return getHP() > 0;
    }

    public int getHP() {
        return this.currentHP;
    }

    public int getAttackPoints() {
        return this.attackPoints;
    }

    public void setHP(int attackPoints) {
        if(this.isAlive()){
            this.currentHP -= attackPoints;
        }
        if(this.currentHP <= 0){
            this.currentHP = 0;
        }
    }
}
