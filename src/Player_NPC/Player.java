package Player_NPC;

import Inventory.W_Stats;
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

    public String P_name;
    public W_Stats currentWeapon; // <--- aqui é a arma equipada

    public Player(String nome) {
        this.P_name = nome;
        this.currentWeapon = null; // começa sem arma
    }

    // Method pra equipar a arma
    public void equipWeapon(W_Stats equipped) {
        this.currentWeapon = equipped; // apenas define
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