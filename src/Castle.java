/**
 * @author Alejandra Alarcón
 */
public class Castle extends Building implements Attacker {
    public Castle() {
        super(4800, 11);
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
    public void cantAttack() {
        if(!this.isAlive()){
            this.setAttackPoints(0);
        }
    }

    @Override
    public void attacked(Attackable v) {
        v.attackedByCastle(this);
    }

    @Override
    public void attackedByArcherUnit(ArcherUnit archerUnit) {
        this.setHP(0.1 * archerUnit.getAttackPoints());
    }

    @Override
    public void attackedByCastle(Castle castle) {
        this.setHP(0.1 * castle.getAttackPoints());
    }

    @Override
    public void attackedByCavalryUnit(CavalryUnit cavalryUnit) {
        this.setHP(0.3 * cavalryUnit.getAttackPoints());
    }

    @Override
    public void attackedByInfantryUnit(InfantryUnit infantryUnit) {
        this.setHP(0.3 * infantryUnit.getAttackPoints());
    }

    @Override
    public void attackedByMonk(Monk monk) {
        this.setHP(0);
    }

    @Override
    public void attackedBySiegeUnit(SiegeUnit siegeUnit) {
        this.setHP(2 * siegeUnit.getAttackPoints());
    }

    @Override
    public void attackedByVillager(Villager villager) {
        this.setHP(-0.3 * villager.getAttackPoints());
    }
}
