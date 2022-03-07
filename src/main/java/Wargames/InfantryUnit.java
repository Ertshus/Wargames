package Wargames;

import javax.xml.stream.Location;
import java.lang.reflect.Field;
import java.util.List;

/**
 * A class that represents an infantry unit.
 * Consisting of name, health, attack and armor
 */
public class InfantryUnit extends Unit{

    private int attackBonus;
    private int resistBonus;


    /**
     * Representing an infantry unit.
     * @param name of the unit
     * @param health of the unit
     * @param attack of the unit
     * @param armor of the unit
     */
    public InfantryUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    /**
     * Representing the values of attack and health.
     * @param name
     * @param health
     */
    public InfantryUnit(String name, int health){
            super(name, health, 15, 10);
        }

    /**
     * Returns the attack bonus.
     * which is consistent and stays at 2
     * @return attack bonus
     */
    @Override
    public int getAttackBonus() {
        return 2;
    }

    /**
     * Returns the resist bonus.
     * which is consistent and stays at 1
     * @return resist bonus
     */
    @Override
    public int getResistBonus() {
        return 1;
    }
}
