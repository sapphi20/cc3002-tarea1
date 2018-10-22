public class CavalryUnit extends Unit {

    public CavalryUnit(){
        super(60, 7);
    }

    @Override
    public void attackedByArcherUnit(ArcherUnit archerUnit) {
        this.setHP(archerUnit.getAttackPoints());
    }

    @Override
    public void attackedByBarracks(Barracks barracks) {

    }

    @Override
    public void attackedByCastle(Castle castle) {
        this.setHP(1.2*castle.getAttackPoints());
    }

    @Override
    public void attackedByCavalryUnit(CavalryUnit cavalryUnit) {
        this.setHP(cavalryUnit.getAttackPoints());
    }

    @Override
    public void attackedByInfantryUnit(InfantryUnit infantryUnit) {
        this.setHP(1.2*infantryUnit.getAttackPoints());
    }

    @Override
    public void attackedByMonk(Monk monk) {
        this.setHP(-0.5*monk.getAttackPoints());
    }

    @Override
    public void attackedBySiegeUnit(SiegeUnit siegeUnit) {
        this.setHP(siegeUnit.getAttackPoints());
    }

    @Override
    public void attackedByVillager(Villager villager) {
        this.setHP(0.5*villager.getAttackPoints());
    }
}
