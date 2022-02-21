package Wargames;

import javax.xml.stream.Location;
import java.util.List;

public class CommanderUnit extends CavalryUnit{

    private int attackBonus;
    private int resistBonus;

    public CommanderUnit(String name, int health, int attack, int armor) {
        super(name, health, 25, 15);
        this.attackBonus = attackBonus;
        this.resistBonus = 1;
    }

    @Override
    public int getAttackBonus() {
        int attackBonus = 2;
        int attackCounter = 0;
        if (attackCounter == 0){
            attackBonus = 6;
        }
        return attackBonus;
    }

    @Override
    public int getResistBonus() {
        return resistBonus;
    }


}

