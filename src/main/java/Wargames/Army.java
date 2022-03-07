package Wargames;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

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
