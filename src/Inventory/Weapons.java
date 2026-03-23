package Inventory;

public class Weapons {

    // W_Stats puxa os atributos
    // nome, danoMin, danoMax, tipo do Dano, Crit Chance, Crit Mult

    W_Stats[] weapons = new W_Stats[3];

    public static  W_Stats Soco = new W_Stats
            ("Soco", 5,10,"Corpo",0.5,1.5);

    public static W_Stats Espada = new W_Stats
            ("Espada", 5, 10, "Cut", 0.1, 2);

    public static W_Stats Katana = new W_Stats
            ("Katana", 8, 15, "Cut", 0.15, 2);

    public static W_Stats Machado = new W_Stats
            ("Machado>", 10, 18, "Cleave", 0.05,2);

}
