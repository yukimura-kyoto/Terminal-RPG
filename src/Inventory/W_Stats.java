package Inventory;

public class W_Stats {

    // Parte totalmente ignoravel, isso define os Status das armas
    // a menos que queira adicionar um novo tipo de Status
    // se quiser se vira para arrumar tudo

    public String name;
    public int danoMin;
    public int danoMax;
    public String tipoDano;
    public double critChance; // 0.1 = 10%
    public double critMult;

    public W_Stats(String name, int danoMin, int danoMax, String tipoDano, double critChance, double critMult) {
        this.name = name;
        this.danoMin = danoMin;
        this.danoMax = danoMax;
        this.tipoDano = tipoDano;
        this.critChance = critChance;
        this.critMult = critMult;
    }

}
