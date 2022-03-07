package Wargames;

import javax.xml.stream.Location;
import java.lang.reflect.Field;
import java.util.List;

/**
 * Represents the class cavalry unit.
 */
public class CavalryUnit extends Unit{

    private int attackBonus;
    int attackCounter;

    /**
     * Representing a cavalry unit by name, health, attack and armor.
     * @param name
     * @param health
     * @param attack
     * @param armor
     */
    public CavalryUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    /**
     * Represents the attack and armor value.
     * which in this case is attack = 20 and armor = 12
     * @param name
     * @param health
     */
    public CavalryUnit(String name, int health) {
        super(name, health, 20, 12);
    }

    /**
     * Returns the attack bonus.
     * which in this case changes
     * based on how many attacks is made
     * @return attack bonus
     */

    @Override
    public int getAttackBonus() {

        if(attackCounter == 1){
            attackBonus = 6;
        } else if (attackCounter >= 2) {
            attackBonus = 2;
        }
        return attackBonus;
        }


    /**
     * Returns resist bonus.
     * which in this case is 1.
     * @return resist bonus
     */
     @Override
    public int getResistBonus() {
        return 1;
    }
}

