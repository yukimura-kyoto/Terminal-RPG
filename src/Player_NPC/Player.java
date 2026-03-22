package Player_NPC;

import Inventory.Weapons;

public class Player {

    // nome, vida, stamina, armadura, esquiva
    public String name;
    public int health;
    public int stamina;
    public int armadura; // se quiser incluir armadura
    public int esquiva;
    public int level;
    public double xp;

    public Weapons currentWeapon;

    public void equipWeapon(Weapons equipped) {
        this.currentWeapon = equipped;
    }



    public Player(String name, int health, int stamina, int armadura, int esquiva, int level, double xp) {
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.armadura = armadura;
        this.esquiva = esquiva;
        this.level = level;
        this.xp = xp;

    }
}