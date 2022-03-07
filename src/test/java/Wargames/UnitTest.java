package Wargames;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class UnitTest {

//    @Test
//    public void nameFail() {
//        DummyUnit dummyUnit = new DummyUnit("", 100);
//
//        assertNotEquals(, dummyUnit.getName());
//    }

    @Test
    public void getHealth() {
        DummyUnit dummyUnit1 = new DummyUnit("DummyUnit", 100);
        DummyUnit dummyUnit = new DummyUnit("DummyUnit" , 100);

        dummyUnit.attackOpponent(dummyUnit1);
        dummyUnit.attackOpponent(dummyUnit1);
        dummyUnit.attackOpponent(dummyUnit1);

        assertEquals(85, dummyUnit.getHealth());
    }

    @Test
    public void getResistAndAttackBonus() {
        DummyUnit dummyUnit = new DummyUnit("DummyUnit", 100);

        assertEquals(1, dummyUnit.getAttackBonus());
        assertEquals(2, dummyUnit.getResistBonus());
    }
}
