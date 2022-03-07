package Wargames;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test class for the class CavalryUnit
 */
public class CavalryUnitTest {
    CavalryUnit cavalryUnit = new CavalryUnit("o", 100);

    /**
     * Test to see if resist bonus 1 is returned.
     */
    @Test
    public void getResistBonus() {
        RangedUnit rangedUnit = new RangedUnit("RangedUnit", 100);
        CavalryUnit cavalryUnit = new CavalryUnit("CavalryUnit", 100);

        rangedUnit.attackOpponent(cavalryUnit);
        rangedUnit.attackOpponent(cavalryUnit);

        assertEquals(1, cavalryUnit.getResistBonus());
    }

    /**
     * Test to see if attack bonus 6 is returned on the first attack
     */
    @Test
    public void getAttackBonus() {
        RangedUnit rangedUnit = new RangedUnit("RangedUnit", 100);
        CavalryUnit cavalryUnit = new CavalryUnit("CavalryUnit", 100);

        rangedUnit.attackOpponent(cavalryUnit);


        assertEquals(6, cavalryUnit.getAttackBonus());
    }

    /**
     * Test to see if attack bonus 2 is returned after 2 or more attacks.
     */
    @Test
    public void getAttackBonus2() {
        RangedUnit rangedUnit = new RangedUnit("RangedUnit", 100);
        CavalryUnit cavalryUnit = new CavalryUnit("CavalryUnit", 100);

        rangedUnit.attackOpponent(cavalryUnit);
        rangedUnit .attackOpponent(cavalryUnit);
        rangedUnit.attackOpponent(cavalryUnit);



        assertEquals(2, cavalryUnit.getAttackBonus());
    }


}
