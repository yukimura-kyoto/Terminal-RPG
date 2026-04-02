package Skills;

import java.util.ArrayList;
import Skills.Special_Skills;

public class Skills {

    // ===== SKILLS ID =====
    // 0 - Ataque Leve
    // 1 - Ataque Duplo
    // 2 - Descarnar
    // 3 - Rajada Caótica
    // 4 - Chama do Abismo
    // 5 - Lâmina Espectral
    // 6 - Ruptura Mental
    // =====================

    public static ArrayList<Usavel> moveset = new ArrayList<>();

    static {
        // Ataques basicos (Corpo a Corpo)
        moveset.add(new Attack_Stats("Ataque Leve", 1,1,0.1,1.5));
        moveset.add(new Attack_Stats("Ataque Duplo", 2,2,0.1,1.5));
        moveset.add(new Attack_Stats("Combo Duelista",1.2,2,0.35,2.5));

        // Magias (Magias)
        moveset.add(new Ritual_Stats("Descarnar", 6,48,0.1,2));
        moveset.add(new Ritual_Stats("Rajada Caótica", 8,64,0.1,2));
        moveset.add(new Ritual_Stats("Chama do Abismo", 18,32,0.2,2));
        moveset.add(new Ritual_Stats("Lamina Espectral",14,26,0.3,2.2));
        moveset.add(new Ritual_Stats("Ruptura Mental",10,40,0.15,2.5));
        moveset.add(new Ritual_Stats("Correntes do Outro Lado",16,28,0.18,1.8));
        moveset.add(new Ritual_Stats("Olhar do Vazio",22,35,0.1,3));
        moveset.add(new Special_Skills.RitualLifesteal("Parasita Sombrio", 11, 20, 0.20, 1.6, 0.3));

    }
}