package Wargames;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test class for class rangedUnit.
 */
public class RangedUnitTest {
    RangedUnit rangedUnit = new RangedUnit("i", 100);

    /**
     * Test to see if it returns resist bonus 6 after first attack
     */
    @Test
    public void getResistBonus() {
        CommanderUnit commanderUnit = new CommanderUnit("CommanderUnit", 100);
        RangedUnit rangedUnit = new RangedUnit("RangedUnit", 100);
        commanderUnit.attackOpponent(rangedUnit);
        assertEquals(6, rangedUnit.getResistBonus());
    }

    /**
     * Test to see if it returns resist bonus 4 after second attack.
     */
    @Test
    public void getResistBonus2() {
        CommanderUnit commanderUnit = new CommanderUnit("CommanderUnit", 100);
        RangedUnit rangedUnit = new RangedUnit("RangedUnit", 100);

        commanderUnit.attackOpponent(rangedUnit);
        commanderUnit.attackOpponent(rangedUnit);

        assertEquals(4, rangedUnit.getResistBonus());
    }

    /**
     * Test to see if it returns resist bonus 2 after 3 or more attacks.
     */
    @Test
    public void getResistBonus3() {
        CommanderUnit commanderUnit = new CommanderUnit("CommanderUnit", 100);
        RangedUnit rangedUnit = new RangedUnit("RangedUnit", 100);

        commanderUnit.attackOpponent(rangedUnit);
        commanderUnit.attackOpponent(rangedUnit);
        commanderUnit.attackOpponent(rangedUnit);

        assertEquals(2, rangedUnit.getResistBonus());
    }

    /**
     * Test to see if it returns attack bonus 3.
     */
    @Test
    public void getAttackBonus() {
        CommanderUnit commanderUnit = new CommanderUnit("CommanderUnit", 100);
        RangedUnit rangedUnit = new RangedUnit("RangedUnit", 100);

        assertEquals(3, rangedUnit.getAttackBonus());
    }
}



