package Skills;

public class Weapons_Stats {

    // Parte totalmente ignoravel, isso define os Status das armas
    // a menos que queira adicionar um novo tipo de Status
    // se quiser se vira para arrumar tudo

    public String name;
    public int danoMin;
    public int danoMax;
    public String tipoDano;
    public double critChance; // 0.1 = 10%
    public double critMult;

    public Weapons_Stats(String name, int danoMin, int danoMax, String tipoDano, double critChance, double critMult) {
        this.name = name;
        this.danoMin = danoMin;
        this.danoMax = danoMax;
        this.tipoDano = tipoDano;
        this.critChance = critChance;
        this.critMult = critMult;
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
