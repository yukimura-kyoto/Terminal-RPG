package Entity.player;
import java.util.ArrayList;

import Entity.base.Stats;
import Skills.Usavel;
import Skills.Weapons_Stats;

import static Skills.Skills.moveset;

public class Player extends Stats {

    public int level;
    public double xp;
    public Weapons_Stats currentWeapon;

    public Player(String name, int health, int stamina, int armadura, int esquiva, int level, double xp) {
        super(name, health, stamina, armadura, esquiva); // Stats cuida disso
        this.level = level;
        this.xp = xp;
    }

    public void equipWeapon(Weapons_Stats equipped) {
        this.currentWeapon = equipped;
    }

    public void addSkill(Usavel skill) {
        if (moveset.size() < 4) {
            moveset.add(skill);
        } else {
            System.out.println("Moveset cheio!");
        }
    }
}