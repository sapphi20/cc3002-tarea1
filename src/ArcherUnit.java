public class ArcherUnit extends Unit {
    public ArcherUnit(){
        super(30, 4);
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
        this.setHP(1.5*cavalryUnit.getAttackPoints());
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
        this.setHP(1.5*siegeUnit.getAttackPoints());
    }

    @Override
    public void attackedByVillager(Villager villager) {
        this.setHP(villager.getAttackPoints());
    }
}
