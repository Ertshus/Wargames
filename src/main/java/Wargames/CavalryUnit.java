package Wargames;

import javax.xml.stream.Location;
import java.lang.reflect.Field;
import java.util.List;

public class CavalryUnit extends Unit{

    private int attackBonus;
    private int resistBonus;

    public CavalryUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    public CavalryUnit(String name, int health) {
        super(name, health, 20, 12);
    }


    @Override
    public int getAttackBonus() {
        int attackBonus = 2;
        int attackCounter = 0;
        if (attackCounter == 0){
            attackBonus = 4 + attackBonus;
        }
        attackCounter++;
        return attackBonus;
    }

    @Override
    public int getResistBonus() {
        return 1;
    }
}

