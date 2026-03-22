package Player_NPC;

public class stats {
    public String name;
    public int health;
    public int stamina;
    public int armadura; // se quiser incluir armadura

    // Construtor
    public stats(String name, int health, int stamina, int armadura) {
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.armadura = armadura;
    }
}