package Skills;

import Entity.base.Stats;

public class Special_Skills {

    public static class RitualLifesteal extends Ritual_Stats {

        public double lifestealPct; // % do dano que cura

        public RitualLifesteal(String name, double danoMin, double danoMax, double critChance, double critMult, double lifestealPct) {
            super(name, danoMin, danoMax, critChance, critMult);
            this.lifestealPct = lifestealPct;
        }

        @Override
        public int usar(Stats user) {
            int dano = (int)(Math.random() * (danoMax - danoMin + 1)) + (int)danoMin;

            if (Math.random() < critChance) {
                dano *= critMult;
                System.out.println("CRÍTICO!");
            }

            int cura = (int)(dano * lifestealPct);
            user.health += cura;

            return dano;
        }
    }
}
