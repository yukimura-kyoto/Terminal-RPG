package Skills.types;

import Entity.base.Stats;
import Skills.base.Ritual_Stats;
import Skills.base.TipoDano;

public class Special_Skills {

    public static class RitualLifesteal extends Ritual_Stats {

        public double lifestealPct; // % do dano que cura

        public RitualLifesteal(String name, double danoMin, double danoMax, double lifestealPct, TipoDano tipoDano) {
            super(name, danoMin, danoMax, tipoDano);
            this.lifestealPct = lifestealPct;
        }

        @Override
        public int usar(Stats user) {
            int dano = (int)(Math.random() * (danoMax - danoMin + 1)) + (int)danoMin;

            int cura = (int)(dano * lifestealPct);
            user.health += cura;

            return dano;
        }
    }
}
