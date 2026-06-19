package debug;

import model.status.Attributes;
import model.status.DerivedAttributes;

public class DebugMenu {

    public static void showStats(Attributes attributes, DerivedAttributes derived) {

        System.out.println("========== PLAYER DEBUG ==========");
        System.out.println();

        System.out.println("Nome: " + attributes.getName());
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

        System.out.println();
        System.out.println("===============================");
    }
}