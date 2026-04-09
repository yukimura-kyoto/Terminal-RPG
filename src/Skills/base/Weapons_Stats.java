package Skills.base;

public class Weapons_Stats {

    // Parte totalmente ignoravel, isso define os Status das armas
    // a menos que queira adicionar um novo tipo de Status
    // se quiser se vira para arrumar tudo

    public String name;
    public int danoMin;
    public int danoMax;
    public double critChance; // 0.1 = 10%
    public double critMult;
    public TipoDano tipoDano;

    public Weapons_Stats(String name, int danoMin, int danoMax, double critChance, double critMult, TipoDano tipoDano) {
        this.name = name;
        this.danoMin = danoMin;
        this.danoMax = danoMax;
        this.critChance = critChance;
        this.critMult = critMult;
        this.tipoDano = tipoDano;
    }

    public int calcularDano() {
        int dano = danoMin + (int)(Math.random() * (danoMax - danoMin + 1));
        if (Math.random() < critChance) {
            dano *= 2;
            System.out.println("CRÍTICO!");
        }
        return dano;
    }

}
