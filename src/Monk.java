public class Monk extends Unit {
    public Monk(){
        super(30, 10);
    }

    @Override
    public void attacked(Attackable v) {
        v.attackedByMonk(this);
    }

    @Override
    public void attackedByArcherUnit(ArcherUnit archerUnit) {
        this.setHP(this.getHP());
    }

    @Override
    public void attackedByBarracks(Barracks barracks) {

    }

    @Override
    public void attackedByCastle(Castle castle) {
        this.setHP(this.getHP());
    }

    @Override
    public void attackedByCavalryUnit(CavalryUnit cavalryUnit) {
        this.setHP(this.getHP());
    }

    @Override
    public void attackedByInfantryUnit(InfantryUnit infantryUnit) {
        this.setHP(this.getHP());
    }

    @Override
    public void attackedByMonk(Monk monk) {
        this.setHP(-0.5*monk.getAttackPoints());
    }

    @Override
    public void attackedBySiegeUnit(SiegeUnit siegeUnit) {
        this.setHP(this.getHP());
    }

    @Override
    public void attackedByVillager(Villager villager) {

    }
}
