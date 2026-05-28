package Old.Skills;

import java.util.ArrayList;

import Old.Skills.base.TipoDano;
import Old.Skills.types.Attack_Stats;
import Old.Skills.base.Ritual_Stats;
import Old.Skills.base.Usavel;
import Old.Skills.types.Special_Skills;

public class Skills {

    // cara isso vai ficar bem baguncado quando tiver muito ataque

    public static ArrayList<Usavel> moveset = new ArrayList<>();

    static {
        moveset.add(new Attack_Stats("Ataque Leve", 1,1,0.1,1.5, 0)); // 0
        moveset.add(new Attack_Stats("Ataque Duplo", 2,2,0.1,1.5, 2));// 1
        moveset.add(new Attack_Stats("Golpe Pesado", 1.5,2,0.1,1.5,0)); // 2
        moveset.add(new Attack_Stats("Combo Duelista",1.2,2,0.35,2.5,10)); // 3


        moveset.add(new Ritual_Stats("Descarnar", 6,48, TipoDano.SANGUE)); // 4
        moveset.add(new Ritual_Stats("Rajada Caótica", 8,64, TipoDano.ENERGIA));// 5
        moveset.add(new Ritual_Stats("Hemofagia",6,36, TipoDano.SANGUE)); // 6
        moveset.add(new Special_Skills.RitualLifesteal("Parasita Sombrio", 11, 20, 0.3, TipoDano.MORTE)); //7
        moveset.add(new Ritual_Stats("Explodir em Sangue",6,60, TipoDano.SANGUE));// 8

    }
}