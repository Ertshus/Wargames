package Wargames;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Represents  an army which can attack other units.
 */
public class Army {
    private String name;
    private ArrayList <Unit> units;

    /**
     *
     * @param name
     */
    public Army(String name){
        this.name = name;
    }

    /**
     *
     * @param name
     * @param units
     */
    public Army(String name, ArrayList<Unit> units){
        this.name = name;
        this.units = units;
    }

    /**
     * Returns the name of the army.
     * @return the name of the army
     */
    public String getName() {
        return this.name;
    }

    /**
     * Adds unit to arraylist.
     * @param unit
     */
    public void add(Unit unit) {
        this.units.add(unit);
    }

    /**
     * Adds all units to arraylist.
     * @param units
     */
    public void addAll(ArrayList <Unit> units) {
        for (Unit unit : units) {
            this.units.add(unit);
        }
    }

    /**
     * Removes unit from arraylist.
     * @param unit
     */
    public void remove(Unit unit) {
        units.remove(unit);
    }

    /**
     * Checks if the arraylist has any
     * units in it.
     * True if unit in it.
     * False if empty.
     * @return boolean: true if there are units in it
     * false if it's empty
     * */
    public boolean hasUnits() {
        if (units.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Returns all the units in the arraylist.
     * @return all the units in the arraylist
     */
    public ArrayList<Unit> getAllUnits() {
        return this.units;
    }

    /**
     * Returns random unit from the arraylist.
     * @return random unit from the arraylist
     */
    public Unit getRandom() {
        Random random = new Random();
        return this.units.get(random.nextInt(this.units.size()));
    }

    /**
     * Returns information about the army.
     * @return information about the army
     */
    @Override
    public String toString() {
        return "Army{" +
                "name='" + name + '\'' +
                ", units=" + units +
                '}';
    }

    /**
     * Returns the instances of the type infantry unit.
     * @return instance of the type infantry unit.
     */
    public List<Unit> getInfantryUnits() {
        return units.stream().filter(I -> I instanceof InfantryUnit).collect(Collectors.toList());
    }

    /**
     * Returns the instances of the type cavalry unit.
     * @return instance of the type cavalry unit.
     */
    public List<Unit> getCavalryUnits() {
        return units.stream().filter(C -> C instanceof CavalryUnit).collect(Collectors.toList());
    }

    /**
     * Returns the instances of the type ranged unit.
     * @return instance of the type ranged unit.
     */
    public List<Unit> getRangedUnits() {
        return units.stream().filter(R -> R instanceof RangedUnit).collect(Collectors.toList());
    }

    /**
     * Returns the instances of the type commander unit.
     * @return instance of the type commander unit.
     */
    public List<Unit> getCommanderUnits() {
        return units.stream().filter(C -> C instanceof CommanderUnit).collect(Collectors.toList());
    }

    /**
     * Returns a boolean: true if this == o
     * false if o == null.
     * @param
     * @return a boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Army army = (Army) o;
        return name.equals(army.name) && units.equals(army.units);
    }

    /**
     * Returns objects name and units.
     * @return objects name and units.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, units);
    }
}
