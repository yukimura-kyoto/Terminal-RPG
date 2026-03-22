package Inventory;

public class Weapons {

    // W_Stats puxa os atributos
    // nome, danoMin, danoMax, tipo do Dano, Crit Chance, Crit Mult

    public static W_Stats Sword = new W_Stats
            ("Sword", 5, 10, "Cut", 0.1, 2);

    public static W_Stats Katana = new W_Stats
            ("Katana", 8, 15, "Cut", 0.15, 2);

    public static W_Stats Axe = new W_Stats
            ("Axe", 10, 18, "Cleave", 0.05,2);


}
