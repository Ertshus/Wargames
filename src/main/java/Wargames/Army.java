package Wargames;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Army {
    private String name;
    ArrayList <Unit> units;

    public Army(String name){
        this.name = name;
    }

    public Army(String name, ArrayList<Unit> units){
        this.name = name;
        this.units = units;
    }

    public String getName() {
        return this.name;
    }

    public void add(Unit unit) {
        this.units.add(unit);
    }

    public void addAll(ArrayList <Unit> units) {
        for (Unit unit : units) {
            this.units.add(unit);
        }
    }

    public void remove(Unit unit) {
        this.units.remove(unit);
    }

    public boolean hasUnits() {
        if (units.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public ArrayList<Unit> getAllUnits() {
        return this. units;
    }

    public Unit getRandom() {
        Random random = new Random();
        return this.units.get(random.nextInt(this.units.size()));
    }

    @Override
    public String toString() {
        return "Army{" +
                "name='" + name + '\'' +
                ", units=" + units +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Army army = (Army) o;
        return name.equals(army.name) && units.equals(army.units);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, units);
    }
}
