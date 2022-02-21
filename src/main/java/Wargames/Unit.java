package Wargames;

import javax.xml.stream.Location;
import java.lang.reflect.Field;
import java.util.List;

/**
 * A class representing the shared attributes of a unit.
 */
public abstract class Unit {

    private String name;
    private int health;
    private int attack;
    private int armor;
    private int defendCounter;
    private int attackCounter;


    protected Unit(String name, int health, int attack, int armor) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;

    }

    protected void attackOpponent() {
        health = health - (attack + getAttackBonus()) + (armor + getResistBonus());
    }

    public int getDefendCounter() {
        return defendCounter;
    }

    public int getAttackCounter() {
        return attackCounter;
    }

    protected String getName() {
        return this.name ;
    }

    protected int getHealth() {
        return this.health;
    }

    protected int getAttack() {
        return this.attack;
    }

    protected int getArmor() {
        return this.armor;
    }

    protected void setHealth() {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", armor=" + armor +
                '}';
    }

    abstract public int getAttackBonus();


    abstract public int getResistBonus();
}
