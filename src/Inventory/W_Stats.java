package Inventory;

public class Weapon_Stats {

    public String nome;
    public int danoMin;
    public int danoMax;
    public String tipoDano;
    public double critChance; // 0.1 = 10%

    public Weapon_Stats(String nome, int danoMin, int danoMax, String tipoDano, double critChance) {
        this.nome = nome;
        this.danoMin = danoMin;
        this.danoMax = danoMax;
        this.tipoDano = tipoDano;
        this.critChance = critChance;
    }

}
