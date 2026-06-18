package debug;

import model.stats.Attributes;
import model.stats.DerivedAttributes;

public class DebugMenu {

    public static void showStats(Attributes attributes, DerivedAttributes derived) {

        System.out.println("========== PLAYER DEBUG ==========");
        System.out.println();

        System.out.println("Nome: " + attributes.getName());
        System.out.println();

        System.out.println("Vigor: " + attributes.getVigor());
        System.out.println("Mind: " + attributes.getMind());
        System.out.println("Endurance: " + attributes.getEndurance());
        // Depois adiciona Strength, Dexterity, etc.

        System.out.println();

        System.out.println("HP: "
                + derived.getCurrentHp()
                + "/"
                + derived.getMaxHp());

        System.out.println("FP: "
                + derived.getCurrentFp()
                + "/"
                + derived.getMaxFp());

//        System.out.println("Stamina: "
//                + derived.getCurrentStamina()
//                + "/"
//                + derived.getMaxStamina());
//
        System.out.println("Equip Load: "
                + derived.getCurrentEquipLoad()
                + "/"
                + derived.getMaxEquipLoad());

        System.out.println();
        System.out.println("===============================");
    }
}