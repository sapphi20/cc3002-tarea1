abstract class Attacker implements Attackable {
    int HP;
    int maxHP;

    public Attacker(int HP, int maxHP) {
        this.HP = HP;
        this.maxHP = maxHP;
    }

    public boolean isAlive() {
        return getHP() > 0;
    }
}
