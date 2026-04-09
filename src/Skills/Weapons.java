package Skills;

import Skills.base.TipoDano;
import Skills.base.Weapons_Stats;

import java.util.ArrayList;

public class Weapons {


    public static ArrayList<Weapons_Stats> Weapons_List = new ArrayList<>();

    static {
        Weapons_List.add(new Weapons_Stats("Soco", 5,10,0.5,1.5, TipoDano.IMPACTO)); // 0
        Weapons_List.add(new Weapons_Stats("Espada", 5,10,0.1,2,TipoDano.CORTE)); // 1
        Weapons_List.add(new Weapons_Stats("Katana", 8,15,0.15,2, TipoDano.CORTE)); // 2
        Weapons_List.add(new Weapons_Stats("Machado", 10,18,0.05,2, TipoDano.CORTE)); // 3
        Weapons_List.add(new Weapons_Stats("Ereshkigal",18,28,0.25,2, TipoDano.CORTE)); // 4
        Weapons_List.add(new Weapons_Stats("Chifre do Diabo", 52,66,0.47,3, TipoDano.SANGUE)); // 5
        Weapons_List.add(new Weapons_Stats("Mordida", 4,18,0.05,2, TipoDano.PERFURACAO)); // 6
    }
}
