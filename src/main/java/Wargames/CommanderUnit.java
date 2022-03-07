package Wargames;

import javax.xml.stream.Location;
import java.util.List;

/**
 * Represents commander unit.
 * which has the same values as cavalry unit
 * but has higher attack and armor
 */
public class CommanderUnit extends CavalryUnit{

    private int attackBonus;
    private int resistBonus;

    /**
     * Represents commander unit.
     * name, health, attack and armor
     * @param name
     * @param health
     * @param attack
     * @param armor
     */
    public CommanderUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    /**
     * Sets the values for attack = 25 and armor = 15.
     * @param name
     * @param health
     */
    public CommanderUnit(String name, int health) {
        super(name, health, 25, 15);
    }
}

