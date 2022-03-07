package Wargames;

import java.util.Random;

/**
 * Represents a class that simulates a battle between 2 army.
 */
public class Battle {

    private Army armyOne;
    private Army armyTwo;
    private Army winner;
    private String attackingArmy;
    private String defendingArmy;

    /**
     * Adds the parameters army one and army two.
     * @param armyOne represents army one
     * @param armyTwo represents army two
     */
    public Battle(Army armyOne, Army armyTwo) {
        this.armyOne = armyOne;
        this.armyTwo = armyTwo;
    }

    /**
     * Simulates two armys fighting.
     * until one of the armys don't have any units
     * and the one with units in it
     * will be declared the winner
     * @return winner of the battle
     */
    public Army simulate() {
        while ((armyOne.hasUnits()) && (armyTwo.hasUnits())) {
            Army attackingArmy;
            Army defendingArmy;

            int index = new Random().nextInt(2);
            if (index == 0) {
                attackingArmy = armyOne;
                defendingArmy = armyTwo;
            } else {
                attackingArmy = armyTwo;
                defendingArmy = armyOne;
            }
            Unit attacker = attackingArmy.getRandom();
            Unit defender = defendingArmy.getRandom();

            attacker.attackOpponent(defender);

            if (defender.getHealth() <= 0) {
                defendingArmy.remove(defender);
            }
        }
        winner = (armyOne.hasUnits()) ? armyOne : armyTwo;
        return winner;
    }

    /**
     * Returns the winner
     * @return the winner
     */
    public Army getWinner() {
        return winner;
    }

    /**
     * Returns information about the battle
     * @return information about battle
     */
    @Override
    public String toString() {
        return "Battle{" +
                "armyOne=" + armyOne +
                ", armyTwo=" + armyTwo +
                ", winner=" + winner +
                '}';
    }
}
