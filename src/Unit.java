public abstract class Unit extends Attacker {

    public Unit(int HP, int attackPoints) {
        super(HP, attackPoints);
    }

    @Override
    public int getHP() {
        return 0;
    }

    @Override
    public int getMaxHP() {
        return 2*HP;
    }

    @Override
    public int setHP() {
        return 0;
    }

    @Override
    public int attackedByArcherUnit(ArcherUnit archerUnit) {
        return 0;
    }

    @Override
    public int attackedByBarracks(Barracks barracks) {
        return 0;
    }

    @Override
    public int attackedByCastle(Castle castle) {
        return 0;
    }

    @Override
    public int attackedByCavalryUnit(CavalryUnit cavalryUnit) {
        return 0;
    }

    @Override
    public int attackedByInfantryUnit(InfantryUnit infantryUnit) {
        return 0;
    }

    @Override
    public int attackedByMonk(Monk monk) {
        return 0;
    }

    @Override
    public int attackedBySiegeUnit(SiegeUnit siegeUnit) {
        return 0;
    }

    @Override
    public int attackedByVillager(Villager villager) {
        return 0;
    }
}
