package Wargames;

public class DummyUnit extends Unit {

    /**
     * Create a new unit with:
     *
     * @param name
     * @param health
     * @param attack
     * @param armor
     */
    protected DummyUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    public DummyUnit(String name, int health) {
        super(name, health, 10, 4);
    }

    @Override
    public int getAttackBonus() {
        return 1;
    }

    @Override
    public int getResistBonus() {
        return 2;
    }
}
