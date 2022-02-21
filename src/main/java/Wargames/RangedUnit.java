package Wargames;

import javax.xml.stream.Location;
import java.util.List;

public class RangedUnit extends Unit{

    private int attackBonus;
    private int resistBonus;

    public RangedUnit(String name, int health, int attack, int armor) {
        super(name, health, 15, 8);
        this.attackBonus = 3;
        this.resistBonus = resistBonus;
    }

    @Override
    public int getAttackBonus() {
        return attackBonus;
    }

    @Override
    public int getResistBonus() {
        int resistBonus = 2;
        int defendCounter = 0;
        if (defendCounter == 0) {
            resistBonus = 6;
        }
        if (defendCounter == 1) {
            resistBonus = 4;
        }
        return resistBonus;
    }





}

