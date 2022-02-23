package Wargames;

import javax.xml.stream.Location;
import java.lang.reflect.Field;
import java.util.List;

/**
 * A class that represents an infantry unit
 * Consisting of name, health, attack and armor
 */
public class InfantryUnit extends Unit{

    private int attackBonus;
    private int resistBonus;


    /**
     * representing an infantry unit
     * @param name
     * @param health
     * @param attack
     * @param armor
     */
    public InfantryUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    /**
     * representing the values of attack and health
     * @param name
     * @param health
     */
    public InfantryUnit(String name, int health){
            super(name, health, 15, 10);
        }

    /**
     * returns the attack bonus
     * which is consistent and stays at 2
     * @return attack bonus
     */
    @Override
    public int getAttackBonus() {
        return 2;
    }

    /**
     * returns the resist bonus
     * which is consistent and stays at 1
     * @return resist bonus
     */
    @Override
    public int getResistBonus() {
        return 1;
    }
}
