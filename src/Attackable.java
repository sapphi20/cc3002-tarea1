public interface Attackable {
    int getHP();
    int getMaxHP();
    boolean isAlive();
    int attackedByArcherUnit(ArcherUnit archerUnit);
    int attackedByBarracks(Barracks barracks);
    int attackedByCastle(Castle castle);
    int attackedByCavalryUnit(CavalryUnit cavalryUnit);
    int attackedByInfantryUnit(InfantryUnit infantryUnit);
    int attackedByMonk(Monk monk);
    int attackedBySiegeUnit(SiegeUnit siegeUnit);
    int attackedByVillager(Villager villager);
}