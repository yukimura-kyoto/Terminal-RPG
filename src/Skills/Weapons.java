package Skills;

import java.util.ArrayList;

public class Weapons {


    public static ArrayList<Weapons_Stats> Weapons_List = new ArrayList<>();

    static {
        Weapons_List.add(new Weapons_Stats("Soco", 5,10,"Corpo",0.5,1.5));
        Weapons_List.add(new Weapons_Stats("Espada", 5,10,"Cut",0.1,2));
        Weapons_List.add(new Weapons_Stats("Katana", 8,15,"Cut",0.15,2));
        Weapons_List.add(new Weapons_Stats("Machado", 10,18,"Cleave",0.05,2));
    }
}
