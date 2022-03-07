package Wargames;

import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertTrue;

/**
 * Test class for the class Battle
 */
public class BattleTest {
    /**
     * Checks if the correct winner is returned
     */
    @Test
    public void simulateAndTestWinner() {
        CommanderUnit commanderUnit = new CommanderUnit("CommanderUnit", 100);
        RangedUnit rangedUnit = new RangedUnit("RangedUnit", 100);

        ArrayList<Unit> units = new ArrayList<Unit>();
        units.add(commanderUnit);
        units.add(rangedUnit);

        Army army1 = new Army("army1", units);

        ArrayList<Unit> units2 = new ArrayList<>();
        units2.add(rangedUnit);
        Army army2 = new Army("army2", units2);

        Battle battle = new Battle(army1, army2);
        Army winningArmy = battle.simulate();

        assertTrue(winningArmy.hasUnits());
        if((army1.hasUnits()) && (army2.hasUnits() == false)) {
            winningArmy = army1;
        } else if ((army1.hasUnits() == false) && (army2.hasUnits())) {
            winningArmy = army2;
        }
    }
}
