package Wargames;

import javax.xml.stream.Location;
import java.util.List;

/**
 * Represents a class for ranged unit
 */
public class RangedUnit extends Unit{

    private int attackBonus;
    private int resistBonus;

    /**
     * Representing a ranged unit.
     * @param name
     * @param health
     * @param attack
     * @param armor
     */

    public RangedUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    /**
     * Sets the value for attack and armor
     * @param name
     * @param health
     */
    public RangedUnit(String name, int health){
            super(name, health, 15, 8);
        }

    /**
     * returns the attack bonus which stays consistent
     * at 3
     * @return attack bonus
     */
        @Override
    public int getAttackBonus() {
        return 3;
    }

    /**
     * returns the resist bonus
     * which in this case changes
     * depending on the amount of attacks
     * @return resist bonus
     */
    @Override
    public int getResistBonus() {
        int resistBonus = 2;
        int defendCounter = 0;
        if (defendCounter == 0) {
            resistBonus = 6;
        }
        if (defendCounter == 1) {
            resistBonus = 4;
        }
        defendCounter++;
        return resistBonus;
    }





}

