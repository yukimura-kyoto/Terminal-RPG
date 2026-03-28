package Player_NPC;
import java.util.ArrayList;

import Skills.Usavel;
import Skills.Weapons_Stats;
import Skills.Attack_Stats;

public class Player {

    // Variaveis pra porra toda
    public String name;
    public int health;
    public int stamina;
    public int armadura; // se quiser incluir armadura
    public int esquiva;
    public int level;
    public double xp;
    public Weapons_Stats currentWeapon; // Isso e pra arma equipada

    // Method pra equipar a arma
    public void equipWeapon(Weapons_Stats equipped) {
        this.currentWeapon = equipped; // apenas define
    }

    // Declarao do Player no imposto de renda
    public Player(String name, int health, int stamina, int armadura, int esquiva, int level, double xp) {
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.armadura = armadura;
        this.esquiva = esquiva;
        this.level = level;
        this.xp = xp;

    }

    // Moveset
    // serve só pra puxar o moveset
    public ArrayList<Usavel> Player_Moveset = new ArrayList<>();

    public void addSkill(Usavel skill) {
        if (Player_Moveset.size() < 4) {
            Player_Moveset.add(skill);
        } else {
            System.out.println("Moveset cheio!");
        }
    }
}