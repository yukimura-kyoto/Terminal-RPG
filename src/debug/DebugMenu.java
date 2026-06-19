package debug;

import model.stats.Attributes;
import model.stats.DerivedAttributes;

public class DebugMenu {

    public static void showStats(Attributes attributes, DerivedAttributes derived) {

        System.out.println("========== PLAYER DEBUG ==========");
        System.out.println();

        System.out.println("Class: " + attributes.getName());
        System.out.println("Level: "+ attributes.getLevel());
        System.out.println();

        System.out.println("Vigor: " + attributes.getVigor());
        System.out.println("Mind: " + attributes.getMind());
        System.out.println("Endurance: " + attributes.getEndurance());
        System.out.println("Strength: " + attributes.getStrength());
        System.out.println("Dexterity: " + attributes.getDexterity());
        System.out.println("Intelligence: " + attributes.getIntelligence());
        System.out.println("Faith: " + attributes.getFaith());
        System.out.println("Arcane: " + attributes.getArcane());
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
                + derived.getMaxEquipLoad()
                + " (" + derived.getRollType().getName() + ")");

        System.out.println("========== Level Up ==========");
        System.out.println();
        System.out.println("1 - Vigor");
        System.out.println("2 - Mind");
        System.out.println("3 - Endurance");
        System.out.println("4 - Strength");
        System.out.println("5 - Dexterity");
        System.out.println("6 - Intelligence");
        System.out.println("7 - Faith");
        System.out.println("8 - Arcane");

        System.out.println();
        System.out.println("===============================");
    }
}