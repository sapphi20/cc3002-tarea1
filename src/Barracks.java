/**
 * @author Alejandra Alarcón
 */
public class Barracks extends Building {
    public Barracks(){
        super(1200,0);
    }

    @Override
    public void attackedByArcherUnit(ArcherUnit archerUnit) {
        this.setHP(0.7*archerUnit.getAttackPoints());
    }

    @Override
    public void attackedByCastle(Castle castle) {
        this.setHP(0.7*castle.getAttackPoints());
    }

    @Override
    public void attackedByCavalryUnit(CavalryUnit cavalryUnit) {
        this.setHP(0.7*cavalryUnit.getAttackPoints());
    }

    @Override
    public void attackedByInfantryUnit(InfantryUnit infantryUnit) {
        this.setHP(0.7*infantryUnit.getAttackPoints());
    }

    @Override
    public void attackedByMonk(Monk monk) {
        this.setHP(0);
    }

    @Override
    public void attackedBySiegeUnit(SiegeUnit siegeUnit) {
        this.setHP(2*siegeUnit.getAttackPoints());
    }

    @Override
    public void attackedByVillager(Villager villager) {
        this.setHP(-0.7*villager.getAttackPoints());
    }
}
