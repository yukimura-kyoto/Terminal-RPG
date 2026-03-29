package Skills;

import Entity.base.Stats;

public class Attack_Stats implements Usavel {

    // Variaveis
    public String name;
    public double multMin;
    public double multMax;
    public double critChance;
    public double critMult;

    // seis sete resenha
    public Attack_Stats(String name, double multMin, double multMax, double critChance, double critMult) {
        this.name = name;
        this.multMin = multMin;
        this.multMax = multMax;
        this.critChance = critChance;
        this.critMult = critMult;
    }

    // usa os atributos do jogador
    public int usar(Stats user) {
        // Pega o dano min e max da arma atual
        int baseMin = user.currentWeapon.danoMin;
        int baseMax = user.currentWeapon.danoMax;

        // isso e o multiplicador do dano que voce seta depois
        int danoMinFinal = (int)(baseMin * multMin);
        int danoMaxFinal = (int)(baseMax * multMax);

        int dano = (int)(Math.random() * (danoMaxFinal - danoMinFinal + 1)) + danoMinFinal;

        // Matemathika in python
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