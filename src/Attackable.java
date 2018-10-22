public interface Attackable {
    int getHP();
    int getMaxHP();
    void setHP(double attackPoints);
    int getAttackPoints();
    boolean isAlive();
    void attackedByArcherUnit(ArcherUnit archerUnit);
    void attackedByBarracks(Barracks barracks);
    void attackedByCastle(Castle castle);
    void attackedByCavalryUnit(CavalryUnit cavalryUnit);
    void attackedByInfantryUnit(InfantryUnit infantryUnit);
    void attackedByMonk(Monk monk);
    void attackedBySiegeUnit(SiegeUnit siegeUnit);
    void attackedByVillager(Villager villager);
}