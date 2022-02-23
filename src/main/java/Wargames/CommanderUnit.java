package Wargames;

import javax.xml.stream.Location;
import java.util.List;

public class CommanderUnit extends CavalryUnit{

    private int attackBonus;
    private int resistBonus;

    public CommanderUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    public CommanderUnit(String name, int health) {
        super(name, health, 25, 15);
    }
}

