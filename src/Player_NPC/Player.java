package Player_NPC;

public class Player {
    // Stats comuns, iguais ao NPC
    public String nome;
    public int health;
    public int stamina;
    public int armadura;

    // Stats exclusivos do player
    public int xp;
    public int level;

    // Construtor
    public Player(String nome, int health, int stamina, int armadura) {
        this.nome = nome;
        this.health = health;
        this.stamina = stamina;
        this.armadura = armadura;
        this.xp = 0;       // começa no 0
        this.level = 1;    // começa no level 1
    }
}