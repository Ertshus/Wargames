package Wargames;

import javax.xml.stream.Location;
import java.lang.reflect.Field;
import java.util.List;

/**
 * A class representing the shared attributes of a unit.
 *
 * @author Sivert Ertshus
 * @Version 21.02.2022
 */
public abstract class Unit {

    private String name;
    private int health;
    private int attack;
    private int armor;
    private int defendCounter;
    private int attackCounter;

    /**
     * Create a new unit with:
     * @param name
     * @param health
     * @param attack
     * @param armor
     */

    protected Unit(String name, int health, int attack, int armor) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;

    }

    /**
     * how the health of an opponent
     * is affected when an attack happens
     */
    protected void attackOpponent() {
        this.health = this.health - (attack + getAttackBonus()) + (armor + getResistBonus());
    }

    /**
     * returns how many times it's defended.
     * @return amount of times defended.
     */
    public int getDefendCounter() {
        return defendCounter;
    }

    /**
     * returns how many times attacked.
     * @return how many times attacked.
     */
    public int getAttackCounter() {
        return attackCounter;
    }

    /**
     * returns name of unit.
     * @return name of unit.
     */
    protected String getName() {
        return this.name ;
    }

    /**
     * returns health
     * @return health
     */
    protected int getHealth() {
        return this.health;
    }

    /**
     * returns attack
     * @return attack
     */
    protected int getAttack() {
        return this.attack;
    }

    /**
     * returns armor of unit.
     * @return armor of unit.
     */
    protected int getArmor() {
        return this.armor;
    }

    /**
     * Sets health for unit.
     * @param health
     */
    protected void setHealth(int health) {
        this.health = health;
    }

    /**
     * returns toString
     * @return toString
     */
    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", armor=" + armor +
                '}';
    }

    /**
     * returns the attack bonus of unit
     * helps on certain attacks
     * @return attack bonus of unit.
     */
    abstract public int getAttackBonus();


    /**
     * returns the resit bonus
     * helps on health
     * @return resist bonus
     */
    abstract public int getResistBonus();
}
