package Skills;

import java.util.ArrayList;

public class Weapons {


    public static ArrayList<Weapons_Stats> Weapons_List = new ArrayList<>();

    static {
        Weapons_List.add(new Weapons_Stats("Soco", 5,10,"Corpo",0.5,1.5)); // 0
        Weapons_List.add(new Weapons_Stats("Espada", 5,10,"Cut",0.1,2)); // 1
        Weapons_List.add(new Weapons_Stats("Katana", 8,15,"Cut",0.15,2)); // 2
        Weapons_List.add(new Weapons_Stats("Machado", 10,18,"Cleave",0.05,2)); // 3
        Weapons_List.add(new Weapons_Stats("Ereshkigal",18,28,"Corte",0.25,2)); // 4
        Weapons_List.add(new Weapons_Stats("Chifre do Diabo", 52,66,"Corpo",0.47,3)); // 5
        Weapons_List.add(new Weapons_Stats("Mordida", 4,18,"Corpo",0.05,2)); // 6
    }
}
