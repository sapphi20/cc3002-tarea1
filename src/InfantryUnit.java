public class InfantryUnit extends Unit {
    public InfantryUnit(){
        super(40, 4);
    }

    @Override
    public void attackedByArcherUnit(ArcherUnit archerUnit) {
        this.setHP(1.2*archerUnit.getAttackPoints());
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
        this.setHP(infantryUnit.getAttackPoints());
    }

    @Override
    public void attackedByMonk(Monk monk) {
        this.setHP(-0.5*monk.getAttackPoints());
    }

    @Override
    public void attackedBySiegeUnit(SiegeUnit siegeUnit) {
        this.setHP(1.5*siegeUnit.getAttackPoints());
    }

    @Override
    public void attackedByVillager(Villager villager) {
        this.setHP(0.8*villager.getAttackPoints());
    }
}
