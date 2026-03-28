package Skills;

import Player_NPC.Player;

public class Ritual_Stats implements Usavel {

    // Variaveis
    public String name;
    public double danoMin;
    public double danoMax;
    public double critChance;
    public double critMult;

    // seis sete resenha
    public Ritual_Stats(String name, double danoMin, double danoMax, double critChance, double critMult) {
        this.name = name;
        this.danoMin = danoMin;
        this.danoMax = danoMax;
        this.critChance = critChance;
        this.critMult = critMult;
    }

    @Override
    public int usar(Player player) {

        int dano = (int)(Math.random() * (danoMax - danoMin + 1)) + (int)danoMin;

        if (Math.random() < critChance) {
            dano *= critMult;
            System.out.println("CRÍTICO!");
        }

        return dano;
    }

    @Override
    public String getName() {
        return name;
    }
}
