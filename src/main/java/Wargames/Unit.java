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
     int defendCounter;
     int attackCounter;

    /**
     * Create a new unit with:
     * @param name
     * @param health
     * @param attack
     * @param armor
     */

    protected Unit(String name, int health, int attack, int armor) {

        if (name.isBlank()) {throw new IllegalArgumentException("Name cannot be blank.");
        } else {
            this.name = name;
        }
        if (health <= 0) { throw new IllegalArgumentException("Health can never be lower than 0");
        } else {
            this.health = health;
        }
        this.attack = attack;
        this.armor = armor;

    }

    /**
     * How the health of an opponent is
     * affected when an attack happens.
     */
    protected void attackOpponent(Unit opponentUnit) {
        this.health = this.health - (attack + getAttackBonus()) + (armor + getResistBonus());
        opponentUnit.defendCounter++;
        opponentUnit.attackCounter++;
    }

    /**
     * Returns how many times it's defended.
     * @return amount of times defended.
     */
    public int getDefendCounter() {
        return defendCounter;
    }

    /**
     * Returns how many times attacked.
     * @return how many times attacked.
     */
    public int getAttackCounter() {
        return attackCounter;
    }

    /**
     * Returns name of unit.
     * @return name of unit.
     */
    protected String getName() {
        return this.name ;
    }

    /**
     * Returns health.
     * @return health
     */
    protected int getHealth() {
        return this.health;
    }

    /**
     * Returns attack.
     * @return attack
     */
    protected int getAttack() {
        return this.attack;
    }

    /**
     * Returns armor of unit.
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
     * Returns toString.
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
     * Returns the attack bonus of unit
     * helps on certain attacks.
     * @return attack bonus of unit.
     */
    abstract public int getAttackBonus();


    /**
     * Returns the resist bonus.
     * helps on health
     * @return resist bonus
     */
    abstract public int getResistBonus();
}
