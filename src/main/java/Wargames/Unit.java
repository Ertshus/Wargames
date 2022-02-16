package Wargames;

/**
 * A class representing the shared attributes of a unit.
 */
public class Unit {

    private String name;
    private int health;
    private int attack;
    private int armor;

    public Unit(String name, int health, int attack, int armor) {
        this.name = name;
        if (health >= 0) {

        } else {
            this.health = health;
        }
        this.attack = attack;
        this.armor = armor;
    }

    public void attackOpponent() {
        health = health - (attack + getAttackBonus()) + (armor + getResistBonus());
    }

    public String getName() {
        return this.name ;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getArmor() {
        return this.armor;
    }

    public void setHealth() {
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

    public int getAttackBonus() {
        return this.getAttackBonus();
    }

    public int getResistBonus() {
        return this.getResistBonus();

    }


}
