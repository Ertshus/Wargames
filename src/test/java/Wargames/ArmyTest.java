package Wargames;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Test class for the army class
 */
public class ArmyTest {
    /**
     * Test to check if units are can be removed from arraylist
     */
    @Test
    public void remove() {
        CommanderUnit commanderUnit = new CommanderUnit("CommanderUnit", 100);
        RangedUnit rangedUnit = new RangedUnit("RangedUnit", 100);
        CavalryUnit cavalryUnit = new CavalryUnit("CavalryUnit", 100);

        ArrayList<Unit> unitsWithCommanderUnit = new ArrayList<Unit>();
        unitsWithCommanderUnit.add(rangedUnit);
        unitsWithCommanderUnit.add(cavalryUnit);
        unitsWithCommanderUnit.add(commanderUnit);

        ArrayList<Unit> unitsWithoutCommanderUnit = new ArrayList<Unit>();
        unitsWithoutCommanderUnit.add(rangedUnit);
        unitsWithoutCommanderUnit.add(cavalryUnit);

        Army army1 = new Army("army", unitsWithCommanderUnit);
        Army army2 = new Army("army", unitsWithoutCommanderUnit);

        assertNotEquals(army1, army2);

        army1.remove(commanderUnit);

        assertEquals(army1, army2);
    }

    /**
     * Test to see if a random unit from the arraylist is returned
     */
    @Test
    public void random() {
        CommanderUnit commanderUnit = new CommanderUnit("CommanderUnit", 100);
        RangedUnit rangedUnit = new RangedUnit("RangedUnit", 100);
        CavalryUnit cavalryUnit = new CavalryUnit("CavalryUnit", 100);

        ArrayList<Unit> units = new ArrayList<Unit>();
        units.add(rangedUnit);
        units.add(cavalryUnit);
        units.add(commanderUnit);

        Army army1 = new Army("army", units);
        System.out.println(army1.getRandom());


    }
    /**
     * Test to see if all units are added
     */
    @Test
    public void addAll() {
        CommanderUnit commanderUnit = new CommanderUnit("CommanderUnit", 100);
        RangedUnit rangedUnit = new RangedUnit("RangedUnit", 100);
        CavalryUnit cavalryUnit = new CavalryUnit("CavalryUnit", 100);

        ArrayList<Unit> units = new ArrayList<Unit>();
        units.add(rangedUnit);
        units.add(cavalryUnit);
        units.add(commanderUnit);
        units.addAll(units);

        System.out.println(units);
    }
}
