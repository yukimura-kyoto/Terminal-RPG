package Skills.types;

import Entity.base.Stats;
import Skills.base.TipoDano;
import Skills.base.Usavel;

public class Attack_Stats implements Usavel {

    // Variaveis
    public String name;
    public double multMin;
    public double multMax;
    public double critChance;
    public double critMult;
    public double gastoStam;

    // seis sete resenha
    public Attack_Stats(String name, double multMin, double multMax, double critChance, double critMult, double gastoStam) {
        this.name = name;
        this.multMin = multMin;
        this.multMax = multMax;
        this.critChance = critChance;
        this.critMult = critMult;
        this.gastoStam = gastoStam;
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
    public TipoDano getTipo(Stats user) {
        return user.currentWeapon.tipoDano; // pega o tipo da arma equipada
    }

    @Override
    public String getName() {
        return name;
    }
}