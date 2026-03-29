package Skills;

import java.util.ArrayList;

public class Skills {

    public static ArrayList<Usavel> moveset = new ArrayList<>();

    static {
        // Ataques basicos (Corpo a Corpo)
        moveset.add(new Attack_Stats("Ataque Leve", 1,1,0.1,1.5));
        moveset.add(new Attack_Stats("Ataque Duplo", 2,2,0.1,1.5));

        // Magias (Magias)
        moveset.add(new Ritual_Stats("Descarnar", 6,48,0.1,2));
        moveset.add(new Ritual_Stats("Rajada Caótica", 8,64,0.1,2));
    }

    // debug

    static {
        System.out.println("Skills inicializando...");
        moveset.add(new Attack_Stats("Ataque Leve", 1,1,0.1,1.5));
        moveset.add(new Attack_Stats("Ataque Duplo", 2,2,0.1,1.5));
        moveset.add(new Ritual_Stats("Descarnar", 6,48,0.1,2));
        moveset.add(new Ritual_Stats("Rajada Caótica", 8,64,0.1,2));
        System.out.println("Skills inicializado! Total: " + moveset.size());
    }
}