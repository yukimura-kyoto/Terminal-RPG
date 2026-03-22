package Player_NPC;

public class Stats {

    // aaahhh parte ignoravel de novo, a menos que queira ajustar a quantidade
    // de Status do NPC

    public String name;
    public int health;
    public int stamina;
    public int armadura;// se quiser incluir armadura
    public int esquiva;

        public Stats(String name, int health, int stamina, int armadura, int esquiva) {
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.armadura = armadura;
        this.esquiva = esquiva;
    }
}