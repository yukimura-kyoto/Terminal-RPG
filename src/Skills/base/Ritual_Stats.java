package Skills.base;

import Entity.base.Stats;

public class Ritual_Stats implements Usavel {

    // Variaveis
    public String name;
    public double danoMin;
    public double danoMax;
    public TipoDano tipoDano;

    // seis sete resenha
    public Ritual_Stats(String name, double danoMin, double danoMax, TipoDano tipoDano) {
        this.name = name;
        this.danoMin = danoMin;
        this.danoMax = danoMax;
        this.tipoDano = tipoDano;
    }

    // Retorna o tipo do dano
    @Override
    public TipoDano getTipo(Stats user) {
        return tipoDano;
    }

    @Override
    public int usar(Stats user) {

        int dano = (int)(Math.random() * (danoMax - danoMin + 1)) + (int)danoMin;

        return dano;
    }

    @Override
    public String getName() {
        return name;
    }
}
