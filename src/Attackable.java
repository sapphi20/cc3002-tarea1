/**
 * @author Alejandra Alarcón
 */
public interface Attackable {
    /**
     * Muestra el valor de currentHP
     * @return int que muestra los puntos de vida actuales de la entidad
     */
    int getHP();

    /**
     * Muestra el valor de
     * @return int que muestra la vida maxima que puede tener la entidad
     */
    int getMaxHP();

    /**
     * Modifica la vida restando un parametro dado.
     * @param attackPoints double
     */
    void setHP(double attackPoints);

    /**
     * Verifica si la vida de la entidad es mayor a cero
     * @return boolean que es True si la vida es mayor a cero, False en el caso contrario
     */
    boolean isAlive();

    /**
     * Modifica la vida de la entidad que es atacada por una ArcherUnit
     * usando setHP
     * @param archerUnit ArcherUnit
     */
    void attackedByArcherUnit(ArcherUnit archerUnit);

    /**
     * Modifica la vida de la entidad que es atacada por un Castle
     * usando setHP
     * @param castle Castle
     */
    void attackedByCastle(Castle castle);

    /**
     * Modifica la vida de la entidad que es atacada por un CavalryUnit
     * usando setHP
     * @param cavalryUnit CavalryUnit
     */
    void attackedByCavalryUnit(CavalryUnit cavalryUnit);

    /**
     *Modifica la vida de la entidad que es atacada por una InfantryUnit
     * usando setHP
     * @param infantryUnit InfantryUnit
     */
    void attackedByInfantryUnit(InfantryUnit infantryUnit);

    /**
     * Modifica la vida de la entidad que es atacada por un Monk
     * usando setHP
     * @param monk Monk
     */
    void attackedByMonk(Monk monk);

    /**
     * Modifica la vida de la entidad que es atacada por una SiegeUnit
     * usando setHP
     * @param siegeUnit SiegeUnit
     */
    void attackedBySiegeUnit(SiegeUnit siegeUnit);

    /**
     * Modifica la vida de la entidad que es atacada por un Villager
     * usando setHP
     * @param villager Villager
     */
    void attackedByVillager(Villager villager);
}