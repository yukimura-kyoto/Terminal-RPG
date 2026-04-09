package Entity.base;

import Skills.base.Usavel;
import Skills.base.Weapons_Stats;

import java.util.ArrayList;

public class Stats {

    public String name;
    public int health;
    public int stamina;
    public int armadura;
    public int esquiva;
    public Weapons_Stats currentWeapon; // vem do Player

    public ArrayList<Usavel> moveset = new ArrayList<>();

    public Stats(String name, int health, int stamina, int armadura, int esquiva) {
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.armadura = armadura;
        this.esquiva = esquiva;
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
