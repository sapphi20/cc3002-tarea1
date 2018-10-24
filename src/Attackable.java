/**
 * @author Alejandra Alarcón
 */
public interface Attackable {
    /**
     *
     * @return vida actual de la entidad
     */
    int getHP();

    /**
     *
     * @return vida maxima que puede tener la entidad
     */
    int getMaxHP();

    /**
     * Modifica la vida restando un parametro dado.
     * @param attackPoints double
     */
    void setHP(double attackPoints);

    /**
     *
     * @return True si la entidad está viva (tiene más de 0 puntos de vida)
     */
    boolean isAlive();

    /**
     *
     * @param archerUnit
     */
    void attackedByArcherUnit(ArcherUnit archerUnit);

    /**
     *
     * @param castle
     */
    void attackedByCastle(Castle castle);

    /**
     *
     * @param cavalryUnit
     */
    void attackedByCavalryUnit(CavalryUnit cavalryUnit);

    /**
     *
     * @param infantryUnit
     */
    void attackedByInfantryUnit(InfantryUnit infantryUnit);

    /**
     *
      * @param monk
     */
    void attackedByMonk(Monk monk);

    /**
     *
     * @param siegeUnit
     */
    void attackedBySiegeUnit(SiegeUnit siegeUnit);

    /**
     *
     * @param villager
     */
    void attackedByVillager(Villager villager);
}