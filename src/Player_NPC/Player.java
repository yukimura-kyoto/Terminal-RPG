package Player_NPC;
import java.util.ArrayList;
import Inventory.W_Stats;
import Inventory.Weapons;

public class Player {

    // Variaveis pra porra toda
    public String name;
    public int health;
    public int stamina;
    public int armadura; // se quiser incluir armadura
    public int esquiva;
    public int level;
    public double xp;
    public W_Stats currentWeapon; // Isso e pra arma equipada

    // Method pra equipar a arma
    public void equipWeapon(W_Stats equipped) {
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

    // a porra do inventario vai se fuder
    public ArrayList<W_Stats> inventario = new ArrayList<>();
    public void addWeapon(W_Stats weapon){
        this.inventario.add(weapon);
    }
}