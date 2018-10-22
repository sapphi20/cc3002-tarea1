public class Castle extends Building {
    public Castle(){
        super(4800, 11);
    }

    @Override
    public void attacked(Attackable v) {
        v.attackedByCastle(this);
    }

    @Override
    public void attackedByArcherUnit(ArcherUnit archerUnit) {
        this.setHP(0.1*archerUnit.getAttackPoints());
    }

    @Override
    public void attackedByBarracks(Barracks barracks) {

    }

    @Override
    public void attackedByCastle(Castle castle) {
        this.setHP(0.1*castle.getAttackPoints());
    }

    @Override
    public void attackedByCavalryUnit(CavalryUnit cavalryUnit) {
        this.setHP(0.3*cavalryUnit.getAttackPoints());
    }

    @Override
    public void attackedByInfantryUnit(InfantryUnit infantryUnit) {
        this.setHP(0.3*infantryUnit.getAttackPoints());
    }

    @Override
    public void attackedByMonk(Monk monk) {

    }

    @Override
    public void attackedBySiegeUnit(SiegeUnit siegeUnit) {
        this.setHP(2*siegeUnit.getAttackPoints());
    }

    @Override
    public void attackedByVillager(Villager villager) {
        this.setHP(-0.3*villager.getAttackPoints());
    }
}
