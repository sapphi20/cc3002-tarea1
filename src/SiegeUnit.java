/**
 * @author Alejandra Alarcón
 */
public class SiegeUnit extends Unit {
    public SiegeUnit(){
        super(50, 40);
    }

    @Override
    public void attacked(Attackable v) {
        v.attackedBySiegeUnit(this);
    }

    @Override
    public void attackedByArcherUnit(ArcherUnit archerUnit) {
        this.setHP(0.8*archerUnit.getAttackPoints());
    }

    @Override
    public void attackedByCastle(Castle castle) {
        this.setHP(0.5*castle.getAttackPoints());
    }

    @Override
    public void attackedByCavalryUnit(CavalryUnit cavalryUnit) {
        this.setHP(1.2*cavalryUnit.getAttackPoints());
    }

    @Override
    public void attackedByInfantryUnit(InfantryUnit infantryUnit) {
        this.setHP(1.2*infantryUnit.getAttackPoints());
    }

    @Override
    public void attackedByMonk(Monk monk) {
        this.setHP(0);
    }

    @Override
    public void attackedBySiegeUnit(SiegeUnit siegeUnit) {
        this.setHP(1.5*siegeUnit.getAttackPoints());
    }

    @Override
    public void attackedByVillager(Villager villager) {
        this.setHP(-0.5*villager.getAttackPoints());
    }
}
