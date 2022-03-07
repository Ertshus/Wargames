package Wargames;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for the class InfantryUnit.
 */
public class InfantryUnitTest {
    /**
     * Test to see if it returns correct resist bonus.
     */
    @Test
    public void getResistBonus() {
        CommanderUnit commanderUnit = new CommanderUnit("CommanderUnit", 100);
        InfantryUnit infantryUnit = new InfantryUnit("InfantryUnit", 100);

        commanderUnit.attackOpponent(infantryUnit);
        commanderUnit.attackOpponent(infantryUnit);

        assertEquals(1, infantryUnit.getResistBonus());
    }

    /**
     * Test to see if it returns correct attack bonus.
     */
    @Test
    public void getAttackBonus() {
        CommanderUnit commanderUnit = new CommanderUnit("CommanderUnit", 100);
        InfantryUnit infantryUnit = new InfantryUnit("RangedUnit", 100);

        assertEquals(2, infantryUnit.getAttackBonus());
    }
}
