package Wargames;

import javax.xml.stream.Location;
import java.lang.reflect.Field;
import java.util.List;

public class InfantryUnit extends Unit{

    private int attackBonus;
    private int resistBonus;

    public InfantryUnit(String name, int health, int attack, int armor) {
        super(name, health, 15, 10);
        this.attackBonus = 2;
        this.resistBonus = 1;
    }


    @Override
    public int getAttackBonus() {
        return attackBonus;
    }

    @Override
    public int getResistBonus() {
        return resistBonus;
    }
}
